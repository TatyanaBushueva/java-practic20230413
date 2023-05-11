package dz3;
//2. Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
//        что на 0й позиции каждого внутреннего списка содержится название жанра,
//        а на остальных позициях - названия книг. Напишите метод для заполнения данной структуры(можно через консоль).
//        Пример:
//        "Классика", "Преступление и наказание", "Война и мир", "Анна Каренина".
//        "Научная фантастика", "Солярис", "Ночной дозор", "Братья Стругацкие".
//        "Детектив", "Десять негритят".
//        "Фантастика", "Хроники Нарнии", "Гарри Поттер и философский камень", "Грозовой перевал".
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        List<ArrayList<String>> bookList = new ArrayList<>();
    int Size = 2;
    for (int i = 0; i < Size; i++) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите жанр книги: ");
        String inputBookName = iScanner.nextLine();
       // genreList.add(inputGenre);
        ArrayList<String> genreList = new ArrayList<>();
        genreList.add(inputBookName);
        System.out.printf("Введите количество книг в жанре: ");
        int bookQty = Integer.parseInt(iScanner.nextLine());

        for (int j = 0;j < bookQty; j++) {
            System.out.printf("Введите название книги: ");
            String inputGenre = iScanner.nextLine();
            genreList.add(inputGenre);
        }
        bookList.add(genreList);
    }

    bookList.forEach(System.out::println);

}
}
