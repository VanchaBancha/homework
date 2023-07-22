import java.util.Scanner;

public class MainConstructor {
    public static void main(String[] args) {

        // По-моему, я сделал не так как надо...
        // Изначально хотел сделать с еще одним словом "bullshit"
        // Но с комадной String modifiedText = text.replace можно заменить только 1 слово, искал варианты но дальше путался

        TextMessage TextMessage = new TextMessage("Ivan");
        TextMessage TextMessage1 = new TextMessage ("Martin");
        TextMessage TextMessage2 = new TextMessage ("Natali");
        TextMessage TextMessage3 = new TextMessage ( "Robin");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Плохие выражения учеников");
        String text1 = scanner.nextLine();

        System.out.print("Было так: " + TextMessage.name + TextMessage.text);
        String text2 = scanner.nextLine();
        System.out.println("Сделаем так: " + TextMessage.name + TextMessage.modifiedText);
        String text3 = scanner.nextLine();

        System.out.println("Было так: " + TextMessage1.name + TextMessage.text);
        String text4 = scanner.nextLine();
        System.out.println("Сделаем так: " + TextMessage1.name + TextMessage.modifiedText);
        String text5 = scanner.nextLine();

        System.out.println("Было так: " + TextMessage2.name + TextMessage.text);
        String text6 = scanner.nextLine();
        System.out.println("Сделаем так: " + TextMessage2.name + TextMessage.modifiedText);
        String text7 = scanner.nextLine();

        System.out.println("Было так: " + TextMessage3.name + TextMessage.text);
        String text8 = scanner.nextLine();
        System.out.println("Сделаем так: " + TextMessage3.name + TextMessage.modifiedText);
        String text9 = scanner.nextLine();
    }
}