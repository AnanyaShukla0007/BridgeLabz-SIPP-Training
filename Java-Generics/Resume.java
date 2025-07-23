abstract class JobRole {
    String role;
    JobRole(String role) { this.role = role; }
    public String toString() { return role; }
}

class SoftwareEngineer extends JobRole {
    SoftwareEngineer() { super("Software Engineer"); }
}

class DataScientist extends JobRole {
    DataScientist() { super("Data Scientist"); }
}

class ProductManager extends JobRole {
    ProductManager() { super("Product Manager"); }
}

class Resume<T extends JobRole> {
    T jobRole;
    Resume(T jobRole) { this.jobRole = jobRole; }

    static void processResumes(List<? extends JobRole> resumes) {
        for (JobRole role : resumes) {
            System.out.println("Screening: " + role);
        }
    }
}
