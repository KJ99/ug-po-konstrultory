package konrad.jezierski;

public class Zadanie10 {
    private int a;
    private int b;

    public Zadanie10() {
        this(0, 0);
    }

    public Zadanie10(int a) {
        this(a, 10);
    }

    public Zadanie10(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int wykonajOperacjeMatematycznaDodawanie() {
        return this.a + this.b;
    }

    public int wykonajOperacjeMatematycznaDodawanie(int x) {
        return this.a + x;
    }

    public int wykonajOperacjeMatematycznaMnozenie(int x, int y) {
        return x * y;
    }
}
