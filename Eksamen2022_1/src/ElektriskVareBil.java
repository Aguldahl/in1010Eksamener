public class ElektriskVareBil extends Bil implements Elektrisk {
    int batteriKapasitet;

    public ElektriskVareBil(String bilNummer, int pris, int batterKapasitet) {
        super(bilNummer, pris);
        this.batteriKapasitet = batterKapasitet;
    }

    @Override
    public int hentKapasitet() {
        return batteriKapasitet;
    }

    @Override
    public String toString() {
        return super.toString() + "Batterikapasitet: " + batteriKapasitet;
    }
}
