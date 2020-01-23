package com.org.javabasics.birds;

import com.org.javabasics.constants.Constants;

/**
 * 
 * @author Ramesh
 *
 */
public class Chicken extends SpecialBird {

	public String activity() {
		return Constants.chickActivity;
	}
	
	public String getSound() {
		return Constants.chickSound;
	}

}
