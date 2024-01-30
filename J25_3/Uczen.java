package J25_3;


import java.util.ArrayList;

public class Uczen {

    private String name;
    private String lastName;
    public ArrayList <Double> opinia = new ArrayList<>();

    public Uczen(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Double> getOpinia() {
        return opinia;
    }

    public void setOpinia(ArrayList<Double> opinia) {
        this.opinia = opinia;
    }

    @Override
    public String toString() {
        return "Uczen{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", opinia=" + opinia +
                '}';
    }
}
