package Week1.day2;

public class Calculator {
	
	public int add(int firstno, int secondno) {
	int sum = 	firstno + secondno;
	return sum;

	}
	
	public double sub(double firstnumber, double secondnumber) {
	double subResult = 	firstnumber - secondnumber;
	return subResult;

	}
	
	public double mul(double mulone, double multwo) {
	double mulres = mulone + multwo;
	return mulres;

	}
	
	public int div(int divfirst, int divtwo) {
		int divres = divfirst / divtwo;
		return divres;
		
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println("Addition" + calc.add(5, 5));
		System.out.println("Subtraction" + calc.sub(21.34, 34.23));
		System.out.println("Multiplication" + calc.mul(12.50, 12.50));
		System.out.println("Division" + calc.div(10, 5));
		
		
		
	}

}
