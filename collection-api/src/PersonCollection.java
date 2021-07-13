import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class PersonCollection {
	
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		//add entries, convert to set, convert to treeset
		list.add(new Person("Mili", 15));
		list.add(new Person("Lili", 19));
		list.add(new Person("Yash", 24));
		
//		HashSet<Person> set = new HashSet<Person>(list);
//		System.out.println("--- Traversing over Set");
//		for (Person elem : set)
//			System.out.println(elem);
		
		PersonAgeComparator pac = new PersonAgeComparator();
		TreeSet<Person> tree = new TreeSet<Person>(pac);
		tree.addAll(list);
		System.out.println("--- Traversing over TreeSet sorted by age");
		for (Person elem : tree)
			System.out.println(elem);
		
//		PersonNameComparator pnc = new PersonNameComparator();
		TreeSet<Person> tree2 = new TreeSet<Person>(list);
//		tree2.addAll(list);
		System.out.println("--- Traversing over TreeSet sorted by name");
		for (Person elem : tree2)
			System.out.println(elem);
	}

}
