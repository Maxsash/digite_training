package spider;

public class ArithmeticDemo {
	
	public static void main(String[] args) {
//		Arithmetic a1 = (x) -> x * x; //Function
//		System.out.println(a1.square(10));
		
		Arithmetic a2 = (x,y) -> x + y; //Bi-Function
		System.out.println(a2.sum(10,30));
	}

}
