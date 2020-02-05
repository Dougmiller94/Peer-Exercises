package com.qa.factorials;

public class FactorialFinder {
	public int number;
	
	public FactorialFinder (int number) {
		this.number = number;
	}
	
	public Boolean findOutIfFactorial() {
		boolean methodStillRunning = true;
		int divisor = 1;
		int divisorFactorial = 1;
		boolean isAFactorial = false;
		while (methodStillRunning) {
			if (divisorFactorial == number) {
				System.out.println(number + " = " + divisor + "!");
				methodStillRunning = false;
				isAFactorial = true;
			} else if (divisorFactorial < number){
				divisor += 1;
				divisorFactorial = divisorFactorial * divisor;
				
			} else {
				isAFactorial = false;
				methodStillRunning = false;
			}
		}
		
		System.out.println(isAFactorial);
		return isAFactorial;
}
}
	
	

