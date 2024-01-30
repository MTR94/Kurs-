package J30_1v2;

public class lodz extends Pojazd {
    public int zanurzenie ;

    public lodz(int waga, int mocSilnika, int liczbaPasazerow, String kolor, double cena, int zanurzenie) {
        super(waga, mocSilnika, liczbaPasazerow, kolor, cena);
        this.zanurzenie = zanurzenie;
    }

    @Override
    public String toString() {
        return "lodz{" +
                "zanurzenie=" + zanurzenie +
                ", waga=" + waga +
                ", mocSilnika=" + mocSilnika +
                ", liczbaPasazerow=" + liczbaPasazerow +
                ", kolor='" + kolor + '\'' +
                ", cena=" + cena +
                '}';
    }
}
