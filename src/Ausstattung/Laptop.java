/*
    Autor: Christoph Lottersberger
    verfasst am 09.03.2021
    geändert am 09.03.2021
    Version 1
 */

package Ausstattung;

//Importieren
import java.util.*;

public class Laptop {

    //Eigenschaften/Attribute
    private String farbe = "";
    private String festplatte = "";
    private String arbeitsspeicher = "";
    private int cpuleistung = 0;
    private String betriebssystem = "";
    private int preis = 0;

    //Konstruktoren

    /**
     *
     * @param farbe - Die Farbe des Laptops
     * @param festplatte - Die Festplatte (HDD/SSD)
     * @param arbeitsspeicher - die Größe des Arbeitsspeichers
     * @param cpuleistung - die CPU-Leistung
     * @param betriebssystem - das Betriebssystem
     * @param preis - der Preis des Laptops
     */
    public Laptop(String farbe, String festplatte, String arbeitsspeicher, int cpuleistung, String betriebssystem, int preis) {
        this.farbe = farbe;
        this.festplatte = festplatte;
        this.arbeitsspeicher = arbeitsspeicher;
        this.cpuleistung = cpuleistung;
        this.betriebssystem = betriebssystem;
        this.preis = preis;
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
     * @return - Gibt die Festplatte zurück
     */
    public String getFestplatte() {
        return festplatte;
    }

    /**
     *
     * @param festplatte - Setzt die Festplatte
     */
    public void setFestplatte(String festplatte) {
        this.festplatte = festplatte;
    }

    /**
     *
     * @return - Gibt den Arbeitsspeicher zurück
     */
    public String getArbeitsspeicher() {
        return arbeitsspeicher;
    }

    /**
     *
     * @param arbeitsspeicher - Setzt den Arbeitsspeicher
     */
    public void setArbeitsspeicher(String arbeitsspeicher) {
        this.arbeitsspeicher = arbeitsspeicher;
    }

    /**
     *
     * @return - Gibt die CPU-Leistung zurück
     */
    public int getCpuleistung() {
        return cpuleistung;
    }

    /**
     *
     * @param cpuleistung - Setzt die CPU-Leistung
     */
    public void setCpuleistung(int cpuleistung) {
        this.cpuleistung = cpuleistung;
    }

    /**
     *
     * @return - Gibt das Betriebssystem zurück
     */
    public String getBetriebssystem() {
        return betriebssystem;
    }

    /**
     *
     * @param betriebssystem - Setzt das Betriebssystem
     */
    public void setBetriebssystem(String betriebssystem) {
        this.betriebssystem = betriebssystem;
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
     * @return - Gibt die Angaben vom Laptop zurück
     */
    @Override
    public String toString() {
        return  "Farbe='" + farbe + '\'' +
                ", Festplatte='" + festplatte + '\'' +
                ", Arbeitsspeicher=" + arbeitsspeicher +
                ", Cpuleistung=" + cpuleistung +
                ", Betriebssystem='" + betriebssystem + '\'' +
                ", Preis=" + preis ;
    }
}
