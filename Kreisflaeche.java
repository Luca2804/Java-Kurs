import java.util.Scanner;

class Kreisflaeche 
{
	public static void main (String[] args )
	{
		double Radius;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Geben sie einen Radius ein:" );
		Radius = input.nextDouble();
		System.out.println("Bei einem Radius von :" + Radius);
		System.out.println("beträgt die Kreisflaeche :" + Math.PI * Math.pow(Radius,2));
		
	
	}
}