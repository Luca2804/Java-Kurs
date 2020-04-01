package JavaKurs30032020;


class Box
{
	double breite;
	double hoehe;
	double laenge;
	
Box(double breitei, double hoehei, double laengei)
	{
	breite = breitei;
	hoehe = hoehei;
	laenge = laengei;
	}

double berechneOberflaeche()
{
	return 2*(breite*laenge+hoehe*laenge+breite*hoehe);
}

double berechneVolumen()
{
	return breite*laenge+hoehe;
}

}

class BoxTester
{
  public static void main ( String[] args )
  {
     Box box = new  Box( 2.5, 5.0, 6.0 ) ;

     System.out.println( "Flaeche: "  + box.berechneOberflaeche( ) +
                         " Volumen: " + box. berechneVolumen( ) );

     System.out.println( "Laenge: " + box.laenge +
                         " Hoehe: " + box. hoehe +
                         "Breite: " + box.breite )  ;
  }
}
