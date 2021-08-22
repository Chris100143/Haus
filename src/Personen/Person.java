/*
    Autor: Christoph Lottersberger
    verfasst am 09.03.2021
    geändert am 09.03.2021
    Version 1
 */

package Personen;

//Importieren
import java.util.*;

public class Person {

    //Eigenschaften/Attribute
    private String name = "";
    private int groeße = 0;
    private int gewicht = 0;
    private String geschlecht = "";
    private int alter = 0;

    //Konstruktoren

    /**
     *
     * @param name - der Name der Person
     * @param groeße - die Größe der Person
     * @param gewicht - das Gewicht der Person
     * @param geschlecht - das Geschlecht der Person
     * @param alter - das Alter der Person
     */
    public Person(String name, int groeße, int gewicht, String geschlecht, int alter) {
        this.name = name;
        this.groeße = groeße;
        this.gewicht = gewicht;
        this.geschlecht = geschlecht;
        this.alter = alter;
    }

    //Methoden/Funktionen

    /**
     *
     * @return - Gibt den Namen zurück
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name - Setzt den Namen
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return - Gibt die Größe zurück
     */
    public int getGroeße() {
        return groeße;
    }

    /**
     *
     * @param groeße - Setzt die Größe
     */
    public void setGroeße(int groeße) {
        this.groeße = groeße;
    }

    /**
     *
     * @return - Gibt das Gewicht zurück
     */
    public int getGewicht() {
        return gewicht;
    }

    /**
     *
     * @param gewicht - Setzt das Gewicht
     */
    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    /**
     *
     * @return - Gibt das Geschlecht zurück
     */
    public String getGeschlecht() {
        return geschlecht;
    }

    /**
     *
     * @param geschlecht - Setzt das Gewicht
     */
    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    /**
     *
     * @return - Gibt das Alter zurück
     */
    public int getAlter() {
        return alter;
    }

    /**
     *
     * @param alter - Setzt das Alter
     */
    public void setAlter(int alter) {
        this.alter = alter;
    }

    /**
     *
     * @return - Gibt die Angaben von der Person zurück
     */
    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", groeße=" + groeße +
                ", gewicht=" + gewicht +
                ", geschlecht='" + geschlecht + '\'' +
                ", alter=" + alter;
    }
}
