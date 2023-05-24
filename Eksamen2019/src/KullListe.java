import java.util.Iterator;

public class KullListe extends Kull {

    Hund første = null;
    Hund siste = null;

    public KullListe(Hund mor, Hund far) {
        super(mor, far);
    }

    @Override
    public void settInn(Hund h) {
        if (første == null) {
            første = h;
            return;
        }
        if (h.compareTo(første) > 0) {
            h.neste = første;
            første = h;
            return;
        }
        Hund denne = første;
        while (true) {
            if (denne.neste == null) {
                denne.neste = h;
            } else if (h.compareTo(denne.neste) > 0) {
                h.neste = denne.neste.neste;
                denne.neste = h;
                return;
            }
        }
    }

    @Override
    public Iterator<Hund> iterator() {
        return new HundeIterator();
    }

    class HundeIterator implements Iterator<Hund> {
        private Hund denne;

        @Override
        public boolean hasNext() {
            return denne != null;
        }

        @Override
        public Hund next() {
            Hund svar = denne;
            denne = denne.neste;
            return svar;
        }
    }


}
