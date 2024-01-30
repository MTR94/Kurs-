package J23;

public class Pracownik {
    public String imie;
    public String nazwisko;
    public int telefon;
    public String email;

    public Pracownik(String imie, String nazwisko, int telefon, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.telefon = telefon;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", telefon=" + telefon +
                ", email='" + email + '\'' +
                '}';
    }
}
