import java.util.Scanner;

class Mikrowellenherd
{
	public static void main (String[] args )
	{
		Scanner scan = new Scanner(System.in);
		
		int Anzahl, Erhitzung;
		double Empfohlen = 0.0;
		
		System.out.println("Geben sie die Anzahl der Posten ein:");
		Anzahl = scan.nextInt();
		System.out.println("Geben sie die Erhitzungsdauer ein:");
		Erhitzung = scan.nextInt();
		
		if(Anzahl == 1) 
		{
			Empfohlen = Erhitzung;
		}
		else if (Anzahl == 2 )
		{
			Empfohlen = Erhitzung * 1.5; 
		}
		else if (Anzahl == 3)
		{
			Empfohlen = Erhitzung * 2; 
		}
		else if (Anzahl > 3)
		{
			System.out.println("Nicht Empfohlen!");
		}
		System.out.println("Die Empfohlene dauer ist :" + Empfohlen);
	}
}