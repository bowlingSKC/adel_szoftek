package main.modell;

public class Alkatresz {

    private int cikkszam;
    private String nev;
    private String marka;
    private String tipus;
    private int eladasiAr;
    private int beszerzesiar;

    public int getCikkszam() {
        return cikkszam;
    }

    public void setCikkszam(int cikkszam) {
        this.cikkszam = cikkszam;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public int getEladasiAr() {
        return eladasiAr;
    }

    public void setEladasiAr(int eladasiAr) {
        this.eladasiAr = eladasiAr;
    }

    public int getBeszerzesiar() {
        return beszerzesiar;
    }

    public void setBeszerzesiar(int beszerzesiar) {
        this.beszerzesiar = beszerzesiar;
    }
}
