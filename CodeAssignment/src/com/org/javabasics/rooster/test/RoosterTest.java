package com.org.javabasics.rooster.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.org.javabasics.constants.Constants;
import com.org.javabasics.rooster.Rooster;

public class RoosterTest {
	
	@Test
	public void roosterTest() {
		Rooster rooster= new Rooster();
		assertEquals(Constants.rooster, rooster.getSound());	
	}

}
