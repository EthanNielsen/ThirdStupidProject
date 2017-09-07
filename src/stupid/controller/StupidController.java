package stupid.controller;


import java.util.Scanner;

/**
 * @author enie1762 gethannielsengmail.com
 */

public class StupidController

{

	public void start()
	{
		System.out.println("I am going to rock climbing today!");
	
		testScanner();
	}
	
	private void testScanner()
	{
		Scanner firstScanner;
		firstScanner = new Scanner(System.in);
		System.out.println("What is your favorite food?");
		String answer = firstScanner.nextLine();
		System.out.println("Oh cool, you like " + answer);
	}
	

}
