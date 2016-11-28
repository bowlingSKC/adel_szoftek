package main.kezelo;

import java.util.ArrayList;
import java.util.List;

public abstract class Kezelo<T> {

    protected List<T> egyedek = new ArrayList<T>();

    public abstract void hozzaad();

    public abstract void torol();

    public abstract void listaz();

    public abstract List<T> kereses();

}
