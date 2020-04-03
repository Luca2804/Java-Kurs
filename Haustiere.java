package JavaKurs30032020;

import java.util.Scanner;

abstract class Haustiere1{
	
	String name;
	double futtervorat;
	int    anzahlTage; // gibt die Anzahl Tage aus, die der Futtervorrat reicht 
	Haustiere1(String name, double futtervorat){
		this.name = name;
		this.futtervorat = futtervorat;
	}

public void fuettern()
{
  // Hier erfolgt zuerst der Aufruf der Methode sprich().
	sprich();
  // Solange der Futtervorrat reicht, wird dann die Methode friss() aufgerufen
while(futtervorat > 0) {
	anzahlTage++;
	friss();
	}
}
  // und die Anzahl der Tage hochgezählt, die der Vorrat reicht.
  // Implementiert werden die abstrakten Methoden sprich() und friss() erst in den Subklassen.
public void anzeigen()
{
	fuettern();
	System.out.println(name + ": " + futtervorat + " " + anzahlTage);
 // zeigt den Namen des Haustiers an und wie viele Tage der Futtervorrat reicht
}

public abstract void sprich();

public abstract void friss();

}

class Hund extends Haustiere1
{
	Hund(String name, double futtervorrat){
		super(name, futtervorrat);
	}
	
	public void sprich() {
		System.out.println("Wuff");
	}
	
	public void friss() {
		futtervorat = futtervorat - 1;
		System.out.println(futtervorat);
	}
}

class Katze extends Haustiere1
{
	Katze(String name, double futtervorrat){
		super(name, futtervorrat);
	}
	
	public void sprich() {
		System.out.println("Miau");
	}
	
	public void friss() {
		futtervorat = futtervorat - 0.5;
		System.out.println(futtervorat);
	}
}


public class Haustiere
{
	  public static void main ( String[] args ) {
		
		  Haustiere1 dog = new Hund("Fifi", 10);
		  Haustiere1 cat = new Katze("Mauzi", 10);
		  
		  cat.anzeigen();
		  dog.anzeigen();
	  }
}
