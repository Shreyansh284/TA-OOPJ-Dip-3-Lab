abstract class Vegetable {
    String color;

    Vegetable(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " color: " + color;
    }
}

class Potato extends Vegetable {
    Potato(String color) {
        super(color);
    }
}

class Brinjal extends Vegetable {
    Brinjal(String color) {
        super(color);
    }
}

class Tomato extends Vegetable {
    Tomato(String color) {
        super(color);
    }
}

public class VegetableDemo {
    public static void main(String[] args) {
        Potato potato = new Potato("Brown");
        Brinjal brinjal = new Brinjal("Purple");
        Tomato tomato = new Tomato("Red");

        System.out.println(potato);
        System.out.println(brinjal);
        System.out.println(tomato);
    }
}
