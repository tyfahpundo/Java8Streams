package filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
    int id;
    String name;
    int price;

    public Product(int id, String name,int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class Demo3 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        List<Product> expensiveStuff = new ArrayList<>();

        products.add(new Product(1,"HP Laptop",25000));
        products.add(new Product(1,"Dell Laptop",23000));
        products.add(new Product(1,"Lenovo Laptop",2500));
        products.add(new Product(1,"Sony Laptop",48000));
        products.add(new Product(1,"Apple Laptop",35000));

        products.stream()
                .filter(pr -> pr.price > 25000)
                .forEach(pr -> System.out.println(pr.name+" "+"$"+pr.price));

    }
}
