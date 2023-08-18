package project5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacGame {
	static int place ;
	static char [][] updateTicTac =  {{' ',' ',' '},
									  {' ',' ',' '},
									  {' ',' ',' '}};
	static char input0 = 'X';
	static char input1 = 'O';
	static String user1;
	static String user2;
	static int count = 1;
	public static void main(String[] args) {
		TicTacGame obj = new TicTacGame ();
		char [][] TicTac = {{'1','2','3'},
							{'4','5','6'},
							{'7','8','9'}};
		obj.printboard(TicTac);
		obj.getUserName();
		obj.place();
		int row = obj.rowPlace(place);
		int colum = obj.columPlace(place);
		obj.placeInputToBoard(row,colum);
	//	obj.checkWinner(input);

	}

	static private void getUserName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player 1 --> Enter your user name (For Player 1 --X) ");
		user1 = sc.next();
		System.out.println("Player 2 --> Enter your user name (For Player 2 --O) ");
		user2 = sc.next();
	}

	private void checkWinner(char input , String user) {
		
		if(updateTicTac [0][0] ==input && updateTicTac [0][1]==input && updateTicTac [0][2] == input )
		{
			System.out.println(" Winner is " + user + " by using " +  input );
		}
		else if (updateTicTac [1][0] ==input && updateTicTac [1][1]==input && updateTicTac [1][2] == input)
		{
			System.out.println(" Winner is " + user + " by using " +  input );
		}
		else if (updateTicTac [2][0] ==input && updateTicTac [2][1]==input && updateTicTac [2][2] == input)
		{
			System.out.println(" Winner is " + user + " by using " +  input );
		}
		else if (updateTicTac [0][0] ==input && updateTicTac [1][0]==input && updateTicTac [2][0] == input)
		{
			System.out.println(" Winner is " + user + " by using " +  input );
		}
		else if (updateTicTac [0][1] ==input && updateTicTac [1][1]==input && updateTicTac [2][1] == input)
		{
			System.out.println(" Winner is " + user + " by using " +  input );
		}
		else if (updateTicTac [0][2] ==input && updateTicTac [1][2]==input && updateTicTac [2][2] == input)
		{
			System.out.println(" Winner is " + user + " by using " +  input );
		}
		else if (updateTicTac [0][0] ==input && updateTicTac [1][1]==input && updateTicTac [2][2] == input)
		{
			System.out.println(" Winner is " + user + " by using " +  input );
		}
		else if (updateTicTac [0][2] ==input && updateTicTac [1][1]==input && updateTicTac [2][0] == input)
		{
			System.out.println(" Winner is " + user + " by using " +  input );
		}
		else
		{
			int count = 0;
			for(int i=0;i<updateTicTac.length;i++)
			{
				for(int j=0;j<updateTicTac.length;j++)
				{
					if(updateTicTac[i][j] == input0  || updateTicTac[i][j] == input1)
					{
						count++;
					}
				}
			}
			if(count==9)
			{
				System.out.println(" Match is Draw ");
			}
			else
			{
				System.out.println("Lets Continue our game ");
				place();
				placeInputToBoard( rowPlace(place) , columPlace(place)) ;
			}
		}
	}

	private void place() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number between 1 and 9 to insert your variable (X or O) in the specified position ");
		//int place =0;
		try {
			place = sc.nextInt();
			if(place>9 && place<1)
			{
				throw new DigitOverLimitException("Enter number between 1 to 9 ");
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Only numbers are Allowed (from 1 to 9) ");
			place();
		} 
		catch (DigitOverLimitException e) {
			System.out.println(e);
			place();
		}
	}

	private int columPlace(int place) {
		int col = place%3;
		if(col==0)
		{
			col =3;
		}
		return col-1;
	}

	private int rowPlace(int place) {
		int row ;
		if(place<=3 && place>0)
		{
			return 0;
		}
		else if (place<=6 && place>=4)
		{
			return 1;
		}
		else //if (place<=9 && place>=7)
		{
			return 2;
		}
	}

	private void placeInputToBoard(  int row , int colum) {
		
//		updateTicTac [row][colum] = input;
//		printboard(updateTicTac);
//		System.out.println("row "+row + "  colum "+colum + " place " + place);
			if(count%2==1)
			{
				count++;
				updateTicTac [row][colum] = input0;
				printboard(updateTicTac);
				//System.out.println("row "+row + "  colum "+colum + " place " + place);
				checkWinner(input0 ,user1);
			}
			else
			{
				count++;
				updateTicTac [row][colum] = input1;
				printboard(updateTicTac);
				//System.out.println("row "+row + "  colum "+colum + " place " + place);
				checkWinner(input1 , user2);
			}
	}

	private void printboard(char[][] ticTac) {
		for(int i=0;i<ticTac.length;i++)
		{
			System.out.print("| ");
			for(int j=0;j<ticTac.length;j++)
			{
				System.out.print(ticTac[i][j]+" | ");
			}
			System.out.println();
			System.out.println("|---|---|---|");
		}
	}
}
