package J30_1v2;

public class Motocykl extends PojazdKolowy{
    public String bagaznikNaKask;

    public Motocykl(int waga, int mocSilnika, int liczbaPasazerow, String kolor, double cena, int liczbaKol, String bagaznikNaKask) {
        super(waga, mocSilnika, liczbaPasazerow, kolor, cena, liczbaKol);
        this.bagaznikNaKask = bagaznikNaKask;
    }

    @Override
    public String toString() {
        return "Motocykl{" +
                "bagaznikNaKask='" + bagaznikNaKask + '\'' +
                ", liczbaKol=" + liczbaKol +
                ", waga=" + waga +
                ", mocSilnika=" + mocSilnika +
                ", liczbaPasazerow=" + liczbaPasazerow +
                ", kolor='" + kolor + '\'' +
                ", cena=" + cena +
                '}';
    }
}
