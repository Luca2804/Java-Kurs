package JavaKurs30032020;

import java.util.Scanner;

public class equals {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		Integer Eingabe = 0;
		int Zaehler = 0;
		Integer Summe = 0;
		String Eingabeaufforderung;
		String Antwort = "ja"; 
		Boolean Pruefung = false;
		
		System.out.println("Eingabeaufforderung <ja> oder <nein>?");
		Eingabeaufforderung = scan.nextLine();
		if(Eingabeaufforderung.equals(Antwort))
		{
			Pruefung = true;
		}
		
		
		while(Zaehler < 5)
		{
			Zaehler = Zaehler + 1;
			if(Pruefung == true)
			{
				System.out.println("Geben sie " + Zaehler + ". Zahl ein:");
			}
			Eingabe = scan.nextInt();
			Summe = Eingabe + Summe;
		}
		
		
		System.out.println("Gesammtsumme: " + Summe);
		
	}

}
