package konrad.jezierski;

public class PrzykladDwa {
    private double prawdziwy;
    private double wyimaginowany;

    public PrzykladDwa(){
        this(0, 0);
    }

    public PrzykladDwa(double prawdziwy) {
        this(prawdziwy, 0);
    }

    public PrzykladDwa(double prawdziwy, double wyimaginowany) {
        this.prawdziwy = prawdziwy;
        this.wyimaginowany = wyimaginowany;
    }

    public void wypisz() {
        System.out.printf("%.1f +i %.1f\n", this.prawdziwy, this.wyimaginowany);
    }
}
