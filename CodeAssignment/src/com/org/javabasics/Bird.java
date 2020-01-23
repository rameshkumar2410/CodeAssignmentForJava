package com.org.javabasics;

import com.org.javabasics.constants.Constants;
import com.org.javabasics.interfaces.BirdActivities;

/**
 * 
 * @author Ramesh
 *
 */
public class Bird extends Animal implements BirdActivities {

	public String fly() {
		return Constants.birdfly;
	}

	@Override
	public String sing() {
		return Constants.birdSing;
	}

}
