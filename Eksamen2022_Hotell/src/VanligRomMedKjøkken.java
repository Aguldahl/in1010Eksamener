public class VanligRomMedKjøkken extends VanligRom implements Kjøkken{


    int KJØKKEN_KVM;

    public VanligRomMedKjøkken(int romNummer, int antallKvadratmeter, int antallSengePlasser, int etasje, boolean ledig, int kjøkkenKvadratMeter) {
        super(romNummer, antallKvadratmeter + kjøkkenKvadratMeter, antallSengePlasser, etasje, ledig);
        this.KJØKKEN_KVM = kjøkkenKvadratMeter;
    }

    @Override
    public int hentKjøkkenKvadrat() {
        return KJØKKEN_KVM;
    }
}
