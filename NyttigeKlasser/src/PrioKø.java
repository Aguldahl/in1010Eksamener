public class PrioKø {

    Node start;
    Node slutt;

    public void addNodeVar1(Node nyNode) {  // Den jeg liker best
        if (start == null) {
            start = nyNode;
            return;
        }
        Node pointer = start;
        while (true) {
            if (pointer.neste == null) {
                pointer.neste = nyNode;
                slutt = nyNode;
                return;
            }
            if (pointer.neste.data >= nyNode.data) {
                nyNode.neste = pointer.neste;
                pointer.neste = nyNode;
            }
        }
    }

    public void addNodeVar2(Node nyNode) {
        if (start == null) {    // Kan også bruke size() eller lignende for å finne ut om listen er tom.
            start = nyNode;
            return;
        }
        Node pointer = start;
        while (pointer.neste != null && pointer.neste.data < 0) {
            pointer = pointer.neste;
        }
        if (pointer.neste == null) {
            nyNode.neste = pointer.neste;
            pointer.neste = nyNode;
            slutt = nyNode;
        }
        nyNode.neste = pointer.neste;
        pointer.neste = nyNode;
    }
}
