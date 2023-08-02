public class MainBoolean {
    public static void main(String[] args) {
        // 1.
        int a = 10;
        int b = 20;

        System.out.println("Исходные значения: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("После обмена: a = " + a + ", b = " + b);
        System.out.println();

        // 2.
        WordState wordState = new WordState();
        boolean isWorldNegativelyGood = wordState.isWorldNegativelyGood();

        System.out.println("Is the state of the world bad?: " + isWorldNegativelyGood);
        System.out.println("What exactly is today?");
        System.out.println("isZombieApocalypse: " + wordState.isZombieApocalypse);
        System.out.println("isTornado: " + wordState.isTornado);
        System.out.println("isTsunami: " + wordState.isTsunami);
        System.out.println("isMeteorRain: " + wordState.isMeteorRain);
        System.out.println("isSunshine: " + wordState.isSunshine + ", but we have !isSunshine: this false");
        System.out.println();

        boolean isWorldPositivelyGood = wordState.isWorldPositivelyGood();

        System.out.println("Is the state of the world good?: " + isWorldPositivelyGood);
        System.out.println("What exactly is today?");
        System.out.println("isPleasantWide: " + wordState.isPleasantWide);
        System.out.println("isTornado: " + wordState.isTornado + ", but we have !isTornado: this false");
        System.out.println("isPleasantSummerRain: " + wordState.isPleasantSummerRain);
        System.out.println("isZombieApocalypse: " + wordState.isZombieApocalypse + ", but we have !isZombieApocalypse: this false");
        System.out.println("isSunshine: " + wordState.isSunshine);



    }
}