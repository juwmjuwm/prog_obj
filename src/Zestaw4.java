import java.util.Arrays;
import java.util.Random;
import java.util.function.DoubleToIntFunction;
import java.util.stream.IntStream;

public class Zestaw4 {

    // z1
    public static double[] generujTablice(int n, double minWartosc, double maxWartosc) {
        if (minWartosc > maxWartosc) {
            throw new IllegalArgumentException();
        }
        double[] arr = new double[n];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextDouble(minWartosc, maxWartosc);
        }
        return arr;
    }

    // z2
    public static void wypiszTablice(int[] tab, int n, int m) {
        boolean endReached = false;
        for (int r = 0; r < n; r++) {
            System.out.print("[");
            for (int c = 0; c < m; c++) {
                int curIdx = r * m + c;
                if (curIdx >= tab.length) {
                    endReached = true;
                }
                if (endReached) {
                    System.out.printf("%10s", "");
                } else {
                    System.out.printf("%10d", tab[curIdx]);
                }
                if (c != m-1) {
                    System.out.print(", ");
                }
            }
            if (r == n-1) {
                System.out.println("]");
            } else {
                System.out.println("],");
            }
        }
    }

    // z3
    public static int ileNieparzystych(int[] tab) {
        int count = 0;
        for (int elem : tab) {
            if (elem % 2 == 1) {
                count++;
            }
        }
        return count;
    }

    public static int ileParzystych(int[] tab) {
        int count = 0;
        for (int elem : tab) {
            if (elem % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int ileDodatnich(int[] tab) {
        int count = 0;
        for (int elem : tab) {
            if (elem > 0) {
                count++;
            }
        }
        return count;
    }

    public static int ileUjemnych(int[] tab) {
        int count = 0;
        for (int elem : tab) {
            if (elem < 0) {
                count++;
            }
        }
        return count;
    }

    public static int ileZerowych(int[] tab) {
        int count = 0;
        for (int elem : tab) {
            if (elem == 0) {
                count++;
            }
        }
        return count;
    }

    public static int ileMaksymalnych(int[] tab) {
        if (tab.length == 0) {
            return 0;
        }
        int counter = 0;
        int curMax = tab[0];
        for (int elem : tab) {
            if (elem > curMax) {
                curMax = elem;
                counter = 1;
            } else if (elem == curMax) {
                counter++;
            }
        }
        return counter;
    }

    public static int ileMinimalnych(int[] tab) {
        if (tab.length == 0) {
            return 0;
        }
        int counter = 0;
        int curMin = tab[0];
        for (int elem : tab) {
            if (elem < curMin) {
                curMin = elem;
                counter = 1;
            } else if (elem == curMin) {
                counter++;
            }
        }
        return counter;
    }

    public static int ileUnikalnych(int[] tab) {
        int[] unique = new int[tab.length];
        int uIdx = 0;
        int counter = 0;
        for (int i = 0; i < tab.length; i++) {
            int curIdx = i;
            if (IntStream.of(unique).noneMatch(e -> e == tab[curIdx])) {
                unique[uIdx++] = tab[curIdx];
                counter++;
            }
        }
        return counter;
    }

    // z4
    public static double sumaDodatnich(double[] tab) {
        double sum = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0) {
                sum += tab[i];
            }
        }
        return sum;
    }

    public static double sumaUjemnych(double[] tab) {
        double sum = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0) {
                sum += tab[i];
            }
        }
        return sum;
    }

    public static double sumaOdwrotnosci(double[] tab) {
        double sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum += 1.0 / tab[i];
        }
        return sum;
    }

    public static double sredniaArytmetyczna(double[] tab) {
        double avg = 0;
        for (int i = 0; i < tab.length; i++) {
            avg += tab[i];
        }
        avg = avg / tab.length;
        return avg;
    }

    public static double sredniaGeometryczna(double[] tab) {
        double avg = 1;
        for (int i = 0; i < tab.length; i++) {
            avg *= tab[i];
        }
        avg = Math.pow(avg, 1.0/tab.length);
        return avg;
    }

    public static double sredniaHarmoniczna(double[] tab) {
        double denominator = sumaOdwrotnosci(tab);
        return (double) tab.length / denominator;
    }

    // z5
    public static double[] funkcjaLiniowa(double[] tab, double a, double b) {
        return Arrays.stream(tab).map(x -> a * x + b).toArray();
    }

    public static double[] funkcjaKwadratowa(double[] tab, double a, double b, double c) {
        return Arrays.stream(tab).map(x -> a*x*x + b*x + c).toArray();
    }

    public static double[] funkcjaWykladnicza(double[] tab, double a) {
        return Arrays.stream(tab).map(x -> Math.pow(a, x)).toArray();
    }

    public static int[] funkcjaSignum(double[] tab) {
        DoubleToIntFunction signum = x -> {
            if (x > 0) {
                return 1;
            } else if (x == 0) {
                return 0;
            } else {
                return -1;
            }
        };
        return Arrays.stream(tab).mapToInt(signum).toArray();
    }

    // z6
    public static int najdluzszyCiagDodatnich(double[] tab) {
        int i = 0;
        int counter = 0;
        int curMax = 0;
        while (i < tab.length) {
            while (i < tab.length && tab[i] > 0) {
                counter++;
                i++;
            }
            if (counter > curMax) {
                curMax = counter;
            }
            counter = 0;
            i++;
        }
        return curMax;
    }

    // z7
    public static double[] generujZakres(int n, double minWartosc, double maxWartosc) {
        double diff = (maxWartosc - minWartosc) / (n - 1);
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = minWartosc + diff * i ;
        }
        return arr;
    }
}
