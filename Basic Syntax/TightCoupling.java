// situation in which one component of one software is closely related to another component

class Laptop {
    public void compile() {
        System.out.println("Compiling...");
    }
}

class Computer {
    public void compile() {
        System.out.println("Compiling...");
    }
}

class Programmer {
    public void writeCode(Laptop laptop) {
        System.out.println("Writing code");
        laptop.compile();
    }
}

public class TightCoupling {
    public static void main(String[] args) {
        Programmer sabin = new Programmer();
        Laptop acer = new Laptop();
        Computer hp = new Computer();
        // works fine
        sabin.writeCode(acer);

        // gives an error
        // sabin.writeCode(hp);

    }
}
