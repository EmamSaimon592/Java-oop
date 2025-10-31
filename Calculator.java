class cal {
  int add(int a, int b) {
    return a + b;
  }

  static double sqrt(double x) {
    return Math.sqrt(x);
  }
}

public class Calculator {
  public static void main(String[] args) {
    cal c = new cal();               // create object of cal
    int sum = c.add(5, 3);           // call non-static method
    double root = cal.sqrt(16);      // call static method using class name

    System.out.println("Sum: " + sum);
    System.out.println("Square Root: " + root);
  }
}
