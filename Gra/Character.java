package Gra;

public class Character {
    private String name;
    private String rase;

    public Character(String name, String klasa) {
        this.name = name;
        this.rase = klasa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRase() {
        return rase;
    }

    public void setRase(String klasa) {
        this.rase = klasa;
    }

    @Override
    public String toString() {
        return "Character{" +
                "Nazwa ='" + name + '\'' +
                ",Rasa ='" + rase + '\'' +
                '}';
    }
}
