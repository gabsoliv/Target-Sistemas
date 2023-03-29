package ava02;

import java.util.Scanner;

public class Avaliacao02 {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = sc.nextInt();
		boolean primo = false;
		
		int fiboNumberA = 1, fiboNumberB = 0;
		
		if (number == fiboNumberA || number == fiboNumberB) {
        	System.out.println("Pertence a sequência");
        	
        } 
        
        for(int i = 1; i < number; i++){

        	fiboNumberA = fiboNumberA + fiboNumberB;	
            fiboNumberB = fiboNumberA - fiboNumberB; 

            if (number == fiboNumberA ) {
            	primo = true;

            } 
        }
        
        if (primo == true) {
        	System.out.println("Pertence a sequência");
        } else {
        	System.out.println("Não pertence a sequência.");
        }

		sc.close();
	}

}
