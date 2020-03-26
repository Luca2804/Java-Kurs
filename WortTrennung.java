import java.util.Scanner;

class Zaehler
{
	public static void main (String[] args )
	{
		Scanner scan = new Scanner(System.in);
		
		String Wort1, Wort2;
		int laenge1, laenge2;
		int Zaehler = 0, Anzahl;
		
		System.out.println("Geben sie ein Wort ein");
		Wort1 = scan.nextLine();
		System.out.println("Geben sie ein weiteres Wortein");
		Wort2 = scan.nextLine();
		laenge1 = Wort1.length();
		laenge2 = Wort2.length();
		System.out.println('\n');
		
		System.out.print(Wort1);
		Anzahl = 30 - (laenge1 + laenge2);
		
		while(Zaehler <= Anzahl)
		{
			Zaehler = Zaehler + 1;
			System.out.print(".");
		}
		
		System.out.println(Wort2);
		
		
		
	}
}