package Exercise1;
/* @author [Carmina Villaflores]
 * 
 * __Week 1 Exercises__
 * Goal: familiarize yourself with 
 * -declaring and using variables 
 * -control statements (if/else)
 * -printing to the console
 * -loops
 * 

 * Note: Don't worry about the bold purple words like "public", "class", and "void"
 * right now. We will get to it next week. Just know that in some 
 * object-oriented languages like java, all your code will be encapsulated in 
 * brackets. Do not place any code outside of the outermost brackets. 
 * 
 * 
 */
public class Main {
	
	/* To get more information about you, please fill in below. 
	 * Take out the semi-colon and complete it like so:
	 * 
	 * public static String firstName = Carmina;
	 * public static String lastName = Villaflores;
	 *  
	 *  Notice that all variables that are words start with a "String" 
	 *  data type, integers start with an "int", and gpa starts with "double".
	 *  This is because java requires that you declare what 'kind' of variable
	 *  it is before you use it. After you declare it, you do not have to 
	 *  put its data type in front of the variable name each time you use it. 
	 */
	
	public static String firstName;
	public static String lastName;
	public static String university;
	public static int age;
	public static double gpa;
	

	/**
	 * MAIN
	 * This is the entry point to your program. Anything within these brackets
	 * will be executed linearly once the program is run. You can think of it
	 * as being called "main" because it is the main method that your computer
	 * will execute. 
	 */
	public static void main(String[] args) {
		
		
		/* Below are a list of "methods" which are nothing more but names of 
		 * pieces of code to execute. They can be methods that are pre-written
		 * and already included in the Java library, or they can be methods that
		 * you write. In this case, you will write these methods. 
		 * 
		 * As you implement these methods, run their
		 * corresponding JUNIT tests to see if you did them correctly. If you
		 * have not implemented the method yet, you will fail the test. 
		 */
		
		
		 printAboutMe();
		 
		 printForLoops();
		 
		 printWhileLoops();
		 
		 
		 /*This method below does not have its own JUNIT test. 
		  * Check your results by observing your console.
		  */
		 printPicturesWithLoops();
		
		
		
		
	}
	


	/* PRINT ABOUT ME
	 * This is the first method you will implement. The name of this method
	 * is arbitrary. You could name it anything you want and it would still 
	 * function correctly. But to increase readability of code, we want to name
	 * it something that relates to its functionality.  
	 * 
	 */
	public static void printAboutMe() {
		
		/* Use the variables you already declared above to complete this. */
		
		 /* 
		 * PART 1: print out
		 * 
		 * Hello, my name is {yourFirstName} {yourLastName} and I go to 
		 * {yourUniversity}. My age is {yourAge} and my gpa is {yourGPA}
		 * 
		 * Remember, coding is case-sensitive. Make sure everything prints 
		 * exactly as the example above, except with your own information 
		 * replacing the curly brackets. 
		 * 
		 * !!DO NOT USE System.out.println() to print because it doesn't work
		 * in the test cases for some reason only God knows. 
		 * Use a new line character at the end of what 
		 * you're printing. Do this or you won't past the test case. 
		 * 
		 * Type your code below here:
		 * */
		
		
		
		

		
		
		/* PART 2: IF AND ELSE STATEMENTS
		 * 
		 * Create if and else statements using the variables you declared
		 * above to store a true or false value in the two booleans below. 
		 */
		
		//These are not initialized. You must initialize it to some
		//arbitrary value because it will make your compiler happy. 
		boolean amIlegal;
		boolean canIdrink;
		
		/*PLACE IF/ELSE STATEMENTS HERE*/
		
		
		
		
		
		
		
		
		/* do not change or revise the print statements below */
		System.out.print("I am 18 and over. --> " + amIlegal + "\n");
		
		System.out.print("I am 21 and over. --> " + canIdrink + "\n");
		
		
	}
	
	
	/*PRINT LOOPS
	 * Time to practice for loops!
	 * Time to practice for loops!
	 * Time to practice for loops!
	 * Time to practice for loops!
	 * Time to practice for loops!
	 */
	public static void printForLoops() {
		
		/* PART 1:  
		 * Print out "Carmina is cool" as many times as how old you are. 
		 * Remember to use a new line character after each print out.  
		 */
		

		
		
		
		
		/* PART 2:
		 * Print out all even numbers between 10 and 20 inclusive. 
		 * (hint: to check if a number is even, use the modulus operator "%" to 
		 * get the remainder of a number divided by another number.)
		 * Ex: 
		 * 9 % 3 = 0
		 * 9 % 4 = 1
		 * 27 % 5 = 2 
		 * 
		 * Your output SHOULD BE:
		 * 10 12 14 16 18 20
		 * Only put a new line character after the last number. 
		 */
		

		
		
		
		/* PART 3: 
		 * Print every other number from 13 to 0 (decrementing). Try to do this
		 * without using the modulus operator. 
		 * 
		 * Your output SHOULD BE:
		 * 13 11 9 7 5 3 1 
		 * Only put a new line character after the last number.
		*/
		

	
		
	}
	
	
	
	/*PRINT WHILE LOOPS
	 * While loops should be used when you don't necessarily know how many
	 * times you will be looping, and  you just want to loop until some 
	 * condition occurs.
	 * 
	 * For the sake of practicing while loops, we will be using while loops
	 * in many different ways, even if its easier or more efficient to just
	 * use a for-loop in place
	 */
	public static void printWhileLoops() {
		
	/* Do Parts 1, 2, and 3 of the printForLoops() method except instead
	 * of using for-loops, use while-loops. The output should be exactly the 
	 * same.
	 */
		

		
	
	}

	

	
	/* PRINT PICTURES WITH LOOPS
	 * This one is tricky because it involves nested for-loops. This means
	 * you have to place a for-loop inside another for-loop like so:
	 * 
	 * for (int i = 0; i < 3; i++) {
	 *    for (int j = 0; j < 3; j++) {
	 *    
	 *    	System.out.print(i + " and " + j + "\n");
	 *    
	 *    }
	 * }
	 * 
	 * The output for this would be:
	 * 0 and 0
	 * 0 and 1
	 * 0 and 2
	 * 1 and 0
	 * 1 and 1
	 * 1 and 2
	 * 2 and 0
	 * 2 and 1
	 * 2 and 2
	 * 
	 * This is because the entire inner for-loop is executed for each time the 
	 * outer-loop is iterated over. 
	 * 
	 * NOTE: There is no JUNIT test for this. Just check your output console
	 * to see if you got it right. 
	 */
	public static void printPicturesWithLoops() {
		
		/* PART 1:
		 * Print out the capital letter I with the '&' symbol EXACTLY like this:
		 * 
		 * 
		 * 
		 * &&&&&&&&&&&&&&&&&&&&&
		 * &&&&&&&&&&&&&&&&&&&&&
		 *         &&&&&
		 *         &&&&&
		 *         &&&&&
		 *         &&&&&
		 *         &&&&&
		 *         &&&&&
		 *         &&&&&
		 * &&&&&&&&&&&&&&&&&&&&&
		 * &&&&&&&&&&&&&&&&&&&&&
		 * 
		 * 
		 * So you don't have to do all the counting yourself, the base and roof
		 * are 21 characters wide. The middle stem is 5 characters wide and 7 
		 * characters tall. The middle stem must start after 8 spaces. The
		 * entire "I" has a total height of 11 characters. 
		 * ~*Remember to put a new line after the very last character.*~
		 * 
		 */
		
		
		
		


		
		
		/*PS: These are kind of hard */
		
		/* PART 2
		 * Now print this:
		 * 
		 * 0 0 0 0 0 0 0 0 0 0
		 * 0 0 0 0 0 0 0 0 0
		 * 0 0 0 0 0 0 0 0
		 * 0 0 0 0 0 0 0
		 * 0 0 0 0 0 0
		 * 0 0 0 0 0
		 * 0 0 0 0
		 * 0 0 0
		 * 0 0 
		 * 0
		 * 
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		
		/* PART 3
		 * Now print this:
		 * 
		 * 0 0 0 0 0 0 0 0 0 0
		 * 0 S S S S S S S 0
		 * 0 S S S S S S 0
		 * 0 S S S S S 0
		 * 0 S S S S 0
		 * 0 S S S 0
		 * 0 S S 0
		 * 0 S 0
		 * 0 0 
		 * 0
		 * 
		 * 
		 * 
		 */
		
		
		
	}
	

}
