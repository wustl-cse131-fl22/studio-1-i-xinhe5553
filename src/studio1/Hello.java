package studio1;

import java.util.Scanner;

public class Hello {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		String name = in.nextLine();
		System.out.println("How are you feeling today" + name + "?");
		String mood = in.nextLine();
		
		System.out.println("Hello and welcome to CSE 131!");
		System.out.println("You seem to be feeling " + mood);
	}

}
