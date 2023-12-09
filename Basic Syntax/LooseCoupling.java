interface Computer {
    void compile();
}

class Laptop implements Computer {
    @Override
    public void compile() {
        System.out.println("compiling....");
    }
}

class Mobile implements Computer {
    @Override
    public void compile() {
        System.out.println("Compiling....");
    }
}

class Programmer {
    public void writeCode(Computer computer) {
        computer.compile();
    }
}

public class LooseCoupling {
    public static void main(String[] args) {
        Computer acer = new Laptop();
        Computer mobile = new Mobile();
        Programmer sabin = new Programmer();
        sabin.writeCode(mobile);
        sabin.writeCode(acer);
    }
}
