public class WordState {
    boolean isZombieApocalypse = true;
    boolean isTornado = true;
    boolean isTsunami = true;
    boolean isMeteorRain = true;
    boolean isSunshine = true;
    boolean isPleasantWide = true;
    boolean isPleasantSummerRain = true;

    public boolean isWorldNegativelyGood () {
        return (isZombieApocalypse && isTsunami) || (isMeteorRain && !isSunshine) || isTornado;
    }

    public boolean isWorldPositivelyGood () {
        return (isPleasantWide || !isTornado) && isPleasantSummerRain && (!isZombieApocalypse || isSunshine);
    }
}
