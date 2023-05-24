abstract public class Bil {
    String bilNummer;
    int pris;
    Bil forrige = null;
    Bil neste = null;

    public Bil(String bilNummer, int pris) {
        this.bilNummer = bilNummer;
        this.pris = pris;
    }

    @Override
    public String toString() {
        return "Bil{" +
                "bilNummer='" + bilNummer + '\'' +
                ", pris=" + pris +
                '}';
    }
}
