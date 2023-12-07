// Interface is the collection of abstract methods

interface Human {
    // methods inside interface are by default public + abstract
    void eat();

    void sleep();

    void bath();
}

class Nepali implements Human {
    @Override
    public void eat() {
        System.out.println("Eat dal bhat");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping early");
    }

    @Override
    public void bath() {
        System.out.println("Bath every second day");
    }
}

class Indian implements Human {
    @Override
    public void eat() {
        System.out.println("Eating samosa");
    }

    @Override
    public void bath() {
        System.out.println("Bath daily");
    }

    @Override
    public void sleep() {
        System.out.println("Sleep late night");
    }
}