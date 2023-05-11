package dz3;
import java.util.ArrayList;
public class task1 {


// 4* Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.
//Пример: {"Яблоко", "11", "13", "Апельсин", "Дыня", "17"} -> {"Яблоко", "Апельсин", "Дыня"}



    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Яблоко");
        list.add("11");
        list.add("13");
        list.add("Апельсин");
        list.add("Дыня");
        list.add("17");
        System.out.println("Исходный список: " + list);

        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);
            try {
                Integer.parseInt(element);
                list.remove(i);
                i--;
            }
            catch (NumberFormatException ignored) {
            }
        }
        System.out.println("Список после удаления целых чисел: " + list);
    }
}

