package work3;

import java.util.Scanner;

public class num1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        String res = ""; // Пустая строка для хранения результата
        //Цикл для переворота строки
        for (int i = input.length() - 1; i >= 0; i--) { //Начинаем цикл с последнего элемента и уменьшаем его на 1 каждый раз
            res += input.charAt(i); // Присваиваем значение из строки
            }
        System.out.println("Обратная строка: " + res);
        scanner.close();
        }
    }

