package J23;

import java.util.ArrayList;
import java.util.Scanner;

public class Run2 {
    public static void main(String[] args) {
        ArrayList<Pracownik> listaPracownikow = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w systemie zarzadzania pracownika");
        while(true){

            System.out.println("1-dodaj pracownika, 2-wysiwtel pracownikow, 3-usun pracownika, 4-zmien pracownika, 5-koniec");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                System.out.println("podaj imie:");
                String imie = scanner.nextLine();
                System.out.println("podaj nazwisko:");
                String nazwisko = scanner.nextLine();
                System.out.println("podaj telefon:");
                int telefon = scanner.nextInt();
                scanner.nextLine();
                System.out.println("podaj email:");
                String email = scanner.nextLine();

                Pracownik pracownik = new Pracownik(imie , nazwisko , telefon , email);
//                pracownik.imie = imie;
//                pracownik.nazwisko = nazwisko;
//                pracownik.telefon = telefon;
//                pracownik.email = email;
                listaPracownikow.add(pracownik);
                System.out.println("pracownik został dodany pomyslnie");
            }
            else if (menu == 2) {
                for (Pracownik x : listaPracownikow){
                    System.out.println(x);
                }
            }
            else if (menu == 3) {
                System.out.println("podaj nazwisko pracownika do usunięcia albo wpisz 0 ");
                String nazwisko1 = scanner.nextLine();
                for (Pracownik x : listaPracownikow){
                    if (x.nazwisko.equals(nazwisko1)){
                        listaPracownikow.remove(x);
                        System.out.println("usuwanie pomyslne");
                    }else if (nazwisko1.equals("0")){
                        break;
                    }
                }

            }
            else if (menu == 4) {
                System.out.println("podaj nazwisko prracownika do zmiany albo wpisz 0  ");
                String nazwisko1 = scanner.nextLine();
                for (Pracownik x : listaPracownikow){
                    if (x.nazwisko.equals(nazwisko1)){
                        System.out.println("podaj nowe imię ");
                        x.imie = scanner.nextLine();
                        System.out.println("podaj nowe nazwisko");
                        x.nazwisko = scanner.nextLine();
                        System.out.println("zmiana pomyślna");
                    } else if (nazwisko1.equals("0")) {
                        break;
                    }
                }

            }
            else if (menu == 5) {
                break;
            }

        }

    }
}
