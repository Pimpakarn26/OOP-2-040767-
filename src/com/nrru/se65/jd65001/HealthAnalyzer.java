package com.nrru.se65.jd65001;

public class HealthAnalyzer {
	
	public String analyzeBmi(double bmi) {
		if(bmi <=18.4) {
			return "Underweight";
		}else if(bmi <= 39.9) {
			return "Normal weight";
		}else {
			return "obesity";
		}
	}
}
