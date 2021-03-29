package TypesOfRecursion;

/**
 * Created English ruler using recursion technique
 */

public class EnglishRuler {
    public static void main(String[] args) {
        drawRuler(0, 2);
        drawLine(1, 0);
        drawLine(1);
        drawInterval(4);

    }

    /**
     * Draws the english ruler for the given number of inches  and major tick length
     */
    public static void drawRuler(int inchesToBeDrawn, int majorLength) {
        drawLine(majorLength - 1);
        for (int j = 1; j <= inchesToBeDrawn; j++) {
            drawInterval(majorLength - 1);
            drawLine(majorLength, j);
        }

    }

    public static void drawInterval(int centralLength) {
        if (centralLength >= 1) {
            drawInterval(centralLength - 1);
            drawLine(centralLength);
            drawInterval(centralLength - 1);
        }

    }

    public static void drawLine(int tickLength, int tickLabel) {
        for (int j = 0; j < tickLength; j++)
            System.out.print("-");
        if (tickLabel >= 0)
            System.out.print(" " + tickLabel);
        System.out.print("\n");
    }

    private static void drawLine(int tickLength) {
        drawLine(tickLength, -1);
    }
}
