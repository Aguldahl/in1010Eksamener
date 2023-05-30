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
                break;
            }
            if (denne.neste.pris > nyBil.pris) {
                denne.neste.forrige = nyBil;
                nyBil.neste = denne.neste;
                nyBil.forrige = denne;
                denne.neste = nyBil;
                break;
            }
            denne = denne.neste;
        }
    }

    void taUtBil(Bil utBil) {
        if (utBil == start) {
            start = start.neste;
            start.forrige = null;
            return;
        }
        if (utBil == slutt) {
            slutt = slutt.forrige;
            slutt.neste = null;
            return;
        } else {
            utBil.neste.forrige = utBil.forrige;
            utBil.forrige.neste = utBil.neste;
        }
        utBil.neste = null;
        utBil.forrige = null;
    }


    public Bil velgBil(Dialog dialog) {
        boolean elBilFlag = false;
        if (!(dialog.svarJaEllerNei("Vil du låne en bil?"))) {
            System.out.println("Den er grei!");
            return null;
        }
        if (dialog.svarJaEllerNei("Vil du kun ha en elbil?")) {
            elBilFlag = true;
        }
        Bil peker = start;
        while (true) {
            if (peker == null) {
                System.out.println("Det er ikke noen andre biler vi kan leie ut dessverre.");
                return null;
            }
            if (elBilFlag) {
                if (!(peker instanceof Elektrisk)) {
                    peker = peker.neste;
                    continue;
                }
            }
            if (dialog.svarJaEllerNei("Vil du ha denne bilen her: " + peker + "?")) {
                taUtBil(peker);
                return peker;
            }
            peker = peker.neste;
        }
    }

    public Bil velgBilR(Dialog dialog) {
        boolean kunElBil = dialog.svarJaEllerNei("Vil du kun ha elbil?");
        Bil bil = start.finnBilR(dialog, kunElBil);
        if (bil != null) {
            taUtBil(bil);
        }
        return bil;

    }
}
