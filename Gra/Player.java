package Gra;

public class Player extends Character{
    public String klasa;
    public int str;
    public int dex;
    public int wit;
    public int know;
    public int power;

    public Player(String name, String rase , int str , int dex) {
        super(name, rase);
        this.str = str;
        this.dex = dex;
        this.wit = 200;
        this.know = 10;
        this.power = 10;
    }

    public String getKlasa() {
        return klasa;
    }

    public void setKlasa(String rase) {
        this.klasa = rase;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getKnow() {
        return know;
    }

    public void setKnow(int know) {
        this.know = know;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int intel) {
        this.power = intel;
    }

    @Override
    public String toString() {
        return "Player{" +
                "Klasa ='" + klasa + '\'' +
                ", Siła =" + str +
                ", Zręczność =" + dex +
                ", Zycie =" + wit +
                ", Wiedza =" + know +
                ", Inteligencja =" + power +
                '}';
    }
}
