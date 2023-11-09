package com.chainsys.day12.inheritence;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class CollectionLearningDemo2 {
	/*Write a Java program to iterate
	 *  through all elements in a linked list starting at the specified position.
	 */

	public static void main(String[] args) {
		LinkedList<String> color = new LinkedList<>();
		
		color.add("Red");
		color.add("Green");
		color.add("Black");
		color.add("White");
		
		System.out.println(color);
		
		Iterator<String> i= color.listIterator(1);
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		// Revers Iterator 
		
		Iterator<String> revers = color.descendingIterator();
		
		while (revers.hasNext()) {
			System.out.print(revers.next()+" , ");
		}
		System.out.println();
		
		//insert the specified element at the specified position in the linked list
		color.set(2, "pink");
		System.out.println(color);
		
		color.addFirst("Blue");
		color.addLast("Brown");
		System.out.println(color);

		
		//Swapping Element 0 and 3
		System.out.println("Before Swapping ="+color);
		Collections.swap(color, 0, 3);
		System.out.println("After Swapping = "+color);
		
		
		
		//Joining Two List
		LinkedList<Integer> num = new LinkedList<>();
		num.add(1);
		num.add(2);
		Collections.addAll(num,3,3,34);
		System.out.println(num);
		
		LinkedList join = new LinkedList<>();
		join.addAll(color);
		join.addAll(num);
		System.out.println(join);
	}

}
