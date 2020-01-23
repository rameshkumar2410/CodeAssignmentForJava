package com.org.javabasics;

import com.org.javabasics.interfaces.BirdActivities;

/**
 * 
 * @author Ramesh
 *
 */
public class Bird extends Animal implements BirdActivities {

	public String fly() {
		return "I am flying";
	}

	@Override
	public String sing() {
		return "I am singing";
	}

}
