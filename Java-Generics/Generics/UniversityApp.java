package generics;

import java.util.*;

abstract class CourseType {
    private String title;
    private String instructor;

    public CourseType(String title, String instructor) {
        this.title = title;
        this.instructor = instructor;
    }

    public String getTitle() {
        return title;
    }

    public String getInstructor() {
        return instructor;
    }

    public abstract String getEvaluationMethod();
}

class ExamCourse extends CourseType {
    public ExamCourse(String title, String instructor) {
        super(title, instructor);
    }

    @Override
    public String getEvaluationMethod() {
        return "Exam-Based Evaluation";
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String title, String instructor) {
        super(title, instructor);
    }

    @Override
    public String getEvaluationMethod() {
        return "Assignment-Based Evaluation";
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String title, String instructor) {
        super(title, instructor);
    }

    @Override
    public String getEvaluationMethod() {
        return "Research-Based Evaluation";
    }
}

class Course<T extends CourseType> {
    private T courseType;

    public Course(T courseType) {
        this.courseType = courseType;
    }

    public T getCourseType() {
        return courseType;
    }

    public String getCourseDetails() {
        return courseType.getTitle() + " | Instructor: " + courseType.getInstructor() +
               " | Evaluation: " + courseType.getEvaluationMethod();
    }
}

class CourseUtil {
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            System.out.println(c.getTitle() + " - " + c.getEvaluationMethod() +
                               " (Instructor: " + c.getInstructor() + ")");
        }
    }
}

public class UniversityApp {
    public static void main(String[] args) {
        Course<ExamCourse> math = new Course<>(new ExamCourse("Mathematics", "Dr. Sharma"));
        Course<AssignmentCourse> programming = new Course<>(new AssignmentCourse("Java Programming", "Ms. Roy"));
        Course<ResearchCourse> aiResearch = new Course<>(new ResearchCourse("AI Research", "Dr. Batra"));

        List<CourseType> courseList = new ArrayList<>();
        courseList.add(math.getCourseType());
        courseList.add(programming.getCourseType());
        courseList.add(aiResearch.getCourseType());

        System.out.println("All University Courses:");
        CourseUtil.displayCourses(courseList);
    }
}