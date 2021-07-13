
public class Person implements Comparable<Person>{
	
	@Override
	public int compareTo(Person p) {
		// TODO Auto-generated method stub
		return this.name.compareTo(p.name);
	}

	private String name;
	private int age;
	
	public Person() {
		
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	

	
	
	

}
