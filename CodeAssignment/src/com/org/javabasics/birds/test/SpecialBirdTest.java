package com.org.javabasics.birds.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.org.javabasics.birds.Chicken;
import com.org.javabasics.birds.Duck;
import com.org.javabasics.birds.SpecialBird;
/**
 * 
 * @author Ramesh
 *
 */
public class SpecialBirdTest {
	
	@Test
	public void chickenSoundTest() {
		SpecialBird sp=new Chicken();
		assertEquals("Cluck, cluck", sp.getSound());
		assertEquals("Chicken cannot fly", sp.activity());
	}
	
	@Test
	public void duckSoundTest() {
		SpecialBird sp=new Duck();
		assertEquals("Quack, quack", sp.getSound());
		assertEquals("Duck can Swim", sp.activity());
	}


}
