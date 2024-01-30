package J23_1;

import java.util.ArrayList;

public class Uczen {
    public String imie;
    public String nazwisko;
    public ArrayList<Integer> oceny = new ArrayList<>();

    public Uczen(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Uczen{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", oceny=" + oceny +
                '}';
    }
}
