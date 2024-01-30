package C67_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] kina = {"Cinema-City", "Multikino"};
        String[][] filmy = {{"Matrix", "Avatar", "Shrek"}, {"Piraci z Karaibów", "Król Lew", "Władca Pierścieni"}};
        Character[] litery = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};
        double cenaBiletu = 18.00;
        int kinoID = 0, filmyID, liczbaOsob, ile = 0;
        String kino = null, film, imie;
        System.out.println("witamy w kinie ");
        System.out.println("kina : 0 - cinema ,  1- multikino");
        while (true) {
            for (String x : kina) {
                System.out.println(x);

                System.out.println("podaj index kina ");
                try {
                    kinoID = scanner.nextInt();
                    scanner.nextLine();
                    kino = kina[kinoID];
                    break;


                } catch (InputMismatchException e) {
                    System.out.println("podajemy tylko liczby ! ");
                    scanner.nextLine();
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("podano za dużą wartośc");
                    scanner.nextLine();
                }
            }

            while (true) {
                System.out.println("podaj index filmu ");
                for (String x : filmy[kinoID]) {
                    System.out.println(x);
                }
                try {
                    filmyID = scanner.nextInt();
                    film = filmy[kinoID][filmyID];
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("podajemy tylko liczby ! ");
                    scanner.nextLine();
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("podano za dużą wartośc");
                    scanner.nextLine();
                }
            }
            while (true) {
                System.out.println("podaj liczbę osob ");
                try {

                    liczbaOsob = scanner.nextInt();
                    scanner.nextLine();
                    if (liczbaOsob < 1) {
                        System.out.println("liczba musi być wieksza od 1 ");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("podajemy tylko cyfry ! ");
                    scanner.nextLine();
                }
            }
            while (true) {
                System.out.println("podaj imię ");

                imie = scanner.nextLine();
                boolean p = false;

                for (int i = 0; i < imie.length(); i++) {
                    char symbol = imie.charAt(i);
                    for (char x : litery) {
                        if (x == symbol) {
                            ile++;
                        }
                    }
                }
                if (ile == imie.length()) {
                    System.out.println("Poprawnie dodano ");
                    break;
                } else if (ile != imie.length()) {
                    System.out.println("tylko małe literki  ");
                }
            }
            double suma = cenaBiletu * liczbaOsob;
            System.out.println("Rezerwacja potwierdzona cena : " + suma);
            break;
        }
    }
}







//                    for (char x : litery){
//                        if ( ){
//                            p = true;
//                            System.out.println("ten symbol jest błędny : " + symbol);
//                        }




////                for
////
////                }




//                if (filmyID == 0 ){
//                    System.out.println("wybrałeś cimema city film : matrix");
//
//
//                } else if (filmyID == 1 ) {
//                    System.out.println("wybrałeś cimema city film : awatar");
//
//
//                } else if (filmyID == 2) {
//                    System.out.println("wybrałeś cimema city film : schrek");
//
//
//                }
//                scanner.nextLine();
//                System.out.println("podaj ilośc osób");
//                liczbaOsob = scanner.nextInt();
//                scanner.nextLine();
//                System.out.println("podaj swoje imię ");
//                imie = scanner.nextLine();
//            } else if (kinoID == 1 ) {
//                System.out.println("Multikino ");
//                System.out.println(" 0 - piraci z karaibów");
//                System.out.println(" 1  - Król lew ");
//                System.out.println(" 2 - władca piewścieni ");
//                filmyID = scanner.nextInt();
//                if (filmyID == 0 ){
//                    System.out.println("wybrałeś Multikino film : piraci z karaibów");
//
//
//                } else if (filmyID == 1 ) {
//                    System.out.println("wybrałeś Multikino film : król lew");
//
//
//                } else if (filmyID == 2) {
//                    System.out.println("wybrałeś Multikino film : Władca pierścieni");
//
//
//                }
//                scanner.nextLine();
//                System.out.println("podaj ilośc osób");
//                liczbaOsob = scanner.nextInt();
//                scanner.nextLine();
//                System.out.println("podaj swoje imie ");
//                imie = scanner.nextLine();
//
//
//            }





