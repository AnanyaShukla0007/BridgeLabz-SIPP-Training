class Student {
    static String universityName = "Tech Uni";
    static int totalStudents = 0;

    final int rollNumber;
    String name;
    char grade;

    Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void displayStudent() {
        if (this instanceof Student) {
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Muskaan", 301, 'A');
        s1.displayStudent();
        Student.displayTotalStudents();
    }
}