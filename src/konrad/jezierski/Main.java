package konrad.jezierski;

public class Main {

    public static void main(String[] args) {
        System.out.println("ZADANIE 1 =======================================");
        Przyklad p1 = new Przyklad();
        Przyklad p2 = new Przyklad(19);
        p1.wypisz();
        p2.wypisz();
        System.out.println("ZADANIE 2 =======================================");
        PrzykladDwa pd1 = new PrzykladDwa();
        PrzykladDwa pd2 = new PrzykladDwa(10);
        PrzykladDwa pd3 = new PrzykladDwa(50, 4.5);
        pd1.wypisz();
        pd2.wypisz();
        pd3.wypisz();
        System.out.println("ZADANIE 3 =======================================");
        Zadanie10 z1 = new Zadanie10();
        Zadanie10 z2 = new Zadanie10(10);
        System.out.println(z1.wykonajOperacjeMatematycznaDodawanie(1));
        System.out.println(z1.wykonajOperacjeMatematycznaMnozenie(2, 2));
        System.out.println(z2.wykonajOperacjeMatematycznaDodawanie());
        System.out.println(z2.wykonajOperacjeMatematycznaMnozenie(3, 3));
        System.out.println("ZADANIE 4 =======================================");
        PrzykladPrzeciazanie pp = new PrzykladPrzeciazanie();
        pp.wypisz(10);
        pp.wypisz(19.2);
        pp.wypisz("Argument tekst");
    }
}
