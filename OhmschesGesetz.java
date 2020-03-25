import java.util.Scanner;

class OhmschesGesetz
{
	public static void main (String[] args )
	{
		double Stromstaerke; 
		int Widerstand;
		int Spannung; 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben sie einen Widerstand ein:");
		Widerstand = scan.nextInt();
		System.out.println("Geben sie eine Spannung ein;");
		Spannung = scan.nextInt();
		
		Stromstaerke = (double)Spannung / (double)Widerstand;
		
		System.out.println("Die Stromstaerke ist : " + Stromstaerke);
		
	}	
}