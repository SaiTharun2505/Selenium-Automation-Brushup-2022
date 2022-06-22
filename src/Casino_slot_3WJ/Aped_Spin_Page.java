package Casino_slot_3WJ;

import java.util.Random;

public class Aped_Spin_Page extends Aped_Base_Page{

	public static void main(String[] args) 
	{
		
		
		do
		{
			System.out.println("Game Name : APED");
			System.out.println("Balance : "+Credit);
			System.out.println("Enter coin value between 0-9 : " );
			
			int input1=sc.nextInt();
			
			Selected_Coin_Value=coin_values[input1];
			
			System.out.println("Coin_value : " +Selected_Coin_Value);
			
			Bet = (Selected_Coin_Value/100) * 10 ;
			
			System.out.println("Bet : "+Bet);
			
			System.out.println("Enter 1 to play normal spin, 2 to play buy bonus game or 0 to quit game : ");
			
			input = sc.nextInt();

			if(Bet<=Credit)
			{	
			
				if(input==1)
				{
					Credit=Credit-Bet;
		
					System.out.println("Pre_Balance : "+Credit);
					
					payline_win=0;
				
					Total_win=0;
				
					reel1_RN= new Random().nextInt(167);
					reel2_RN= new Random().nextInt(161);
					reel3_RN= new Random().nextInt(160);
				
					BG_Multiplier_Increment_Decrement_Range();
					
					Base_Game_Multiplier();
				
					Wild_Wins();
					
					Scatter_Win();
				
					System.out.println("Total_win : "+Total_win);
				
					Credit=Credit+Total_win;
				
					System.out.println("Post_Balance : "+Credit);
				
					System.out.println("");
				
					Free_Spins();
				}
			}

			if(input==2)
			{
				Buy_Bonus_Free_Spins();
			}
			
		}while(input==1 || input==2);
	
	}

}
