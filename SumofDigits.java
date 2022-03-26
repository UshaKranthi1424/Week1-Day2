package week1.day3;

public class SumofDigits {

	public static void main(String[] args) {
		
		// Declare your input number (int)
		int num=123;
		
		// Initialize an integer variable by name: sum
		int sum=0;
				
		// Use loop to calculate the sum: use while loop to set condition until the number goes greater than 0
		while(num>0)
		{
		
		// Within loop: get the remainder when done by 10 -> Tip: use mod %
			int rem=num%10;
			
			// Print the remainder to confirm
			System.out.println(rem);
			
			// Within loop: add that remainder to the sum
			sum=sum+rem;
			
			// Print the sum to confirm
			System.out.println(sum);
			
			// Within loop: get quotient of that number (tip: quotient should be same variable of loop condition)
			num=num/10;
					
			// Print the quotient to confirm
			System.out.println(num);
		}
			// Outside the loop: print the final sum
		System.out.println(sum);

	}

}
