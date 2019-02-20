package com.coveros.hello_world;

import static org.junit.Assert.*;

import org.junit.Test;

public class EvenNumberGeneratorTest {

	 @Test
	 public void testRandomEvenNumberGenerator() {

	  int randomResult = EvenNumberGenerator.generateRandomEven();

	  assertEquals(0, randomResult % 2);
	 }

}
