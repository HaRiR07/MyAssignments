package week2.day4;

public class Calculator {

	public void additionTwoNumber(int a, int b) {
		int c=a+b;
		System.out.println(c);
		}
	
	public void subractionTwoNumber(int e, int f) {
		int d=e-f;
		System.out.println(d);
		}	
	
	public void multipleTwoNumbers(double i, double j) {
		double h=i*j;
		System.out.println(h);

		}
	public void divideTwoNumber(float x, float y) {
		float k=x/y;
		System.out.println(k);
	}
	
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.additionTwoNumber(10, 10);
		calc.subractionTwoNumber(25, 15);
		calc.multipleTwoNumbers(20.5, 10.5);
		calc.divideTwoNumber(20.8f , 2.2f);
		
	}
}

