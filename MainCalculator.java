import java.util.Random;

public class MainCalculator {
    public static void main(String[] args) {

         Calculator calculator = new Calculator();

         Random random = new Random();
         int number1 = random.nextInt(1,1000);
         int number2 = random.nextInt(1,1000);

         System.out.println("Random Number: " + number1);
         System.out.println("Random number: " + number2);

         int resultAdd = calculator.add(number1, number2);
         int resultSubtract = calculator.subtract(number1, number2);
         int resultMultiply = calculator.multiply(number1, number2);
         int resultDivide = calculator.divide(number1, number2);

         System.out.println("Method Add: " + number1 + " + " + number2 + " = " + resultAdd);
         System.out.println("Method Subtract: " + number1 + " - " + number2 + " = " + resultSubtract);
         System.out.println("Method Multiply: " + number1 + " * " + number2 + " = " + resultMultiply);
         System.out.println("Method Divide: " + number1 + " / " + number2 + " = " + resultDivide);

    }
}