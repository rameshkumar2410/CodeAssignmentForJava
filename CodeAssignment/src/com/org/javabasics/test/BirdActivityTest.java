package com.org.javabasics.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.org.javabasics.Bird;
import com.org.javabasics.constants.Constants;
/**
 * 
 * @author Ramesh
 *
 */
public class BirdActivityTest{
	
	@Test
	void birdTest() {
		Bird bird=new Bird();
		assertEquals(Constants.birdfly, bird.fly());
		assertEquals(Constants.animalWalk, bird.walk());
		assertEquals(Constants.birdSing, bird.sing());
	}

}
