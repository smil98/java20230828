package Home.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class SentencePrinter {
    public static void main(String[] args) {
        List<String> sentences = new ArrayList<>();
        sentences.add("This is the first sentence.");
        sentences.add("Here's the second one.");
        sentences.add("And here's the third and final sentence.");

        // Use lambda expressions and forEach to print all the words in each sentence
        sentences.forEach(sentence -> {
            String[] words = sentence.split(" ");
            Arrays.stream(words).forEach(System.out::println);
        });
    }
}

