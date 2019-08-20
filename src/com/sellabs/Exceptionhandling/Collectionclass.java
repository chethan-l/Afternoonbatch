
package com.sellabs.Exceptionhandling;

import java.util.ArrayList;
import java.util.List;

public class Collectionclass {

	public static List<Integer> displaynumbers() {

		List<Integer> l = new ArrayList<Integer>();
		int i;
		for (i = 1; i <= 10; i++) {
			l.add(i);
		}
		return l;

	}

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();

		li.addAll(displaynumbers());
		try {
			System.out.println(li.get(11));
		} catch (IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("Index is not present : " + e.getMessage());
		}

		System.out.println("Elements in list which are returned by diplaynumbers  " + li);
		System.out.println("Size of the list" + li.size());

	}

}