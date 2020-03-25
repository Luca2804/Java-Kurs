import java.util.Scanner;

class CentzuDollar 
{
	public static void main (String[] args )
	{
	 int Zahl;
	 int Dollar; 
	 int Quarter;
	 int Dime;
	 int Nickel;
	 int Cent; 
	 
	 Scanner input = new Scanner(System.in);
	 System.out.println("Geben sie eine Zahl ein:");
	 Zahl = input.nextInt();
	 Dollar = Zahl / 100; 
	 Zahl = Zahl % 100;
	 Quarter = Zahl / 25;
	 Zahl = Zahl % 25; 
	 Dime = Zahl / 10; 
	 Zahl = Zahl % 10; 
	 Nickel = Zahl / 5; 
	 Zahl = Zahl % 5; 
	 Cent = Zahl; 
	 
	 System.out.println("Dein Wechselgeld ist" );
	 System.out.println("Dollar"+ Dollar );
	 System.out.println("Quarter"+ Quarter);
	 System.out.println("Dime"+ Dime);
	 System.out.println("Nickel" +Nickel)
	  System.out.println("Quarter"+ Quarter);
	  System.out.println("Cent"+ Cent);
	
	
	 
	 
		
		
	}
}	
