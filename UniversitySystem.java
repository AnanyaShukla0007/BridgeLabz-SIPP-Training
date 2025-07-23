package JavaProblems;

class Student {
    private String name;
    private double gpa;
    private int totalCredits;

    public Student(String name) {
        this.name = name;
        this.gpa = 0.0;
        this.totalCredits = 0;
    }
    
    public void updateGPA(double gradePoints, int credits) {
        gpa = ((gpa * totalCredits) + (gradePoints * credits)) / (totalCredits + credits);
        totalCredits += credits;
    }

    public String getName() {
    	return name;
    }
    
    public double getGPA() {
    	return gpa;
    }
    
  class Undergraduate extends Student{
	  public Undergraduate(String name) {
		  super(name);
	  }
  }
  
  class Postgraduate extends Student{
	  public Postgraduate(String name) {
		  super(name);
	  }
  }
  
  class Courses{
	  String courseName;
	  String credit;
	  
	  public Courses(String courseName, String credit) {
		  this.courseName = courseName;
		  this.credit = credit;
	  }
  }
  
  interface Graded {
	    void assignGrade(Student student, double marks);
	}
  
  class LetterGrading implements Graded{
	  public void assignGrade(Student student, double marks) {
		  double gradePoint;
		  if(marks >= 90) gradePoint = 4.0;
		  else if(marks >= 80) gradePoint = 3.5;
		  else if(marks >= 70) gradePoint = 3.0;
		  else if(marks >= 60 )gradePoint = 2.0
		  else gradePoint = 0;
		  
		  student.updateGPA(gradePoint, 3);
	      System.out.println(student.getName() + " assigned letter grade. GPA now: " + student.getGPA());
	  }
  }
  
  class PassFailGrading implements Graded{
	  public void assignGrade(Student student, double marks) {
	        double gradePoint = marks >= 50 ? 3.0 : 0.0;
	        student.updateGPA(gradePoint, 3);
	        System.out.println(student.getName() + " assigned pass/fail grade. GPA now: " + student.getGPA());
	    }
  }
  
  class Faculty{
	  private String name;

	    public Faculty(String name) {
	        this.name = name;
	    }

	    public void gradeStudent(Student student, double marks, Graded gradingStrategy) {
	        gradingStrategy.assignGrade(student, marks);
	    }
  }
      
public class UniversitySystem {
	public static void  main(String[] args) {
		Undergraduate u1 = new Undergraduate("Alankrati");
		Postgraduate p1 = new Postgraduate("Harshita");
		
		Faculty f1 = new Faculty("Mr Anil Sharma");
		
		Course c1 = new Course("DSA", 4);
		
		Graded g1 = new LetterGrading();
		Graded g2 = new PassFailGrading();
		
		f1.gradeStudent(u1, 85, g2);
		f1.gradeStudent(p1, 50, g2);
	}
}
