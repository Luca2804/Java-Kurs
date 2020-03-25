import java.util.Scanner;

class Bestellung 
{
	public static void main (String[] args )
	{
		Scanner scan = new Scanner(System.in);
		final int SB = 5;
		final int MB = 3;
		final int UB = 1;
		int Schrauben, Muttern, Unterlegscheiben;
		int Gesamtpreis; 
		
		System.out.println("Anzahl der Schrauben;");
		Schrauben = scan.nextInt();
		System.out.println("Anzahl der Muttern;");
		Muttern = scan.nextInt();
		System.out.println("Anzahl der Unterlegscheiben;");
		Unterlegscheiben = scan.nextInt();
		
		Gesamtpreis = Schrauben * SB + Muttern * MB + Unterlegscheiben * UB;
		
		if (Schrauben > Muttern)
		System.out.println("Kontrollieren Sie Ihre Bestellung!" + '\n' + Gesamtpreis) ;
		else
		System.out.println("Die Bestellung ist okay." + '\n' + Gesamtpreis);
		
		
		
	}
}	
