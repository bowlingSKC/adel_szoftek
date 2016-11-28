package main.modell.aktor;

public class Felhasznalo {
    
    protected String szemszam;
    protected String nev;
    protected String jelszo;
    protected String email;

    public Felhasznalo() {

    }

    public Felhasznalo(String szemszam, String nev, String jelszo, String email) {
        this.szemszam = szemszam;
        this.nev = nev;
        this.jelszo = jelszo;
        this.email = email;
    }

    public String getSzemszam() {
        return szemszam;
    }

    public void setSzemszam(String szemszam) {
        this.szemszam = szemszam;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getJelszo() {
        return jelszo;
    }

    public void setJelszo(String jelszo) {
        this.jelszo = jelszo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
