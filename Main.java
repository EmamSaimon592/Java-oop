// class
class Dog {
  String name;
  int age;
  
  // method
  void bark() {
    System.out.println(name + "say woof!");
  }
}


// Object creation & usage
public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog();     // object 1
        d1.name = "Buddy";
        d1.age = 3;
        d1.bark();              // Buddy says Woof!

        Dog d2 = new Dog();     // object 2
        d2.name = "Max";
        d2.bark();              // Max says Woof!
    }
}