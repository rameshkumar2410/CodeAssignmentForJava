package com.org.javabasics.birds;

import com.org.javabasics.constants.Constants;

/**
 * 
 * @author Ramesh
 *
 */
public class Duck extends SpecialBird {
	
	public String activity() {
		return Constants.duckActivity;
	}

	public String getSound() {
		return Constants.duckSound;
	}
}
