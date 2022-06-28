package Casino_slot_3WJ;

import java.util.Random;

public class Run_Casino extends Base_Game{

	public static void main(String[] args) 
	{
		int input;
		
		do
		{
			System.out.println("Game Name : APED");
			System.out.println("Balance : "+Credit);
			System.out.println("Enter coin value between 0-9 : " );
			
			int input1=sc.nextInt();
			
			Selected_Coin_Value=coin_values[input1];
			
			System.out.println("Coin_value : " +Selected_Coin_Value);
			
			Bet = Selected_Coin_Value * 10 ;
			
			System.out.println("Bet : "+Bet);
			
			System.out.println("Enter 1 to play spin or 2 to quit game : ");
		
			input = sc.nextInt();
			
			Credit=Credit-Bet;
	
			System.out.println("Pre_Balance : "+Credit);
			
			payline_win=0;
			
			Total_win=0;
			
			reel1_RN= new Random().nextInt(14);
			reel2_RN= new Random().nextInt(14);
			reel3_RN= new Random().nextInt(14);
			
			//System.out.println(reel1_RN + " " + reel2_RN + " " + reel3_RN);
			
			/*Matrix_Data();*/
			
			BG_Multiplier_Increment_Decrement_Range();
			
			Base_Game_Multiplier();
			
			Wild_Wins();
			
			/*payline1();
			
			payline2();
			
			payline3();
			
			payline4();
			
			payline5();*/
			
			Scatter_Win();
			
			System.out.println("Total_win : "+Total_win);
			
			Credit=Credit+Total_win;
			
			System.out.println("Post_Balance : "+Credit);
			
			System.out.println("");
			
			Free_Spins();
			
		}while(input==1);
			

	}

}
