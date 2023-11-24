package ConsoleGame_Palaguly;

import java.util.ArrayList;
import java.util.Scanner;

public class Pallankuli {
	
	public static int totalPointForPlayer1;
	public static int totalPointForPlayer2;
	
	public static int currentPointForPlayer1;
	public static int currentPointForPlayer2;
	
	public static int player1Input;
	public static int player2Input;
	
	public static boolean isGameOver;
		
	public static void main(String[] args) {
		Pallankuli obj = new Pallankuli();
		ArrayList <Integer> Player1 = new ArrayList();
		ArrayList <Integer> Player2 = new ArrayList();
		obj.valueInitiation(Player1,Player2);
		obj.printTheBoard(Player1,Player2);
		obj.letsPlayPallankuli( obj, Player1, Player2);
	}
	
	public void letsPlayPallankuli(Pallankuli obj,ArrayList Player1,ArrayList Player2)
	{
//		//first time
		while(isGameOver==false)
		{
			if(letsContinueOurGame(Player1)==true)
			{
				obj.inputFromPlayer1(Player1);
				obj.rotationForPlayer1Forward(player1Input,Player1,Player2);
				System.out.println("Total point for player1 -->" +totalPointForPlayer1);
				System.out.println("Current point for player1 -->" +currentPointForPlayer1);
				System.out.println();
				//obj.printTheBoard(Player1,Player2);
				System.out.println("-------------------------------------******************************");
				if(letsContinueOurGame(Player2)==true)
				{
					obj.inputFromPlayer2(Player2);
					obj.rotationForPlayer2Reverse(player2Input,Player1,Player2);
					System.out.println("Total point for player2 -->" +totalPointForPlayer2);
					System.out.println("Current point for player2 -->" +currentPointForPlayer2);
					System.out.println("-------------------------------------******************************");
				}
				else {
					finalResult(Player1,Player2);
				}
			}
			else {
				finalResult(Player1,Player2);
			}
		}
	}

	public void finalResult(ArrayList Player1,ArrayList Player2)
	{
		System.out.println("!!!!!!!!!-----------Game Over----------!!!!!!!!!!");
		System.out.println();
		printTheBoard(Player1,Player2);
		for(int i=0;i<7;i++)
		{
			totalPointForPlayer1 = totalPointForPlayer1+ (int) Player1.get(i);
			totalPointForPlayer2 = totalPointForPlayer2+ (int) Player2.get(i);
		}
		System.out.println("Total point for player1 --> " + totalPointForPlayer1);
		System.out.println("Total point for player2 --> " + totalPointForPlayer2);
		if(totalPointForPlayer1>totalPointForPlayer2)
		{
			System.out.println("Player1 Win the Game");
		}
		else if(totalPointForPlayer1<totalPointForPlayer2)
		{
			System.out.println("Player2 Win the Game2");
		}
		else {
			System.out.println("Match Draw");
		}
		isGameOver=true;
	}
	
	public void rotationForPlayer1Forward(int rotationIndex ,ArrayList Player1,ArrayList Player2)
	{
		int rotationNumber=(int) Player1.get(rotationIndex);
		if(rotationNumber==0)
		{
			if(rotationIndex<6)
			{
				rotationIndex++;
				currentPointForPlayer1 = (int) Player1.get(rotationIndex);
				totalPointForPlayer1= totalPointForPlayer1+ (int) Player1.get(rotationIndex);
				Player1.set(rotationIndex, 0);
				return;
			}
			else {
				rotationIndex++;
				rotationIndex = indexTransformForward(rotationIndex);
				currentPointForPlayer1 = (int) Player2.get(rotationIndex);
				totalPointForPlayer1= totalPointForPlayer1+ (int) Player2.get(rotationIndex);
				Player2.set(rotationIndex, 0);
				return;
			}
		}
		System.out.println("now i get the rotation value " + rotationNumber);
		Player1.set(rotationIndex, 0);
		rotationIndex++;
		for(int i=0;i<rotationNumber;i++)
		{
			//Bonus point in some exception sutivation
			if(i==14)
			{
				addBonusToRespectivePlayer(Player1,Player2);
			}
			if(rotationIndex<=6)
			{
				Player1.set(rotationIndex,(int)Player1.get(rotationIndex)+1);
			}
			else if(rotationIndex>6)
			{
				 if(rotationIndex>13)
				 {
					int reWorkedIndex=indexTransformForward(rotationIndex);
					if(rotationIndex>20)
					{
						reWorkedIndex=indexTransformForward(reWorkedIndex);
						Player2.set( (reWorkedIndex),(int)Player2.get(reWorkedIndex)+1);
						
					}
					else
						Player1.set( (reWorkedIndex),(int)Player1.get(reWorkedIndex)+1);
				}
				else
				{
					int reWorkedIndex=indexTransformForward(rotationIndex);
					Player2.set( (reWorkedIndex),(int)Player2.get(reWorkedIndex)+1);
				}
			}
			rotationIndex++;
		}
		//adding bonus points 
		addBonusToRespectivePlayer(Player1,Player2);
		//simple Board Printing
		printTheBoard(Player1,Player2);
		if(rotationIndex>6)
		{
			if(rotationIndex>13)
			{
				rotationIndex=indexTransformForward(rotationIndex);
				if(rotationIndex>6)
				{
					rotationIndex=indexTransformForward(rotationIndex);
					rotationForPlayer1Reverse(rotationIndex , Player1, Player2);
				}
				else
				rotationForPlayer1Forward(rotationIndex , Player1, Player2);
			}
			else
			{
				rotationIndex=indexTransformForward(rotationIndex);
				rotationForPlayer1Reverse(rotationIndex , Player1, Player2);
			}	
		}
		else {
			rotationForPlayer1Forward(rotationIndex , Player1, Player2);
		}
	}
	
	
	public void rotationForPlayer1Reverse(int rotationIndex ,ArrayList Player1,ArrayList Player2)
	{
		int rotationNumber=(int) Player2.get(rotationIndex);
		if(rotationNumber==0)
		{
			if(rotationIndex>=0)
			{
				rotationIndex--;
				rotationIndex=indexTransformReverse(rotationIndex);
				if(rotationIndex>6)
				{
					rotationIndex=indexTransformForward(rotationIndex);
					currentPointForPlayer1 =(int) Player2.get(rotationIndex);
					totalPointForPlayer1= totalPointForPlayer1+ (int) Player2.get(rotationIndex);
					Player2.set(rotationIndex, 0);
					return;
				}
				else {
					currentPointForPlayer1 = (int) Player1.get(rotationIndex);
					totalPointForPlayer1= totalPointForPlayer1+ (int) Player1.get(rotationIndex);
					Player1.set(rotationIndex, 0);
					return;
				}
			}
			if(rotationIndex<=6)
			{
				rotationIndex--;
				currentPointForPlayer1 = (int) Player2.get(rotationIndex);
				totalPointForPlayer1= totalPointForPlayer1+ (int) Player2.get(rotationIndex);
				Player2.set(rotationIndex, 0);
				return;
			}
		}
		System.out.println("now i get the rotation value " + rotationNumber);
		Player2.set(rotationIndex, 0);
		rotationIndex--;
		for(int i=0;i<rotationNumber;i++)
		{
			//Bonus point in some exception sutivation
			if(i==14)
			{
				addBonusToRespectivePlayer(Player1,Player2);
			}
			if(rotationIndex>=0)
			{
				Player2.set(rotationIndex,(int)Player2.get(rotationIndex)+1);
			}
			else if(rotationIndex<0)
			{
				int reWorkedIndex=indexTransformReverse(rotationIndex);
				if(rotationIndex<-7)
				{
					Player2.set((reWorkedIndex),(int)Player2.get(reWorkedIndex)+1);
				}
				else
				Player1.set( (reWorkedIndex),(int)Player1.get(reWorkedIndex)+1);
			}
			rotationIndex--;
		}
		//adding bonus points 
		addBonusToRespectivePlayer(Player1,Player2);
		//simple Board Printing
		printTheBoard(Player1,Player2);
		if(rotationIndex<0)
		{
			if(rotationIndex<-7)
			{
				rotationIndex=indexTransformReverse(rotationIndex);
				rotationForPlayer1Reverse(rotationIndex ,Player1,Player2);
			}
			else {
				rotationIndex=indexTransformReverse(rotationIndex);
				rotationForPlayer1Forward(rotationIndex ,Player1,Player2);
			}
		}
		else {
			rotationForPlayer1Reverse(rotationIndex , Player1, Player2);
		}
		printTheBoard(Player1,Player2);
	}
	
	
	public void rotationForPlayer2Forward(int rotationIndex ,ArrayList Player1,ArrayList Player2)
	{
		int rotationNumber=(int) Player1.get(rotationIndex);
		if(rotationNumber==0)
		{
			if(rotationIndex<6)
			{
				rotationIndex++;
				currentPointForPlayer2 =(int) Player1.get(rotationIndex);
				totalPointForPlayer2= totalPointForPlayer2+ (int) Player1.get(rotationIndex);
				Player1.set(rotationIndex, 0);
				return;
			}
			else {
				rotationIndex++;
				rotationIndex = indexTransformForward(rotationIndex);
				currentPointForPlayer2=(int) Player2.get(rotationIndex);
				totalPointForPlayer2= totalPointForPlayer2+ (int) Player2.get(rotationIndex);
				Player2.set(rotationIndex, 0);
				return;
			}
		}
		System.out.println("now i get the rotation value " + rotationNumber);
		Player1.set(rotationIndex, 0);
		rotationIndex++;
		for(int i=0;i<rotationNumber;i++)
		{
			//Bonus point in some exception sutivation
			if(i==14)
			{
				addBonusToRespectivePlayer(Player1,Player2);
			}
			if(rotationIndex<=6)
			{
				Player1.set(rotationIndex,(int)Player1.get(rotationIndex)+1);
			}
			else if(rotationIndex>6)
			{
				if(rotationIndex>13)
				{
					int reWorkedIndex=indexTransformForward(rotationIndex);
					if(reWorkedIndex>6)
					{
						reWorkedIndex=indexTransformForward(reWorkedIndex);
						Player2.set( (reWorkedIndex),(int)Player2.get(reWorkedIndex)+1);
					}
					else
					Player1.set( (reWorkedIndex),(int)Player1.get(reWorkedIndex)+1);
				}
				else {
					int reWorkedIndex=indexTransformForward(rotationIndex);
					Player2.set( (reWorkedIndex),(int)Player2.get(reWorkedIndex)+1);
				}
				
			}
			rotationIndex++;
		}
		//adding bonus points 
		addBonusToRespectivePlayer(Player1,Player2);
		//simple Board Printing
		printTheBoard(Player1,Player2);
		if(rotationIndex>6)
			{
				if(rotationIndex>13)
				{
					rotationIndex=indexTransformForward(rotationIndex);
					if(rotationIndex>6)
					{
						rotationIndex=indexTransformForward(rotationIndex);
						rotationForPlayer2Reverse(rotationIndex , Player1, Player2);
					}
					else
					rotationForPlayer2Forward(rotationIndex , Player1, Player2);
				}
				else
				{
					rotationIndex=indexTransformForward(rotationIndex);
					rotationForPlayer2Reverse(rotationIndex , Player1, Player2);
				}	
			}
		else {
			rotationForPlayer2Forward(rotationIndex , Player1, Player2);
		}
	}
	
	
	public void rotationForPlayer2Reverse(int rotationIndex ,ArrayList Player1,ArrayList Player2)
	{
		int rotationNumber=(int) Player2.get(rotationIndex);
		if(rotationNumber==0)
		{
			if(rotationIndex>=0)
			{
				rotationIndex--;
				rotationIndex=indexTransformReverse(rotationIndex);
				if(rotationIndex>6)
				{
					rotationIndex=indexTransformForward(rotationIndex);
					currentPointForPlayer2 =(int) Player2.get(rotationIndex);
					totalPointForPlayer2= totalPointForPlayer2+ (int) Player2.get(rotationIndex);
					Player2.set(rotationIndex, 0);
					return;
				}
				else {
					currentPointForPlayer2 = (int) Player1.get(rotationIndex);
					totalPointForPlayer2 = totalPointForPlayer2+ (int) Player1.get(rotationIndex);
					Player1.set(rotationIndex, 0);
					return;
				}
			}
			if(rotationIndex<=6)
			{
				rotationIndex--;
				currentPointForPlayer2 = (int) Player2.get(rotationIndex);
				totalPointForPlayer2= totalPointForPlayer2+ (int) Player2.get(rotationIndex);
				Player2.set(rotationIndex, 0);
				return;
			}
		}
		System.out.println("now i get the rotation value " + rotationNumber);
		Player2.set(rotationIndex, 0);
		rotationIndex--;
		for(int i=0;i<rotationNumber;i++)
		{
			//Bonus point in some exception sutivation
			if(i==14)
			{
				addBonusToRespectivePlayer(Player1,Player2);
			}
			if(rotationIndex>=0)
			{
				Player2.set(rotationIndex,(int)Player2.get(rotationIndex)+1);
			}
			else if(rotationIndex<0)
			{
				if(rotationIndex<-7)
				{
					int reWorkedIndex=indexTransformReverse(rotationIndex);
					Player2.set((reWorkedIndex),(int)Player2.get(reWorkedIndex)+1);
				}
				else {
					int reWorkedIndex=indexTransformReverse(rotationIndex);
					Player1.set((reWorkedIndex),(int)Player1.get(reWorkedIndex)+1);
				}

			}
			rotationIndex--;
		}
		//adding bonus points 
		addBonusToRespectivePlayer(Player1,Player2);
		//simple Board Printing
		printTheBoard(Player1,Player2);
		if(rotationIndex<0)
		{
			if(rotationIndex<-7)
			{
				rotationIndex=indexTransformReverse(rotationIndex);
				rotationForPlayer2Reverse(rotationIndex ,Player1,Player2);
			}
			else
			{
				rotationIndex=indexTransformReverse(rotationIndex);
				rotationForPlayer2Forward(rotationIndex ,Player1,Player2);
			}
		}
		else {
			rotationForPlayer2Reverse(rotationIndex , Player1, Player2);
		}
		printTheBoard(Player1,Player2);
	}
	
	
	public int indexTransformForward(int rotationIndex)
	{
		switch(rotationIndex)
		{
		case 7:
			return 6;
		case 8:
			return 5;
		case 9:
			return 4;
		case 10:
			return 3;
		case 11:
			return 2;
		case 12:
			return 1;
		case 13:
			return 0;
		default:
			return rotationIndex-14;
		}	
	}
	
	
	public int indexTransformReverse(int rotationIndex)
	{
		switch(rotationIndex)
		{
		case -1:
			return 0;
		case -2:
			return 1;
		case -3:
			return 2;
		case -4:
			return 3;
		case -5:
			return 4;
		case -6:
			return 5;
		case -7:
			return 6;
		default:
			return rotationIndex+14;
		}	
	}
	
	
	public void inputFromPlayer2(ArrayList Player2)
	{
			Scanner scObj=new Scanner(System.in);
			System.out.println("Enter Your Position to move ---Player2");
			int player2Move = scObj.nextInt();
			if((int)Player2.get(player2Move)==0)
			{
				System.out.println("!!!!!!!!!!!!!!! Dont Choose Empty Box for Iteration !!!!!!!!!!!!!!!");
				inputFromPlayer2(Player2);
			}
			else {
				player2Input=player2Move;
			}
	}
	
	public void inputFromPlayer1(ArrayList Player1)
	{
			Scanner scObj = new Scanner(System.in);
			System.out.println("Enter Your Position to move ---Player1");
			int player1Move = scObj.nextInt();
			if((int)Player1.get(player1Move)==0)
			{
				System.out.println("!!!!!!!!!!!!!!! Dont Choose Empty Box for Iteration !!!!!!!!!!!!!!!");
				inputFromPlayer1(Player1);
			}
			else {
				player1Input=player1Move;
			}
	}
	
	public void printTheBoard(ArrayList Player1,ArrayList Player2)
	{
		System.out.println("|--0--|--1--|--2--|--3--|--4--|--5--|--6--|----------------->Positions for Player1 & Player2");
		System.out.println("|--^--|--^--|--^--|--^--|--^--|--^--|--^--|");
		System.out.println();
		System.out.println("|-----|-----|-----|-----|-----|-----|-----|");
		for(int i=0;i<Player1.size();i++)
		{
			if(i==0)
				System.out.print("|  ");
			if((int)Player1.get(i)>9)
				System.out.print(Player1.get(i)+" |  ");
			else
				System.out.print(Player1.get(i)+"  |  ");
			
		}
		System.out.println();
		System.out.println("|-----|-----|-----|-----|-----|-----|-----|");
		for(int i=0;i<Player2.size();i++)
		{
			if(i==0)
				System.out.print("|  ");
			if((int)Player2.get(i)>9)
				System.out.print(Player2.get(i)+" |  ");
			else
				System.out.print(Player2.get(i)+"  |  ");
		}
		System.out.println();
		System.out.println("|-----|-----|-----|-----|-----|-----|-----|");
		System.out.println();
	}
	
	
	public void valueInitiation(ArrayList Player1,ArrayList Player2)
	{
		for(int i=0;i<7;i++)
		{
			//testing code 
//			if(i==6)
//				Player1.add(0);
//			else
			Player1.add(5);
			Player2.add(5);
		}
	}


	public boolean letsContinueOurGame(ArrayList Player)
	{
		int totalNumberOfBoxes=7;
		int totalNumberOfEmptyBoxes=0;
		for(int i=0;i<7;i++)
		{
			if((int)Player.get(i)==0)
				totalNumberOfEmptyBoxes++;
		}
		if(totalNumberOfBoxes==totalNumberOfEmptyBoxes)
			return false;
		else
			return true;
	}

	public void addBonusToRespectivePlayer(ArrayList Player1,ArrayList Player2)
	{
		for(int i=0;i<7;i++)
		{
			if((int)Player1.get(i)==4)
			{
				totalPointForPlayer1 = totalPointForPlayer1 +4;
				printTheBoard(Player1,Player2);
				System.out.println("TotalPoints after adding Bonus points totalPointForPlayer1 " +totalPointForPlayer1);
				Player1.set(i, 0);
			}
			if((int)Player2.get(i)==4)
			{
				totalPointForPlayer2 = totalPointForPlayer2 +4;
				printTheBoard(Player1,Player2);
				System.out.println("TotalPoints after adding Bonus points totalPointForPlayer2 " +totalPointForPlayer2);
				Player2.set(i, 0);
			}
		}
	}

}
