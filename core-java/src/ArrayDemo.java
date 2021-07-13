import java.util.Iterator;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] ar = {10, 20, 30, 40, 50};
		//Print this array's elements
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		for (int i : ar) {
			System.out.println(i);
		}
		
		int[][] jag = {{1,2},{3,4,5},{6,7,8,9}};
		for (int[] is : jag) {
			for (int i = 0; i < is.length; i++) {
				System.out.println(is[i]);
			}
		}
		}
	}
