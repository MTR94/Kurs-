package J30_1v2;

public class PojazdKolowy extends Pojazd {
    public int liczbaKol;

    public PojazdKolowy(int waga, int mocSilnika, int liczbaPasazerow, String kolor, double cena, int liczbaKol) {
        super(waga, mocSilnika, liczbaPasazerow, kolor, cena);
        this.liczbaKol = liczbaKol;

    }

    @Override
    public String toString() {
        return "PojazdKolowy{" +
                "liczbaKol=" + liczbaKol +
                ", waga=" + waga +
                ", mocSilnika=" + mocSilnika +
                ", liczbaPasazerow=" + liczbaPasazerow +
                ", kolor='" + kolor + '\'' +
                ", cena=" + cena +
                '}';
    }
}