package Bilety;

import java.util.ArrayList;

public class Rezerwacja {
    public String imie;
    public String nazwisko;
    public String wylotZ;
    public String przylotDo;
    public boolean vip;
    public ArrayList<String> posilek = new ArrayList<>();
    public String uwagi;


    public Rezerwacja(String imie, String nazwisko, String wylotZ, String przylotDo, boolean vip, ArrayList<String> posilek, String uwagi) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wylotZ = wylotZ;
        this.przylotDo = przylotDo;
        this.vip = vip;
        this.posilek = posilek;
        this.uwagi = uwagi;
    }
}
