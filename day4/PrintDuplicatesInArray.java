package week1.day4;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
		int arr [] = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		// get the length of the array
		System.out.println(arr.length);
		int count;
		
		// iterate from 0 to the array length-1 (outer loop starts here)
		for (int i = 0; i < arr.length; i++) {
			count=0;
			// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			for (int j = i+1; j < arr.length; j++) {
				// compare both the loop variables & check they're equal
				if(arr[i]==arr[j]) {
					// print the matching value
					System.out.println(arr[i]);
				}
				
			}
			
		}
		
		

	}

}
