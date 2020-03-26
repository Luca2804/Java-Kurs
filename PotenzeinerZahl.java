import java.util.Scanner;

class PotenzeinerZahl
{
	public static void main (String[] args )
	{
		Scanner scan = new Scanner(System.in);
		
		double x; 
		int n;
		
		System.out.println("Geben sie x ein:");
		x = scan.nextDouble();
		System.out.println("eben sie n ein:");
		n = scan.nextInt();
		
		if (n<1)
		{
			System.out.println("n muss ein positiver Integer sein.");
		}
		else
		{
			System.out.println(x + " hoch " + n + " ergibt: " + Math.pow(x,n));
		}
		
	}
}