import java.util.Iterator;

public class KullArray extends Kull {

    Hund[] hundeArray = new Hund[60];

    KullArray(Hund mor, Hund far) {
        super(mor, far);
    }

    @Override
    public void settInn(Hund h) {
        h.neste = hundeArray[h.minFodselstid.sek];
        hundeArray[h.minFodselstid.sek] = h;
    }

    @Override
    public Iterator<Hund> iterator() {
        return null;
    }

    public void skrivUtAlle() {
        for (int i = 0; i < 60; i++) {
            Hund h = hundeArray[i];
            while (h != null) {
                System.out.println(h.navn);
                h = h.neste;
            }
        }
    }
}
