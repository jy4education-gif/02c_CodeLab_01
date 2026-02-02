
package com.cc.java;

public class Konto {

    private final int initialerKontostand;
    private int aktuellerKontostand;    // Instanzvariable 'aktuellerKontostand' verhindert Zugriff von draußen

    public Konto(int startwert) {  // Konstruktor: wird aufgerufen wenn 'new Konto(...)' aufgerufen wird.
        this.initialerKontostand = startwert;
        this.aktuellerKontostand = startwert;
    }

    public int getInitialerKontostand() {
        return initialerKontostand;
    }

    public int getAktuellerKontostand() {
        return aktuellerKontostand;
    }

    public void setAktuellerKontostand(int neuerStand){
        this.aktuellerKontostand = neuerStand;
    }
  
}
