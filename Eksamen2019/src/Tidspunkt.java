import java.util.Arrays;

class Tidspunkt implements Comparable<Tidspunkt> {
    int aar;
    int mnd;
    int dag;
    int time;
    int min;
    int sek;
    int [] fullTid;


    public Tidspunkt(int aar, int mnd, int dag, int time, int min, int sek) {
        this.sek = sek;
        this.aar = aar;
        this.dag = dag;
        this.time = time;
        this.min = min;
        this.mnd = mnd;
        fullTid = new int[]{aar, mnd, dag, time, min, sek};
    }

    @Override
    public int compareTo(Tidspunkt tidspunkt) {
        for (int i = 0; i < fullTid.length; i++) {
            if (fullTid[i] < tidspunkt.fullTid[i]) {
                return 1;
            }
        }
        return -1;
    }


    @Override
    public String toString() {
        return "Tidspunkt{" +
                "aar=" + aar +
                ", mnd=" + mnd +
                ", dag=" + dag +
                ", time=" + time +
                ", min=" + min +
                ", sek=" + sek +
                ", fullTid=" + Arrays.toString(fullTid) +
                '}';
    }
}
