// class 1 : FiyazPizza
class FiyazPizza {
    public String name;
    public String ingredients;
    private double price;

    // constructor 
    public FiyazPizza(String name, String ingredients, double price) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
    }

    // Getter and setter for price
    public double getPrice() {
        return this.price;  // ✅ must return price
    }

    public void setPrice(double price) {
        this.price = price;
    }
}


// class 2 : sylhetiFaiyazPizza
class sylhetiFaiyazPizza extends FiyazPizza {
    public String sylhetiSpecial;

    public sylhetiFaiyazPizza(String name, String ingredients, double price, String sylhetiSpecial) {
        super(name, ingredients, price);
        this.sylhetiSpecial = sylhetiSpecial;
    }
}


// class 3 : FaiyazShop
class FaiyazShop {
    public String name;
    public String address;

    FaiyazShop(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Overloaded methods
    public void preparePizza(FiyazPizza pizza) {
        System.out.println("Preparing " + pizza.name);
    }

    public void preparePizza(sylhetiFaiyazPizza pizza) {
        System.out.println("Sylheti special pizza: " + pizza.name);
    }

    public void preparePizza(Object pizza) {  // ✅ should be Object, not object
        System.out.println("Preparing pizza in general");
    }
}


// class 4 : Test
public class Main {
    public static void main(String[] args) {

        // creating objects
        FiyazPizza pizza1 = new FiyazPizza("Cheese Burst", "Cheese sauce", 550);
        sylhetiFaiyazPizza pizza2 = new sylhetiFaiyazPizza("Sylheti Spicy", "Beef chili", 650, "Extra hot");
        FaiyazShop shop = new FaiyazShop("Faiyaz Pizza Home", "Sylhet, Bangladesh");

        // calling methods
        shop.preparePizza(pizza1);
        shop.preparePizza(pizza2);
        shop.preparePizza((Object) pizza1);

        System.out.println("Price of " + pizza1.name + ": " + pizza1.getPrice());
    }
}
