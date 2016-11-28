package main.modell.aktor;

import main.modell.Auto;
import main.modell.Foglalas;

import java.util.ArrayList;
import java.util.List;

public class Ugyfel extends Felhasznalo {

    private int egyenleg;
    private List<Auto> autok = new ArrayList<>();
    private List<Foglalas> foglalasok = new ArrayList<>();

    public Ugyfel() {

    }

    public Ugyfel(String szemszam, String nev, String jelszo, String email, int egyenleg) {
        super(szemszam, nev, jelszo, email);
        this.egyenleg = egyenleg;
    }

    public int getEgyenleg() {
        return egyenleg;
    }

    public void setEgyenleg(int egyenleg) {
        this.egyenleg = egyenleg;
    }

    public List<Auto> getAutok() {
        return autok;
    }

    public void setAutok(List<Auto> autok) {
        this.autok = autok;
    }

    public List<Foglalas> getFoglalasok() {
        return foglalasok;
    }

    public void setFoglalasok(List<Foglalas> foglalasok) {
        this.foglalasok = foglalasok;
    }

    @Override
    public String toString() {
        return nev + " (" + szemszam + "): " + email + " (FELHASZNALO)";
    }
}
