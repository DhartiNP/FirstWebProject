package java8practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_Interface {
	public static void main(String[] args) {
		Consumer<String> consumer = s-> System.out.println(s);
		consumer.accept("Divam loves his mumma");
		Consumer<List<Integer>> listConsumer = li-> {
			for (int i : li) {
				System.out.println(i+100);
			}
		};
		
		Consumer<List<Integer>> listConsumer1 = li-> {
			for (int i : li) {
				System.out.println(i);
			}
		};
		
		Consumer<List<Integer>> newConsumer = listConsumer.andThen(listConsumer1);
		newConsumer.accept(Arrays.asList(1,3,4,6));
	}
}
