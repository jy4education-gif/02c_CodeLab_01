
package com.cc.java;

public class Konto {

    private int kontostand;    // Instanzvariable 'kontostand' verhindert Zugriff von draußen

    public Konto(int kontostand) {  // Konstruktor: wird aufgerufen wenn 'new Konto(...)' aufgerufen wird.
        this.kontostand = kontostand;
    }

    public int getKontostand() {
        return kontostand;
    }

    public void setKontostand(int kontostand){
        this.kontostand = kontostand;
    }
  
}
