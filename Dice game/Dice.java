import java.util.Scanner;
import java.util.Random;
public class Dice {

	public static void main(String[] args) {
		
        int i;
		for(i=0;i<3;i++)
		{   
			int dicenumber;
			int dice1;
		    int dice2;
		    
			//User enters the number between 2 and 12
			System.out.println("Choose a number between 2 and 12 ");
			Scanner input= new Scanner(System.in);
			dicenumber=input.nextInt();
			
		    Random rand =new Random();
			dice1=rand.nextInt(10)+1;//Generates random number in dice1
			dice2=rand.nextInt(10)+1;//Generated random number in dice2
		
			//Checking the condition 
			if(dicenumber==(dice1+dice2))
			{
				System.out.println("User Wins");
				System.out.println("The Game ends");
				break;
		    }
			else
			{
				System.out.println("Computer wins ");
			}
}
		
		
}

}
