package com.org.javabasics.animalbehaviour;

import com.org.javabasics.animalbehaviour.interf.CrawlingInsect;
import com.org.javabasics.animalbehaviour.interf.FlyingInsect;
import com.org.javabasics.constants.Constants;

public class Caterpillar implements CrawlingInsect {
	@Override
	public String fly() {
		return Constants.caterpillar;
	}

	@Override
	public String sound() {
		return null;
	}

	@Override
	public String walk() {
		return Constants.caterpillarActivity;
	}
	
	public void transformToButterfly() {
		FlyingInsect flyingInsect=new Butterfly();
		System.out.println(flyingInsect.fly());
		System.out.println(flyingInsect.sound());
	}
}
