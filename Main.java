class Animal {              // Parent class
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {  // Child class
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();   // Inherited method from Animal
        d.bark();    // Child class method
    }
}
