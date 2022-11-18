package com.will.corejavaoperators;

public class AssignmentOperatorsDemo {

	public static void main(String[] args) {
		
		int x, y;
		x = 10;
		System.out.println("to start, x is: " + x);
		
		x = 50;
		y = x;
		System.out.println("x is : " + x);
		System.out.println("y is : " + y);

		y = x = 100;
		System.out.println("x is : " + x);
		System.out.println("y is : " + y);
	}
}
