package JavaKurs30032020;

import java.util.Scanner;

class Auto
{
  // Instanzvariablen
  double startMeilen;   // Anfangsstand Tachometer
  double endMeilen;     // Endstand Tachometer
  double gallonen;      // verbrauchte Gallonen Benzin


  // Konstruktor
  Auto(double neuerTacho , double aktTacho, double gallonent)
  {
    startMeilen = aktTacho;
    endMeilen   = neuerTacho;
    gallonen    = gallonent;      
  }
  
  // Methoden
  double berechneMPG()
  {
    return (endMeilen - startMeilen) / gallonen ;
  }
  
 boolean benzinschwein()
  {
   return berechneMPG() < 15;
  }
 
  boolean sparauto()
	{
	return berechneMPG() > 30;
	}
}
class MeilenProGallone
{
  public static void main( String[] args )
  {
	  Scanner scan = new Scanner(System.in);
	  int Anfang = 0, ende, gallonen;
	  
	System.out.println("Aktuellen Tachometerstand eingeben:");
	ende = scan.nextInt();
	System.out.println("Anzahl der Gallonen für Tankfüllung:");
	gallonen = scan.nextInt();
	
	Auto auto = new Auto(Anfang, ende, gallonen);
	
    System.out.println( "Meilen pro Gallonen:"+ auto.berechneMPG() );
    if (auto.sparauto())
    {
    	System.out.println("Sparauto!");
    }
    
    if(auto.benzinschwein())
    {
    	System.out.println("Benzinschwein!");
    }
  }
}
