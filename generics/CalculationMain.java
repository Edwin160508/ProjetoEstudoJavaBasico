package generics;

import generics.model.Product;
import generics.service.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CalculationMain {

    public static void main(String[] args) {
        List<Product> productList =  new ArrayList<>();
        String path = "generics/products_list.txt";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String line = bufferedReader.readLine();
            while(line != null){
                String[] fields = line.split(",");

                productList.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = bufferedReader.readLine();
            }

            Product expensive = CalculationService.max(productList);
            System.out.println("Max: ");
            System.out.println(expensive);

        }catch (IOException ex){
            System.out.println("Error :".concat(ex.getMessage()));
        }
    }
}
