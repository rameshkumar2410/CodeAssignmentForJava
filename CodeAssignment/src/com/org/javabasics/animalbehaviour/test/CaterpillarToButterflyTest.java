package com.org.javabasics.animalbehaviour.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.org.javabasics.animalbehaviour.Butterfly;
import com.org.javabasics.animalbehaviour.Caterpillar;
import com.org.javabasics.animalbehaviour.interf.FlyingInsect;
import com.org.javabasics.constants.Constants;

/**
 * 
 * @author Ramesh
 *
 */
public class CaterpillarToButterflyTest {

	@Test
	public void metamorphosisTest() {
		Caterpillar caterpillar = new Caterpillar();
		System.out.println(caterpillar.fly());
		System.out.println(caterpillar.walk());
		caterpillar.transformToButterfly();

		assertNotNull(caterpillar.fly());
		assertEquals(Constants.caterpillar, caterpillar.fly());
		assertNotNull(caterpillar.walk());
		assertEquals(Constants.caterpillarActivity, caterpillar.walk());

		FlyingInsect flyingInsect = new Butterfly();

		assertNotNull(caterpillar.fly());
		assertEquals(Constants.butterfly, flyingInsect.fly());
		assertNotNull(caterpillar.walk());
		assertEquals(Constants.butterflySound, flyingInsect.sound());

	}

}
