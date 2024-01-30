package J30_1v2;

public class Samochod extends PojazdKolowy {
    public String typFelg;

    public Samochod(int waga, int mocSilnika, int liczbaPasazerow, String kolor, double cena, int liczbaKol, String typFelg) {
        super(waga, mocSilnika, liczbaPasazerow, kolor, cena, liczbaKol);
        this.typFelg = typFelg;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "typFelg='" + typFelg + '\'' +
                ", liczbaKol=" + liczbaKol +
                ", waga=" + waga +
                ", mocSilnika=" + mocSilnika +
                ", liczbaPasazerow=" + liczbaPasazerow +
                ", kolor='" + kolor + '\'' +
                ", cena=" + cena +
                '}';
    }
}
