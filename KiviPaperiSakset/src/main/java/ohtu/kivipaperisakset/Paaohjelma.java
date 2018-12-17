package ohtu.kivipaperisakset;

import java.util.Scanner;

/**
 * Kivi-Paperi-Sakset, jossa voidaan valita pelataanko toista pelaajaa 
 * vastaan, "tekoälyä" vastaan vai kehittyneempää "tekoälyä" vastaan.
 */
public class Paaohjelma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            tulostaOhje();
            if (!aloitaPeli(scanner.nextLine(), scanner)) break;
        }
    }
    
    private static void tulostaOhje() {
        System.out.println("\nValitse pelataanko" 
                + "\n (a) ihmistä vastaan "
                + "\n (b) tekoälyä vastaan"
                + "\n (c) parannettua tekoälyä vastaan"
                + "\nmuilla valinnoilla lopetataan");
    }
    
    /**
     * @return Palauttaa false jos peli haluttiin lopettaa 
     */
    private static boolean aloitaPeli(String vastaus, Scanner scanner) {
        if (vastaus.endsWith("a")) {
            System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
            Peli kaksinpeli = KPS.kaksinpeli(scanner);
            kaksinpeli.pelaa();
        } else if (vastaus.endsWith("b")) {
            System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
            Peli yksinpeli = KPS.yksinpeli(scanner);
            yksinpeli.pelaa();
        } else if (vastaus.endsWith("c")) {
            System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
            Peli pahaYksinpeli = KPS.pahaYksinpeli(scanner);
            pahaYksinpeli.pelaa();
        } else {
            return false;
        }
        return true;
    }
    
}
