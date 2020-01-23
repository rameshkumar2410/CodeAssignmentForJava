package com.org.javabasics;

/**
 * 
 * @author Ramesh
 *
 */
public class Solution {

	public static void main(String arg[]) {
		Bird bird = new Bird();
		String flyMsg=bird.fly();
		String walkMsg=bird.walk();
		String singMsg=bird.sing();
		System.out.println("  "+flyMsg+"   "+walkMsg+"   "+singMsg);
		
	}
}
