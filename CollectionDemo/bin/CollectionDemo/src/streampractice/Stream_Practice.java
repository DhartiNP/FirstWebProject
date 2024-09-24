package streampractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Practice {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30);
		Stream<Integer> myStream = list.stream();

		String[] array = { "Apple", "Banana", "Chocolate" };
		Stream<String> myNewStream = Arrays.stream(array);

		Stream<Integer> myIntegerStream = Stream.of(10, 20, 30);

		Stream<String> limit = Stream.generate(() -> "one").limit(3);
		// System.out.println(limit.

		List<Integer> listStream = Arrays.asList(23, 24, 56, 76, 34, 89, 32, 32, 56);
		// use of filter to find the even number
		List<Integer> filteredList = listStream.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(filteredList);

		// Use of mapped take old value and return new list with duplicate values
		List<Integer> mappedList = filteredList.stream().map(x -> x / 10).collect(Collectors.toList());
		System.out.println(mappedList);

		// Use of mapped take old value and return new list without duplicate values
		List<Integer> mappedListDistinct = filteredList.stream().map(x -> x / 10).distinct()
				.collect(Collectors.toList());
		System.out.println(mappedListDistinct);

		// Use of mapped take old value and return new list without duplicate values and
		// sorted
		List<Integer> mappedListDistinctSorted = filteredList.stream().map(x -> x / 10).distinct().sorted()
				.collect(Collectors.toList());
		System.out.println(mappedListDistinctSorted);
		
		//skip first 11 from 0 to 100
		List<Integer> oneto100 = Stream.iterate(0, x->x+1).limit(101).
				skip(11).collect(Collectors.toList());
		
		
		System.out.println(oneto100);
		

	}

}
