package com.cashapona.collections.list.linkedlist.june9;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AllLinkedListBasicMethods {
	public static void main(String[] args) {
		// create a linked list:
		List<Integer> numbers = new LinkedList<Integer>();
		// add the elements:
		numbers.add(11);
		numbers.add(12);
		numbers.add(13);
		numbers.add(14);
		numbers.add(15);
		numbers.add(16);
		numbers.add(17);
		numbers.add(18);
		// print the elements:
		System.out.println("adding the linked list elements:" + "\n" + numbers);
		// find the size of the linkedList:
		System.out.println("Size of the linkedList:" + "\n" + numbers.size());
		/*
		 * get(): it is returns the given to the indexPostion that element in
		 * linkedlist:
		 */
		System.out.println("Returns the LinkedList Element:" + "\n" + numbers.get(0) + "\n" + numbers.get(5) + "\n"
				+ numbers.get(3));
		// add the element in that specified index:
		numbers.add(6, 50);
		// print the linkedList elements:
		System.out.println("adding the new element in the linkedlist:" + "\n" + numbers);
		// create another new linkedlist:
		List<Integer> names = new LinkedList<Integer>();
		names.add(100);
		names.add(200);
		names.add(300);
		names.add(400);
		names.add(500);
		names.add(600);
		names.add(700);
		names.add(800);
		names.add(900);
		// print the linkedList elements:
		System.out.println("New linkedList elements:" + "\n" + names);
		/*
		 * we can combined the first linkedlist and second linked list: we using the
		 * addAll() method:
		 */
		numbers.addAll(names);
		System.out.println("combined the both first and second linked list elements:" + "\n" + numbers);
		/*
		 * we can combined the first and second linked list elements. // we print the
		 * second list elements in first.then using the method is addAll(int index,
		 * collectionobject): It is used to append all the elements in the specified
		 * collection, starting at the specified position of the list.
		 */
		numbers.addAll(0, names);
		System.out.println("print the elements :" + "\n" + names);

		/*
		 * addFirst(): it is used to this method adding the element in first
		 */

		/*
		 * for loop : using the for loop the elements are print one by one.
		 */
		// for (int i = 0; i <= numbers.size(); i++) {
		// System.out.println(numbers.get(i));
		// }
		/*
		 * Enhances for loop :
		 */
		for (int no : numbers) {
			System.out.println(" linked list elements:" + no);

		}

		// iterator:
		Iterator<Integer> it = numbers.iterator();
		while (it.hasNext()) {
			int num = it.next();
			System.out.println(num);
			// removing the current object if condition is true:
			
		}
		/*
		 * contains() method: search the elements present or not in linked list:
		 */
		System.out.println("Search the element in linked list: " + numbers.contains(100));

	/*
	 * remove(): remove() method is used to remove the elements in the list:
	 */
	System.out.println("removing the elements in list:" + "\n" + numbers.remove(0));
	// after removing the elements:
	System.out.println("After removing the elements:" + numbers);

	// removeAll ();
	// this method is used to remove the all elements in the list:
	System.out.println("remove the all elements in the list:" + "\n" + numbers.removeAll(names));
}
}