import java.util.Iterator;

class Hund implements Comparable<Hund> {
    String navn;
    Kull mittKull;
    Tidspunkt minFodselstid;
    Hund neste = null;

    Hund(Kull k, String navn, Tidspunkt fodt) {
        this.navn = navn;
        mittKull = k;
        minFodselstid = fodt;
    }

    @Override
    public int compareTo(Hund h) {
        if (this.minFodselstid.compareTo(h.minFodselstid) > 0) {
            return 1;
        } else if (this.minFodselstid.compareTo(h.minFodselstid) < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public Hund mor() {
        if (mittKull.mor != null) {
            return mittKull.mor;
        } else {
            return null;
        }
    }

    public Hund far() {
        if (mittKull.far != null){
            return mittKull.far;
        } else {
            return null;
        }
    }

    public boolean erHelsosken(Hund h) {
        if (this.far() == h.far() && this.mor() == h.mor()) {
            return true;
        } else return false;
    }

    public boolean erHalvsosken(Hund h) {
        if (erHelsosken(h)) {
            return false;
        } else if (this.far() == h.far() || this.mor() == h.mor()) {
            return true;
        } else return false;
    }

    public Hund finnEldsteKjenteOpphav() {
        if (mor() == null) {
            return far()==null ? this : far().finnEldsteKjenteOpphav();
        }
        if (far() == null) {
            mor().finnEldsteKjenteOpphav();
        }
        Hund morsEldsteOpphav = mor().finnEldsteKjenteOpphav();
        Hund farsEldsteOpphav = far().finnEldsteKjenteOpphav();
        if (morsEldsteOpphav.compareTo(farsEldsteOpphav) < 0) {
            return morsEldsteOpphav;
        } else return farsEldsteOpphav;
    }
}

abstract class Kull implements Iterable<Hund> {
    Hund mor, far;

    Kull(Hund mor, Hund far) {
        this.mor = mor;
        this.far = far;
    }

    public abstract void settInn(Hund h);

    public abstract Iterator<Hund> iterator();

}