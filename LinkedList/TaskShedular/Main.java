package LinkedList.TaskShedular;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        CircularTaskList taskList = new CircularTaskList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add at Beginning\n2. Add at End\n3. Add at Position\n4. Remove by ID\n5. View Current Task and Move\n6. Display All\n7. Search by Priority\n8. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter ID, Name, Priority, Due Date: ");
                    taskList.addAtBegining(sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
                    break;
                case 2:
                    System.out.print("Enter ID, Name, Priority, Due Date: ");
                    taskList.addAtEnd(sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
                    break;
                case 3:
                    System.out.print("Enter Position, ID, Name, Priority, Due Date: ");
                    taskList.addAtPosition(sc.nextInt(), sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
                    break;
                case 4:
                    System.out.print("Enter Task ID to remove: ");
                    taskList.removeById(sc.nextInt());
                    break;
                case 5:
                    taskList.viewcurrentAndMovement();
                    break;
                case 6:
                    taskList.displayAll();
                    break;
                case 7:
                    System.out.print("Enter Priority to search: ");
                    taskList.searchByPriority(sc.nextInt());
                    break;
                case 8:
                    System.out.println("Exiting.");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}