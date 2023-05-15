package dz4;

// 1. Реализовать консольное приложение, которое:

//Принимает от пользователя и “запоминает” строки.

//Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.

//Если введено revert, удаляет предыдущую введенную строку из памяти.

import java.util.LinkedList;

import java.util.Scanner;

    public class task1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            LinkedList<String> list = new LinkedList<>();
            while (true) {
                System.out.println("Введите print/revert:");
                String input = scanner.nextLine();
                if (input.equals("print")) {
                    System.out.println("Последняя введенная строка - первая в списке, а первая - последняя:");
                    while (!list.isEmpty()) {
                        System.out.println(list.removeLast());
                    }
                } else if (input.equals("revert")) {
                    if (!list.isEmpty()) {
                        list.removeLast();
                        System.out.println("Предыдущая введенная строка удалена");
                    } else {
                        System.out.println("Для удаления нет сохраненных строк");
                    }
                } else {
                    list.addLast(input);
                }
            }
        }
    }

