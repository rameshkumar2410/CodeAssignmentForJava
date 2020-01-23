package com.org.javabasics.rooster;

import com.org.javabasics.constants.Constants;
import com.org.javabasics.rooster.interfaces.Chicken;

/**
 * 
 * @author Ramesh
 *
 */
public class Rooster implements Chicken {
	@Override
	public String getSound() {
		return Constants.rooster;
	}

	public String relation() {
		return Constants.roosterRelation;
	}

}
