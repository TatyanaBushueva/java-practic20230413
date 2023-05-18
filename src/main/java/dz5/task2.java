package dz5;
import java.util.*;
public class task2 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> notePhone = ex1();
        for (var item : notePhone.entrySet()) {
            System.out.println(item);
        }
        ex2(notePhone);
    }
    private static Map<String, ArrayList<String>> ex1() {
//        System.out.println("----задание 1----");
//

        /**
         * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
         * Пусть дан список сотрудников:
         Иван Иванов
         Светлана Петрова
         Кристина Белова
         Анна Мусина
         Анна Крутова
         Иван Юрин
         Петр Лыков
         Павел Чернов
         Петр Чернышов
         Мария Федорова
         Марина Светлова
         Мария Савина
         Мария Рыкова
         Марина Лугова
         Анна Владимирова
         Иван Мечников
         Петр Петин
         Иван Ежов

         */

        Map<String, ArrayList<String>> note = Map.ofEntries(
                Map.entry("Иван Иванов", new ArrayList<>(List.of("25 50 51"))),
                Map.entry("Светлана Петрова", new ArrayList<>(Arrays.asList("32 56 56", "23 23 23"))),
                Map.entry("Кристина Белова", new ArrayList<>(List.of("45 45 45"))),
                Map.entry("Анна Мусина", new ArrayList<>(Arrays.asList("78 78 78"))),
                Map.entry("Анна Крутова", new ArrayList<>(Arrays.asList("56 56 56"))),
                Map.entry("Иван Юрин", new ArrayList<>(Arrays.asList("89 89 89"))),
                Map.entry("Петр Лыков", new ArrayList<>(Arrays.asList("12 12 12"))),
                Map.entry("Павел Чернов", new ArrayList<>(List.of("25 25 25"))),
                Map.entry("Петр Чернышов", new ArrayList<>(List.of("36 36 36"))),
                Map.entry("Мария Федорова", new ArrayList<>(List.of("65 65 65"))),
                Map.entry("Марина Светлова", new ArrayList<>(List.of("29 29 29"))),
                Map.entry("Мария Савина", new ArrayList<>(List.of("95 95 95"))),
                Map.entry("Мария Рыкова", new ArrayList<>(List.of("54 54 54"))),
                Map.entry("Марина Лугова", new ArrayList<>(List.of("52 25 52"))),
                Map.entry("Анна Владимирова", new ArrayList<>(List.of("48 48 48"))),
                Map.entry("Иван Мечников", new ArrayList<>(Arrays.asList("77 77 77", "33 33 33"))),
                Map.entry("Петр Петин", new ArrayList<>(Arrays.asList("88 88 88", "26 26 26"))),
                Map.entry("Иван Ежов", new ArrayList<>(List.of("44 44 44")))
        );
        return note;
    }

    private static void ex2(Map<String, ArrayList<String>> note) {
        System.out.println("\n----задание 2----");

/**
 Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
 Отсортировать по убыванию популярности.
 */
        Map<String, Integer> sor = new HashMap<>();
        for (var item : note.keySet()) {
            String item2 = item.split(" ")[0];
            if (sor.containsKey(item2)) {
                sor.put(item2, sor.get(item2) + 1);
            } else {
                sor.put(item2, 1);
            }
        }
        System.out.println(sor);
        List<Map.Entry<String, Integer>> list = new ArrayList<>(sor.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        System.out.println(list);
    }
}
