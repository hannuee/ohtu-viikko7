package ohtu.konepelaajat;

import ohtu.konepelaajat.KonePelaaja;

public class Tekoaly implements KonePelaaja {

    private int siirto;

    public Tekoaly() {
        siirto = 0;
    }
    
    @Override
    public void asetaSiirto(String ekanSiirto) {
        // ei tehdä mitään 
    }

    @Override
    public String annaSiirto() {
        siirto++;
        siirto = siirto % 3;

        if (siirto == 0) {
            return "k";
        } else if (siirto == 1) {
            return "p";
        } else {
            return "s";
        }
    }
}
