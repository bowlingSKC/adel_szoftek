package main.kezelo;

import main.SzervizMain;
import main.modell.aktor.*;

import java.util.List;
import java.util.Optional;

public class FelhasznaloKezelo extends Kezelo<Felhasznalo> {

    @Override
    public void hozzaad() {
        try {
            System.out.println("Tipus: [1] Ugyfel, [2] Tulajdonos, [3] Raktaros, [4] Szerelo, [5] Recepcios");
            String tipus = SzervizMain.bekerSzoveg();
            if( "1".equals(tipus) ) {
                ugyfelHozzaad();
            } else {
                if( "2".equals(tipus) || "3".equals(tipus) || "4".equals(tipus) || "5".equals(tipus) ) {
                    System.out.print("Nev: ");
                    String nev = SzervizMain.bekerSzoveg();
                    System.out.print("Szemelyi igazolvany szama: ");
                    String szemszam = SzervizMain.bekerSzoveg();
                    System.out.print("E-mail: ");
                    String email = SzervizMain.bekerSzoveg();
                    System.out.print("Jelszo: ");
                    String jelszo = SzervizMain.bekerSzoveg();
                    System.out.println("Oraber: ");
                    int oraber = SzervizMain.bekerSzam();

                    if( "2".equals(tipus) ) {
                        egyedek.add(new Tulajdonos(szemszam, nev, jelszo, email, oraber));
                    } else if("3".equals(tipus)) {
                        egyedek.add(new Raktaros(szemszam, nev, jelszo, email, oraber));
                    } else if("4".equals(tipus)) {
                        egyedek.add(new Szerelo(szemszam, nev, jelszo, email, oraber));
                    } else if("5".equals(tipus)) {
                        egyedek.add(new Recepcios(szemszam, nev, jelszo, email, oraber));
                    }

                    System.out.println("Sikeresen hozzaadva!");
                } else {
                    System.out.println("Ismeretlen tipus!");
                }
            }
        } catch (Exception ex) {
            System.out.println( SzervizMain.HIBAUZENET );
        }
    }

    public void ugyfelHozzaad() {
        try {
            System.out.print("Nev: ");
            String nev = SzervizMain.bekerSzoveg();
            System.out.print("Szemelyi igazolvanyszama: ");
            String szemszam = SzervizMain.bekerSzoveg();
            System.out.print("E-mail cim: ");
            String email = SzervizMain.bekerSzoveg();
            System.out.print("Jelszo: ");
            String jelszo = SzervizMain.bekerSzoveg();
            egyedek.add(new Ugyfel(szemszam, nev, jelszo, email, 10000));

            System.out.println("Sikeres regisztracio!");
        } catch (Exception ex) {
            System.out.println( SzervizMain.HIBAUZENET );
        }
    }

    public Felhasznalo bejelentkezes() {
        try {
            System.out.print("Email cim: ");
            final String email = SzervizMain.bekerSzoveg();
            System.out.print("Jelszo: ");
            final String jelszo = SzervizMain.bekerSzoveg();

            Optional<Felhasznalo> keresett = egyedek
                    .stream()
                    .filter(felhasznalo -> felhasznalo.getEmail().equals(email) && felhasznalo.getJelszo().equals(jelszo))
                    .findFirst();

            return keresett.isPresent() ? keresett.get() : null;
        } catch (Exception ex) {
            System.out.println( SzervizMain.HIBAUZENET );
        }

        return null;
    }

    @Override
    public void torol() {
        try {
            listaz();
            int sorszam = SzervizMain.bekerSzam();

            egyedek.remove(sorszam);
            System.out.println("Felhasználó sikeresen torolve!");
        } catch (Exception ex) {
            System.out.println( SzervizMain.HIBAUZENET );
        }
    }

    @Override
    public void listaz() {
        for (int i = 0;  i < egyedek.size(); i++) {
            System.out.println((i+1) + ". " + egyedek.get(i));
        }
    }

    @Override
    public List<Felhasznalo> kereses() {
        return null;
    }

}
