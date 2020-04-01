package JavaKurs30032020;

import java.util.Scanner;

class Marmelade1
{
  // Instanzvariablen
  private String inhalt;   // Art der Frucht im Glas
  private String datum;   // Datum des Abfüllens
  private int menge;       // Menge der Marmelade im Glas


  // Konstruktor
  public Marmelade1( String inhalt, String datum, int menge )
  {
    this . inhalt = inhalt;
    this . datum  = datum;
    this . menge  = menge;
  }

  // Methoden
  public boolean istLeer()
  {
    return ( menge == 0 );
  }

  public void ausgeben()
  {
    System.out.println ( inhalt + "   " +  datum + "   " +  menge + " Unzen." );
  }

  public void auftragen ( int unzen)
  {
    if ( !istLeer() )
    {
      if ( unzen <= menge )
      {
        System.out.println("Auftragen von " + unzen + " Unzen "
            + inhalt );
        menge = menge - unzen;
      }
      else
      {
        System.out.println("Auftragen von  " + menge + " Unzen "
            + inhalt );
        menge =  0;
      }
     }
     else
       System.out.println("Keine Marmelade im Glas!");
  }

}

class Vorratskammer1
{
  // Instanzvariablen
  private Marmelade1  glas1;
  private Marmelade1  glas2;
  private Marmelade1  glasAusgewaehlt;
  private boolean leer1 = false;
  private boolean leer2 = false;

  // Konstruktor
  public Vorratskammer1( Marmelade1 glas1, Marmelade1 glas2)
  {
    this . glas1    = glas1;
    this . glas2    = glas2;
    glasAusgewaehlt = null;
  }

  // Methoden
  public void ausgeben()
  {
    System.out.print("1: "); glas1 . ausgeben();
    System.out.print("2: "); glas2 . ausgeben();
  }

  // wir setzen voraus, dass der Anwender eine richtige Auswahl trifft, 1, 2, oder 3
  public boolean auswaehlen(int glasNummer ) {
	if (glasNummer == 1) {
		if (glas1 != null) {
			glasAusgewaehlt = glas1;
		} else {
			leer1 = true;
			return leer1;
		}
	} else {
		if (glasNummer == 2) {
			if (glas2 != null) {
				glasAusgewaehlt = glas2;
			} else {
				leer2 = true;
				return leer2;
			}
		} else {

		}
	}
	return false;
}
  // Auftragen der ausgewählten Marmelade
  public void auftragen( int unzen  )
  {
    glasAusgewaehlt . auftragen( unzen  );
  }
}

class VorratskammerTester2
{
  public static void main ( String[] args )
  {
    Marmelade1 stachelbeer = new Marmelade1( "Stachelbeer", "04.07.09", 12 );
    Marmelade1 erdbeer     = new Marmelade1( "Erdbeer", "31.09.10", 8 );

    Vorratskammer1 vorrat = new Vorratskammer1( stachelbeer, erdbeer );
    vorrat.ausgeben();

    if ( vorrat.auswaehlen(1) )
      vorrat.auftragen(2);
    else
      System.out.println("Auswahl nicht verfuegbar");
    vorrat.ausgeben();

    if ( vorrat.auswaehlen(3) )
      vorrat.auftragen(2);
    else
      System.out.println("Auswahl nicht verfuegbar");
    vorrat.ausgeben();

  }
}