package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSPelaajaVsPelaaja extends KPS implements Peli {

    private final Scanner scanner;
    
    protected KPSPelaajaVsPelaaja(Scanner scanner) {
        this.scanner = scanner;
    }
    
    @Override
    protected String toisenPelaajanSiirto(String ekanSiirto) {
        System.out.print("Toisen pelaajan siirto: ");
        return scanner.nextLine();
    }
    
    @Override
    protected String getNextLine() {
        return this.scanner.nextLine();
    }
    
}