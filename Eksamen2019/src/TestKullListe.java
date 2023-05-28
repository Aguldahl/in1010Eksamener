class TestKullListe {

    public static void main(String[] args) {
        Hund mormor = null;
        Hund farfar = null;
        KullListe tilMorOgFar = new KullListe(mormor, farfar);
        Hund mor = new Hund(tilMorOgFar, "hanne", new Tidspunkt(3,1,1,1,1,1));
        Hund mor2 = new Hund(tilMorOgFar, "hanne", new Tidspunkt(1,1,1,1,1,1));
        Hund far = new Hund(tilMorOgFar, "egil", new Tidspunkt(5,2,2,2,2,100));
        KullListe listen = new KullListe(mor, far);
        listen.settInn(new Hund(listen, "4", new Tidspunkt(3, 3, 3, 3, 3, 3)));
        listen.settInn(new Hund(listen, "5", new Tidspunkt(2, 3, 3, 3, 3, 3)));
        listen.settInn(new Hund(listen, "3", new Tidspunkt(4, 4, 4, 4, 4, 4)));
        listen.settInn(new Hund(listen, "1", new Tidspunkt(8, 5, 5, 5, 5, 5)));
        listen.settInn(new Hund(listen, "2", new Tidspunkt(6, 5, 5, 5, 5, 100)));
        listen.settInn(new Hund(listen, "6", new Tidspunkt(1, 1, 5, 5, 5, 2)));
        for (Hund e : listen
        ) {
            System.out.println(e.navn);
        }


    }
}