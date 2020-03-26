import java.util.Scanner;

class Reifendruck
{
	public static void main (String[] args )
	{
		Scanner scan = new Scanner(System.in);
		
		int LV = 0, RV, LH, RH, DifH = 0, DifV = 0;
		boolean druckok = true;
		
		System.out.println("Reifendruck: rechter Vorderreifen");
			RV = scan.nextInt();
				if(RV > 45 || RV < 35)
				{
					System.out.println("Nicht erlauber bereich");
					druckok = false;
				}
		System.out.println("Reifendruck: linker Vorderreifen");
			LV = scan.nextInt();
				if(LV > 45 || LV < 35)
				{
					System.out.println("Nicht erlauber bereich");
					druckok = false;
				}
		System.out.println("Reifendruck: rechter Hinterreifen");
			RH = scan.nextInt();
				if(RH > 45 || RH < 35)
				{
					System.out.println("Nicht erlauber bereich");
					druckok = false;
				}
		System.out.println("Reifendruck: rechter Hinterreifen");
			LH = scan.nextInt();
				if(LH > 45 || LH < 35)
				{
					System.out.println("Nicht erlauber bereich");
					druckok = false;
				}
			
			DifV = LV - RV;
			DifH = LH -RH;
			
		if(DifH < 3 || DifH > -3 && DifV < 3 ||DifV > -3 && druckok == true)
		{
			System.out.println("Reifendruck ist OK");
		}
		else 
		{
			System.out.println("Reifendruck nicht in Ordnung");
		}
		
	}
}