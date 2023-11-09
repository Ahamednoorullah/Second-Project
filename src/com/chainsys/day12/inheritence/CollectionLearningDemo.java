package com.chainsys.day12.inheritence;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class CollectionLearningDemo {

	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<>();
		alist.add(1);
		alist.add(3);
		alist.add(68);
		alist.add(22);
		
		alist.add(3, 30);
		alist.remove(2);
		alist.set(2, 33);
		
		
		for (int x  : alist) {
			System.out.println(alist);
		}
		
		ArrayList all = new ArrayList<>(); 
		all.add(1);
		all.add("Ahamed");
		all.add(20.00);
		
		System.out.println(all);
		for (Object obj : all) {
			System.out.println(obj);
		}
		
		Queue<String> color = new LinkedList<>();
		color.add("Red");
		color.add("Green");
		color.add("White");
		color.add("Black");
	System.out.println(color);
	System.out.println("Head is "+color.peek());
	//color.remove("Red");
	System.out.println("Head is "+color.peek());
	//color.remove();
	System.out.println(color);
	color.remove(color);
	System.out.println("Remove "+color);
	
	Scanner sc = new Scanner(System.in);
	
	List color_list = new ArrayList<>();
	for (int i = 0; i < 4; i++) {
		System.out.println("Enter Color");
		color_list.add(sc.next());
	}
     System.out.println(color_list);	
		//color_list.set(2, "Black");
		//System.out.println(color_list);
		//System.out.println(color_list.get(3));
		if (color_list.contains("Red")) {
			System.out.println();
			System.out.println("Found the element");
		} else {
            System.out.println("Not found");
		}
	}

}
