package com.org.javabasics.parrot;

import com.org.javabasics.constants.Constants;

/**
 * 
 * @author Ramesh
 *
 */
public class Dog extends Parrot{
	@Override
	public String parrotSays() {
		return Constants.dog;
	}
	
}
