package LinkedList.Student_Management_System;
import java.util.*;
public class Main {
	
	public static void main(String args[]) {
		Student st1=new Student("Divyansh",33,21,'A');
		Student st2=new Student("Tom",45,16,'F');
		Student st3=new Student("Chris",49,16,'B');
		
		Linkedlist list=new Linkedlist();
		list.add_at_head(st1);
		list.add_at_last(st2);
		list.add_at_head(st3);
		
		list.delete_rollNO(49);
		list.displayDetails();
	}
}
