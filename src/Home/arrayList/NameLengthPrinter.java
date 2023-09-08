package Home.arrayList;

import java.util.ArrayList;
import java.util.List;

public class NameLengthPrinter {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // Your task: Use lambda expressions and forEach to print the length of each name.
        names.forEach(x-> System.out.println(x.length()));

        // Your code goes here
    }
}
