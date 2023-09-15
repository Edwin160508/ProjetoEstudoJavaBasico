package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JokerTypesMain {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(5, 6, 8);
        printList(numbersList);

        List<String> stringList = Arrays.asList("Maria", "José", "João");
        printList(stringList);
    }

    private static void printList(List<?> list){
        for(Object obj: list){
            System.out.println(obj);
        }
    }

}
