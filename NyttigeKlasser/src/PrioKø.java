public class PrioKø {

    // Dette er enkelt listede prioritetskøer.

    Node start;
    Node slutt;

    public void addNodeVar1(Node nyNode) {  // Den jeg liker best
        if (start == null) {
            start = nyNode;
            return;
        }
        Node pointer = start;
        while (true) {
            // Hvis neste er null, er vi på slutten av listen.
            if (pointer.neste == null) {
                pointer.neste = nyNode;
                slutt = nyNode;
                return;
            }
            // Går gjennom listen til den finner en .neste som er større/mindre og legger til nyNode før den.
            if (pointer.neste.data >= nyNode.data) {
                nyNode.neste = pointer.neste;
                pointer.neste = nyNode;
                return;
            }
            // Iterer gjennom listen.
            pointer = nyNode.neste;
        }
    }

    public void addNodeVar2(Node nyNode) {
        // Kan også bruke size() eller lignende for å finne ut om listen er tom.
        if (start == null) {
            start = nyNode;
            slutt = nyNode;
            return;
        }
        // Iterer gjennom listen helt til den finner pointer.neste som er større enn nynode. Setter inn noden senere.
        Node pointer = start;
        while (pointer.neste != null && pointer.neste.data > nyNode.data) {
            pointer = pointer.neste;
        }
        if (pointer.neste == null) {
            nyNode.neste = pointer.neste;
            pointer.neste = nyNode;
            slutt = nyNode;
        }
        // Setter inn noden.
        nyNode.neste = pointer.neste;
        pointer.neste = nyNode;
    }

    // Fungerer likt som addNodeVar1 men mer kode som gjør at den blir dobbelt lenket.
    public void addNodeDobbel(Node nyNode) {
        if (start == null) {
            start = nyNode;
            slutt = nyNode;
            return;
        }

        Node pointer = start;
        while (true) {
            if (pointer == slutt) {
                pointer.neste = nyNode;
                nyNode.forrige = pointer;
                slutt = nyNode;
                return;
            }
            if (pointer.neste.data > nyNode.data) {
                nyNode.neste = pointer.neste;
                pointer.neste.forrige = nyNode;
                nyNode.forrige = pointer;
                pointer.neste = nyNode;
                return;

            } else {
                pointer = pointer.neste;
            }
        }
    }
}
