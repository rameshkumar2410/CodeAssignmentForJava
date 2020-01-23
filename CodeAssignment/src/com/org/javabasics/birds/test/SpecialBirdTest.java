package com.org.javabasics.birds.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.org.javabasics.birds.Chicken;
import com.org.javabasics.birds.Duck;
import com.org.javabasics.birds.SpecialBird;
import com.org.javabasics.constants.Constants;
/**
 * 
 * @author Ramesh
 *
 */
public class SpecialBirdTest {
	
	@Test
	public void chickenSoundTest() {
		SpecialBird sp=new Chicken();
		assertEquals(Constants.chickSound, sp.getSound());
		assertEquals(Constants.chickActivity, sp.activity());
	}
	
	@Test
	public void duckSoundTest() {
		SpecialBird sp=new Duck();
		assertEquals(Constants.duckSound, sp.getSound());
		assertEquals(Constants.duckActivity, sp.activity());
	}


}
