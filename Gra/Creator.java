package Gra;

import java.util.ArrayList;
import java.util.Scanner;

public class Creator {
    Scanner scanner = new Scanner(System.in);
    ArrayList <Player> playerList = new ArrayList<>();
    ArrayList <Character> characters = new ArrayList<>();
    public Creator (){
        this.menu1();
    }
    public void menu1(){
        while (true){
            System.out.println(" Witamy w grze !!");
            System.out.println("1 - Make character 2- choose character 3- End");
            int choose = scanner.nextInt();
            scanner.nextLine();
            if (choose == 1){
                System.out.println("podaj nazwe postaci ");
                String name = scanner.nextLine();
                System.out.println(" Wybierz rase postaci ");
                System.out.println("1 - Człowiek siła : 15 , zręczność : 10 , intelekt : 10 , wiedza : 10");
                System.out.println("2 - Elf siła : 10 , zręczność 15 , intelekt : 10 , wiedza : 10 ");
                choose = scanner.nextInt();
                scanner.nextLine();
                if (choose == 1){
                    System.out.println("wybałeś człowieka");
                    this.human(name , "human");
                } else if (choose == 2) {
                    System.out.println("wybrałeś Elfa ");
                    this.elf(name , "elf");
                }

            } else if (choose == 2) {

            } else if (choose == 3 ) {
                System.out.println("zapraszamy powownie");
                break;
            }
        }
    }
    public void human(String name , String rase){
        Character character = new Character(name , rase);
        characters.add(character);
        System.out.println("stworzono czlowieka");
        for (Character x : characters){
            Player human = new Player(x.getName(), x.getRase(), 15, 10);
            playerList.add(human);
            System.out.println("Postać stworzona pomyślnie!");
            this.chooseKlas(name);
        }
    }
    public void elf(String name , String rase){
        Character character = new Character(name , rase);
        characters.add(character);
        System.out.println("stworzono elfa");
        for (Character x : characters){
            Player elf = new Player(x.getName(), x.getRase(), 10, 15);
            playerList.add(elf);
            System.out.println("Postać stworzona pomyślnie!");
            this.chooseKlas(name);
        }
    }
    public void chooseKlas(String name){
        System.out.println("Swietnie teraz przejdźmy do wyboru klasy ");
        System.out.println("1 - Knight (siła + 10 , życie + 50 ");
        System.out.println("2 - Rogue (Zręczność +10 Moc + 5 , wiedza + 5");
        int choose = scanner.nextInt();
        scanner.nextLine();
        boolean p = false;
        if (choose == 1 ){
            for (Player x : playerList) {
                if (x.getName().equals(name)) {
                    p = true;
                    x.str = x.str + 10;
                    x.wit = x.wit + 50;
                    System.out.println("od teraz jesteś Rycerzem");
                    x.setKlasa("Knight");
                    this.menu2(name);
                    break;
                }
            }
            if (!p){
                System.out.println("nie ma takiej postaci ");
            }
        } else if (choose == 2 ) {
            for (Player x : playerList){
                if (x.getName().equals(name)){
                    p = true;
                    x.setDex(x.getDex() + 10);
                    x.setPower(x.getPower() + 5);
                    x.setKnow(x.getKnow() + 5);
                    System.out.println("od teraz jesteś złodziejem ");
                    x.setKlasa("Rogue");
                    this.menu2(name);
                    break;

                }
            }
            if (!p){
                System.out.println("nie ma takiej postaci ");
            }
        }
    }
    public void menu2(String name){
        System.out.println("1 - Statystyki postaci  2- lista postaci 3- lista graczy 4 - pierwsze menu");
        int choose = scanner.nextInt();
        scanner.nextLine();
        if (choose == 1 ){
            for (Player x : playerList){
                if (x.getName().equals(name)){
                    System.out.println(x);
                }
            }

        } else if (choose == 2 ) {
            System.out.println(playerList);

        } else if (choose == 3 ) {
            System.out.println(characters);

        } else if (choose == 4) {
            this.menu1();

        }
    }
}
