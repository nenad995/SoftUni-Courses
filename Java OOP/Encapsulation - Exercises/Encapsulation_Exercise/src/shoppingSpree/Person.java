package shoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {

    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public void setMoney(double money) {
        if (money < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (products.isEmpty()){
            sb.append(name).append(" - Nothing bought");
        } else {
            sb.append(name).append(" - ");
            sb.append(products.stream().map(Product::getName).collect(Collectors.joining(", ")));
        }
        return sb.toString();
    }

    public void buyProduct(Product product){
        if (this.money >= product.getCost()){
            this.products.add(product);
            this.money -= product.getCost();
            System.out.println(this.name + " bought " + product.getName());
        } else {
            throw new IllegalStateException(this.name + " can't afford " + product.getName());
        }
    }
}
