import com.digite.org.Employee;
import com.digite.org.Executive;
import com.digite.org.Manager;

public class TestEmployee {
	public static void main(String[] args) {
		// Declaration / Instantiation
//		Employee e1 = new Employee("Mobius", 500000);
//		System.out.println(e1.getSalary());
//		e1.paySlip();
//		
////		Employee e2 = new Employee();
////		e2.paySlip();
		
		Manager mgr = new Manager("Garry", 4000, 1200);
//		mgr.paySlip();
//		System.out.println(mgr.getSalary());
		Executive exec = new Executive("Shanon", 7000, 12000);
//		exec.paySlip();
//		System.out.println(exec.getSalary());
		showSalary(mgr);
		showSalary(exec);
	}
	
	private static void showSalary(Employee emp) {
		if(emp instanceof Manager)
			System.out.println("Manager Salary: " + emp.getSalary());
		else
			System.out.println("Executive Salary: " + emp.getSalary());
	}

//	private static void showSalary(Manager mgr) {
//		System.out.println("Manager Salary: " + mgr.getSalary());
//		
//	}
//
//	private static void showSalary(Executive exec) {
//		System.out.println("Executive Salary: " + exec.getSalary());
//		
//	}
}

