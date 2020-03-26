import java.util.Scanner;

class Zaehler
{
	public static void main (String[] args )
	{
		Scanner scan = new Scanner(System.in);
		
		int Start, Ende;
		
		System.out.println("Startwert");
			Start = scan.nextInt();
		System.out.println("Endwert");
			Ende = scan.nextInt();
		System.out.println('\n');
			
		while(Start <= Ende)
		{
			System.out.println(Start);
			Start = Start + 1;
		}
		
		
		
	}
}