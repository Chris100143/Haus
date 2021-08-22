/*
    Autor: Christoph Lottersberger
    verfasst am 09.03.2021
    geändert am 09.03.2021
    Version 1
 */

package Ausstattung;

//Importieren
import java.util.*;

public class Schrank {

    //Eigenschaften/Attribute
    private int laenge = 0;
    private int breite = 0;
    private int hoehe = 0;
    private int preis = 0;
    private String madein = "";
    private String material = "";

    //Konstruktoren

    /**
     *
     * @param laenge - die Länge des Schranks
     * @param breite - die Breite des Schranks
     * @param hoehe - die Höhe des Schranks
     * @param preis - der Preis des Schranks
     * @param madein - wo wurde der Schrank hergestellt
     * @param material - aus welchem Material besteht der Schrank
     */
    public Schrank(int laenge, int breite, int hoehe, int preis, String madein, String material) {
        this.laenge = laenge;
        this.breite = breite;
        this.hoehe = hoehe;
        this.preis = preis;
        this.madein = madein;
        this.material = material;
    }

    //Methoden/Funktionen

    /**
     *
     * @return - Gibt die Länge zurück
     */
    public int getLaenge() {
        return laenge;
    }

    /**
     *
     * @param laenge - Setzt die Länge
     */
    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }

    /**
     *
     * @return - Gibt die Breite zurück
     */
    public int getBreite() {
        return breite;
    }

    /**
     *
     * @param breite - Setzt die Breite
     */
    public void setBreite(int breite) {
        this.breite = breite;
    }

    /**
     *
     * @return - Gibt die Höhe zurück
     */
    public int getHoehe() {
        return hoehe;
    }

    /**
     *
     * @param hoehe - Setzt die Höhe
     */
    public void setHoehe(int hoehe) {
        this.hoehe = hoehe;
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
     * @return - Gibt das Land zurück, wo der Schrank hergestellt wurde
     */
    public String getMadein() {
        return madein;
    }

    /**
     *
     * @param madein - Setzt das Herstellungsland
     */
    public void setMadein(String madein) {
        this.madein = madein;
    }

    /**
     *
     * @return - Gibt das Material vom Schrank zurück
     */
    public String getMaterial() {
        return material;
    }

    /**
     *
     * @param material - Setzt das Material
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     *
     * @return - Gibt die Angaben vom Schrank zurück
     */
    @Override
    public String toString() {
        return  "laenge=" + laenge +
                ", breite=" + breite +
                ", hoehe=" + hoehe +
                ", preis=" + preis +
                ", madein='" + madein + '\'' +
                ", material='" + material + '\'';
    }
}
