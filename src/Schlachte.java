public class Schlachte {
    int id;
    String charaktername;
    String stufe;
    String beschreibung;
    String datum;
    double kraftpunkte;

    /**
     * Konstruktor für die Initialisierung einer Ninja.
     *
     * @param id            Eindeutige Eveniment-ID
     * @param charaktername Vollständiger Name des beteiligten Ninjas
     * @param stufe          Ninja-Rang zum Zeitpunkt des Ereignisses
     * @param beschreibung   Kurze Beschreibung des Ereignisses
     * @param datum         Datum des Ereignis
     * @param kraftpunkte   Bewertetes Kraftniveau des Ereignisses
     */
    public Schlachte(int id, String charaktername, String stufe, String beschreibung, String datum, double kraftpunkte) {
        this.id = id;
        this.charaktername = charaktername;
        this.stufe = stufe;
        this.beschreibung = beschreibung;
        this.datum = datum;
        this.kraftpunkte = kraftpunkte;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + charaktername + ", stufe: " + stufe + ", beschreibung: " + beschreibung + ", Datum: " + datum + ", kraftpunkte: " + kraftpunkte;
    }

    public int compareTo(Schlachte o) {
        return o.datum.compareTo(this.datum);
    }
}
