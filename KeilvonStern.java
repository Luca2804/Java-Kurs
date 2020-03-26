import java.util.Scanner;

class KeilvonStern
{
	public static void main (String[] args )
	{
		Scanner scan = new Scanner(System.in);
		
		int Start, Zaehler = 0;
		
		System.out.println("Anfangszahl der Sterne:");
		Start = scan.nextInt();
		
		while(Start > 0)
		{
			System.out.print('\n');
			while(Zaehler < Start)
			{
				Zaehler = Zaehler + 1;
				System.out.print("*");
			}

			Zaehler = 0;
		    Start = Start - 1;
			Hoehe = Hoehe - 1;
		}
	}
}