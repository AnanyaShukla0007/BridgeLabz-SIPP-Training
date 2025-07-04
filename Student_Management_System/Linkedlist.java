package LinkedList.Student_Management_System;

public class Linkedlist {
	Node head;
	
	void add_at_head(Student data) {
		Node nn=new Node(data);
		if(head==null) {
			head=nn;
		}
		else {
			nn.next=head;
			head=nn;
		}
	}
	
	void add_at_last(Student data) {
		Node nn=new Node(data);
		if(head==null) {
			head=nn;
			return ;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=nn;
	}
	void add_at_pos(Student data,int k) {
		Node nn=new Node(data);
		if(head==null) {
			head=nn;
			return;
		}
		if(k==0) {
			nn.next=head;
			head=nn;
			return ;
		}
		Node temp=head;
		for(int i=0;i<k-1 && temp!=null;i++) {
			temp=temp.next;
		}
		if(temp==null) {
			System.out.println("Invalid");
			return ;
		}
		nn.next=temp.next;
		temp.next=nn;
		
	}
	void delete_rollNO(int rollNo) {
		if(head.data.rollNo==rollNo) {
			head=head.next;
			return;
		}
		Node temp=head;
		while(temp!=null && temp.data.rollNo!=rollNo) {
			temp=temp.next;
		}
		
		if(temp==null) {
			System.out.println("Data Not found");
			return;
		}
		temp.data=temp.next.data;
		temp.next=temp.next.next;
	}
	
	public void displayDetails(){
		Node temp=head;
		while(temp!=null) {
			System.out.println("Name: "+temp.data.name);
			System.out.println("RollNo: "+temp.data.rollNo);
			System.out.println("Grade: "+temp.data.grade);
			System.out.println("Age: "+temp.data.age);
			temp=temp.next;
		}
	}
}
