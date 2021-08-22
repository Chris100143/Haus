/*
    Autor: Christoph Lottersberger
    verfasst am 09.03.2021
    geändert am 09.03.2021
    Version 1
 */

package Fahrzeug;

//Importieren
import java.util.*;

public class Auto {

    //Eigenschaften/Attribute
    private String farbe = "";
    private int reifenanzahl = 0;
    private int preis = 0;
    private int ps = 0;

    //Konstruktoren

    /**
     *
     * @param farbe - die Farbe des Autos
     * @param reifenanzahl - die Reifenanzahl
     * @param preis - der Preis des Autos
     * @param ps - die Pferdestärke des Autos
     */
    public Auto(String farbe, int reifenanzahl, int preis, int ps) {
        this.farbe = farbe;
        this.reifenanzahl = reifenanzahl;
        this.preis = preis;
        this.ps = ps;
    }

    //Funktionen/Methoden

    /**
     *
     * @return - Gibt die Farbe zurück
     */
    public String getFarbe() {
        return farbe;
    }

    /**
     *
     * @param farbe - Setzt die Farbe
     */
    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    /**
     *
     * @return - Gibt die Reifenanzahl zurück
     */
    public int getReifenanzahl() {
        return reifenanzahl;
    }

    /**
     *
     * @param reifenanzahl - Setzt die Reifenanzahl
     */
    public void setReifenanzahl(int reifenanzahl) {
        this.reifenanzahl = reifenanzahl;
    }

    /**
     *
     * @return - Gibt den Preis zurück
     */
    public int getPreis() {
        return preis;
    }

    /**
     *
     * @param preis - Setzt den Preis
     */
    public void setPreis(int preis) {
        this.preis = preis;
    }

    /**
     *
     * @return - Gibt die Pferdestärke zurück
     */
    public int getPs() {
        return ps;
    }

    /**
     *
     * @param ps - Setzt die Pferdestärke
     */
    public void setPs(int ps) {
        this.ps = ps;
    }

    /**
     *
     * @return - Gibt die Angaben vom Auto zurück
     */
    @Override
    public String toString() {
        return  "farbe='" + farbe + '\'' +
                ", reifenanzahl=" + reifenanzahl +
                ", preis=" + preis +
                ", ps=" + ps;
    }
}
