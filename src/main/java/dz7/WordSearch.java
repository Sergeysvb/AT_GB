package dz7;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class WordSearch {
    public static void main(String[] args) {
    String[] words = new String[]{"Яблоко","Банан","Вишня","Манго","Арбуз","Дыня","Виноград","Арбуз","Дыня","Виноград"};

    for(String words1 : words)
        System.out.print(words1 + " ");
        System.out.println();

        System.out.println();
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(words));
    HashSet<String> hashSet = new HashSet<>(arrayList);

    for (String word : hashSet) {
        System.out.println("Слово " + word + " встречается " + Collections.frequency(arrayList, word) + " раз(а)");
    }
}
}
