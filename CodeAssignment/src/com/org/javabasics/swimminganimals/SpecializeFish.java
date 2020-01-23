package com.org.javabasics.swimminganimals;

/**
 * 
 * @author Ramesh
 *
 */
public class SpecializeFish {

	public boolean isShark;
	public boolean isClown;

	public SpecializeFish(boolean isShark, boolean isClown) {
		this.isShark = isShark;
		this.isClown = isClown;
	}

	public boolean getIsShark() {
		return this.isShark;
	}

	public boolean getIsClown() {
		return this.isClown;
	}

	public static String fishType(String type, String color) {
		if (type.equals("Large") && color.equals("Grey")) {
			Shark shrk = new Shark();
			return shrk.getFishBodyType() + "\n" + shrk.getFishActivities();
		}
		if (type.equals("Small") && color.equals("Orange")) {
			ClownFish clown = new ClownFish();
			return clown.getFishBodyType() + "\n" + clown.getFishActivities();
		}
		return null;
	}
}
