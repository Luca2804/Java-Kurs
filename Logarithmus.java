import java.util.Scanner;

class Logarithmus
{
	public static void main (String[] args )
	{
		Scanner scan = new Scanner(System.in);
		
		double Zahl,n;
		
		System.out.println("Geben sie eine Zahl ein :");
		Zahl = scan.nextDouble();
		n = Math.log(Zahl) / Math.log(2);
		System.out.println("Der Zweierlogarithmus von" + Zahl + " ist " + n);
			
		
		
	}
}