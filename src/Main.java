import java.util.InputMismatchException;
import java.util.List;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Lab3 lab = new Lab3();
        lab.wypiszPodzbiory(new int[] {1, 2, 3, 4});
    }
    
    /**
     * Contains solutions for Zestaw1.pdf
     */
    public static class TaskSet1 {
    
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
    
    /**
     * Contains solutions for Zestaw2.pdf
     */
    public static class TaskSet2 {
        
        public void zad1() {
            var var1 = 23.0 + 76;
            System.out.printf("23.0+76 ; type: %s%n", ((Object) var1).getClass().getSimpleName());
            var var2 = 41 * 2.0 + 3;
            System.out.printf("41*2.0+3 ; type: %s%n", ((Object) var2).getClass().getSimpleName());
            var var3 = 5 - 33;
            System.out.printf("5-33 ; type: %s%n", ((Object) var3).getClass().getSimpleName());
            var var4 = 109%3;
            System.out.printf("109%%3 ; type: %s%n", ((Object) var4).getClass().getSimpleName());
            var var5 = 50/2;
            System.out.printf("50/2 ; type: %s%n", ((Object) var5).getClass().getSimpleName());
            var var6 = 4|2;
            System.out.printf("4|2 ; type: %s%n", ((Object) var6).getClass().getSimpleName());
            var var7 = 3^5;
            System.out.printf("3^5 ; type: %s%n", ((Object) var7).getClass().getSimpleName());
            var var8 = 7&9;
            System.out.printf("7&9 ; type: %s%n", ((Object) var8).getClass().getSimpleName());
        }
        
        public void zad2() {
            double result1 = (Math.sqrt(7) - 1) / 2 + Math.pow(3, 3) % 2;
            int iResult1 = (int) result1;
            double result2 = 2001.0 / (19 * 12);
            int iResult2 = (int) result2;
            double result3 = 9876.0 % 50 % 4;
            int iResult3 = (int) result3;
            double result4 = (double) ("Nowak".length() % "Jacek".length() + 1) / Math.pow(2, 1.0 / 4);
        }

        public void zad3() {
            try (Scanner input = new Scanner(System.in)) {
                String word1 = input.next();
                String word2 = input.next();
                System.out.println(word1 + " " + word2);
            }
        }

        public void zad4() {
            try (Scanner input = new Scanner(System.in)) {
                double num1, num2;
                System.out.print("Enter the first number: ");
                if (input.hasNextDouble()) {
                    num1 = input.nextDouble();
                    input.nextLine();
                } else {
                    throw new InputMismatchException("The input cannot be interpreted as a number.");
                }
                System.out.print("Enter the second number: ");
                if (input.hasNextDouble()) {
                    num2 = input.nextDouble();
                } else {
                    throw new InputMismatchException("The input cannot be interpreted as a number.");
                }
                System.out.println("Sum: " + (num1 + num2));
                System.out.println("Difference: " + (num1 - num2));
                System.out.println("Product: " + (num1 * num2));
                System.out.println("Division: " + (num1 / num2));
            }
        }

        public void zad5() {
            try (Scanner input = new Scanner(System.in)) {
                System.out.print("Enter an integer number: ");
                int num;
                if (input.hasNextInt()) {
                    num = input.nextInt();
                } else {
                    throw new InputMismatchException("The input cannot be interpreted as an integer number.");
                }
                System.out.println(num + 140);
                System.out.println(num -31);
                System.out.println(num * 7);
                System.out.println(num / 13);
                System.out.println(num % 7);
                System.out.println((long) num / 4);
                System.out.println(Math.pow(num, 45));
                System.out.println(num & 67);
                System.out.println(num | 59);
                System.out.println(num ^ 23);
                System.out.println(num << 5);
                System.out.println(num >> 6);
            }
        }
    }
}
