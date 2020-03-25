class Quadratischegleichung
{
  public static void main ( String[] args )
  {
    double x = 4;
	double Ergebnis = 0.0;
	Ergebnis = 3 * Math.pow(x,2) -8 * x + 4;
	
	System.out.println("bei x = "+ x );
	System.out.println("ergibt die Quadratgleichung den Wert " + Ergebnis);
	
	x = 2;
	Ergebnis = 0.0;
	Ergebnis = 3 * Math.pow(x,2) -8 * x + 4;
	
	System.out.println("bei x = "+ x );
	System.out.println("ergibt die Quadratgleichung den Wert " + Ergebnis);
	
	x = 2/3;
    Ergebnis = 0.0;
	Ergebnis = 3 * Math.pow(x,2) -8 * x + 4;
	
	System.out.println("bei x = "+ x );
	System.out.println("ergibt die Quadratgleichung den Wert " + Ergebnis);
  }
}