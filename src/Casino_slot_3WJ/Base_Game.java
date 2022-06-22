package Casino_slot_3WJ;

import java.util.Random;
import java.util.Scanner;

public class Base_Game
{
	static Scanner sc= new Scanner(System.in);
	static double Credit=100000;
	static double pay[]= {100,70,70,50,30,30,20,20,100,100};
	static char Symbols[] = {'a','b','c','d','e','f','g','h','w'};
	static char Scatter_symbol='s';
	static char Wild_Symbol='w';
	
	static char Reel1[]= {'a','s','c','b','w','a','a','s','b','a','a','b','w','s','a','a'};
	static char Reel2[]= {'c','a','w','s','b','b','a','a','a','s','w','b','a','a','s','a'};
	static char Reel3[]= {'a','b','s','w','c','b','b','w','a','a','s','a','c','c','c','a'};
	
	static int reel1_RN;
	static int reel2_RN;
	static int reel3_RN;
	
	static int BG_Mult;
	static double BG_Multiplier_ID;
	static int Increment_Decrement;
	static double BG_Multiplier;
	
	static int FG_Mult;
	static double FG_Multiplier_ID;
	static int Increment_StaySame;
	static double FG_Multiplier;
	static int Freespins_Award=5;
	static boolean FreeSpins_Status;
	static double Total_Free_Spins_Win;
	
	static double payout;
	static double payline_win;
	static double scatter_win;
	static double Total_win;
	
	
	static double coin_values[]={100,200,300,400,500,600,700,800,900,1000};
	static double Selected_Coin_Value;
	
	static double Bet;
	static int s;
	
	static char[][] Matrix;
	
	public static void payline1()
	{
		if(Matrix[0][0]==Matrix[0][1] && Matrix[0][0]==Matrix[0][2])
		{
			if(Matrix[0][0]==Symbols[s] && FreeSpins_Status==false)
			{
				payout=pay[s];	
				payline_win=Selected_Coin_Value*payout*BG_Multiplier;
				Total_win=Total_win+payline_win;
				System.out.println("Payline_1_win : "+payline_win);
			}
			
			else if(Matrix[0][0]==Symbols[s])
			{
				payout=pay[s];	
				payline_win=Selected_Coin_Value*payout*FG_Multiplier;
				Total_win=Total_win+payline_win;
				System.out.println("Payline_1_win : "+payline_win);
			}
		}
		
	}
	
	public static void payline2()
	{
		
		if(Matrix[1][0]==Matrix[1][1] && Matrix[1][0]==Matrix[1][2])
		{
			if(Matrix[1][0]==Symbols[s] && FreeSpins_Status==false)
			{
				payout=pay[s];	
				payline_win=Selected_Coin_Value*payout*BG_Multiplier;
				Total_win=Total_win+payline_win;
				System.out.println("Payline_2_win : "+payline_win);
			}
			
			else if(Matrix[1][0]==Symbols[s])
			{
				payout=pay[s];	
				payline_win=Selected_Coin_Value*payout*FG_Multiplier;
				Total_win=Total_win+payline_win;
				System.out.println("Payline_2_win : "+payline_win);
			}
		}
	}
	
	public static void payline3()
	{
		
		if(Matrix[2][0]==Matrix[2][1] && Matrix[2][0]==Matrix[2][2])
		{
			if(Matrix[2][0]==Symbols[s] && FreeSpins_Status==false)
			{
				payout=pay[s];	
				payline_win=Selected_Coin_Value*payout*BG_Multiplier;
				Total_win=Total_win+payline_win;
				System.out.println("Payline_3_win : "+payline_win);
			}
			
			else if(Matrix[2][0]==Symbols[s])
			{
				payout=pay[s];	
				payline_win=Selected_Coin_Value*payout*FG_Multiplier;
				Total_win=Total_win+payline_win;
				System.out.println("Payline_3_win : "+payline_win);
			}
		}
	}
	
	public static void payline4()
	{
		
		if(Matrix[0][0]==Matrix[1][1] && Matrix[0][0]==Matrix[2][2])
		{
			if(Matrix[0][0]==Symbols[s] && FreeSpins_Status==false)
			{
				payout=pay[s];	
				payline_win=Selected_Coin_Value*payout*BG_Multiplier;
				Total_win=Total_win+payline_win;
				System.out.println("Payline_4_win : "+payline_win);
			}
			
			else if(Matrix[0][0]==Symbols[s])
			{
				payout=pay[s];	
				payline_win=Selected_Coin_Value*payout*FG_Multiplier;
				Total_win=Total_win+payline_win;
				System.out.println("Payline_4_win : "+payline_win);
			}
		}
	}
	
	public static void payline5()
	{
		
		if(Matrix[2][0]==Matrix[1][1] && Matrix[2][0]==Matrix[0][2])
		{
			if(Matrix[2][0]==Symbols[s] && FreeSpins_Status==false)
			{
				payout=pay[s];	
				payline_win=Selected_Coin_Value*payout*BG_Multiplier;
				Total_win=Total_win+payline_win;
				System.out.println("Payline_5_win : "+payline_win);
			}
			
			else if(Matrix[2][0]==Symbols[s])
			{
				payout=pay[s];	
				payline_win=Selected_Coin_Value*payout*FG_Multiplier;
				Total_win=Total_win+payline_win;
				System.out.println("Payline_5_win : "+payline_win);
			}
		}
	}
	
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
	
	public static void BG_Multiplier_Increment_Decrement_Range()
	{
		BG_Mult=new Random().nextInt(200);
		BG_Multiplier_ID=(BG_Mult/100.0)+0.01;
		
	}
	
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
			if(BG_Multiplier<0.01)
			{
				BG_Multiplier=0.01;
			}
		}
		
		System.out.println("Base Game Multiplier : "+BG_Multiplier);
	}
	
	public static void FG_Multiplier_Increment_Decrement_Range()
	{
		FG_Mult=new Random().nextInt(1000);
		FG_Multiplier_ID=(FG_Mult/100.0)+0.01;
		
	}
	
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
	
	public static void Wild_Wins()
	{
		//Matrix_Data(s);
		
					for(s=0; s<=7; s++)
					{
						Matrix_Data(s);
						//Matrix_Data();
						System.out.println("Iterations count for wild replace : "+(s+1));
						if(Matrix[0][0]=='w')
						{
							Matrix[0][0]=Symbols[s];	
							//System.out.println("Matrix[0][0] : "+Matrix[0][0]);
						}
						if(Matrix[0][1]=='w')
						{
							Matrix[0][1]=Symbols[s];	
						}
						if(Matrix[0][2]=='w')
						{
							Matrix[0][2]=Symbols[s];	
						}
						if(Matrix[1][0]=='w')
						{
							Matrix[1][0]=Symbols[s];	
						}
						if(Matrix[1][1]=='w')
						{
							Matrix[1][1]=Symbols[s];	
						}
						if(Matrix[1][2]=='w')
						{
							Matrix[1][2]=Symbols[s];	
						}
						if(Matrix[2][0]=='w')
						{
							Matrix[2][0]=Symbols[s];	
						}
						if(Matrix[2][1]=='w')
						{
							Matrix[2][1]=Symbols[s];	
						}
						if(Matrix[2][2]=='w')
						{
							Matrix[2][2]=Symbols[s];	
						}
						
						if(Matrix[0][0]==Matrix[0][1] && Matrix[0][0]==Matrix[0][2] && Matrix[0][0]==Symbols[s]||
								Matrix[1][0]==Matrix[1][1] && Matrix[1][0]==Matrix[1][2] && Matrix[1][0]==Symbols[s]||
								Matrix[2][0]==Matrix[2][1] && Matrix[2][0]==Matrix[2][2] && Matrix[2][0]==Symbols[s]||
								Matrix[0][0]==Matrix[1][1] && Matrix[0][0]==Matrix[2][2] && Matrix[0][0]==Symbols[s]||
								Matrix[2][0]==Matrix[1][1] && Matrix[2][0]==Matrix[0][2] && Matrix[2][0]==Symbols[s])
						{
							System.out.println("Matrix[] : "+Matrix[0][0]+Matrix[0][1]+Matrix[0][2]+";"
									+Matrix[1][0]+Matrix[1][1]+Matrix[1][2]+";"+Matrix[2][0]+Matrix[2][1]+Matrix[2][2]+";");
							
							if((Matrix[0][0]==Symbols[s] || Matrix[1][0]==Symbols[s] || Matrix[2][0]==Symbols[s]) && FreeSpins_Status==false)
							{
								payout=pay[s];	
								payline_win=Selected_Coin_Value*payout*BG_Multiplier;
								Total_win=Total_win+payline_win;
								System.out.println("Payline_"+(s+1)+"_win : "+payline_win);
							}
							
							else if(Matrix[0][0]==Symbols[s] || Matrix[1][0]==Symbols[s] || Matrix[2][0]==Symbols[s])
							{
								payout=pay[s];	
								payline_win=Selected_Coin_Value*payout*FG_Multiplier;
								Total_win=Total_win+payline_win;
								System.out.println("Payline_"+(s+1)+"_win : "+payline_win);
							}
							
							/*payline1();
							
							payline2();
							
							payline3();
							
							payline4();
							
							payline5();*/
					}
				}
					
		
	}
	
	public static void Free_Spins()
	{
		FreeSpins_Status=false;
		if(scatter_win>0)
		{
			
			scatter_win=0;
			FG_Multiplier=5;
			Total_Free_Spins_Win=0;
			for(int i=1; i<=Freespins_Award; i++)
			{
				
				Total_win=0;
				scatter_win=0;
				FreeSpins_Status=true;
				
				FG_Multiplier_Increment_Decrement_Range();
				
				Free_Game_Multiplier();
				
				if(i==1)
				{
					FG_Multiplier=5;
				}
				
				System.out.println("Free Game Multiplier : "+FG_Multiplier); 
				
				System.out.println("Free Spins count : "+i+"/"+Freespins_Award );
			
				reel1_RN= new Random().nextInt(7);
				reel2_RN= new Random().nextInt(7);
				reel3_RN= new Random().nextInt(7);
				
				/*Matrix_Data();*/
				
				Wild_Wins();
				
				/*payline1();
				
				payline2();
				
				payline3();
				
				payline4();
				
				payline5();*/
				
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

	
	
}
