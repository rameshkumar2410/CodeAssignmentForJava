package com.org.javabasics.parrot.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.org.javabasics.parrot.Cat;
import com.org.javabasics.parrot.Dog;
import com.org.javabasics.parrot.Parrot;
import com.org.javabasics.parrot.Rooster;

public class ParrotMessageTest {
	
	@Test
	public void parrotSoundTest() {
		Parrot parrot=new Dog();
		assertEquals("A parrot living with Dog Says Woof woof", parrot.getMessgae("Dog"));
		parrot=new Cat();
		assertEquals("A parrot living with Cat Says Meow", parrot.getMessgae("Cat"));
		parrot=new Rooster();
		assertEquals("A parrot living with Rooster Says Cock-a-doodle-doo", parrot.getMessgae("Rooster"));
	}

}
