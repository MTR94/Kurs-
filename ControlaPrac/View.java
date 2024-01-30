package ControlaPrac;

import java.sql.SQLException;
import java.util.Scanner;

public class View {
    public View() throws SQLException {
        this.menu();
    }
    public void menu() throws SQLException {
        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);
        String choose, name , lastName;
        int payment, lp;
        while (true){
            System.out.println("Witaj w rejestrze pracowników ");
            System.out.println("1 - Pokaż pracowników , 2 - dodaj pracownika , 3 - usuń pracownika , 4 - edytuj pracownika , 5 - koniec");
            choose = scanner.nextLine();
            if (choose.equals("1")){
                controller.p();
            }
            else if ((choose.equals("2"))){
                System.out.println("Podaj Imie ");
                name = scanner.nextLine();
                System.out.println("Podaj Nazwisko ");
                lastName = scanner.nextLine();
                System.out.println("Podaj zarobki ");
                payment = scanner.nextInt();
                scanner.nextLine();
                controller.d(name , lastName , payment);
            } else if (choose.equals("3")) {
                System.out.println("podaj liczbe porządkową pracownika");
                lp = scanner.nextInt();
                scanner.nextLine();
                controller.d(lp);
            } else if (choose.equals("4")) {
                System.out.println("podaj liczbe porządkową pracownika");
                lp = scanner.nextInt();
                controller.e(lp);

            } else if (choose.equals("5")) {
                System.out.println("Do widzania! ");
                break;

            } else {
                System.out.println("Wybierz odpowiednia opcje !");
            }
        }
    }

}
