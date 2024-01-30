package J25_3;

import J23.Uczen;

import java.util.ArrayList;
import java.util.Scanner;

public class Dziennik {
    Scanner scanner = new Scanner(System.in);
    public ArrayList<J23.Uczen> listaUczniow = new ArrayList<>();
    public Dziennik() {
        this.menu();
    }
    public void menu() {
        while (true) {
            System.out.println("WItamy w dzienniku ");
            System.out.println("1 - dodaj ucznia 2 - dodaj ocene 3 - wyświetl ucznów  4 - usun ucznia 5- modyfikuj ucznia 6- koniec");
            int choose = scanner.nextInt();
            scanner.nextLine();
            if (choose == 1) {
                System.out.println("Podaj imię ");
                String name = scanner.nextLine();
                System.out.println("podaj nazwisko");
                String lastName = scanner.nextLine();
                this.add(name, lastName);
            } else if (choose == 2) {
                System.out.println(" Podaj nazwisko ");
                String lastName = scanner.nextLine();
                System.out.println(" Podaj ocene ");
                double opinion = scanner.nextDouble();
                scanner.nextLine();
                this.addOpinion(lastName, opinion);
            } else if (choose == 3) {
                this.view();
            } else if (choose == 4) {
                System.out.println("Podaj nazwisko ");
                String lastName = scanner.nextLine();
                this.remove(lastName);
            } else if (choose == 5) {
                System.out.println("Podaj nazwiko ");
                String lastName = scanner.nextLine();
                System.out.println("Podaj nowe imię ");
                String name = scanner.nextLine();
                System.out.println("Podaj nowe nazwisko");
                String lastName2 = scanner.nextLine();
                this.mod(lastName, name, lastName2);

            } else if (choose == 6) {
                System.out.println("koniec ");
                break;

            }
        }
    }

    public void add(String name, String lastName) {//dodawanie ucznia
        J23.Uczen uczen = new J23.Uczen(name, lastName);
        listaUczniow.add(uczen);
        System.out.println("pomyślnie dodano ");
    }

    public void addOpinion(String lastName, double opinion) {// dodawanie opini
        boolean p = false;
        for (J23.Uczen x : listaUczniow) {// czytam liste uczniow
            if (x.getLastName().equals(lastName)) {
                p = true;
                x.opinia.add(opinion);
                System.out.println("Pomyślnie dodano ");// daje komunikat o dodaniu
            }
        }
        if (!p){
            System.out.println("nie ma takiego ucznia ");
        }
    }


    public void view() {
        double srednia ;// zmienna do liczenia sredniej
        for (J23.Uczen x : listaUczniow) {// czyta liste uczniow
            srednia = 0.0;
            for (double y : x.opinia) {//czyta oceny ucznia
                srednia += y / x.opinia.size();// liczy srednia
            }
            System.out.println("imie: " + x.getName() + " " + " Nazwisko: " + x.getLastName() + " Oceny: " + x.opinia + " srednia " + srednia);
        }
    }

    public void remove(String lastName) {// metoda do usuwania
        boolean p = false;
        for (J23.Uczen x : listaUczniow){
            if (x.getLastName().equals(lastName)){
                p = true;
                listaUczniow.remove(x);
                System.out.println("pomyślnie usunięto ");
                break;
            }
        }
        if (!p){
            System.out.println("nie ma takiego ucznia ");
        }
    }

    public void mod(String lastName, String name, String lastName2) {// metoda do modyfikacji ucznia
        boolean p = false;
        for (Uczen x : listaUczniow) {// czyta liste uczniow
            if (x.getLastName().equals(lastName)) {// spr. czy jest na liscie uczen
                p = true;
                x.setName(name);
                x.setLastName(lastName2);
                System.out.println("zmieniono pomyślnie");
            }
        }
        if (!p){
            System.out.println(" nie ma takiego ucznia ");
        }
    }
}