/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.pro;

// The Component interface
interface Product {
    String getDescription();
    double getPrice();
}
// The Concrete Component
class BasicProduct implements Product {
    private final String description;
    private final double price;

    public BasicProduct(String description, double price) {
        this.description = description;
        this.price = price;
    }
    @Override
    public String getDescription() {
        return description;
    }
    @Override
    public double getPrice() {
        return price;
    }
}
// The Decorator abstract class implements the Component interface
abstract class ProductDecorator implements Product {
    protected Product product;

    public ProductDecorator(Product product) {
        this.product = product;
    }
    @Override
    public String getDescription() {
        return product.getDescription();
    }
    @Override
    public double getPrice() {
        return product.getPrice();
    }
}
// The Concrete Decorator adds gift wrapping to the product.
class GiftWrappedProduct extends ProductDecorator {
    public GiftWrappedProduct(Product product) {
        super(product);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " gift wrapped ";
    }
    @Override
    public double getPrice() {
        return super.getPrice() + 5000;
    }
}
// The Concrete Decorator adds express shipping to the product.
class ExpressShippingProduct extends ProductDecorator {
    public ExpressShippingProduct(Product product) {
        super(product);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + "plus express shipping cost";
    }
    @Override
    public double getPrice() {
        return super.getPrice() + 10000;
    }
}

// Client code can create a BasicProduct and decorate it with any number of decorators.
public class Decorator {
    public static void main(String[] args) {
        //Create Objects of Product
        Product Shoes = new BasicProduct("Shoes", 20000);
        Product Bags = new BasicProduct("Bags", 60000);
        Product Glasses = new BasicProduct("Glasses", 10000);
        Product Dresses = new BasicProduct("Dresses", 40000);

        // implementing the WrapperDecorator pattern
        Product WrappedShoes = new GiftWrappedProduct(Shoes);
        Product WrappedBags = new GiftWrappedProduct(Bags);
        Product WrappedGlasses = new GiftWrappedProduct(Glasses);
        Product WrappedDresses = new GiftWrappedProduct(Dresses);

        //implementing the ExpressDecorator pattern
        Product ExpressShoes = new ExpressShippingProduct(WrappedShoes);
        Product ExpressBags = new ExpressShippingProduct(WrappedBags);
        Product ExpressGlasses = new ExpressShippingProduct(WrappedGlasses);
        Product ExpressDresses = new ExpressShippingProduct(WrappedDresses);


        System.out.println(Shoes.getDescription() + " cost : shs" + Shoes.getPrice());
        System.out.println(WrappedShoes.getDescription() + ": shs" + WrappedShoes.getPrice());
        System.out.println(ExpressShoes.getDescription() + ": shs" + ExpressShoes.getPrice());
        System.out.println("===============================================");
        
        System.out.println(Bags.getDescription() + " cost : shs" + Bags.getPrice());
        System.out.println(WrappedBags.getDescription() + ": shs" + WrappedBags.getPrice());
        System.out.println(ExpressBags.getDescription() + ": shs" + ExpressBags.getPrice());
        System.out.println("===============================================");

        System.out.println(Glasses.getDescription() + " cost : shs" + Glasses.getPrice());
        System.out.println(WrappedGlasses.getDescription() + ": shs" + WrappedGlasses.getPrice());
        System.out.println(ExpressGlasses.getDescription() + ": shs" + ExpressGlasses.getPrice());
        System.out.println("===============================================");

        System.out.println(Dresses.getDescription() + " cost : shs" + Dresses.getPrice());
        System.out.println(WrappedDresses.getDescription() + ": shs" + WrappedDresses.getPrice());
        System.out.println(ExpressDresses.getDescription() + ": shs" + ExpressDresses.getPrice());
        System.out.println("===============================================");
        }
}

