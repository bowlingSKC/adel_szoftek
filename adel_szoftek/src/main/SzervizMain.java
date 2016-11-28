package main;

import main.kezelo.FelhasznaloKezelo;
import main.kezelo.MunkalapKezelo;
import main.modell.aktor.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SzervizMain {

    public static final String HIBAUZENET = "Hiba tortent az adatok bekerese kozben! Kerem probalja ujra!";

    private Felhasznalo bejelentkezett;     // bejelentkezett felhasználó vagy null

    // kezelok
    private final MunkalapKezelo munkalapKezelo;
    private final FelhasznaloKezelo felhasznaloKezelo;

    public SzervizMain() {
        this.munkalapKezelo = new MunkalapKezelo();
        this.felhasznaloKezelo = new FelhasznaloKezelo();
    }

    private void start() {
        udvozletKiir();

        while(true) {
            try {
                menuKiir();

                System.out.print("A valasztott menu: ");
                String menu = bekerSzoveg();
                if("X".equals(menu.toUpperCase())) {
                    // TODO fajlba mentes
                    break;
                } else {
                    menuVegrehajt(menu);
                }
            } catch (Exception ex) {
                System.out.println( HIBAUZENET );
            }
        }

        elkoszonKiir();
    }

    private void udvozletKiir() {
        System.out.println("================== Udvozoljuk a szerviz szolgaltatasunkban ==================");
    }

    private void elkoszonKiir() {
        System.out.println("================== Viszontlatasra! ==================");
    }

    private void menuKiir() {
        if( bejelentkezett == null ) {      // senki sincs bejelentkezve
            MenuKiiro.vendegMenuKiir();
        } else if( bejelentkezett instanceof Ugyfel) {     // ügyfél van bejelentkezve
            MenuKiiro.ugyfelMenuKiir();
        } else if( bejelentkezett instanceof Tulajdonos ) { // tulajdonos van bejelentkezve
            MenuKiiro.tulajdonosMenuKiir();
        } else if( bejelentkezett instanceof Recepcios ) {  // recepcios van bejelentkezve
            MenuKiiro.recepciosMenuKiir();
        } else if( bejelentkezett instanceof Raktaros ) {   // raktaros van bejelentkezve
            MenuKiiro.raktarosMenuKiir();
        } else if( bejelentkezett instanceof Szerelo ) {    // szerelo van bejelentkezve
            MenuKiiro.szereloMenuKiir();
        } else {                                            // ennek sose szabadna lefutnia, ha igen akkor kivetel lesz
            throw new IllegalArgumentException("Valami hiba van a bejelentkezett felhasznalot illetoen!");
        }
    }

    private void menuVegrehajt(String menu) {
        if( bejelentkezett == null ) {      // senki sincs bejelentkezve
            vendegMenuVegrehajt(menu);
        } else if( bejelentkezett instanceof Ugyfel) {     // ügyfél van bejelentkezve

        } else if( bejelentkezett instanceof Tulajdonos ) { // tulajdonos van bejelentkezve

        } else if( bejelentkezett instanceof Recepcios ) {  // recepcios van bejelentkezve

        } else if( bejelentkezett instanceof Raktaros ) {   // raktaros van bejelentkezve

        } else if( bejelentkezett instanceof Szerelo ) {    // szerelo van bejelentkezve

        } else {                                            // ennek sose szabadna lefutnia, ha igen akkor kivetel lesz
            throw new IllegalArgumentException("Valami hiba van a bejelentkezett felhasznalot illetoen!");
        }
    }

    private void vendegMenuVegrehajt(String menu) {
        if( "1".equals(menu) ) {
            Felhasznalo bejelentkezett = felhasznaloKezelo.bejelentkezes();
            if( bejelentkezett == null ) {
                System.out.println("Hibas felhasznalonev/jelszo!");
            }
            this.bejelentkezett = bejelentkezett;
        } else if( "2".equals(menu) ) {
            felhasznaloKezelo.ugyfelHozzaad();
        } else {
            System.out.println("Nincs ilyen menupont!");
        }
    }

    public static String bekerSzoveg() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    public static Integer bekerSzam() throws IOException {
        return Integer.valueOf(bekerSzoveg());
    }

    public static void main(String[] args) {
        new SzervizMain().start();
    }
    
}
