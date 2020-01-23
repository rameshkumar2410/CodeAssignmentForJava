package com.org.javabasics.animalbehaviour;

import com.org.javabasics.animalbehaviour.interf.FlyingInsect;
import com.org.javabasics.constants.Constants;

public class Butterfly implements FlyingInsect {
	@Override
	public String fly() {
		return Constants.butterfly;
	}

	@Override
	public String sound() {
		return Constants.butterflySound;
	}
}
