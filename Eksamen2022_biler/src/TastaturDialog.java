import java.util.Scanner;

public class TastaturDialog implements Dialog {
    Scanner leser = new Scanner(System.in);

    @Override
    public boolean svarJaEllerNei(String sporsmal) {
        System.out.println(sporsmal);
        System.out.println("Bruk \"j\" for ja, og \"n\" for nei.");
        String brukerInput = leser.nextLine();
        if (brukerInput.equals("j")) {
            return true;
        } else return false;
    }



}
