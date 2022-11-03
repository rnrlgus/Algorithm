package grammer;

public class Animal {
    void move() {
        System.out.println("왔다갔다");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("멍");
    }
}

class Test2 {
    public static void main(String[] args) {
        Animal animal = new Animal();

        Dog down = (Dog)animal;
        down.move();
        down.bark();
    }
}
