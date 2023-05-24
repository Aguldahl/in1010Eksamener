class Tidspunkt implements Comparable<Tidspunkt> {
    int aar;
    int mnd;
    int dag;
    int time;
    int min;
    int sek;
    int[] fullTid = {aar, mnd, dag, time, min, sek};

    public Tidspunkt(int aar, int mnd, int dag, int time, int min, int sek) {
        this.aar = aar;
        this.mnd = mnd;
        this.dag = dag;
        this.time = time;
        this.min = min;
        this.sek = sek;
    }


    @Override
    public int compareTo(Tidspunkt tidspunkt) {
        if (this.toString().equals(tidspunkt.toString())) {
            return 0;
        }
        int i = 0;
        for (int e : fullTid) {
            if (e > tidspunkt.fullTid[i]) {
                return 1;
            }
            i++;
        }
        return -1;
    }



}
