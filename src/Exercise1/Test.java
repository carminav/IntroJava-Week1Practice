package Exercise1;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;




public class Test {


	
	@org.junit.Test
	public void testPrintAboutMe() {
		
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		
		assertTrue(true);
		
		boolean legal = (Main.age >= 18) ? true : false;
		boolean drink = (Main.age >= 21) ? true : false;
		
		
		Main.printAboutMe();
		String first = "Hello, my name is " + Main.firstName + " " +  Main.lastName + 
				" and I go to " + Main.university + ". My age is " + Main.age +
				" and my gpa is " + Main.gpa + "\n";
		String sec = "I am 18 and over. --> " + legal + "\n";
		String thr = "I am 21 and over. --> " + drink + "\n";
		
		String answer = first + sec + thr;
		 assertEquals(answer, outContent.toString());
		
		System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));

	}
	
	
	@org.junit.Test
	public void testForLoops() {
		
		String a = "";
		
		for (int i = 0; i < Main.age; i++) {
			a += "Carmina is cool\n";
		}
		
		String b = "10 12 14 16 18 20 \n";
		String b2 = "10 12 14 16 18 20\n";
		
		String c = "13 11 9 7 5 3 1 \n";
		String c2 = "13 11 9 7 5 3 1\n";
		
		String answer = a + b + c;
		String ans2 = a + b2 + c2;
		
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		
		Main.printForLoops();
		
	    assertTrue(outContent.toString().equals(answer) || 
	    		outContent.toString().equals(ans2));
			
		System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
		
	}
	
	@org.junit.Test
	public void testWhileLoop() {
		String a = "";

		for (int i = 0; i < Main.age; i++) {
			a += "Carmina is cool\n";
		}

		String b = "10 12 14 16 18 20 \n";
		String b2 = "10 12 14 16 18 20\n";

		String c = "13 11 9 7 5 3 1 \n";
		String c2 = "13 11 9 7 5 3 1\n";

		String answer = a + b + c;
		String ans2 = a + b2 + c2;

		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		Main.printWhileLoops();

		assertTrue(outContent.toString().equals(answer) || 
				outContent.toString().equals(ans2));

		System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
	}
	

	

}
