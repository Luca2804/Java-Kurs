import java.util.Scanner;

class Integeraddieren
{
	public static void main (String[] args )
	{
		Scanner scan = new Scanner(System.in);
		
		int Anzahl, EingabeZahl, Zaehler = 1, Summe = 0;
		
		System.out.println("Wie viele Integer sollen addiert werden:");
		Anzahl = scan.nextInt();
		
		while(Zaehler <= Anzahl)
		{
			Zaehler = Zaehler + 1;
			System.out.println("Zahl Eingeben:");
			EingabeZahl = scan.nextInt();
			Summe = Summe + EingabeZahl;
		}
		System.out.println("Die Summe ist " + Summe);
		
	}
}	
