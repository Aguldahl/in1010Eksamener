public class ElektriskPersonBil extends Bil implements Elektrisk {
    int batteriKapasitet;

    public ElektriskPersonBil(String bilNummer, int pris, int batterKapasitet) {
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

    @Override
    Bil finnBilR(Dialog dialog, boolean kunElektrisk) {
        if (dialog.svarJaEllerNei("Vil du ha denne: " + this + "?")) {
            return this;
        }
        if (neste != null) {
            return neste.finnBilR(dialog, kunElektrisk);
        }
        return null;
    }
}
