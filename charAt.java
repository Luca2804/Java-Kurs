package JavaKurs30032020;

import java.util.Scanner;
import java.awt.*;

public class charAt {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);

		String string;
		int Laenge;
		int Zaehler = 0; 
		char chr;
		
		System.out.println("Geben sie einen String ein: ");
		string  = scan.nextLine();
		
		Laenge = string.length();
		
		while(Zaehler < Laenge )
		{
			chr =  string.charAt(Zaehler);
			System.out.println(chr);
			Zaehler = Zaehler + 1;
		}
				
	}

}
