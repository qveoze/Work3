package work3;
import java.util.Scanner;

public class num2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String input = scanner.nextLine().replace(" ", "").toLowerCase(); //`replace(" ", "")` — удаляем все пробелы из строки
        //  - `toLowerCase()` — преобразуем все символы строки в нижний регистр.
   // Это делается для того, чтобы проверка на палиндром была нечувствительна к регистру и пробелам.
        String reversed = new StringBuilder(input).reverse().toString();

        //Здесь мы сравниваем оригинальную строку `input` с перевернутой строкой `reversed` с помощью метода `equals()`.
        if (input.equals(reversed)) {
            System.out.println("Строка является палиндромом.");
        } else {
            System.out.println("Строка не является палиндромом.");
        }
    }
}

