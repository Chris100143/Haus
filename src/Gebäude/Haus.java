/*
    Autor: Christoph Lottersberger
    verfasst am 09.03.2021
    geändert am 09.03.2021
    Version 1
 */

package Gebäude;

public class Haus {

    //Eigenschaften/Attribute
    private String farbe = "";
    private int flaecheHaus = 0;
    private int laengeHaus = 0;
    private int breiteHaus = 0;
    private int hoeheHaus = 0;
    private int geschosse = 0;
    private int zimmer = 0;

    //Konstruktor

    /**
     *
     * @param farbe - die Farbe des Hauses
     * @param flaecheHaus - die Fläche des Hauses
     * @param laengeHaus - die Länge des Hauses
     * @param breiteHaus - die Breite des Hauses
     * @param hoeheHaus - die Höhe des Hauses
     * @param geschosse - die Geschosse des Hauses
     * @param zimmer - die Zimmer des Hauses
     */
    public Haus(String farbe, int flaecheHaus, int laengeHaus, int breiteHaus, int hoeheHaus, int geschosse, int zimmer) {
        this.farbe = farbe;
        this.flaecheHaus = flaecheHaus;
        this.laengeHaus = laengeHaus;
        this.breiteHaus = breiteHaus;
        this.hoeheHaus = hoeheHaus;
        this.geschosse = geschosse;
        this.zimmer = zimmer;
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
     * @return - Gibt die Fläche zurück
     */
    public int getFlaecheHaus() {
        return flaecheHaus;
    }

    /**
     *
     * @param flaecheHaus - Setzt die Fläche
     */
    public void setFlaecheHaus(int flaecheHaus) {
        this.flaecheHaus = flaecheHaus;
    }

    /**
     *
     * @return - Gibt die Länge des Hauses zurück
     */
    public int getLaengeHaus() {
        return laengeHaus;
    }

    /**
     *
     * @param laengeHaus - Setzt die Länge des Hauses
     */
    public void setLaengeHaus(int laengeHaus) {
        this.laengeHaus = laengeHaus;
    }

    /**
     *
     * @return - Gibt die Breite zurück
     */
    public int getBreiteHaus() {
        return breiteHaus;
    }

    /**
     *
     * @param breiteHaus - Setzt die Breite
     */
    public void setBreiteHaus(int breiteHaus) {
        this.breiteHaus = breiteHaus;
    }

    /**
     *
     * @return - Gibt die Höhe zurück
     */
    public int getHoeheHaus() {
        return hoeheHaus;
    }

    /**
     *
     * @param hoeheHaus - Setzt die Höhe
     */
    public void setHoeheHaus(int hoeheHaus) {
        this.hoeheHaus = hoeheHaus;
    }

    /**
     *
     * @return - Gibt die Geschosse zurück
     */
    public int getGeschosse() {
        return geschosse;
    }

    /**
     *
     * @param geschosse - Setzt die Geschosse
     */
    public void setGeschosse(int geschosse) {
        this.geschosse = geschosse;
    }

    /**
     *
     * @return - Gibt die Zimmer zurück
     */
    public int getZimmer() {
        return zimmer;
    }

    /**
     *
     * @param zimmer - Setzt die Zimmer
     */
    public void setZimmer(int zimmer) {
        this.zimmer = zimmer;
    }

    /**
     *
     * @return - Gibt die Angaben vom Haus zurück
     */
    @Override
    public String toString() {
        return  "farbe='" + farbe + '\'' +
                ", flaecheHaus=" + flaecheHaus +
                ", laengeHaus=" + laengeHaus +
                ", breiteHaus=" + breiteHaus +
                ", hoeheHaus=" + hoeheHaus +
                ", geschosse=" + geschosse +
                ", zimmer=" + zimmer;
    }
}
