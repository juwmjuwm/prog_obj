public class Kolokwium1 {

    // 1
    public static boolean dokladnosc(double x, double y, double k) {
        double diff = y - x;
        if (diff < 0) {
            diff = diff * -1;
        }

        return diff <= Math.pow(10, -k);
    }

    // 2
    public static int najblizszySasiad(double S) {
        int above = 1;
        while (above * above < S) {
            above++;
        }
        int below = above -1;

        int belowSq = below * below;
        int aboveSq = above * above;

        double diffFromAbove = aboveSq - S >= 0 ? aboveSq - S : (aboveSq - S) * -1;
        double diffFromBelow = belowSq - S >= 0 ? belowSq - S : (belowSq - S) * -1;

        return diffFromAbove < diffFromBelow ? above : below;
    }

    // 3
    public static double pierwiastek(double S, int n, int k) {
        if (S == 0) {
            return 0;
        }
        if (S < 0) {
            throw new IllegalArgumentException("S cannot be less than zero.");
        }
        double x = S;
        while (true) {
            double temp = 0;
            for (int i = 0; i < n-1; i++) {
                temp += x;
            }
            double newX = (temp + S / Math.pow(x, n-1)) / n;
            if (dokladnosc(x, newX, k)) {
                return newX;
            }
            x = newX;
        }

    }

    // 4
    public static int podciag(int[] tab) {
        int maxLength = 1, tempLength = 1;
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < tab[i-1]) {
                tempLength++;
            } else {
                if (tempLength > maxLength) {
                    maxLength = tempLength;
                    tempLength = 1;
                }
            }
        }
        if (tempLength > maxLength) {
            maxLength = tempLength;
        }
        return maxLength;
    }

    // 5
    public static int podciag(int[] tab, int r) {
        int maxLength = 1, tempLength = 1;
        for (int i = 1; i < tab.length; i++) {
            if (tab[i-1] - tab[i] == r) {
                tempLength++;
            } else {
                if (tempLength > maxLength) {
                    maxLength = tempLength;
                    tempLength = 1;
                }
            }
        }
        if (tempLength > maxLength) {
            maxLength = tempLength;
        }
        return maxLength;
    }

    // 6
    public static boolean czyPalindrom(int n) {
        // length
        int numLength = 0;
        while ((double) n / Math.pow(10, numLength) >= 1) {
            numLength++;
        }

        for (int i = 0; i < numLength/2; i++) {
            if (getDigitAt(n, i) != getDigitAt(n, numLength - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param n the number to get digits from
     * @param index the index of a digit with 0 being the index of the rightmost digit
     * @return the digit at the given index
     */
    private static int getDigitAt(int n, int index) {
        for (int i = 0; i < index; i++) {
            n /= 10;
        }
        if (n < 1) {
            throw new IllegalArgumentException("Index %d invalid for the given number n. The number n has less than %d digits."
                    .formatted(index, index+1));
        }
        return n % 10;
    }

    // 7
    public static void palindromLiczbowy(int m) {
        if (m < 1) {
            throw new IllegalArgumentException("Parameter m cannot be less than one.");
        }
        int lowerBound = (int) Math.pow(10, m-1);
        int upperBound = (int) Math.pow(10, m) - 1;

        for (int i = lowerBound; i <= upperBound; i++) {
            for (int j = i; j <= upperBound; j++) {
                if (czyPalindrom(i * j)) {
                    System.out.printf("%d x %d = %d%n", i, j, i * j);
                }
            }
        }
    }

}
