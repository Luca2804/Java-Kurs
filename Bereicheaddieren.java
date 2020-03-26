import java.util.Scanner;

class Berreicheaddieren 
{
	public static void main (String[] args )
	{
		Scanner scan = new Scanner(System.in);
			
		int Untergrenze, Obergrenze, EingabeZahl = 1;
		int Summein = 0, Summeout = 0;
		
		System.out.println("Untergrenze:");
			Untergrenze = scan.nextInt();
		System.out.println("Obergrenza:");
			Obergrenze = scan.nextInt();
		while(EingabeZahl != 0)
		{
		System.out.println("Daten Eingeben:");
			EingabeZahl = scan.nextInt();
			if (EingabeZahl > Obergrenze || EingabeZahl < Untergrenze)
			{
				Summeout = Summeout + EingabeZahl;
			}
			else 
			{
				Summein = Summein + EingabeZahl;
			}
		}
		System.out.println("Summe der Werte innerhalb des Bereichs: "+ Summein);
		System.out.println("Summe der Werte ausserhalb des Bereichs: "+ Summeout);
		
	}
}