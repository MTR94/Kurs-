package J25;

public class Run {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int wynik = calculator.suma1(10, 10);
        int wynik2 = calculator.suma1(10, 10, 11);
        double wynik3 = calculator.suma1(1.5, 3.5);
        double wynik4 = calculator.suma1(2.5, 3.5, 5.6);
        System.out.println(wynik);
        System.out.println(wynik2);
        System.out.println(wynik3);
        System.out.println(wynik4);


    }
}
