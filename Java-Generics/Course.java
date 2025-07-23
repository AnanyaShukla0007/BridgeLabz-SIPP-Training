abstract class CourseType {
    String courseName;
    CourseType(String courseName) { this.courseName = courseName; }
    public String toString() { return courseName; }
}

class ExamCourse extends CourseType {
    ExamCourse(String courseName) { super(courseName); }
}

class AssignmentCourse extends CourseType {
    AssignmentCourse(String courseName) { super(courseName); }
}

class ResearchCourse extends CourseType {
    ResearchCourse(String courseName) { super(courseName); }
}

class Course<T extends CourseType> {
    T course;
    Course(T course) { this.course = course; }
    T getCourse() { return course; }

    static void listCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            System.out.println(c);
        }
    }
}
