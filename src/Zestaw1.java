import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

/**
 * Contains solutions for Zestaw1.pdf
 */
public class Zestaw1 {

    private static final String firstname = "Jacek";
    private static final String lastname = "Nowak";
    private static final String symbol = "* ";
    private static final String blank = "  ";

    public void zad1() {
        System.out.printf("%s %s%n", firstname, lastname);
    }

    public void zad2() {
        System.out.printf("Długość imienia: %d%n", firstname.length());
        System.out.printf("Długość nazwiska: %d%n", lastname.length());
    }

    public String zad3() {
        List<String> words = List.of("Ala", "ma", "kota");
        String sentence = String.join(" ", words);
        //        System.out.println(sentence);
        return sentence;
    }

    public void zad4_1() {
        for (int i = 1; i < 6; i++) {
            printArrowLine(i);
        }
        for (int i = 4; i > 0; i--) {
            printArrowLine(i);
        }
    }

    public void zad5() {
        String newSentence = this.zad3().replace('a', 'e');
        System.out.println(newSentence);
    }

    public void zad6() {
        String lowerSentence = this.zad3().toLowerCase();
        System.out.println(lowerSentence);
        String upperSentence = this.zad3().toUpperCase();
        System.out.println(upperSentence);
    }

    public void zad7() {
        List<Character> chars = List.of('A', '!', '@', '>', '~', '\n', '\b');
        for (Character letter : chars) {
            String line = String.format("\"%c\" - %d", letter, (int) letter);
            line = line.replace("\n", "\\n").replace("\b", "\\b");
            System.out.println(line);
        }
    }

    public void zad8() {
        System.out.printf("A - Z: %d - %d%n", (int) 'A', (int) 'Z');
        System.out.printf("a - z: %d - %d%n", (int) 'a', (int) 'z');
        System.out.printf("0 - 9: %d - %d%n", (int) '0', (int) '9');
    }

    public void zad9() {
        String text = "Grzesiek nie wiedział dlaczego %s jest tak drapieżnym %s mimo, że jego %s na to nie wskazuje."
                .formatted("morze", "budynek", "wieża");
        System.out.println(text);
    }

    public void zad10() {
        String text = "%s to najlepsza książka napisana przez %s".formatted("Harry Potter", "J. K. Rowling");
        System.out.println(text);
    }

    public void zad11() {
        String word = "wodrze";
        for (int i = 0; i < 5; i++) {
            System.out.print(word);
        }
        System.out.println();
    }

    public void zad12() {
        String template = "Dzisiaj jest (%02d-%02d-%d) godzina(%02d:%02d:%02d)";
        LocalDateTime dt = LocalDateTime.now(ZoneId.of("Europe/Warsaw"));
        String text = String.format(template, dt.getDayOfMonth(), dt.getMonthValue(), dt.getYear(), dt.getHour(), dt.getMinute(), dt.getSecond());
        System.out.println(text);
    }

    public void zad13() {
        List<Integer> nums = List.of(54, 103, 241, 67, 9999, "Jacek Nowak".length(), 174724);
        for (int num : nums) {
            System.out.printf("%d - %c%n", num, (char) num);
        }
    }

    private void printArrowLine(int i) {
        if (i < 4) {
            printArrowIndent();
        } else {
            printArrowStem();
        }
        for (int j = 0; j < i; j++) {
            System.out.print(symbol);
        }
        System.out.println();
    }

    private void printArrowIndent() {
        for (int j = 0; j < 10; j++) {
            System.out.print(blank);
        }
    }

    private void printArrowStem() {
        for (int j = 0; j < 10; j++) {
            System.out.print(symbol);
        }
    }
}