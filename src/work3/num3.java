package work3;
import java.util.Scanner;

public class num3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String input = scanner.nextLine();
        String[] words = input.split("\\s+"); //Здесь мы разбиваем введённую строку на слова с помощью метода `split()`. Аргументом передается регулярное выражение `"\\s+"`, которое означает "один или более пробелов". Это позволяет разделить строку на слова, игнорируя лишние пробелы между ними. Результат сохраняется в массиве строк `words`.
        System.out.println("Количество слов в строке: " + words.length); //Выводим на экран количество слов в строке, которое получаем из длины массива `words` с помощью свойства `length`. Это значение будет равно количеству слов, найденных в введенной строке.
    }
}

