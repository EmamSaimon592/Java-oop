class Book {
    String title;
    String author;

    // Default constructor
    Book() {
        this.title = "Unknown";
        this.author = "Anonymous";
    }

    // Parameterized constructor
    Book(String title, String author) {
        this.title = title;   // 'this' resolves ambiguity
        this.author = author;
    }

    // Method to display book details
    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("--------------------");
    }
}

// Main class to test
public class Constructor {
    public static void main(String[] args) {
        // Create object using default constructor
        Book b1 = new Book();

        // Create object using parameterized constructor
        Book b2 = new Book("The Alchemist", "Paulo Coelho");

        // Display both
        b1.displayInfo();
        b2.displayInfo();
    }
}

