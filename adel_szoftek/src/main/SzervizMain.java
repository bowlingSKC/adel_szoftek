package main;

import main.kezelo.MunkalapKezelo;
import main.modell.aktor.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SzervizMain {

    private Felhasznalo bejelentkezett;     // bejelentkezett felhasználó vagy null

    // kezelők
    private final MunkalapKezelo munkalapKezelo;

    public SzervizMain() {
        this.munkalapKezelo = new MunkalapKezelo();
    }

    private void start() {
        udvozletKiir();



        elkoszonKiir();
    }

    private void udvozletKiir() {
        System.out.println("================== Udvozoljuk a szerviz szolgaltatasunkban ==================");
    }

    private void elkoszonKiir() {
        System.out.println("================== Viszont latasra! ==================");
    }

    private void menuKiir() {
        if( bejelentkezett == null ) {      // senki sincs bejelentkezve
            MenuKiiro.vendegMenuKiir();
        } else if( bejelentkezett instanceof Ugyfel) {     // ügyfél van bejelentkezve

        } else if( bejelentkezett instanceof Tulajdonos ) { // tulajdonos van bejelentkezve

        } else if( bejelentkezett instanceof Recepcios ) {  // recepcios van bejelentkezve

        } else if( bejelentkezett instanceof Raktaros ) {   // raktaros van bejelentkezve

        } else if( bejelentkezett instanceof Szerelo ) {    // szerelo van bejelentkezve

        } else {                                            // ennek sose szabadna lefutnia, ha igen akkor kivetel lesz
            throw new IllegalArgumentException("Valami hiba van a bejelentkezett felhasznalot illetoen!");
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
