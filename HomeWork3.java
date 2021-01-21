import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    /*1.  */
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean inGame = true;

        while (inGame) {
            System.out.println("Новая игра:");
            int hiddenNumber = random.nextInt(9);

            while (true) {
                System.out.println("Введите число: ");
                int enteredNumber = scanner.nextInt();
                if (enteredNumber > hiddenNumber) {
                    System.out.println("Загаданное число меньше");
                } else if (enteredNumber < hiddenNumber) {
                    System.out.println("Загаданное число больше");
                } else {
                    System.out.println("Вы победили!");
                    System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                    int exit = scanner.nextInt();
                    if (exit == 1) {
                        break;
                    } else if (exit == 0) {
                        inGame = false;
                        break;
                    }
                }
            }
        }

          /*2.  */

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
                "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple",
                "pumpkin", "potato"};

        Random randomWord = new Random();
        int ran = randomWord.nextInt(words.length);
        String hiddenWord = words[ran];
        int plug = 15 - hiddenWord.length();

        while (true) {
            System.out.println("Угадайте загаданое слово: ");
            String enteredWord = scanner.next();

            if (enteredWord.equals(hiddenWord)) {
                System.out.println(enteredWord);
                System.out.println("Вы победили!");
                break;
            } else {
                for (int i = 0; i < hiddenWord.length(); i++) {

                    char a = hiddenWord.charAt(i);
                    char b = enteredWord.charAt(i);
                    if (a == b) {
                        System.out.print(a);
                    } else if (a != b) {
                        System.out.print("#");
                    }
                }
                for (int j = 0; j < plug; j++) {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}