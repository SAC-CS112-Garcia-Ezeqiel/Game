package rock;

import java.util.Random;
import java.util.Scanner;

public class game {
	public static void main(String[] args) 
	{ 
	    String personPlay; 
	    String computerPlay = ""; 
	    int computerInt; 
	    String response; 


	    Scanner scan = new Scanner(System.in); 
	    Random generator = new Random(); 

	    System.out.println("Hey, let's play Rock, Paper, Scissors!\n" + 
	                       "Please enter a move.\n" + "Rock = R, Paper" + 
	                       "= P, and Scissors = S.");

	    System.out.println();

	    
	    computerInt = generator.nextInt(3)+1; 

	    
	    
	    if (computerInt == 1) 
	        computerPlay = "R"; 
	     else if (computerInt == 2) 
	        computerPlay = "P"; 
	     else if (computerInt == 3) 
	        computerPlay = "S"; 


	     System.out.println("Enter your play: "); 
	     personPlay = scan.next();

	   
	     personPlay = personPlay.toUpperCase(); 

	   
	     System.out.println("Computer play is: " + computerPlay); 
	     

	     if (personPlay.equals(computerPlay)) 
	        System.out.println("It's a tie!"); 
	     else if (personPlay.equals("Rock")) 
	        if (computerPlay.equals("Scissors")) 
	           System.out.println("Rock crushes scissors. You win!!");
	     else if (computerPlay.equals("Paper")) 
	             System.out.println("Paper eats rock. You lose!!"); 
	     else if (personPlay.equals("Paper")) 
	        if (computerPlay.equals("Scissors")) 
	        System.out.println("Scissor cuts paper. You lose!!"); 
	     else if (computerPlay.equals("Rock")) 
	             System.out.println("Paper eats rock. You win!!"); 
	     else if (personPlay.equals("Scissors")) 
	          if (computerPlay.equals("Paper")) 
	          System.out.println("Scissor cuts paper. You win!!"); 
	     else if (computerPlay.equals("Rock")) 
	             System.out.println("Rock breaks scissors. You lose!!"); 
	     else 
	          System.out.println("Invalid user input."); 
	 }
	 }


// Let's make the code easier to read by using Rock/Paper instead of R/P
