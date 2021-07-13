
public class Person implements Cloneable {
	//  Attributes of a class is usually private
	private String name;
	private int age;
	
	// Defining constructor manually
	public Person() {
		//Calling another constructor on the same object with matching
		// signature
		// AKA constructor chaining
		this("Anonymous", -1);
	}
	
	//Place cursor here: go to Source -> Generate constructor using fields
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Methods of a class are usually public
	//public void setState() {
	//	name = "Polo";
	//	age = 21;
	//}
	
	public void print() {
		System.out.println("Name: " + name + "\tAge: " + age);
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "\tAge: " + age;
	}

	@Override
	public void finalize() throws Throwable {
		System.out.println("Person is no more!");
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person) obj;
			if(p.name.equals(this.name) && p.age == this.age )
				return true;
		}
		return false;
	}

	public static void main(String[] args) throws Exception {
		// Declaration / Instantiation
		Person p = new Person("Polo", 21);
		
		Person p2 = new Person("Polo", 21);
		
		System.out.println(p.equals(p2));
		
//		Person p2 = (Person) p.clone();
		
		System.out.println(p2);
//		System.out.println(p.hashCode());
//		System.out.println(p);
	//	p.setState(); //No need for this since defined in constructor
//		p.print();
		
//		Person p2 = new Person("Mili", 19);
//		p2.print();
//		for(int c=1; c<=5; c++) {
//			p = new Person();
//		}
		
//		System.gc();
	}

}
