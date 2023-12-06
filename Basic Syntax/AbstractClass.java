// The type of class which has been defined using abstract keyword
// we cannot create object of abstract class
// but we can create refrence of abstract class
// a abstarct class can have abstract methods
// it provides base for subclasses which can be used by overriding it

abstract class Animal {
    abstract void eat();
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Eat");
    }
}

class Main {
    public static void main(String[] args) {
        // Animal a = new Animal(); gives error
        Animal a; // refrence of animal
        Dog d = new Dog();
        d.eat();

    }
}