package com.org.javabasics.animalbehaviour;

/**
 * 
 * @author Ramesh
 *
 */
public class MetamorphosisPart {

	public static void main(String arg[]) {

		Caterpillar caterpillar = new Caterpillar();
		System.out.println(caterpillar.fly());
		System.out.println(caterpillar.walk());
		caterpillar.transformToButterfly();

	}

}
