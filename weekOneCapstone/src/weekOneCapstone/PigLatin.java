package weekOneCapstone;

import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Welcome to Pig Latin Translator!\n");
		
	String cont,r,lp, rp, pf; // left part, right part, and Pig Latin form
	
	do {
	
	int i,l; // i for loop, l for left
	
	char ch;
	System.out.println("Please Enter a Word\n"); // asking for user input 
	cont = sc.next();
	
	cont = cont.toUpperCase(); // to convert to Upper Case.
	
	l = cont.length(); // to find the length 
	
	for (i=0; i<l;i++) {
		
		ch = cont.charAt(i); // i is to locate the vowel
		if (ch =='A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
			break;
		
	}
	
	lp = cont.substring(0,i);
	rp = cont.substring(i);
	pf = rp+lp + "AY";
	
	System.out.println("\n Piglatin form is: " + pf); 
	
	System.out.println("\n Do you want to contunue? type Y/N!");
	cont = sc.next();
	
	} while (cont.equalsIgnoreCase("Y"));
	
	System.out.println("Goodbye!");
	
	
		
			
			
		
		
		sc.close();
		
		
	}
	

}
