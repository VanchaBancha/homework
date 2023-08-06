import java.util.Random;
import java.util.Scanner;

public class MainCycle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number;

        boolean isTheEquationCorrect = false;

        while(!isTheEquationCorrect) {
            int number1 = random.nextInt(50);
            int number2 = random.nextInt(50);
            int equation = number1 + number2;
            System.out.println("Решите уравнение: " + number1 + " + " + number2);
            number = scanner.nextInt();
            System.out.println("Ваш ответ: " + number);
            isTheEquationCorrect = number == equation;

        }
        System.out.println("Ура! Наконец-то!");


    }
}