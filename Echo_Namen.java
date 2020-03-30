package JavaKurs30032020;

import java.util.Locale;
import java.util.Scanner;
import java.awt.*;

public class Echo_Namen {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
	String Name; 
	int Zaehler = 0;
	char chr = 'a';
	String Nachname; 
	String Vorname;
	
	System.out.println("Geben sie ihren Namen ein:");
	Name = scan.nextLine();
	
	while(chr != ' ')
	{
		Zaehler = Zaehler + 1;
		chr = Name.charAt(Zaehler);
	}
	
	Nachname = Name.substring(Zaehler);
	Vorname = Name.substring(0, Zaehler);
	
	Nachname = Nachname.toUpperCase();
	
	System.out.println(Vorname + Nachname);	
	
	}
}
