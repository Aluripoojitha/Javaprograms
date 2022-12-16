package com.java.polymorphism;

public class MethodOverloading {
	static int add(int a, int b) {
		return a+b;
	}
static int add (int a, int b, int c) {
	return a+b+c;
}
public static void main(String ar[]) {
	System.out.println(add(2,4));
	System.out.println(add(2,4,6));
}
}

