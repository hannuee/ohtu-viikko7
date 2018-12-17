package ohtu.kivipaperisakset;

import ohtu.konepelaajat.KonePelaaja;
import java.util.Scanner;

public class KPSTekoaly extends KPS implements Peli {

    private final Scanner scanner;
    private KonePelaaja tekoaly;
    
    protected KPSTekoaly(Scanner scanner, KonePelaaja tekoaly) {
        this.scanner = scanner;
        this.tekoaly = tekoaly;
    }
    
    @Override
    protected String toisenPelaajanSiirto(String ekanSiirto) {
        String tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        tekoaly.asetaSiirto(ekanSiirto);
        return tokanSiirto;
    }
    
    @Override
    protected String getNextLine() {
        return this.scanner.nextLine();
    }
}