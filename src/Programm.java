/*
    Autor: Christoph Lottersberger
    verfasst am 09.03.2021
    geändert am 09.03.2021
    Version 1
 */

//Importieren
import Ausstattung.Laptop;
import Ausstattung.Schrank;
import Fahrzeug.Auto;
import Gebäude.Haus;
import Personen.Person;
import java.util.*;

public class Programm {

    public static void main(String[] args) {

        //Person erstellen
        Person person1 = new Person("Christoph",180,75,"maennlich",20);

        //Haus erstellen
        Haus haus1 = new Haus("blau",500,15,20,6,4,6);

        //Auto erstellen
        Auto auto1 = new Auto("Schwarz",4,10000,90);

        //Laptop erstellen
        Laptop laptop1 = new Laptop("Schwarz","SSD","16GB",3,"Windows",1000);

        //Schrank erstellen
        Schrank schrank1 = new Schrank(3,1,2,500,"China","Holz");

        //Ausstattung ausgeben
        System.out.println("Die Person " + person1.toString() + " hat folgende Ausstattung: " + "\n\t" + "Laptop: " + laptop1.toString() + "\n\t" + "Schrank: " + schrank1.toString() + "\n\t" + "Auto: " + auto1.toString() + "\n\t" + "Haus: " + haus1.toString());
    }
}
