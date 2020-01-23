package com.org.javabasics.swimminganimals;

/**
 * 
 * @author Ramesh
 *
 */
public class SpecializeFishSolution {

	public static void main(String arg[]) {
		String shark = SpecializeFish.fishType("Large", "Grey");
		System.out.println(shark);
		String clown = SpecializeFish.fishType("Small", "Orange");
		System.out.println(clown);
		
		//Reused the Fish interface to give the implementation of Swim method 
		//no new code introduced
		String dolphinMsg=new Dolphin().swim();
		System.out.println(dolphinMsg);
	}

}
