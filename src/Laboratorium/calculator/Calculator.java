package Laboratorium.calculator;

public class Calculator {
	private double result = 0.0;

	public double getResult(){
		return result;
	}
	void add(double value){
		result += value;
	}
	void mult(double value){
		result *= value;
	}
}
