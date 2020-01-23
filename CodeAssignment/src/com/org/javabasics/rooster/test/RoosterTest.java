package com.org.javabasics.rooster.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.org.javabasics.rooster.Rooster;

public class RoosterTest {
	
	@Test
	public void roosterTest() {
		Rooster rooster= new Rooster();
		assertEquals("Cock-a-doodle-doo", rooster.getSound());	
	}

}
