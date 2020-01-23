package com.org.javabasics.countinganimal;

import com.org.javabasics.constants.Constants;

public class CountingAnimal extends Animal {

	public static int fly = 0;

	public void getCountofAnimalActivities() {

		Animal animal = new Animal();
		if (animal.getBird().fly().equals(Constants.birdfly)) {
			fly++;
		}
		if (animal.getButt().fly().equals(Constants.butterfly)) {
			fly++;
		}
		
		//Similarly we need to have conditions for Sing,walk
	
	}

	public static void main(String arg[]) {

		CountingAnimal animal = new CountingAnimal();
		animal.getCountofAnimalActivities();
		System.out.println(fly);

	}

}
