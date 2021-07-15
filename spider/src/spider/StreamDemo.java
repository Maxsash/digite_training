package spider;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
	
	public static void print(Object obj) {
		System.out.println(obj);
	}
	public static void main(String[] args) {
		Integer[] ar = {2,5,7,9,2};
		List<Integer> numbers = Arrays.asList(ar);
		
//		numbers.forEach(System.out::println);
//		numbers.forEach(StreamDemo::print);
		
		System.out.println("-------------");
		Stream<Integer> str1 = numbers.stream().distinct();
		//only one of them works at a time
		str1.forEach(StreamDemo::print);
//		System.out.println(str1.count());
		
		System.out.println("-------------");
		Stream<Integer> str2 = numbers.stream().filter(n -> n >= 5);
		str2.forEach(StreamDemo::print);
		
		System.out.println("-------------");
		numbers.stream().limit(3).forEach(StreamDemo::print);
		
		System.out.println("------------");
		numbers.stream().distinct().sorted().forEach(StreamDemo::print);
		
		System.out.println("-------------");
		System.out.println(numbers.stream().reduce(0, Integer::sum));
		System.out.println("-------------");
		System.out.println(numbers.stream().reduce(0, (a,b) -> a+b));
		
		System.out.println("-------------");
		System.out.println(IntStream.range(1, 99).count());
		System.out.println("-------------");
		IntStream.range(1, 10).skip(5).forEach(System.out::println);
		System.out.println("-------------");
		System.out.println(IntStream.range(1, 10).sum());
		
		System.out.println("-------------");
		IntSummaryStatistics statics = IntStream.of(7,2,19,88,73,4,10).summaryStatistics();
		System.out.println(statics);

		
	}

}
