package week1.day3;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		
		int [] arr= {3,4,5,6,24,25,49,50};
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
			
		}
		System.out.println("Second largest array element is " + arr[arr.length-2]);

	}

}
