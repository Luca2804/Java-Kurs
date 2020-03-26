import java.util.Scanner;

class Summeausn
{
	public static void main (String[] args )
	{
		Scanner scan = new Scanner(System.in);
		
		double Summe = 0.0;
		int Eingabe, Durchgaenge, Zaehler = 0;
		
		System.out.println("Geben sie n ein:");
		Eingabe = scan.nextInt();
		Durchgaenge = Eingabe;
		
		while(Zaehler < Durchgaenge)
		{
			Zaehler = Zaehler + 1;
			Summe = Summe + 1.0/Zaehler;
		}
		
		System.out.println("Die Summe ist: " + Summe);
		
	}
}