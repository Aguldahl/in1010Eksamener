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
// Oppgave 2b
    }

    public Hund mor() {
// Oppgave 2a
    }

    public Hund far() {
// Oppgave 2a
    }

    public boolean erHelsosken(Hund h) {
// Oppgave 2c
    }

    public boolean erHalvsosken(Hund h) {
// Oppgave 2c
    }

    public Hund finnEldsteKjenteOpphav() {
// Oppgave 2d
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