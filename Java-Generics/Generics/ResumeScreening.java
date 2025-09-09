
package generics;

import java.util.*;

abstract class JobRole {
    private String candidateName;

    public JobRole(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public abstract String evaluateResume();
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String name) {
        super(name);
    }

    @Override
    public String evaluateResume() {
        return "Software Engineer Resume Evaluation for " + getCandidateName();
    }
}

class DataScientist extends JobRole {
    public DataScientist(String name) {
        super(name);
    }

    @Override
    public String evaluateResume() {
        return "Data Scientist Resume Evaluation for " + getCandidateName();
    }
}

class ProductManager extends JobRole {
    public ProductManager(String name) {
        super(name);
    }

    @Override
    public String evaluateResume() {
        return "Product Manager Resume Evaluation for " + getCandidateName();
    }
}

class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public T getJobRole() {
        return jobRole;
    }

    public void process() {
        System.out.println(jobRole.evaluateResume());
    }
}

class ResumeProcessor {
    public static void screenResumes(List<? extends JobRole> resumes) {
        for (JobRole role : resumes) {
            System.out.println(role.evaluateResume());
        }
    }
}

public class ResumeScreening{
    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer("Kuldeep"));
        Resume<DataScientist> dsResume = new Resume<>(new DataScientist("Ananya"));
        Resume<ProductManager> pmResume = new Resume<>(new ProductManager("Rohit"));

        List<JobRole> allResumes = new ArrayList<>();
        allResumes.add(seResume.getJobRole());
        allResumes.add(dsResume.getJobRole());
        allResumes.add(pmResume.getJobRole());

        System.out.println("AI-Driven Resume Screening:\n");
        ResumeProcessor.screenResumes(allResumes);
    }
}
