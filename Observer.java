/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.pro;

import java.util.ArrayList;
import java.util.List;
// The Subject interface defines the methods to register and notify observers.
interface ShoppingCart {
    void attach(Salesperson observer);
    void notifyObservers(Product product);
}
// The Concrete Subject maintains a list of observers & notifies them when a product is added to the cart.
class ShoppingCartImpl implements ShoppingCart {
    private List<Salesperson> observers = new ArrayList<>();
    private List<Product> items = new ArrayList<>();

    public void attach(Salesperson observer) {
        observers.add(observer);
    }
    public void notifyObservers(Product product) {
        for (Salesperson observer : observers) {
            observer.update(product);
        }
    }
    public void addItem(Product product) {
        items.add(product);
        notifyObservers(product);
    }

    public List<Product> getItems() {
       System.out.println(observers);
       return null;
    }
}

// The Observer interface
interface Salesperson {
    void update(Product product);
}
// The Concrete Observer is a salesperson that is notified when a product is added to the cart.
class SalespersonImpl implements Salesperson {
    private String name;
    public SalespersonImpl(String name) {
        this.name = name;
    }
    public void update(Product product) {
        System.out.println(name + " received notification that " + product.getName() +
         " is added to the cart with a cost of " + product.getPrice());
    }
}
// The Product class represents a product that can be added to the cart.
class Product {private String name;private double price;
    public Product(String name, double price) {this.name = name;this.price = price;}
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}
public class Observer {
    public static void main(String[] args) {
        ShoppingCartImpl cart = new ShoppingCartImpl();
        Salesperson salesperson = new SalespersonImpl("Salesperson");
        cart.attach(salesperson);
        Product Bag = new Product("Bag", 40000);
        Product Dress = new Product("Dress", 30000);
        Product Shoe = new Product("Shoe", 50000);
        
        cart.addItem(Bag);
        cart.addItem(Dress);
        cart.addItem(Shoe);

    }
}

  
