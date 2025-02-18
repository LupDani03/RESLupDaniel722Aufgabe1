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
     * @param stufe         Ninja-Rang zum Zeitpunkt des Ereignisses
     * @param beschreibung  Kurze Beschreibung des Ereignisses
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

    /**
     * Gibt eine String-Darstellung der Schlachtens zurück.
     *
     * @return Formatierte Zeichenkette mit allen Informationen des Schlachtens.
     */
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + charaktername + ", stufe: " + stufe + ", beschreibung: " + beschreibung + ", Datum: " + datum + ", kraftpunkte: " + kraftpunkte;
    }

    /**
     * Vergleicht zwei Ninjanamen basierend auf dem Datum.
     *
     * @param o Die zu vergleichende mitgliedsnamen
     * @return Ein negativer Wert, wenn diese Ereignis neuer ist als die übergebene,
     * ein positiver Wert, wenn sie älter ist, oder 0, wenn beide gleich alt sind.
     */
    public int compareTo(Schlachte o) {
        return o.datum.compareTo(this.datum);
    }
}
