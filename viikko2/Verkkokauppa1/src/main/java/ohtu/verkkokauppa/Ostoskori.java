package ohtu.verkkokauppa;

import java.util.ArrayList;

public class Ostoskori implements OstoskoriRP {

    ArrayList<TuoteRP> tuotteet;

    public Ostoskori() {
        tuotteet = new ArrayList<TuoteRP>();
    }

    public void lisaa(TuoteRP t) {
        tuotteet.add(t);
    }


    public void poista(TuoteRP t) {
        tuotteet.remove(t);
    }

    public int hinta() {
        int hinta = 0;

        for (TuoteRP tuote : tuotteet) {
            hinta += tuote.getHinta();
        }

        return hinta;
    }
}
