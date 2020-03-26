import java.util.Scanner;
import java.util.Random;

class Ratespiel
{
	public static void main (String[] args )
	{
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int Zufallszahl, Versuche = 3, Eingabe;
		
		Zufallszahl = rand.nextInt(10)+1 ;
		
		while (Versuche > 0)
		{
			Versuche = Versuche - 1;
			
			if(Versuche == 0)
			{
				System.out.println("Sie haben Verloren");
				break;
			}
			
			System.out.println("Geben sie eine Zahl zwischen 1-10 ein:");
			Eingabe = scan.nextInt();
			
			if(Zufallszahl == Eingabe)
			{
				System.out.println("Sie haben gewonnen");
				break;
			}
			else 
			{
				System.out.println("Leider nein sie haben noch " + Versuche + " Versuch");
			}
		}
		
	}
}