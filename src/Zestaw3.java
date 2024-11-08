import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class Zestaw3 {

    /**
     * Task 1
     */
    public void trojkiPitagorejskie(int n) {
        for (int i = n; i > 2; i--) {
            for (int j = i-1; j > 0; j--) {
                for (int k = j-1; k > 0; k--) {
                    if (Math.pow(k, 2) + Math.pow(j, 2) == Math.pow(i, 2)) {
                        System.out.println(k + "; " + j + "; " + i);
                    }
                }
            }
        }
    }

    /**
     * Task 2
     */
    public void funKwaRozwiazania(int n) {
        for (int a = n; a >= 0; a--) {
            for (int b = n; b >= 0; b--) {
                for (int c = n; c >= 0; c--) {
                    double delta = Math.pow(b, 2) - 4 * a * c;
                    if (delta >= 0) {
                        System.out.println(a + "; " + b + "; " + c);
                    }
                }
            }
        }
    }

    /**
     * Task 3
     */
    public void funKwaDelta(int n) {
        for (int a = n; a >= 0; a--) {
            for (int b = n; b >= 0; b--) {
                for (int c = n; c >= 0; c--) {
                    double delta = Math.pow(b, 2) - 4 * a * c;
                    double deltaRoot = Math.sqrt(delta);
                    boolean isRootNaturalPower = Math.sqrt(deltaRoot) == (int) Math.sqrt(deltaRoot);
                    if (isRootNaturalPower) {
                        System.out.println("Delta sqrt: " + deltaRoot);
                        System.out.println(a + "; " + b + "; " + c);
                    }
                }
            }
        }
    }

    /**
     * Task 4
     */
    public void liczbyPierwsze(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    /**
     * Task 5
     */
    public void liczbyPodzielne(int m, int n) {
        if (m < 1 || n < 1) {
            throw new IllegalArgumentException();
        }
        StringBuilder sbUpper = new StringBuilder();
        StringBuilder sbLower = new StringBuilder();
        sbLower.append('1');
        for (int i = 0; i < m; i++) {
            sbUpper.append('9');
            sbLower.append('0');
        }
        sbLower.deleteCharAt(m - 1);
        long upperBound = Long.parseLong(sbUpper.toString());
        long lowerBound = Long.parseLong(sbLower.toString());

        for (long i = lowerBound; i <= upperBound; i++) {
            boolean dividable = (double) i / n == i / n;
            if (dividable) {
                System.out.println(i);
            }
        }
    }

    /**
     * Task 7
     */
    public long silnia(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        long result = 1;
        while (n > 0) {
            result *= n--;
        }
//        System.out.println(result);
        return result;
    }

    /**
     * Task 8
     */
    public long silniaPodwojna(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        long result = 1;
        while (n > 0) {
            result *= n;
            n -= 2;
        }
//        System.out.println(result);
        return result;
    }

    /**
     * Task 9
     */
    public long silnia(int m, int n) {
        if (n < 0 || m < 1) {
            throw new IllegalArgumentException();
        }
        long result = 1;
        while (n > 0) {
            result *= n;
            n -= m;
        }
//        System.out.println(result);
        return result;
    }

    /**
     * Task 10
     */
    public long dwumianNewtona(int n, int k) {
        if (k > n) {
            throw new IllegalArgumentException();
        }
        return silnia(n) / (silnia(k) * silnia(n - k));
    }

    /**
     * Task 11
     */
    public int ciagFibonacciego(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        }

        int prev1 = 1;
        int prev2 = 1;
        int curElem = 0;
        for (int i = 1; i <= n; i++) {
            if (i < 3) {
                System.out.print(prev1 + " ");
                continue;
            }
            curElem = prev1 + prev2;
            System.out.print(curElem + " ");
            prev2 = prev1;
            prev1 = curElem;
        }
        return curElem;
    }

    // TASK 12
    public long sumaNaturalnych(int n) {
        return sumCondition(n, this::isNatural);
    }

    public long sumaParzystych(int n) {
        return sumCondition(n, this::isEven);
    }

    public long sumaNieparzystych(int n) {
        return sumCondition(n, this::isOdd);
    }

    public long sumaKwaNaturalnych(int n) {
        return sumTransformed(n, num -> Math.pow(num, 2));
    }

    public long sumaSzeNaturalnych(int n) {
        return sumTransformed(n, num -> Math.pow(num, 3));
    }

    public long sumaOdwNaturalnych(int n) {
        return sumTransformed(n, num -> 1.0 / num);
    }
    // END TASK 12

    /**
     * Task 13
     */
    public boolean czyPalindrom(String wyraz) {
        for (int i = 0; i < wyraz.length(); i++) {
            if (wyraz.charAt(i) != wyraz.charAt(wyraz.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 16
     */
    public boolean czyDoskonala(int n) {
        int result = 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                result += i;
            }
        }
        return n == result;
    }

    /**
     * 17
     */
    public boolean czyPierwsza(int n) {
        return isPrime(n);
    }

    /**
     * 18
     */
    public int NWD(int a, int b) {
        int div = Math.min(a, b);
        while (div > 0) {
            if (a % div == 0 && b % div == 0) {
                return div;
            }
            div--;
        }
        return -1;
    }

    /**
     * 19
     */
    public int[] wczytajTablice() {
        int[] arr = null;
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                int num = scanner.nextInt();
                arr[i] = num;
            }
        }
        return arr;
    }

    /**
     * 20
     */
    public void wypiszPodzbiory(int[] tab) {
        int totalSubsets = (int) Math.pow(2, tab.length);
        int[][] subsets = new int[totalSubsets][];

        for (int i = 0; i < totalSubsets; i++) {
            List<Integer> currentSubset = new ArrayList<>();
            for (int j = 0; j < tab.length; j++) {
                if ((i & (1 << j)) != 0) {
                    currentSubset.add(tab[j]);
                }
            }
            int[] cur = currentSubset.stream().mapToInt(e -> e).toArray();
            subsets[i] = cur;
            System.out.println(Arrays.toString(cur));
        }
    }
    

    private boolean isPrime(int num) {
        if (num == 2) {
            return true;
        }
        if (num < 2) {
            return false;
        }
        for (int div = (int) Math.sqrt(num); div > 1; div--) {
            double result = (double) num / div;
            int intResult = (int) result;
            if (result == intResult) {
                return false;
            }
        }
        return true;
    }

    private long sumCondition(int n, Function<Integer, Boolean> condition) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            if (condition.apply(i)) {
                sum += i;
            }
        }
        return sum;
    }

    private long sumTransformed(int n, Function<Double, Double> transform) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += transform.apply((double) i);
        }
        return sum;
    }

    private boolean isNatural(int num) {
        return num >= 0;
    }

    private boolean isEven(int num) {
        return num % 2 == 0;
    }

    private boolean isOdd(int num) {
        return !isEven(num);
    }
}
