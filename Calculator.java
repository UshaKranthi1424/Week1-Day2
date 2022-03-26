package week1.day3;

public class Calculator {
	
		public int add( int num1,int num2,int num3)
		{
			int sum = num1 + num2 + num3;
			return sum;
		}
		
		public int sub( int num1,int num2)
		{
			int diff = num1 -num2;
			return diff;
		}
		
		public double mul(double num1,double num2)
		{
			double prod = num1 * num2;
			return prod;	
		}
		
		public float divide( float num1,float num2)
		{
			float div = num1 / num2;
			return div;
		}
	
	public static void main(String[] args) {
		Calculator objCal = new Calculator();
			int addition=objCal.add(3,5,7);
			int subtraction=objCal.sub(10,5);
			double multiplication=objCal.mul(6d,5d);
			float division=objCal.divide(10f,5f);
			System.out.println("Addition of Given Numbers is "+addition);
			System.out.println("Subtration of Given numbers is "+subtraction);
			System.out.println("Multiplication of Given Numbers is "+multiplication);
			System.out.println("Division of Given Numbers is "+division);
	}

}
