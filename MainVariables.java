public class MainVariables {
    public static void main(String[] args) {

        // Четыре переменные
        byte byteNumber = -56;
        int intNumber = 131;
        double doubleNumber = 3232;
        float floatNumber = 24867;

        // Сужение
        int doubleToInt = (int) doubleNumber;       // c double в int
        byte intToByte = (byte) intNumber;          // c int в byte
        float doubleToFloat = (float) doubleNumber; // с double в float
        byte floatToByte = (byte) floatNumber;      // с float в byte

        // Расширение
        int byteToInt = byteNumber;
        float intToFloat = intNumber;
        double floatToDouble = floatNumber;

        System.out.println("Сужение");
        System.out.println(doubleToInt);
        System.out.println(intToByte);
        System.out.println(doubleToFloat);
        System.out.println(floatToByte);

        System.out.println("Расширение");
        System.out.println(byteToInt);
        System.out.println(intToFloat);
        System.out.println(floatToDouble);



    }
}