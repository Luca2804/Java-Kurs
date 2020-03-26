import java.util.Scanner;

class Zaehler
{
	public static void main (String[] args )
	{
		Scanner scan = new Scanner(System.in);
		
		int laenge, Zaehler = 0; 
		String inputString;
		
		
		inputString = scan.nextLine();

		laenge = inputString.length();
		
		while(Zaehler <= laenge)
		{
			System.out.println(inputString);
			Zaehler = Zaehler + 1;
		}
		
	}
}