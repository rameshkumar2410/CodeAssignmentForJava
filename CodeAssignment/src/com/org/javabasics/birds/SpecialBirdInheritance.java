package com.org.javabasics.birds;


/**
 * 
 * @author Ramesh
 *
 */
public class SpecialBirdInheritance {

	public static void main(String arg[]) {
		SpecialBird bird=new Duck();
		bird.getMessage("Duck");
		bird.activity();
		System.out.println(""+bird.activity());
		bird=new Chicken();
		bird.getMessage("Chicken");
		bird.activity();
		System.out.println(""+bird.activity());
	}
	
}
