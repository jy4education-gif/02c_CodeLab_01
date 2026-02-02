package com.cc.java;

public class App {
    
    public static void main(String[] args) {
    
        Konto konto1 = new Konto(1000000);  // Instanziierung
        Konto konto2 = new Konto(1000000);
        Konto konto3 = new Konto(1000000);


        output("Guten Tag, meine Bank sei die Berenberg Bank..\nIhr initialer Kontostand: ");
        output("Konto1: " + konto1.getInitialerKontostand());
        output("Konto2: " + konto2.getInitialerKontostand());
        output("Konto3: " + konto3.getInitialerKontostand());  
        
        output("-----------------------------");

        konto1.setAktuellerKontostand(konto1.getInitialerKontostand()*2);
        konto2.setAktuellerKontostand(konto2.getInitialerKontostand()*3);
        konto3.setAktuellerKontostand(konto3.getInitialerKontostand()*4);

        output("Ihr aktueller Kontostand: ");    
        output("Konto1: " + konto1.getAktuellerKontostand());
        output("Konto2: " + konto2.getAktuellerKontostand());
        output("Konto3: " + konto3.getAktuellerKontostand());  
    }


    public static void output(String outputStr) {
        System.out.println(outputStr);
    } 


}
