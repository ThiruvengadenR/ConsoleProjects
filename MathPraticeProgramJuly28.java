package MathClass;

public class MathPraticeProgramJuly28 {
	
	public static void main(String[] args) {
		int a = 2;
		long b = 4;
		float c = 120.45f;
		double d = 4540.212;
		MathPraticeProgramJuly28 obj = new MathPraticeProgramJuly28();
//		obj.absoluteValue(a);
//		obj.addition(a,b);
	//	obj.subtraction(a,b);
//		obj.decrement(a);
	//	obj.increment(a);
	//	obj.unitInTheLastPlace(c);// unable to understand 
	//	obj.FindMinimum(a,b);
	//	obj.findMaximum(a,b);
	//	obj.Mutiply(a,b);
	//	obj.divi(a,b); // doubt // floor unable to under stand 
	//	obj.remainer(a,b);
	//	obj.copySignParameter(a,b);
	//	obj.powerMethod(a,b);
	//	obj.roundOff(d);
	//	obj.generateRandomNumber();
		obj.findSquareRoot(c);
		obj.findCubeRoot(c);
		
	}

	public void findCubeRoot(double a) {
		System.out.println("Cube root of given double value "+Math.cbrt(a));
	}

	public void findSquareRoot(double a) {
		System.out.println("Square root of given double value "+Math.sqrt(a));
		
	}

	public void generateRandomNumber() {
		System.out.println("Generating the random number using random method "+(int)(Math.random()*1000));
		
	}

	public void roundOff(double a) {
		System.out.println("Round of given number "+(Math.round(a)));
		
	}

	public void powerMethod(int a, long b) {
		
		System.out.println("First argument raised to the power of the second argument "+(Math.pow(a, b)));
		
	}

	public void copySignParameter(int a,long b) {
		// copy the sign of the second parameter sign to the first parameter value.
		System.out.println("copy Sign Parameter "+(Math.copySign(a,b)));
		
	}

	public void remainer(int a, long b) {
		 // Divisor and dividend is having same sign --> output positive
		// Divisor is having negative sign --> output negative
		// Dividend is having negative sign --> output Positive 
		System.out.println("Give the remainder "+ Math.floorMod(a, b));
		
	}

	public void divi(int a, long b) {
		// doubt floorDiv method only return whole number 2.3-->2 also 2.75-->2 
		// it negative -2.33-->-3 why??
		System.out.println("Division of two given number "+Math.floorDiv(a,b));
	}

	public void Mutiply(int a, long b) {
		System.out.println("Product of two given number "+Math.multiplyExact(a, b));
		
	}

	public void findMaximum(int a, long b) {
		System.out.println("Maximum number of two given number " +(Math.max(a, b)));
		
	}

	public void FindMinimum(int a, long b) {
		System.out.println("Minimum number of two given number " +(Math.min(a, b)));
		
	}

	public void unitInTheLastPlace(float c) {
		// unable to understand what happened inside the method
		System.out.println(Math.ulp(c));
		
	}

	public void increment(int a) {
		//incrementExact is the static method use to add one in the given number . only works for int and long data type.
		System.out.println(Math.incrementExact(a));
	}

	public void subtraction(int a, long b) {
		//subtractExact is the static method used to subtract the two given values .only works for int and long data type.
		System.out.println(Math.subtractExact(a,b));
		
	}

	public void decrement(int a) {
		//decrement exact is the method is used to decrease by one in given number,Only works for int and long data types .
		System.out.println(Math.decrementExact(a));
	}

	public void addition(int a, long b) {
		//addition of  two number passed in the argument .only works for int and long data type.
		System.out.println(Math.addExact(a,b));
		
	}

	public void absoluteValue(int a) {
		//the absolute value of 5 is 5, and the absolute value of −5 is also 5.
		//The absolute value of a number may be thought of as its distance from zero along real number line.
		System.out.println(Math.abs(a));
		
	}

}
