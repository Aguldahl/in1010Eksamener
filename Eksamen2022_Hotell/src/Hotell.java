public class Hotell {

    final int MAX_ANT_SENGEPLASSER = 8;
    Rom forsteRom = null;
    Reservasjon forsteR = null;
    Reservasjon sisteR = null;

    void tildelRom(String navn) {
    }

    Rom finnRom(int antSeng, boolean kjøkken) {
        Rom pointer = forsteRom;
        while (true) {
            if (pointer.ledig && antSeng <= pointer.SENGE_PLASSER && (pointer instanceof Kjøkken || !kjøkken)) {
                return pointer;
            } else if (pointer.neste != null) {
                pointer = pointer.neste;
            } else return null;
        }
    }

    void taUtRes(Reservasjon reservasjon) {
        if (reservasjon == forsteR && reservasjon == sisteR) {
            forsteR = sisteR = null;
        } else if (reservasjon == forsteR) {
            forsteR = reservasjon.nesteR;
            forsteR.forrigeR = null;
        } else if (reservasjon == sisteR) {
            sisteR = reservasjon.forrigeR;
            sisteR.nesteR = null;
        } else {
            reservasjon.forrigeR.nesteR = reservasjon.nesteR;
            reservasjon.nesteR.forrigeR = reservasjon.forrigeR;
        }
        reservasjon.nesteR = reservasjon.forrigeR = null;
    }

    void tilDelRom(String navn) {
        Reservasjon pointer = forsteR;
        Gjest reserverendeGjest;
        while (true) {
            if (pointer == null) {
                throw new IngenReservasjon("Du har ingen reservasjon her.");
            }

            if (pointer.reserverendeGjest.navn.equals(navn)) {
                reserverendeGjest = pointer.reserverendeGjest;
                taUtRes(pointer);
                break;
            }
        }
        boolean funnetRom = false;
        Rom riktigRom;
        int sengeplasser = pointer.ønsketSengePlass;
        while (!(funnetRom)) {
            if (finnRom(sengeplasser, pointer.ønskerKjøkken) != null) {
                funnetRom = true;
                riktigRom = finnRom(pointer.ønsketSengePlass, pointer.ønskerKjøkken);
                reserverendeGjest.rom = riktigRom;
            } else if (sengeplasser < MAX_ANT_SENGEPLASSER){
                sengeplasser++;
            } else {
                throw new IngenLedigeRom("Det er ingen ledige rom for deg");
            }
        }
    }
}
