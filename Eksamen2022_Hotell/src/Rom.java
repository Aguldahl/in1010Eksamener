abstract public class Rom {
    final int ROM_NUMMER, KVM, SENGE_PLASSER, ETASJE;
    boolean ledig;
    Rom neste;


    public Rom(int romNummer, int antallKvadratmeter, int antallSengePlasser, int etasje, boolean ledig) {
        this.ROM_NUMMER = romNummer;
        KVM = antallKvadratmeter;
        SENGE_PLASSER = antallSengePlasser;
        ETASJE = etasje;
        this.ledig = ledig;
    }

    @Override
    public String toString() {
        return "RomNummer: " + ROM_NUMMER +
                "\nAntall Kvadratmeter: " + KVM +
                "\nAntall sengeplasser: " + SENGE_PLASSER +
                "\nEtasje: " + ETASJE +
                "\nledig" + ledig;
    }
}
