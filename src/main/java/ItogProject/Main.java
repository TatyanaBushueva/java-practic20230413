package ItogProject;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Notebook> set = new HashSet<>();
        set.add(new Notebook("Notebook 1", 16, "Windows8", 90000, "Asus"));
        set.add(new Notebook("Notebook 2", 32, "Windows10", 85000, "HP"));
        set.add(new Notebook("Notebook 3", 8, "Windows8", 85000, "HP"));
        set.add(new Notebook("Notebook 4", 16, "linux", 90000, "LG"));
        set.add(new Notebook("Notebook 5", 64, "Windows10", 90000, "Toschiba"));

        OperationWithNotebook operation = new OperationWithNotebook(set);
        operation.start();

    }
}
