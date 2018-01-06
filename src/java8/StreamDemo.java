package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.apache.commons.lang3.Validate;

public class StreamDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		list.forEach(i -> System.out.println(i));
		// List<Integer> list1 = list.stream().filter(i ->
		// i).collect(Collectors.toList());
	}
}
