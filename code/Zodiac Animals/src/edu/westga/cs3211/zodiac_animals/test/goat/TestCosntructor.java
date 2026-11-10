package edu.westga.cs3211.zodiac_animals.test.goat;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.zodiac_animals.model.Goat;

class TestCosntructor {

	@Test 
	void testConstructor() {

		assertDoesNotThrow(()->{
			Goat goat = new Goat(100, 100);
		});
	}
	
	@Test
	void testWeightNegative() {
		assertThrows(IllegalArgumentException.class, ()-> {
			Goat goat = new Goat(-1,100);
		});
	}
	@Test
	void testHeightNegative(){
		assertThrows(IllegalArgumentException.class, ()-> {
			Goat goat = new Goat(100,-1);
		});
	}
	}
