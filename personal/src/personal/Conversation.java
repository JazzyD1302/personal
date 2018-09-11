package personal;

import java.util.Random;
import java.util.Scanner;

public class Conversation {

	static String name;
	static Scanner in = new Scanner(System.in);
	static String answer;
	static Random random = new Random();
	static int num;

	public static void main(String[] args) {
		System.out.println("Hi I am Prime M." + " What's your name");
		if (in.hasNext("Dante")) {
			name = "Dante";
			System.out.println("Prove it. " + "Say his favortie number");
			in.next();
			in.hasNext("26");
			System.out.println("hi " + name + " How was your day");
		} else {
			name = in.next();
			System.out.println("hi " + name + " How was your day");
		}

		answer = in.next();
		if (in.hasNext("bad") || in.hasNext("Bad")) {
			System.out.println("why");
			answer = in.next();
			in.next();
			System.out.println("that sucks " + name);
		} else {
			in.hasNext("good");
			System.out.println("Cool " + name);
		}
		fun();
	}

	private static void fun() {

		System.out.println("want to play a game");
		in.next();
		if (in.hasNext("yes")) {
			System.out.println("Ok, so the point of the game is to guess the number I am thinking of");
			System.out.println("The numbers are from 1 to 10 ");
			num = random.nextInt(10) + 1;
			in.next();
			int guess = in.nextInt();
			if (num == guess) {
				System.out.println("yay you win");
			} else {
				System.out.println("sorry you lose");}
				System.out.println("again?");
				in.next();
				
				if(in.hasNext("yes"));{
				fun();
				}	
					
				if (in.hasNext("no")) {
			

				}
			}
		}
	}
