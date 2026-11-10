package edu.westga.cs3211.zodiac_animals.model;

public class Goat {
	int weight;
	int height;
	public Goat(int weight, int height) {
		if(weight < 0) {
			throw new IllegalArgumentException("Weight cannot be negative");
		}
		if (height < 0) {
			throw new IllegalArgumentException("Height cannot be negative");
		}
		this.weight = weight;
		this.height = height;
	}
}
