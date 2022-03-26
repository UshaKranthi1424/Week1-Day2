package week1.day3;

public class MyCalculator {

	public static void main(String[] args) {

		Calculator objCal = new Calculator();
			int addition=objCal.add(3,5,7);
			int subtraction=objCal.sub(10,5);
			double multiplication=objCal.mul(6d,5d);
			float division=objCal.divide(10f,5f);
			System.out.println("addition = " +addition+"\n"+"subtraction = " +subtraction+"\n"+
					"multiplication = " +multiplication+"\n"+"division = " +division); 
	}

}
