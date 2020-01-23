package com.org.javabasics.swimminganimals;

import com.org.javabasics.swimminganimals.interf.FishInterface;

/**
 * 
 * @author Ramesh
 *
 */
public class Shark implements FishInterface{

	public String getFishBodyType() {
		return "Sharks are large and grey";
	}

	public String getFishActivities() {
		return "Sharks eat other fish";
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
