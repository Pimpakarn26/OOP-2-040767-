package com.nrru.se65.jd65001;

public class Bmindexer {
	
	public double calculateBmi(double height, double weight) {
		return (weight/(height*height))*10000;
	}
}
