package week1.day5;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare a String 
		String text1 = "stops";
		String text2 = "potss";
		//Check length of the strings are same then (Use A Condition)
		if(text1.length()==text2.length()) {
			//System.out.println("same");
		
		//Convert both Strings in to characters
		char[] chararray1 = text1.toCharArray();
		char[] chararray2 = text2.toCharArray();
		Arrays.sort(chararray1);
		Arrays.sort(chararray2);
			if(Arrays.equals(chararray1,chararray2)) {
				System.out.println("It is an Anagram");
		}else {
			System.out.println("It is not an Anagram");
		}
		}
		}
	}

