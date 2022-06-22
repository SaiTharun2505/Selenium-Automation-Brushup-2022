package Casino_slot_3WJ;

import java.util.Random;
import java.util.Scanner;

public class Aped_Base_Page 
{
	static Scanner sc= new Scanner(System.in);
	static double Credit=1000;
	static double pay[]= {50,25,10,5,5,5,5,5,100,10};
	static char Symbols[] = {'a','b','c','d','e','f','g','h','w'};
	static char Scatter_symbol='s';
	//static char Wild_Symbol='w';
	
	static char Reel1[]= {'h', 'd', 'f', 'h', 'g', 'w', 'a', 'd', 'c', 'w', 'b', 'h', 'g', 'd', 'h', 'w', 's', 'h', 'e', 'a', 'w', 'g', 'h', 'e', 'g', 'h', 'd', 'a', 'w', 'h', 'd', 's', 'g', 'w', 'f', 'g', 'h', 'w', 'f', 'd', 'e', 'g', 'h', 'w', 'g', 'c', 'a', 'e', 'd', 'h', 's', 'w', 'c', 'd', 'g', 'c', 'h', 'w', 'b', 'h', 'a', 'b', 'e', 'w', 'h', 'c', 'b', 'w', 's', 'e', 'b', 'g', 'e', 'h', 'w', 'c', 'h', 'w', 'd', 'a', 'h', 'w', 'c', 'e', 's', 'g', 'd', 'h', 'w', 'c', 'e', 'w', 'h', 'e', 's', 'b', 'h', 'w', 'g', 'c', 'b', 'w', 'e', 'f', 'h', 's', 'w', 'c', 'e', 'w', 'f', 'h', 'g', 'e', 'f', 's', 'w', 'h', 'f', 'g', 'h', 'w', 'b', 'h', 'e', 'd', 'h', 'w', 'c', 'f', 'h', 'g', 'w', 'f', 'h', 'g', 'd', 'h', 'f', 'c', 'w', 'd', 'b', 'g', 'w', 'c', 'h', 'f', 'w', 'g', 'e', 'w', 'b', 'f', 'h', 'c', 'w', 'g', 'e', 'h', 'g', 'd', 'h', 'f', 'w', 'g', 'h', 'w', 'e'};
	
	static char Reel2[]= {'h', 'g', 'w', 'h', 'f', 'g', 'b', 's', 'w', 'h', 'g', 'd', 'b', 'w', 'd', 'g', 'a', 'w', 'c', 'e', 'w', 'g', 'h', 's', 'c', 'e', 'g', 'd', 'w', 'e', 'c', 'h', 'e', 's', 'w', 'g', 'd', 'h', 'g', 'w', 'h', 'g', 'e', 'w', 'd', 'e', 's', 'g', 'w', 'c', 'd', 'g', 's', 'e', 'w', 'd', 'g', 'a', 'e', 'c', 'f', 'w', 'd', 'a', 'e', 'c', 'w', 's', 'e', 'c', 'f', 'w', 'c', 'w', 'e', 's', 'h', 'w', 'f', 'g', 'w', 'd', 'g', 'h', 'f', 'c', 's', 'e', 'w', 'b', 'e', 'w', 'd', 'w', 'c', 'f', 's', 'w', 'h', 'g', 'e', 'd', 'g', 'w', 'd', 'g', 'e', 's', 'b', 'h', 'd', 'w', 'e', 'g', 'w', 'e', 'f', 's', 'w', 'e', 'f', 'b', 'd', 'g', 'c', 'w', 'g', 'd', 's', 'e', 'c', 'w', 'g', 'd', 's', 'w', 'h', 'd', 'c', 'g', 'w', 'd', 'g', 'w', 'h', 'd', 'e', 'g', 'h', 'd', 'e', 'f', 'd', 'g', 'f', 'w', 'c', 'd', 'f', 'c', 'w', 'g', 'd'};
	
	static char Reel3[]= {'h', 'g', 'c', 'h', 'e', 'f', 'd', 'c', 'f', 'e', 'a', 'g', 'w', 'b', 'e', 'w', 'b', 'f', 'd', 'e', 'b', 's', 'g', 'd', 'b', 'a', 'f', 'e', 'h', 's', 'f', 'g', 'a', 'w', 'e', 'f', 'c', 's', 'h', 'e', 'd', 'w', 'c', 'e', 'g', 'f', 'a', 'd', 'f', 's', 'w', 'e', 'f', 'c', 'a', 'w', 'e', 'd', 'w', 'f', 'c', 'g', 'd', 'e', 'c', 'w', 'f', 's', 'e', 'd', 'g', 'f', 'e', 'w', 'c', 'g', 'f', 'e', 'h', 'd', 'w', 'e', 'h', 'w', 'g', 's', 'e', 'f', 'c', 'w', 'd', 'e', 'f', 'g', 'h', 's', 'w', 'b', 'g', 'd', 'e', 'c', 'w', 'e', 'f', 'h', 'c', 'w', 'd', 'g', 'h', 's', 'w', 'e', 'd', 'g', 's', 'f', 'w', 'd', 'e', 'h', 'w', 'g', 'f', 'd', 'w', 'h', 'c', 'e', 'd', 'f', 'g', 'w', 'f', 'd', 'h', 'w', 'c', 'b', 'g', 'w', 'h', 'f', 'e', 'd', 'g', 'f', 'e', 'd', 'f', 'h', 'c', 'd', 'h', 'e', 'd', 'w', 'e', 'g', 'd', 'e'};
	
	
	/*static char Reel1[]= {'w','a','b'};
	static char Reel2[]= {'w','b','b'};
	static char Reel3[]= {'w','a','b'};*/
	
	
	static int reel1_RN;
	static int reel2_RN;
	static int reel3_RN;
	
	static int BG_Mult;
	static double BG_Multiplier_ID;
	static int Increment_Decrement;
	static double BG_Multiplier=1;
	
	static int FG_Mult;
	static double FG_Multiplier_ID;
	static int Increment_StaySame;
	static double FG_Multiplier;
	static int Freespins_Award=5;
	static boolean FreeSpins_Status;
	static double Total_Free_Spins_Win;
	
	static double payout;
	static double payline_win;
	static int payline_status;
	static double scatter_win;
	static double Total_win;
	
	
	static double coin_values[]={100,200,300,400,500,600,700,800,900,1000};
	static double Selected_Coin_Value;
	
	static double Bet;
	static double Total_Bet;
	static int s;
	
	static int a,b;
	
	static int Buy_Bonus=2;
	static int input;
	static char[][] Matrix;
	
	public static void Paylines_Total_Win_Calculations()
	{
		payline_status=0;
		if(Matrix[a][b]==Symbols[s] && FreeSpins_Status==false)
		{
			payout=pay[s];	
			payline_win=(Selected_Coin_Value/100)*payout*BG_Multiplier;
			Total_win=Total_win+payline_win;
			payline_status=1;
		}			
		else if(Matrix[a][b]==Symbols[s])
		{
			payout=pay[s];	
			payline_win=(Selected_Coin_Value/100)*payout*FG_Multiplier;
			Total_win=Total_win+payline_win;
			payline_status=1;
		}
	}
	
	//Paylines logic
	
	public static void PayLine1()
	{
			//Payline 1
				if(Matrix[0][0]==Matrix[0][1] && Matrix[0][0]==Matrix[0][2])
				{
					a=0;
					b=0;
					Paylines_Total_Win_Calculations();
					if(payline_status==1) 
					{
						System.out.println("Payline_1_win : "+payline_win);
					}
				}
	}
	
	public static void PayLine2()
	{
				
			//Payline 2
				
				if(Matrix[1][0]==Matrix[1][1] && Matrix[1][0]==Matrix[1][2])
				{
					a=1;
					b=0;
					Paylines_Total_Win_Calculations();
					if(payline_status==1) 
					{
						System.out.println("Payline_2_win : "+payline_win);
					}
				}
	}
	
	public static void PayLine3()
	{
	
			//Payline 3
				
				if(Matrix[2][0]==Matrix[2][1] && Matrix[2][0]==Matrix[2][2])
				{
					a=2;
					b=0;
					Paylines_Total_Win_Calculations();
					if(payline_status==1) 
					{
						System.out.println("Payline_3_win : "+payline_win);
					}
				}
	}
	
	public static void PayLine4()
	{
		
			//Payline 4
				
				if(Matrix[0][0]==Matrix[1][1] && Matrix[0][0]==Matrix[2][2])
				{
					a=0;
					b=0;
					Paylines_Total_Win_Calculations();
					if(payline_status==1) 
					{
						System.out.println("Payline_4_win : "+payline_win);
					}
				}
	}
	
	public static void PayLine5()
	{
			
			//Payline 5	
				
				if(Matrix[2][0]==Matrix[1][1] && Matrix[2][0]==Matrix[0][2])
				{
					a=2;
					b=0;
					Paylines_Total_Win_Calculations();
					if(payline_status==1) 
					{
						System.out.println("Payline_5_win : "+payline_win);
					}
				}
			
	}
	
	
	//3 Wilds condition
	public static void Wild_replace()
	{
		for(int i=0; i<=2; i++)
		{
			for(int j=0; j<=2; j++)
			{
				if(Matrix[i][j]=='w')
				{
					Matrix[i][j]=Symbols[s];	
				}
			}
		}
	}
	
	//Wild replace for all symbols logic 
	public static void Wild_Wins()
	{
		for(s=0; s<=8; s++)
		{
			Matrix_Data(s);
			
			//Payline 1 wild win condition
			if(Matrix[0][0]==Matrix[0][1] && Matrix[0][0]==Matrix[0][2] && Matrix[0][0]=='w')
			{
				PayLine1();
				
				Wild_replace();
				
				PayLine2();
				PayLine3();
				PayLine4();
				PayLine5();
			}
			
			//Payline 2 wild win condition
			else if(Matrix[1][0]==Matrix[1][1] && Matrix[1][0]==Matrix[1][2] && Matrix[1][0]=='w')
			{

				PayLine2();
				
				Wild_replace();
				
				PayLine1();
				PayLine3();
				PayLine4();
				PayLine5();
			}
			
			//Payline 3 wild win condition
			else if(Matrix[2][0]==Matrix[2][1] && Matrix[2][0]==Matrix[2][2] && Matrix[2][0]=='w')
			{
				PayLine3();
				
				Wild_replace();
				
				PayLine1();
				PayLine2();
				PayLine4();
				PayLine5();
			}
			
			
			//Payline 4 wild win condition
			else if(Matrix[0][0]==Matrix[1][1] && Matrix[0][0]==Matrix[2][2] && Matrix[0][0]=='w')
			{
				PayLine4();
				
				Wild_replace();
				
				PayLine1();
				PayLine2();
				PayLine3();
				PayLine5();
			}
			
			//Payline 5 wild win condition
			else if(Matrix[2][0]==Matrix[1][1] && Matrix[2][0]==Matrix[0][2] && Matrix[2][0]=='w')
			{
				PayLine5();
				
				Wild_replace();
				
				PayLine1();
				PayLine2();
				PayLine3();
				PayLine4();				
			}
				
			else 
			{
				Wild_replace();
				
				PayLine1();
				PayLine2();
				PayLine3();
				PayLine4();
				PayLine5();
			}
			
		}
		
	}
	
	//Scatter Wins Logic
	public static void Scatter_Win()
	{
		
		if(Matrix[0][0]==Matrix[0][1] && Matrix[0][0]==Matrix[0][2] && Matrix[0][0]==9||
				Matrix[0][0]==Matrix[0][1] && Matrix[0][0]==Matrix[1][2] && Matrix[0][0]=='s'||
				Matrix[0][0]==Matrix[0][1] && Matrix[0][0]==Matrix[2][2] && Matrix[0][0]=='s'||
				Matrix[0][0]==Matrix[1][1] && Matrix[0][0]==Matrix[0][2] && Matrix[0][0]=='s'||
				Matrix[0][0]==Matrix[1][1] && Matrix[0][0]==Matrix[1][2] && Matrix[0][0]=='s'||
				Matrix[0][0]==Matrix[1][1] && Matrix[0][0]==Matrix[2][2] && Matrix[0][0]=='s'||
				Matrix[0][0]==Matrix[2][1] && Matrix[0][0]==Matrix[0][2] && Matrix[0][0]=='s'||
				Matrix[0][0]==Matrix[2][1] && Matrix[0][0]==Matrix[1][2] && Matrix[0][0]=='s'||
				Matrix[0][0]==Matrix[2][1] && Matrix[0][0]==Matrix[2][2] && Matrix[0][0]=='s'||

				Matrix[1][0]==Matrix[0][1] && Matrix[1][0]==Matrix[0][2] && Matrix[1][0]=='s'||
				Matrix[1][0]==Matrix[0][1] && Matrix[1][0]==Matrix[1][2] && Matrix[1][0]=='s'||
				Matrix[1][0]==Matrix[0][1] && Matrix[1][0]==Matrix[2][2] && Matrix[1][0]=='s'||
				Matrix[1][0]==Matrix[1][1] && Matrix[1][0]==Matrix[0][2] && Matrix[1][0]=='s'||
				Matrix[1][0]==Matrix[1][1] && Matrix[1][0]==Matrix[1][2] && Matrix[1][0]=='s'||
				Matrix[1][0]==Matrix[1][1] && Matrix[1][0]==Matrix[2][2] && Matrix[1][0]=='s'||
				Matrix[1][0]==Matrix[2][1] && Matrix[1][0]==Matrix[0][2] && Matrix[1][0]=='s'||
				Matrix[1][0]==Matrix[2][1] && Matrix[1][0]==Matrix[1][2] && Matrix[1][0]=='s'||
				Matrix[1][0]==Matrix[2][1] && Matrix[1][0]==Matrix[2][2] && Matrix[1][0]=='s'||

				Matrix[2][0]==Matrix[0][1] && Matrix[2][0]==Matrix[0][2] && Matrix[2][0]=='s'||
				Matrix[2][0]==Matrix[0][1] && Matrix[2][0]==Matrix[1][2] && Matrix[2][0]=='s'||
				Matrix[2][0]==Matrix[0][1] && Matrix[2][0]==Matrix[2][2] && Matrix[2][0]=='s'||
				Matrix[2][0]==Matrix[1][1] && Matrix[2][0]==Matrix[0][2] && Matrix[2][0]=='s'||
				Matrix[2][0]==Matrix[1][1] && Matrix[2][0]==Matrix[1][2] && Matrix[2][0]=='s'||
				Matrix[2][0]==Matrix[1][1] && Matrix[2][0]==Matrix[2][2] && Matrix[2][0]=='s'||
				Matrix[2][0]==Matrix[2][1] && Matrix[2][0]==Matrix[0][2] && Matrix[2][0]=='s'||
				Matrix[2][0]==Matrix[2][1] && Matrix[2][0]==Matrix[1][2] && Matrix[2][0]=='s'||
				Matrix[2][0]==Matrix[2][1] && Matrix[2][0]==Matrix[2][2] && Matrix[2][0]=='s')
		{
				payout = pay[9];
				scatter_win=Bet*payout;
				Total_win=Total_win+scatter_win;
				System.out.println("Scatter wins : "+scatter_win);
		}
	}
	
	
	//Matrix Data
	public static void Matrix_Data(int s)
	{
		Matrix=new char[][] {{Reel1[reel1_RN],Reel2[reel2_RN],Reel3[reel3_RN]},
				{Reel1[reel1_RN+1],Reel2[reel2_RN+1],Reel3[reel3_RN+1]},
				{Reel1[reel1_RN+2],Reel2[reel2_RN+2],Reel3[reel3_RN+2]}};
		if(s==0)
		{
			System.out.print("Matrix[] : ");
			for(int i=0; i<=2; i++)
			{
				for(int j=0; j<=2; j++)
				{
					System.out.print(Matrix[i][j]);
					if(j==2)
					{
						System.out.print(";");
					}
					if(i==2 && j==2)
					{
						System.out.println("");
					}
				}
			}
		}
		
	}
	
	//Base Game Multiplier inc/dec Random number generator between 0.01 - 2.00
	public static void BG_Multiplier_Increment_Decrement_Range()
	{
		BG_Mult=new Random().nextInt(200);
		BG_Multiplier_ID=(BG_Mult/100.0)+0.01;
		
	}
	
	//Base Game Multiplier inc/dec
	public static void Base_Game_Multiplier()
	{
		Increment_Decrement=new Random().nextInt(2);
		if(Increment_Decrement==0)
		{
			System.out.println("Base Game Multiplier Increment Range : "+BG_Multiplier_ID);
			BG_Multiplier=BG_Multiplier+BG_Multiplier_ID;
			if(BG_Multiplier>10)
			{
				BG_Multiplier=10;
			}
		}
		else
		{
			System.out.println("Base Game Multiplier Decrement Range : "+BG_Multiplier_ID);
			BG_Multiplier=BG_Multiplier-BG_Multiplier_ID;
			if(BG_Multiplier<1)
			{
				BG_Multiplier=1;
			}
		}
		
		System.out.println("Base Game Multiplier : "+BG_Multiplier);
	}
	
	
	//Free Game Multiplier increment range in between 0.01 - 10.00
	public static void FG_Multiplier_Increment_Decrement_Range()
	{
		FG_Mult=new Random().nextInt(1000);
		FG_Multiplier_ID=(FG_Mult/100.0)+0.01;
		
	}
	
	//Free Game Multiplier inc/stay same (5.00-100.00)
	public static void Free_Game_Multiplier()
	{
		Increment_StaySame=new Random().nextInt(2);
		if(Increment_StaySame==0)
		{
			System.out.println("Free Game Multiplier Increment Range : "+FG_Multiplier_ID);
			FG_Multiplier=FG_Multiplier+FG_Multiplier_ID;
			if(FG_Multiplier>100)
			{
				FG_Multiplier=100;
			}
		}
		else
		{
			System.out.println("Free Game Multiplier stay same !"+FG_Multiplier);
		}
	}
	
	
	//Free Spins and Additional Free spins logic
	public static void Free_Spins()
	{
		FreeSpins_Status=false;
		if(scatter_win>0 || Buy_Bonus==input)
		{
			
			scatter_win=0;
			FG_Multiplier=5;
			Total_Free_Spins_Win=0;
			for(int i=1; i<=Freespins_Award; i++)
			{
				
				Total_win=0;
				scatter_win=0;
				FreeSpins_Status=true;
				
				if(i!=1)
				{
					FG_Multiplier_Increment_Decrement_Range();
					Free_Game_Multiplier();
				}

				System.out.println("Free Game Multiplier : "+FG_Multiplier); 
				
				System.out.println("Free Spins count : "+i+"/"+Freespins_Award );
				
				reel1_RN= new Random().nextInt(167);
				reel2_RN= new Random().nextInt(161);
				reel3_RN= new Random().nextInt(160);
				
				System.out.println(reel1_RN+" "+reel2_RN+" "+reel3_RN);
				
				Wild_Wins();
				
				Scatter_Win();
				
				System.out.println("Total_win : "+Total_win);
				
				Total_Free_Spins_Win=Total_Free_Spins_Win+Total_win;
				
				System.out.println("Total Free Spins win : "+Total_Free_Spins_Win);
				
				Credit=Credit+Total_win;
				
				
				System.out.println("Post_Balance : "+Credit);
				
				System.out.println("");
				
				if(scatter_win>0)
				{
					Freespins_Award=Freespins_Award+3;
				}
			}
		}
		
	}
	
	public static void Buy_Bonus_Free_Spins()
	{
		Total_Bet=Bet*70;
		if(Total_Bet<=Credit)
		{
			Credit=Credit-Total_Bet;
			Free_Spins();	
		}
		else
		{
			System.out.println("You have insufficient Balance");
		}
		
	}
}
