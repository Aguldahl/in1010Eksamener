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
}
