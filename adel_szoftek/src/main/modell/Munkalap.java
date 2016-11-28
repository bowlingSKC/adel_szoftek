package main.modell;

import java.util.ArrayList;
import java.util.List;

public class Munkalap {

    public static enum MunkalapAllapot {
        UJ("Új"), FOLYAMATBAN("Folyamatban"), KESZ("Kesz");

        private String name;

        MunkalapAllapot(final String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    private int azonosito;
    private String hibaleiras;
    private MunkalapAllapot allapot = MunkalapAllapot.UJ;
    private int ido;                    // megkezdett órák száma
    private List<Tetel> tetelek = new ArrayList<>();
    private Auto auto;

    public int getAzonosito() {
        return azonosito;
    }

    public void setAzonosito(int azonosito) {
        this.azonosito = azonosito;
    }

    public String getHibaleiras() {
        return hibaleiras;
    }

    public void setHibaleiras(String hibaleiras) {
        this.hibaleiras = hibaleiras;
    }

    public MunkalapAllapot getAllapot() {
        return allapot;
    }

    public void setAllapot(MunkalapAllapot allapot) {
        this.allapot = allapot;
    }

    public int getIdo() {
        return ido;
    }

    public void setIdo(int ido) {
        this.ido = ido;
    }

    public List<Tetel> getTetelek() {
        return tetelek;
    }

    public void setTetelek(List<Tetel> tetelek) {
        this.tetelek = tetelek;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }
}
