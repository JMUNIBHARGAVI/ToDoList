import java.util.ArrayList;
import java.util.Scanner;

public class ToDoApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		ArrayList<String> tasks=new ArrayList<>();
		while(true) {
			System.out.println("\n---------TO-DO LIST MENU---------");
			System.out.println("1. Add Task");
			System.out.println("2. View Tasks");
			System.out.println("3. Delete Tasks");
			System.out.println("4. Exit");
			System.out.println("Choose an option: ");
			int choice=scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			
			case 1:
				System.out.println("Enter your task: ");
				String task=scanner.nextLine();
				tasks.add(task);
				System.out.println("Task added.");
				break;
				
			case 2:
				System.out.println("\n------Your Tasks------");
				if(tasks.isEmpty()) {
					System.out.println("No tasks found");
				}
				else {
					for(int i=0;i<tasks.size();i++) {
						System.out.println((i+1)+". "+tasks.get(i));
					}
				}
				break;
				
			case 3:
				System.out.println("Enter task number to delete:");
				int deleteIndex=scanner.nextInt();
				if(deleteIndex>0 && deleteIndex<=(tasks.size())) {
					tasks.remove(deleteIndex-1);
					System.out.println("Task deleted.");
				}
				else {
					System.out.println("Invalid task number");
				}
				break;
				
			case 4:
				System.out.println("Exiting...Goodbye!");
				scanner.close();
				System.exit(0);
				
			default:
				System.out.println("Invalid choice. Please try again.");
				
			}
			
		}

	}

}
