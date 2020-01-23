package com.org.javabasics.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.org.javabasics.Bird;
/**
 * 
 * @author Ramesh
 *
 */
public class BirdActivityTest{
	
	@Test
	void birdTest() {
		Bird bird=new Bird();
		assertEquals("I am flying", bird.fly());
		assertEquals("I am walking", bird.walk());
		assertEquals("I am singing", bird.sing());
	}

}
