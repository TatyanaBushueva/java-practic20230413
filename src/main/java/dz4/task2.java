package dz4;

import java.util.Collections;
import java.util.LinkedList;
public class task2 {
    //2. Пусть дан LinkedList с несколькими элементами.
    // Реализуйте метод, который вернет “перевернутый” список
        public static void main(String[] args) {
            LinkedList<String> list = new LinkedList<String>();
            list.add("o");
            list.add("p");
            list.add("r");
            LinkedList<String> reversedList = reverseLinkedList(list);
            System.out.println(reversedList); // [r, p, o]
        }

        public static LinkedList reverseLinkedList(LinkedList list) {
            Collections.reverse(list);
            return list;
        }
    }

