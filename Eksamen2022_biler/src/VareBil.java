public class VareBil extends Bil {
    int lasteVolum;

    public VareBil(String bilNummer, int pris, int lasteVolum) {
        super(bilNummer, pris);
        this.lasteVolum = lasteVolum;
    }

    @Override
    public String toString() {
        return super.toString() + "Lastevolum: " + lasteVolum;
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
