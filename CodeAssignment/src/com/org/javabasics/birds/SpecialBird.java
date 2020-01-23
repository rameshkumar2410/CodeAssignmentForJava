package com.org.javabasics.birds;

/**
 * 
 * @author Ramesh
 *
 */
public abstract class SpecialBird {
	public abstract String activity();

	public abstract String getSound();

	public void getMessage(String name) {

		System.out.println("A " + name + " says " + this.getSound());

	}
}
