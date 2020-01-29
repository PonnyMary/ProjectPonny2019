package org.java;

public class ArrayJava {

	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=10;
		a[1]=30;
		a[3]=40;
		a[4]=50;
		int i = a.length;

		System.out.println(i);
		System.out.println(a[3]);
			for (int j = 0; j < a.length; j++) {
				System.out.println(a[j]);
				}
			// 
			
			System.out.println(a[5]);
			System.out.println("Based on  values");
			for (int x : a) {
				System.out.println(x);
			}

	}

}
