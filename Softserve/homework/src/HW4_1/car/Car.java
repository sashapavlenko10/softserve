package HW4_1car;

import java.util.Scanner;

public class Car {
private String type;
private int year;
private double engine;
Scanner sc = new Scanner(System.in);
public Car(String type, int year, double engine) {
	this.type = type;
	this.year = year;
	this.engine = engine;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	while (year<1900 || year >= 2020) {
		System.out.println("введите коректный год ");
    year = sc.nextInt();}
	this.year = year;
}
public double getEngine() {
	return engine;
}
public void setEngine(double engine) {
	this.engine = engine;
}
@Override
public String toString() {
	return "Car [type=" + type + ", year=" + year + ", engine=" + engine + "]";
}
public Car() {
	year = 0;
	type="";
	engine=0.0;
}
}
