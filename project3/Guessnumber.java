package project3;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.math.*;

public class Guessnumber {
	
//	final static short randomNumber = (short) (Math.random()*100);
	static int countGetInput=0;
	static int countStart =0;
	static int countEnd =0;

	public static void main(String[] args) throws OverTryException {
		Guessnumber obj = new Guessnumber();
		obj.instruction();
		long start = obj.set_Starting_Number_for_Range();
		long end = obj.set_Ending_Number_for_Range();
		long randomNumber = obj.setRandomNumber(start, end);
			// System.out.println(randomNumber);//printing random number 
		long userGuess = getinput(start , end);
		obj.checkTheNumber(userGuess , randomNumber ,start ,end);
	}

	private long setRandomNumber(long start, long end) {
		long randomNumber =(long) (start +(Math.random()*end));
		long range =0;
		if(randomNumber>end)
		{
			range = (randomNumber-end);
		}
		return (randomNumber>end)? randomNumber-range:randomNumber;
	}

	private long set_Ending_Number_for_Range() throws OverTryException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ending Range: The highest number in the range you can guess ");
	//	int count =0;
		long end = 100;
		try
		{
			end  = sc.nextLong();
		}
		catch(InputMismatchException e)
		{
			countEnd++;
			if(countEnd>3)
			{
				System.out.println("You cross the max limit ");
				throw new OverTryException("Continous wrong input ");
			}
			else
			{
				System.out.println("Only number are allowed ");
				set_Starting_Number_for_Range();
			}
		}
		return end ;
	}

	private long set_Starting_Number_for_Range() throws OverTryException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Starting Range: The lowest number in the range you can guess from ");
	//	int count =0;
		long start = 0;
		try
		{
			 start = sc.nextLong();
		}
		catch(InputMismatchException e)
		{
			countStart++;
			if(countStart>3)
			{
				System.out.println("You cross the max limit ");
				throw new OverTryException("Continous wrong input ");
			}
			else
			{
				System.out.println("Only number are allowed ");
				set_Starting_Number_for_Range();
			}
		}
		return start;
	}

	private void instruction() {
		System.out.println("  ^^^Instructions^^^\n  ");
		System.out.println("## Setup: The game begins by setting a target number, which is a randomly generated number within a predefined range.\n"
				+ "## Range Input: The player is asked to provide a range of numbers within which the target number lies. For example, they might specify a range between 1 and 100.\n"
				+ "## Guessing: The player starts making guesses for the target number within the specified range.\n"
				+ "## Feedback: After each guess, the game provides feedback to the player. If the guess is too high, the player is told that their guess is too high. If the guess is too low, they're informed that their guess is too low.\n"
				+ "## Refinement: Based on the feedback, the player refines their guesses to narrow down the possible range for the target number.\n"
				+ "## Winning: The game continues until the player correctly guesses the target number. Once they guess it right, they're informed that they've won along with the number of guesses they took.\n"
				+ "## Restart: The player can choose to restart the game and try to guess a new target number.");
		System.out.println();
	}

	private void checkTheNumber(long userGuess , long randomNumber , long start ,long end) throws OverTryException {
		long userGuessNum = userGuess;
		int i = 1;
		while(i<=50)
		{
		if(userGuessNum==randomNumber)
		{
			System.out.println(""
					+ "### Congratulations you are successfully find the random number ###");
			System.out.println(" ***you take " + i+ " attempt to find the random  number *** ");
			System.out.println();
			break;
		}
		else if(userGuessNum>randomNumber)
		{
//			 if(userGuess>start && userGuess<start)
//			 {
				System.out.println(userGuessNum +" is Greater than the random number ");
				System.out.println();
				userGuessNum = getinput(start,end);
//			 }
//			 else
//			 {
//				userGuessNum = getinput(start,end);
//			 }
		}
		else if(userGuessNum<randomNumber)
		{
//			if(userGuess>start && userGuess<start)
//			 {
				System.out.println(userGuessNum +" is Smaller than the random number ");
				System.out.println();
				userGuessNum = getinput(start,end);
//			 }
//			 else
//			 {
//				userGuessNum = getinput(start,end); 
//			 }
		}
		else if (i==50)
		{
			System.out.println("Maxium chances are over Try Again ");
			System.out.println();
			break;
		}
		i++;
		}
	}
	static private long getinput(long start , long end) throws OverTryException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number between " + start +" to "+end );
		//int count =0;
		long userGuess= -1;
		try {
			 userGuess = sc.nextLong();
			 if(userGuess >end || userGuess<start)
			 {
				 throw new ArithmeticException("Please enter the number with in the range");
			 }
		}
		catch(InputMismatchException e)
		{
			countGetInput++;
			if(countGetInput>3)
			{
				System.out.println("Try Again max limit over :( :(");
				throw new OverTryException("Continous wrong input ");
			}
			else
			{
				System.out.println("Please enter valid number ");
				getinput(start,end);
			}
		}
		catch(ArithmeticException e)
		{
			countGetInput++;
			if(countGetInput>3)
			{
				System.out.println("Try Again max limit over :( :(");
				throw new OverTryException("Continous wrong input ");
			}
			else
			{
				System.out.println(e);
				getinput(start,end);
			}
		}
		return (userGuess>end)? getinput(start,end):userGuess;
	}
}
