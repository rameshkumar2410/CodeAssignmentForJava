package com.org.javabasics.swimminganimals;

import com.org.javabasics.constants.Constants;
import com.org.javabasics.swimminganimals.interf.FishInterface;

/**
 * 
 * @author Ramesh
 *
 */
public class ClownFish implements FishInterface {
	
	public String getFishBodyType() {
		return Constants.fishBodyType;
	}

	public String getFishActivities() {
		return Constants.fishActivity;
	}

	@Override
	public String sing() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String walk() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String swim() {
		// TODO Auto-generated method stub
		return null;
	}

}
