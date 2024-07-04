package com.nrru.se65.jd65001;

public class HumanBeing {
	private double height;
	private double weight;
	private double bmi;
	
private double getheight() {
	return height;
}
public void setHeight(double height) {
	this.height = height ;
}

private double getweight() {
	return weight;
}
public void setWeight(double weight) {
	this.weight = weight;
}

private double getBmi() {
	return bmi;
}
public void setBmi(double bmi) {
	this.bmi = bmi;
}


	

public void calculateBMI() {
	Bmindexer bi1 = new Bmindexer();
	setBmi(bi1.calculateBmi(getheight(), getweight()));
}

public String analyzeBmi( ) {
	HealthAnalyzer ha = new HealthAnalyzer();
	return ha.analyzeBmi(getBmi());
}
}

