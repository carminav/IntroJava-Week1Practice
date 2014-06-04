package Exercise2;

import java.util.Scanner;


/* @author [Carmina Villaflores]
 * 
 * In this file we're going to make a bank application. The user will interact
 * with the bank in the output console below. You will scan for the user's input
 * and the program will continue in certain ways depending on what the user
 * asks for. This project doesn't have a JUNIT test. You will have to inspect
 * if it works correctly by running and using it. 
 * 
 * THE RULES FOR BANK OF CARMERICA (Read carefully):
 * 
 * At first, the user will be have these choices:
 * 1) Withdraw money
 * 2) Deposit
 * 3) Inquire about balance
 * 4) exit
 * 5) Rob the bank
 * 
 * 
 * CHOICE 1: Withdraw
 * Once user enters "1" for choice 1, user will be directed to enter an amount
 * to withdraw. You must subtract this amount from their account. If the user
 * tries to deposit more than there is in his/her account, just make their
 * account 0. 
 * 
 * CHOICE 2: DEPOSIT
 * Once user enters "2" for choice 2, user will be directed to enter an amount
 * to deposit. You  must add this amount to their account. BUT, 
 * the bank of CARMERICA only allows amounts of up to 5000 to be deposited 
 * at a time. If the amount is greater than 5000, you have to add it to the
 * user's account in smaller batches less than or equal to 5000 until the total 
 * amount is added. This rule is set in place because anyone depositing more
 * that 5000 at once is probably a drug dealer. 
 * 
 * CHOICE 3: INQUIRE ABOUT BALANCE
 * Once user enters "3" for choice 3, just print out the user's balance. 
 * 
 * CHOICE 4: EXIT
 * Once user enters "4" for choice 4, tell the user to "Have a nice day" and then
 * end the program. 
 * 
 * CHOICE 5: ROB THE BANK
 * This will be a secret choice. The user will not be asked if they want to 
 * rob the bank obviously. In order to rob the bank, the user must type any
 * other number other than 1,2, 3, or 4.
 * 
 * Now here comes the interesting part that determines
 * whether the user will succeed in robbing the bank and go home with the money, 
 * or if the user fails and goes to jail. 
 * 
 * ~~Robbing bank of CARMERICA 101~~
 * 1)After the user declares they want to be a scumbag robber, they will have to
 *   input an amount they are planning to steal. Before any robbing goes on, they
 *   must decide this amount. 
 * 2)Rule: The first $10,000 robbed will take 1 minute, next $10,000 will take
 *   3 minutes, next $10,000 will take 5 minutes...etc. Do you catch the pattern?
 *   Minutes increase by 2. 
 *   
 *    Ex: $12,000 will take 4 minutes total. 
 *        $20,000 will also take 4 minutes total. 
 *        $46,000 will take 25 minutes total. 
 *        $800 will take 1 minute total. 
 *        
 *   If the robber takes too long and the cops come before they finish, then
 *   they go to jail. The robber will never know when the police are coming. 
 *   The police will come at some random time between 1 minute and 60 minutes
 *   depending on how busy the police are that day. (The bank of CARMERICA
 *   is located in a really crappy place where crime rates are super high). 
 *   
 *        
 *        
 *FLOW OF PROGRAM:
 * You will need to use a do-while loop. After the user inputs choice 1, 2, 3,
 * your program will present the 3 choices to the user again. This will happen
 * either until the user types "4" for exit OR the user chooses the rob the bank. 
 * If the user robs the  bank, the program will end either after the user succeeds
 * or fails to rob the bank. 
 * 
 *       
 *       
 * NEW FEATURES:
 * In this project it is necessary to use the Scanner class to get the user's
 * input and the Math.random() function to generate random numbers. The random
 * number generator is necessary to compute how long the cops will take to get
 * to the bank in case of robbery. It is random, so the user will not know
 * how long they will take. 
 * 
 * Here's a useful resource explaining how to use Math.random()
 * http://stackoverflow.com/questions/7961788/math-random-explained
 * 
 */
public class Main {

	/* FIELDS AND VARIABLES (do not edit this area)
	 * This area at the top is typically reserved for initially declaring
	 * fields or variables you will use throughout your code. You can technically
	 * place them anywhere inside this class (as long as its within the outermost
	 * brackets, but its neater to place them at the top). 
	 */
	
	
	/* I've done this part for you. This is what your program should print
	 * when it asks the user what to do. 
	 */
	public static final String GIVE_CHOICES = "Welcome to the Bank of " +
			"CARMERICA. " +
			"\nTo withdraw, type 1" +
			"\nTo deposit, type 2" +
			"\nTo inquire about your bank balance, type 3" +
			"\nTo leave the bank, type 4\n";
	
	/* By default, the user will start off with $30,000 */
	public static int account_balance = 30000;
	
	public static final int MAX_DEPOSIT = 5000;
	
	public static final String ROBBERY_FAIL = "You are charged with assault " +
			" and robbery. You will serve 25 to life\n";
	
	public static final String ROBBERY_SUCCEED = "Congratulations, you got away " +
			"with robbery. High five\n";
			
	
	
	
	
	/*************************************************************************/
	
	/* METHODS 
	 * This is where the actual logic and coding is done. You can use the
	 * fields and variables declared above in this code.*/
	
	/*MAIN
	 *  The entry point to your program. 
	 */
	public static void main(String[] args) {
		
		
		/* USING THE SCANNER
		 * sc is a variable of type 'Scanner'. Use this in order to get
		 * the user's input and store it in a variable. 
		 * For example: 
		 * 
		 * This gets the next integer that a user types
		 * int x = sc.nextInt() 
		 *
		 * or, if you're expecting the user to type a string you will do
		 * 
		 * String str = sc.nextLine(); 
		 * 
		 * This gets the entire next line typed
		 * and stores it in a string. 
		 * 
		 * Check the link below if you have a problem. Perhaps this is your problem?
		 * http://stackoverflow.com/questions/7056749/scanner-issue-when-using-nextline-after-nextxxx
		 *
		 *
		 */
		
		Scanner sc = new Scanner(System.in);
		
		/* Place your code in this do-while loop. This is necessary because
		 * you want your program to execute at least once, and continue only if
		 * the user wants to continue. 
		 */
		
		
		boolean userWantsToContinue;
		
		do { /* Edit this area */
			
			/* 1) Print out the GIVE_CHOICES prompt below using System.out.print */
			/* insert code here */
			
			
			
			
			
			
			
			/* 2) Now get the user's input using the scanner object 'sc' and 
			 * store it in a variable so you can use it. It will */
			/* insert code here */
			
			
			
			/* 3) Using if and else statements on the user's choice, call the 
			 * appropriate method.
			 * 
			 *     -If user entered 1, call the withdraw method. 
			 *     -If user entered 2, first check if the amount to deposit is
			 *      less than 5000. If not you will need to call the deposit 
			 *      method an appropriate number of times until the entire
			 *      amount is deposited. The deposit method is designed to do 
			 *      nothing if you try to deposit more than 5000 at once. 
			 *     -If user entered 3, print out exactly :
			 *     		"Your account balance is {user's account balance}"
			 *      without the quotations and by replacing the content in the
			 *      curly brackets. 
			 *     -if user entered 4, update the userWantsToContinue variable
			 *      to false. This will stop the loop and end the program. 
			 *     -else if user entered any other number, run the robBank()
			 *      method and then update userWantsToContinue variable to false. 
			 * 
			 */
			
			/* place code here */
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		} while (userWantsToContinue); 
		/* ^ Hover over the error above to find and fix the problem */
		
		
		
		
		
		
		
		
		/* Do not edit */
		sc.close();
		
	}
	
	
	/* WITHDRAW
	 * -take the @param amount and subtract it from the account_balance
	 * -if @param amount is greater than account_balance, zero out the 
	 * account_balance
	 * 
	 */
	public static void withdraw(int amount) {
		
		/*insert code here */
		
		
	}
	
	
	
	
	/* DEPOSIT
	 * -take the @param amount and add it to the account_balance
	 */
	public static void deposit(int amount) {
		
		/* Do not edit/delete this. This ensures that this method exits
		 * and does nothing if the amount is greater than 5000.
		 */
		if (amount > MAX_DEPOSIT) {
			return;
		}
		
		
		/*insert code here */
		
		
		
		
		
	}
	
	
	
	/* ROB BANK
	 * - 1) take the @param amount and calculate how long it takes to rob the bank.
	 *  Use the description above to figure out how long it would take. 
	 * - 2) Then, calculate how long the cops will take to get to the bank using
	 *  a random number generator. Use Math.random() to randomly generate a 
	 *  number between 1 and 60 inclusive. Store the random number generated
	 *  in a variable you can use.
	 * - 3) If the time it takes to rob the bank is greater than or equal to the time
	 *  it takes for cops to come, user will fail and go to jail. Else, the user
	 *  will succeed. 
	 *  
	 *  -If the user fails: print the ROBBERY_FAIL string
	 *  -If the user succeeds: print the ROBBERY_SUCCEED string
	 *  Use System.out.print() and do not use a new line character. Just simply
	 *  print it. 
	 *
	 */
	
	public static void robBank(int amount) {
		
		
		/* insert code here */
		
		
	}
	
	
	
	

}
