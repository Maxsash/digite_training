import java.util.Scanner;

public class ConsoleDemo {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		String name = console.next();

		String nameRegex = "[A-Z][a-z]{3,}";
		if(name.matches(nameRegex))
			System.out.println("Name: " + name);
		else
			System.out.println("Invalid name");
			
		System.out.println("Enter mobile: ");
		String mobile = console.next();
		
		String mobRegex = "[7-9][0-9]{9}";
		assert mobile.matches(mobRegex): "Invalid Mobile No";
		System.out.println("Mobile No: " + mobile);
		
		System.out.println("Enter age: ");
		int age = console.nextInt();
		
		if (age >= 18 && age <130)
			System.out.println("Age: " + age);
		else
			System.out.println("Invalid age");
	}
}