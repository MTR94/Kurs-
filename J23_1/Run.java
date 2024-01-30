package J23_1;

import J23.Pracownik;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        ArrayList<Uczen> listaUczniow = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w systemie zarzadzania uczniami");
        while (true) {

            System.out.println("1-dodaj ucznia, 2-pokaz uczniow, 3-dodaj ocene uczniowu, 4-wyswietl oceny Ucznia, 5-koniec");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                System.out.println("podaj imię");
                String imie = scanner.nextLine();
                System.out.println("podaj nazwisko");
                String nazwisko = scanner.nextLine();
                Uczen uczen = new Uczen(imie, nazwisko);
                listaUczniow.add(uczen);
                System.out.println("uczen dodany pomyślnie");
                //pytania: imie, nazwisko
            } else if (menu == 2) {
                for (Uczen x : listaUczniow) {
                    System.out.println("imie : " + x.imie + " nazwisko : "+ x.nazwisko);
                }
                //wypisanie wszystkich uczniow (pętlą)
            } else if (menu == 3) {
                System.out.println("podaj nazwisko ucznia");
                String nazwisko = scanner.nextLine();
                System.out.println("Dodaj cene");
                int ocena = scanner.nextInt();
                scanner.nextLine();
                for (Uczen x : listaUczniow) {
                    if (x.nazwisko.equals(nazwisko)) {
                        x.oceny.add(ocena);
                        System.out.println("poprawnie dodana ");
                    }
                }
            } else if (menu == 4) {
                System.out.println("podaj nazwisko ucznia");
                String nazwisko = scanner.nextLine();
                for (Uczen x : listaUczniow){
                    if (x.nazwisko.equals(nazwisko)){
                        System.out.println(" oceny ucznie to : " + x.oceny);
                    }
                }
                //pytania:  nazwisko
            } else if (menu == 5) {
                break;
            }
        }
    }
}


