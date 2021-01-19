package com.lenguyen.example;

import java.util.Scanner;

public class ExampleMeaningfulNames {
	/*Main method to test some functions in necessary case
	 * */
	private String number;
	private String verb;
	private String pluralModifier;
	
	public static void main(String[] args) {
		int count;
		char candidate;
		String sentence;
		
		Scanner clavier1 = new Scanner(System.in);
		System.out.println("Please enter number of candidate");
	
		count = clavier1.nextInt();
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("Please enter number of candidate");
	
		candidate = (clavier.nextLine()).charAt(0);
		
		System.out.println("Count = "+count+ ", Candidate = "+ candidate);
		
		ExampleMeaningfulNames callNonStaticMethodExemple = new ExampleMeaningfulNames();
		
		sentence = callNonStaticMethodExemple.make(candidate, count);
		System.out.println(sentence);
		
	}
	
	public String make(char candidate, int count) {
		createPluralDependentMessageParts(count);
		return String.format("There %s %s %s%s", this.verb, this.number, candidate, this.pluralModifier );
		
	}
	
	
	private void createPluralDependentMessageParts(int count) {
		if (count == 0) {
			therAreNoLetters();
		}else if (count==1) {
			therIsOneLetter();
		}else {
			thereAreManyLetter(count);
		}
	}
	
	
	private void therAreNoLetters() {
		this.number = "no";
		this.verb = "are";
		this.pluralModifier = "s";
		
	}
	
	private void therIsOneLetter() {
		this.number = "1";
		this.verb = "is";
		this.pluralModifier = "";
	}
	
	private void thereAreManyLetter(int count) {
		this.number = Integer.toString(count);
		this.verb = "are";
		this.pluralModifier = "s";
	}


}


