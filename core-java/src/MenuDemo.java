import java.util.Scanner;

public class MenuDemo {
	
	public static void main(String[] args) {
		while (true) {
		Scanner console = new Scanner(System.in);
		System.out.println("1-Add\n2-View\n3-Delete\n4-Exit");
		System.out.println("Choice: ");
		
		int option = console.nextInt();
		switch(option) {
		case 1 : System.out.println("Add Selected"); break;
		case 2: System.out.println("View Selected"); break;
		case 3: System.out.println("Delete Selected"); break;
		case 4: System.exit(0);
		default:
			System.out.println("Invalid option");
		}
	}

	}
}
