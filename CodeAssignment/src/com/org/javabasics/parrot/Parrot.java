package com.org.javabasics.parrot;

/**
 * 
 * @author Ramesh
 *
 */
public abstract class Parrot {
	
	public abstract String parrotSays();
	
	public String getMessgae(String name) {
		return "A parrot living with "+name+" Says "+this.parrotSays();
	}

}
