public class BilKollektiv {
    Bil[] alleBilene;
    Bil start = null;
    Bil slutt = null;

    public BilKollektiv(int AB) {
        alleBilene = new Bil[AB];
    }

    void lagBilPris() {
        for (Bil bil : alleBilene) {
            leggTil(bil);
        }


    }

    void leggTil(Bil nyBil) {
        if (start == null) {
            start = nyBil;
            return;
        }
        Bil denne = start;
        while (true) {
            if (denne.neste == null) {
                denne.neste = nyBil;
                slutt = nyBil;
                return;
            }
            if (denne.neste.pris > nyBil.pris) {
                denne.neste.forrige = nyBil;
                nyBil.neste = denne.neste;
                nyBil.forrige = denne;
                denne.neste = nyBil;
                return;
            }
            denne = denne.neste;
        }
    }
}
