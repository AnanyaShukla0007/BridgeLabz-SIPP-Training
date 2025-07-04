package LinkedList.TaskShedular;

public class CircularTaskList {
	private Task head=null;
	private Task tail=null;
	private Task current=null;
	
	public void addAtBegining(int id,String name,int priority,String dueDate) {
		Task newTask=new Task(id,name,priority,dueDate);
		if(head==null) {
			head=newTask;
			tail=newTask;
			tail.next=head;
		}
		else {
			newTask.next=head;
			head=newTask;
			tail.next=head;
		}
	}
	public void addAtEnd(int id,String name,int priority,String dueDate) {
		Task newTask=new Task(id,name,priority,dueDate);
		if(head==null) {
			head=newTask;
			tail=newTask;
			tail.next=head;
		}
		else {
			tail.next=newTask;
			tail=tail.next;
			tail.next=head;
		}
	}
	public void addAtPosition(int id,String name,int priority,String dueDate,int k) {
		Task newTask=new Task(id,name,priority,dueDate) 
		if(k<=1) {
			addAtBegining(id, name, priority, dueDate);
			return;
		}
		Task temp=head;
		int count=1;
		while(count<k-1 && temp.next!=null) {
			temp=temp.next;
			count++;
		}
		newTask.next=temp.next;
		temp.next=newTask;
		if(temp==tail) {
			tail=newTask;
		}
		tail.next=head;
	}
	public void removeById(int id) {
		if(head==null)return;
		Task temp=head,prev=null;
		
		if(head.taskId==id) {
			if(head==tail) {
				head=tail=null;
				return ;
			}
			head=head.next;
			tail.next=head;
			return;
		}
		do {
			prev=temp;
			temp=temp.next;
			if(temp.taskId==id) {
				prev.next=temp.next;
				if(temp==tail) {
					tail=prev;
				}
				tail.next=head;
				return;
			}
		}while(temp!=head);
	}
	public void viewcurrentAndMovement() {
		if(head==null) {
			System.out.println("Task list is Empty");
			return;
		}
		if(current==null)current=head;
		System.out.println("Current Task: [ID: " + current.taskId + ", Name: " + current.taskName +
                ", Priority: " + current.priority + ", Due: " + current.dueDate + "]");
        current = current.next;
	}
	public void displayAll() {
		if(head==null) {
			System.out.println("Task list is empty");
		}
		Task temp=head;
		System.out.println("Task in the list are:");
		do {
			 System.out.println("[ID: " + temp.taskId + ", Name: " + temp.taskName +
	                    ", Priority: " + temp.priority + ", Due: " + temp.dueDate + "]");
	            temp = temp.next;
	        } while (temp != head);
		
	}
	public void searchByPriority(int searchPriority) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        boolean found = false;
        Task temp = head;
        do {
            if (temp.priority == searchPriority) {
                System.out.println("[ID: " + temp.taskId + ", Name: " + temp.taskName +
                        ", Priority: " + temp.priority + ", Due: " + temp.dueDate + "]");
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tasks found with priority " + searchPriority);
        }
    }
}
