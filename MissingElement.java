package week1.day3;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		// Here is the input
		int[] arr1 = {1,2,3,4,7,6,8};

		// Sort the array	
		Arrays.sort(arr1);	

			// loop through the array (start i from arr1[0] till the length of the array)
			for(int i=arr1[0];i<arr1.length;i++)
			{
				// check if the iterator variable is not equal to the array values respectively	
				if (i!=arr1[i-1])
				{
					
					// print the number
					System.out.println(i);	
					// once printed break the iteration
					break;
				}
			}

	}

}
