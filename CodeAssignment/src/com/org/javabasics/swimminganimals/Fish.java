package com.org.javabasics.swimminganimals;

import com.org.javabasics.constants.Constants;
import com.org.javabasics.swimminganimals.interf.FishInterface;

/**
 * 
 * @author Ramesh
 *
 */
public class Fish implements FishInterface {

	public String sing() {
		return Constants.fishSing;
	}

	public String walk() {
		return Constants.fishWalk;
	}

	public String swim() {
		return Constants.fishSwim;
	}

	@Override
	public String getFishBodyType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFishActivities() {
		// TODO Auto-generated method stub
		return null;
	}

}
