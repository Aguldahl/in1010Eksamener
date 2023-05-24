public class BilKollektiv {
    Bil[] alleBilene;
    Bil start = null;
    Bil slutt = null;

    public BilKollektiv(int AB) {
        alleBilene = new Bil[AB];
    }

    void lagBilPris() {
        Bil minsteBil = null;
        for (int i = 0; i < alleBilene.length; i++) {
            for (int j = i + 1; j < alleBilene.length; j++) {
                if (alleBilene[i].pris <)
            }
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
            if ()
        }
    }

}
