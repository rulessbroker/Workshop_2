package com.bridgelabz;

public class ArraysSpecialCharacterRemoveProblem {
	public static void main(String[] args) {

//		Problem statement :- 
//		Take char array, in that include characters as well as special characters.
//		print char array into string without special character.

		char input[] = { 'r', ',', 'a', '.', 'h', '!', 'u', '@', 'l' };	//Taking char array with special characters
		String s = String.valueOf(input);								//Convert array char array into string
		System.out.println("Without removing special character : ");
		System.out.println(s);											//print without removing special character
		System.out.println("\nAfter removing Special characters : ");	//remove special character from array
		for (int i = 0; i < s.length(); i++) {							//using for loop for taking each index
			if (s.charAt(i) != ',' && s.charAt(i) != '.'				//compare each index with special character in if statement
					&& s.charAt(i) != '!' && s.charAt(i) != '@') {
				System.out.print(s.charAt(i) + " ");					//Printing reaming indexes vice-versa.

			}

		}

	}
}
