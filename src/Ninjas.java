public class Ninjas {
    int id;
    String charaktername;
    String stufe;
    String beschreibung;
    String datum;
    double kraftpunkte;

    public Ninjas(int id, String charaktername, String stufe, String beschreibung, String datum, double kraftpunkte) {
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

    public int compareTo(Ninjas o) {
        return o.datum.compareTo(this.datum);
    }
}
