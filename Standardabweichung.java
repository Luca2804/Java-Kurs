import java.util.Scanner;

class Standardabweichung
{
	public static void main (String[] args )
	{
		Scanner scan = new Scanner(System.in);
		
		int Anzahl,Zaehler = 0;
		double SD = 0.0 , Eingabezahl = 0.0,Summe = 0.0,Eingabezahl2 = 0.0,Summe2 = 0.0,Durchschnitt = 0.0, Durchschnitt2 = 0.0;
		
		System.out.println("Geben sie einen wert für n ein:");
		Anzahl = scan.nextInt();
		
		while(Zaehler < Anzahl)
		{
			System.out.println("Geben sie eine Zahl ein:");
			Eingabezahl = scan.nextDouble();
			Eingabezahl2 = Eingabezahl;
			Summe = Summe + Eingabezahl;
			Summe2 = Summe2 + Eingabezahl2 * Eingabezahl2;	
			Zaehler = Zaehler + 1;
		}

		Durchschnitt = Summe/Anzahl;
		Durchschnitt = Durchschnitt * Durchschnitt;
		Durchschnitt2 = Summe2/Anzahl;
		SD = Math.sqrt(Durchschnitt2 - Durchschnitt);
		
		System.out.println("Das Ergebnis ist:" + SD);
		
		
	}
}