package main.modell;

public class Megrendeles {
    
    private int azonosito;
    private int partazon;
    private int darab;
    private int koltseg;

    public Megrendeles(int azonosito, int partazon, int darab, int koltseg) {
        this.azonosito = azonosito;
        this.partazon = partazon;
        this.darab = darab;
        this.koltseg = koltseg;
    }

    
    
    
    public int getAzonosito() {
        return azonosito;
    }

    public int getKoltseg() {
        return koltseg;
    }

    
    
}
