package J30_1v2;

public class Samolot extends Pojazd {
    public int pulap;

    public Samolot(int waga, int mocSilnika, int liczbaPasazerow, String kolor, double cena, int pulap) {
        super(waga, mocSilnika, liczbaPasazerow, kolor, cena);
        this.pulap = pulap;
    }

    @Override
    public String toString() {
        return "Samolot{" +
                "pulap=" + pulap +
                ", waga=" + waga +
                ", mocSilnika=" + mocSilnika +
                ", liczbaPasazerow=" + liczbaPasazerow +
                ", kolor='" + kolor + '\'' +
                ", cena=" + cena +
                '}';
    }
}
