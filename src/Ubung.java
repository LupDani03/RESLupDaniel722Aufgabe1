import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ubung {
    public static void main(String[] args) {
        String filepath = "ninja_events.tsv";
        List<Ninjas> ninjaList = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(Paths.get(filepath));
            String firstLine = lines.get(0);

            for (String line : lines) {
                if (!line.equals(firstLine)) {
                    String[] daten = line.split("\t");
                    int id = Integer.parseInt(daten[0]);
                    String ninja = daten[1];
                    String symptom = daten[2];
                    String diagnose = daten[3];
                    String datum = daten[4];
                    double kraftpunkte = Double.parseDouble(daten[5]);

                    Ninjas neuesObjekt = new Ninjas(id, ninja, symptom, diagnose, datum, kraftpunkte);
                    ninjaList.add(neuesObjekt);
                }
            }
        } catch (IOException e) {
            System.err.println("Fehler beim Lesen der Datei: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Fehler beim Parsen der Datei: " + e.getMessage());
        }

        //ninjaList.forEach(System.out::println);
        Scanner sc = new Scanner(System.in);
        System.out.println("Wert: ");
        double wert = sc.nextDouble();
        sc.nextLine();
        List<String> noDuplicates = new ArrayList<>();
        for (Ninjas objekt : ninjaList) {
            if (!noDuplicates.contains(objekt.charaktername)) {
                if (objekt.kraftpunkte>wert) {
                    System.out.println(objekt.charaktername);
                    noDuplicates.add(objekt.charaktername);
                }
            }
        }

        List<Ninjas> ninjaDaten = new ArrayList<>();
        for (Ninjas objekt : ninjaList) {
            if (objekt.stufe.equals("Jonin")) {
                ninjaDaten.add(objekt);
            }
        }
        ninjaDaten.sort(Ninjas::compareTo);

        // Ausgabe der gefilterten und sortierten ninja
        System.out.println("\nNinjas mit Jonin gesortet: ");
        for (Ninjas ninja : ninjaDaten) {
            System.out.println(ninja.datum + " : "+ ninja.charaktername +" - "+ ninja.beschreibung);
        }
    }
}
