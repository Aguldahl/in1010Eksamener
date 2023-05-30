public class SuiteMedKjøkken extends Suite implements Kjøkken {

    final int KJØKKEN_KVM;

    public SuiteMedKjøkken(int romNummer, int antallKvadratmeter, int antallSengePlasser, int etasje, boolean ledig, int kjøkkenKvadratMeter) {
        super(romNummer, antallKvadratmeter + kjøkkenKvadratMeter, antallSengePlasser, etasje, ledig);
        KJØKKEN_KVM = kjøkkenKvadratMeter;
    }

    @Override
    public int hentKjøkkenKvadrat() {
        return KJØKKEN_KVM;
    }
}
