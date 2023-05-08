package dz2;
//2.Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида:
//        1 Расширение файла: txt
//        2 Расширение файла: pdf
//        3 Расширение файла:
//        4 Расширение файла: jpg
import java.io.File;
import java.util.HashSet;

public class task2 {
    public static void main(String[] args) {
        File folder = new File("C:/Users/Mary/IdeaProjects/java-practic20230413/src/main/resources/");
        HashSet<String> FolderExtensions = new HashSet<String>();

        for (File file : folder.listFiles())
        {
            String name = file.getName();
//            System.out.println(name);
            String ext;
//            System.out.println(file.getExtension());
            int i = name.lastIndexOf('.');
            ext = i > 0 ? name.substring(i + 1) : "";
//            System.out.println(ext);  // => extension
            FolderExtensions.add(ext);
//            System.out.println(FolderExtensions);
        }
        int i = 1;
        for (String ext_i  : FolderExtensions) {
            System.out.println(i+ ". Расширение файла: " +ext_i);
            i+=1;
        }

    }

}


