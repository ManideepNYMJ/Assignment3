import java.util.*;
class Guesser
{
	int guesserNum,tempNum;
	int guesser()
	{
	System.out.println(" Guesser Please Enter any number between 0 to 10");
	 Scanner scan=new Scanner(System.in);
	 tempNum=scan.nextInt();
	 if(tempNum<=10)
	 {
		 guesserNum=tempNum;
		
	 }
	 else {
		 System.out.println(" Invalid Number ......Please  Run Again And Enter the Number between 0 t0 10");
		 tempNum=scan.nextInt();
		 guesserNum=tempNum;
	 }
	return guesserNum;
	}
}

class Player
{
	 int playerNum,tempNum;
	 int player1()
	 {
		 System.out.println(" Player1 Please Enter any number between 0 to 10");
		 Scanner scan=new Scanner(System.in);
		 tempNum=scan.nextInt();
		 if(tempNum<=10)
		 {
			 playerNum=tempNum;
			
		 }
		 else {
			 System.out.println(" Invalid Number ......Please  Run Again And Enter the Number between 0 t0 10");
			 tempNum=scan.nextInt();
			 playerNum=tempNum;
		 }
	
	 return playerNum;
	 }
	 
	 int player2()
	 {
		 System.out.println(" Player2 Please Enter any number between 0 to 10");
		 Scanner scan=new Scanner(System.in);
		 tempNum=scan.nextInt();
		 if(tempNum<=10)
		 {
			 playerNum=tempNum;
			
		 }
		 else {
			 System.out.println(" Invalid Number ......Please  Run Again And Enter the Number between 0 t0 10");
			 tempNum=scan.nextInt();
			 playerNum=tempNum;
		 }
	 return playerNum;
	 }
	
	 int player3()
	 {
		 System.out.println(" Player3 Please Enter any number between 0 to 10");
		 Scanner scan=new Scanner(System.in);
		 tempNum=scan.nextInt();
		 if(tempNum<=10)
		 {
			 playerNum=tempNum;
			
		 }
		 else {
			 System.out.println(" Invalid Number ......Please  Run Again And Enter the Number between 0 t0 10");
			 tempNum=scan.nextInt();
			 playerNum=tempNum;
		 }
	 return playerNum;
	 }
}
class umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser()
	{
	Guesser	g=new Guesser();
	numFromGuesser = g.guesser();
	}
	void collectNumFromplayer()
	{
	Player	p1=new Player();
	Player	p2=new Player();
	Player	p3=new Player();
	numFromPlayer1 = p1.player1();
	numFromPlayer2 = p2.player2();
	numFromPlayer3 = p3.player3();
	}
    void compare()
    {
    	if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("All players won the game,Congratulations All Of You");
			}
			else if(numFromGuesser==numFromPlayer2 )
			{
				System.out.println("Player 1 & Player2 won");
				System.out.println("Congratulations Player1 and Player2");
				System.out.println("Player3 Better luck Next Time");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 & Player3 won");
				System.out.println("Player 1 & Player3 Congratulations");
				System.out.println("Player2 Better Luck Next Time");
			}
			else
			{
			System.out.println("Player 1 won the game,Congratulations");
			System.out.println("Player 2 & Player3 Better Luck Next Time");
			}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 2 & Player3 won");
				System.out.println("Player 2 & Player3 Congratulations");
				System.out.println("Player 1 Better Luck Next Time");
			}
			else
			{
			System.out.println("Player 2 won the game,Congratulations");
			System.out.println("Player 1 & Player3 Better Luck Next Time");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won the game,Congratulations");
			System.out.println("Player 1 & Player2 Better Luck Next Time");
		}
		else
		{
			System.out.println("Every one Lost the GAME!, Better luck Next Time");
		}
		
	}
	
}






public class LaunchGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		 umpire u=new umpire();
		u.collectNumFromGuesser();
		u.collectNumFromplayer();
		u.compare();
		
	}

}
