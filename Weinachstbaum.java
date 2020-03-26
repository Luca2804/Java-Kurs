import java.util.Scanner;

class Weinachstbaum 
{
	public static void main (String[] args )
	{
		Scanner scan = new Scanner(System.in);
		
		int Hoehe,Zaehler = 0,x = 0,Anzahl = 1; 
		int StartStamm = 0, Breite = 3, y = 3, i = 0;
		
		System.out.println("Geben sie eine hoehe ein:");
		Hoehe = scan.nextInt();
		while(Hoehe > 0)
		{
			while(Zaehler < Hoehe)
			{
				Zaehler = Zaehler + 1;
				System.out.print(" ");
			}
			while(x < Anzahl)
			{
				x = x + 1;
				System.out.print("*");
			}	
			Zaehler = 0;
			x = 0;
			Hoehe = Hoehe - 1;
			Anzahl = Anzahl + 2;	
			System.out.print('\n');
		}	
		StartStamm = Anzahl / 2 - 1;
		while(Breite > 0)
		{
			while(y < 3)
			{
				y = y + 1;
				System.out.print("*");
			}
			i = 0;
			y = 0;
			Breite = Breite - 1;
			System.out.print('\n');
		}

	}
}