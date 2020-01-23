package com.org.javabasics.swimminganimals.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.org.javabasics.swimminganimals.Dolphin;
import com.org.javabasics.swimminganimals.SpecializeFish;

/**
 * 
 * @author Ramesh
 *
 */
public class FishTest {

	@Test
	public void typeOfFish() {
		String shark = SpecializeFish.fishType("Large", "Grey");
		assertNotNull(shark);
		assertEquals("Sharks are large and grey\n" + "Sharks eat other fish", shark);
		String clown = SpecializeFish.fishType("Small", "Orange");
		assertNotNull(clown);
		assertEquals("Clownfish are small and colourful\n" + "Clownfish make jokes", clown);
	}
	
	@Test
	public void dolphinTest() {
		String dolphinMsg=new Dolphin().swim();
		assertNotNull(dolphinMsg);
		assertEquals("Dolphin can swim", dolphinMsg);
	}

}
