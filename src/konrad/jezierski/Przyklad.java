package konrad.jezierski;

public class Przyklad {
    private int pole;

    public Przyklad() {
        this(10);
    }

    public Przyklad(int pole) {
        this.pole = pole;
    }

    public void wypisz() {
        System.out.println(this.pole);
    }
}
