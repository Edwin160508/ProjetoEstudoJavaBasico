package generics;

import generics.service.PrintService;

import java.util.Locale;
import java.util.Scanner;

public class GenericMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        PrintService<String> printService = new PrintService<>();

        System.out.println("How many values? ");
        int quantity = sc.nextInt();

        addValue(quantity, printService, sc);

        printService.print();
        System.out.println("First: " + printService.first());

        sc.close();
    }

    private static void addValue(int quantity, PrintService printService, Scanner scanner){
        for(int index=0; index<quantity; index++){
            String value = scanner.next();
            printService.addValue(value);
        }
    }
}
