import java.util.*;
import java.util.stream.Collectors;

public class Zestaw5 {

    // 1
    public static List<Integer> append(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
        tab1.addAll(tab2);
        return tab1;
    }

    // 2
    public static List<Integer> merge(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
        boolean flag = true;
        List<Integer> newList = new ArrayList<>();
        int i = 0, j = 0;
        while (i < tab1.size() && j < tab2.size()) {
            if (flag) {
                newList.add(tab1.get(i++));
            } else {
                newList.add(tab2.get(j++));
            }
            flag = !flag;
        }
        while (i < tab1.size()) {
            newList.add(tab1.get(i++));
        }
        while (j < tab2.size()) {
            newList.add(tab2.get(j++));
        }
        return newList;
    }

    // 3
    public static List<Integer> mergeSorted(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
        tab1.addAll(tab2);
        Collections.sort(tab1);
        return tab1;
    }

    // 4
    public static ArrayList<Character> toArrayList(String napis) {
        List<Character> list = Arrays.stream(napis.split(""))
                .map(s -> s.charAt(0))
                .sorted()
                .toList();
        return new ArrayList<>(list);
    }

    public static ArrayList<Integer> toArrayList(int liczba) {
        List<Integer> list = Arrays.stream(String.valueOf(liczba).split(""))
                .map(Integer::valueOf)
                .sorted()
                .toList();
        return new ArrayList<>(list);
    }

    // 5
    public static boolean checkChar(ArrayList<String> tab, char znak) {
        for (String elem : tab) {
            if (elem.indexOf(znak) != -1) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkDigit(ArrayList<Integer> tab, int cyfra) {
        return tab.contains(cyfra);
    }

    // 6
    public static int countChar(ArrayList<String> tab, char znak) {
        int counter = 0;
        for (String elem : tab) {
            if (elem.indexOf(znak) != -1) {
                counter++;
            }
        }
        return counter;
    }

    public static int countDigit(ArrayList<Integer> tab, int cyfra) {
        return (int) tab.stream()
                .filter(e -> e == cyfra)
                .count();
    }

    // 7
    public static ArrayList<ArrayList<Integer>> uniqueArrayList(ArrayList<Integer> tab) {
        ArrayList<ArrayList<Integer>> arr2d = new ArrayList<>();
        Set<Integer> uniques = new HashSet<>(tab);
        for (Integer unique : uniques) {
            arr2d.add(new ArrayList<>(List.of(unique, 0)));
        }
        return arr2d;
    }

    public static ArrayList<ArrayList<Object>> uniqueArrayList2(ArrayList<String> tab) {
        ArrayList<ArrayList<Object>> arr2d = new ArrayList<>();
        Set<String> uniques = new HashSet<>(tab);
        for (String unique : uniques) {
            arr2d.add(new ArrayList<>(List.of(unique, 0)));
        }
        return arr2d;
    }

    // 8
    public static ArrayList<ArrayList<Integer>> countArrayList(ArrayList<Integer> tab) {
        ArrayList<ArrayList<Integer>> counts = new ArrayList<>();
        Set<Integer> uniques = new HashSet<>(tab);

        for (Integer unique : uniques) {
            long uniqueCount = tab.stream().filter(e -> e == unique).count();
            counts.add(new ArrayList<>(List.of(unique, (int) uniqueCount)));
        }
        return counts;
    }

    public static ArrayList<ArrayList<Object>> countArrayList2(ArrayList<String> tab) {
        ArrayList<ArrayList<Object>> counts = new ArrayList<>();
        Set<String> uniques = new HashSet<>(tab);
        for (String unique : uniques) {
            long uniqueCount = tab.stream().filter(e -> e.equals(unique)).count();
            counts.add(new ArrayList<>(List.of(unique, (int) uniqueCount)));
        }
        return counts;
    }
}
