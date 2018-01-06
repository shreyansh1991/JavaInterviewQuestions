package java8;

// Java program to demonstrate methods
// of StringJoiner class

import java.util.ArrayList;
import java.util.StringJoiner;

public class StringJoinerDemo {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();

		al.add("Ram");
		al.add("Shyam");
		al.add("Alice");
		al.add("Bob");

		StringJoiner sj1 = new StringJoiner(",");

		// setEmptyValue() method
		sj1.setEmptyValue("sj1 is empty");
		System.err.println(sj1);

		// add() method
		sj1.add(al.get(0)).add(al.get(1));
		System.out.println(sj1);

		/*
		 * // length() method System.out.println("Length of sj1 : " +
		 * sj1.length());
		 * 
		 * StringJoiner sj2 = new StringJoiner(":");
		 * sj2.add(al.get(2)).add(al.get(3));
		 * 
		 * // merge() method sj1.merge(sj2);
		 * 
		 * // toString() method System.out.println(sj1.toString());
		 * 
		 * System.out.println("Length of new sj1 : " + sj1.length());
		 * 
		 */ }
}
