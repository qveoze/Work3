package work3;
import java.util.Scanner;

public class Caesar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String text = scanner.nextLine();

        System.out.println("Введите сдвиг: ");
        int shift = scanner.nextInt();

        String caesarWord = "";

        for (char letter : text.toCharArray()) {
            int asciiLetter = (int) letter;
            if ((asciiLetter >= 1072) & (asciiLetter <= 1103)) { //Проверка на русские строчные буквы
                if (asciiLetter + shift <= 1103) {
                    caesarWord = caesarWord + (char) (asciiLetter + shift);
                } else {
                    caesarWord = caesarWord + (char) (asciiLetter + shift - 31);
                }
            } else if ((asciiLetter >= 1040) & (asciiLetter <= 1071)) { //Проверка на русские заглавные буквы
                if (asciiLetter + shift <= 1071) {
                    caesarWord = caesarWord + (char) (asciiLetter + shift);
                } else {
                    caesarWord = caesarWord + (char) (asciiLetter + shift - 31);
                }

            } else if ((asciiLetter >= 97) & (asciiLetter <= 122)) { //Проверка на английские строчные буквы
                if (asciiLetter + shift <= 122) {
                    caesarWord = caesarWord + (char) (asciiLetter + shift);
                } else {
                    caesarWord = caesarWord + (char) (asciiLetter + shift - 25);
                }
            } else if ((asciiLetter >= 65) & (asciiLetter <= 90)) { //Проверка на английские заглавные буквы
                if (asciiLetter + shift <= 90) {
                    caesarWord = caesarWord + (char) (asciiLetter + shift);
                } else {
                    caesarWord = caesarWord + (char) (asciiLetter + shift - 25);
                }
            } else { //Остальные символы записываются без изменений в зашифрованном виде
                caesarWord = caesarWord + (char) asciiLetter;
            }
        }
        System.out.println("Сообщение: " + caesarWord);
    }
}
