package Casino_slot_3WJ;

import java.util.Random;
import java.util.Scanner;

public class Paylines 
{
	public static void main(String[] args) 
	{
	Scanner sc= new Scanner(System.in);
	int Credit = 100000;
	int pay[]={100,70,70,50,30,30,20,20};
	
	int Reel1[]= {1,2,3,4,5,6,7,8,9};
	int Reel2[]= {1,2,3,4,5,6,7,8,9};
	int Reel3[]= {1,2,3,4,5,6,7,8,9};
	
	int reel1_RN;
	int reel2_RN;
	int reel3_RN;
	
	int payout;
	int payline_win;
	int Total_win;
	
	int coin_values[]={100,200,300,400,500,600,700,800,900,1000};
	int Selected_Coin_Value;
	
	int Bet;
	int input;
	
	System.out.println("Enter coin value Between 0-9 : " );
	
	int input1=sc.nextInt();
	
	System.out.println("Enter 1 to Play spin or 2 to quit game : ");
	input = sc.nextInt();
	
	Selected_Coin_Value=coin_values[input1];
	
	
	System.out.println("coin value : " +Selected_Coin_Value);
	
	Bet = Selected_Coin_Value * 10 ;
	
	System.out.println("Bet : "+Bet);
	
	Credit=Credit-Bet;

	System.out.println("Pre Balance : "+Credit);
	
	payline_win=0;
	Total_win=0;
	
	reel1_RN= new Random().nextInt(7);
	reel2_RN= new Random().nextInt(7);
	reel3_RN= new Random().nextInt(7);
	
	System.out.println(reel1_RN + " " + reel2_RN + " " + reel3_RN);

	
	}
}
