import com.digite.lib.Book;
import com.digite.lib.BookException;
import com.digite.lib.Member;

public class TestLibrary {
	public static void main(String[] args) {
		Book b1 = new Book("The Alchemist", null);
		Member m1 = new Member("Paulo", null);
		Book b2 = new Book("The Godfather", null);
		Member m2 = new Member("Forgot", null);
		
		try {
			b1.returnBook();
		} catch (BookException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		b1.assign_mem(m1);
//		b2.assign_mem(m2);
//		b2.assign_mem(m1);
//		m1.returnBook();
	}
}
