public class PersonBil extends Bil {
    int antallPassasjerer;


    public PersonBil(String bilNummer, int pris, int antallPassasjerer) {
        super(bilNummer, pris);
        this.antallPassasjerer = antallPassasjerer;
    }

    @Override
    public String toString() {
        return super.toString() + "antallPassasjerer: " + antallPassasjerer;
    }
}
