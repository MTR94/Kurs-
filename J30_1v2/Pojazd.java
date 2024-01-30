package J30_1v2;

public class Pojazd {
    public int waga , mocSilnika, liczbaPasazerow ;
    public String kolor;
    public double cena;

    public Pojazd(int waga, int mocSilnika, int liczbaPasazerow, String kolor, double cena) {
        this.waga = waga;
        this.mocSilnika = mocSilnika;
        this.liczbaPasazerow = liczbaPasazerow;
        this.kolor = kolor;
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Pojazd{" +
                "waga=" + waga +
                ", mocSilnika=" + mocSilnika +
                ", liczbaPasazerow=" + liczbaPasazerow +
                ", kolor='" + kolor + '\'' +
                ", cena=" + cena +
                '}';
    }
}
