package ohtu.kivipaperisakset;

import ohtu.konepelaajat.TekoalyParannettu;
import ohtu.konepelaajat.Tekoaly;
import java.util.Scanner;

public abstract class KPS {
    
    public void pelaa() {
        Tuomari tuomari = new Tuomari();
        
        System.out.print("Ensimmäisen pelaajan siirto: ");
        String ekanSiirto = this.getNextLine();

        String tokanSiirto = this.toisenPelaajanSiirto(ekanSiirto);

        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            System.out.println(tuomari);
            System.out.println();

            System.out.print("Ensimmäisen pelaajan siirto: ");
            ekanSiirto = this.getNextLine();

            tokanSiirto = this.toisenPelaajanSiirto(ekanSiirto);
        }

        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }
    
    protected abstract String toisenPelaajanSiirto(String ekanSiirto);
    
    protected abstract String getNextLine();
    
    private static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
    
    
    public static Peli kaksinpeli(Scanner scanner) {
        return new KPSPelaajaVsPelaaja(scanner);
    }
    
    public static Peli yksinpeli(Scanner scanner) {
        return new KPSTekoaly(scanner, new Tekoaly());
    }
    
    public static Peli pahaYksinpeli(Scanner scanner) {
        return new KPSTekoaly(scanner, new TekoalyParannettu(20));
    }
    
}
