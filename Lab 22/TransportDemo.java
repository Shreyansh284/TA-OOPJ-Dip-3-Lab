interface Transport {
    void deliver();
}

abstract class Animal {
    abstract void sound();
}

class Tiger extends Animal {
    @Override
    void sound() {
        System.out.println("Tiger roars");
    }
}

class Camel extends Animal implements Transport {
    @Override
    void sound() {
        System.out.println("Camel grunts");
    }

    @Override
    public void deliver() {
        System.out.println("Camel is delivering goods");
    }
}

class Deer extends Animal {
    @Override
    void sound() {
        System.out.println("Deer makes a sound");
    }
}

class Donkey extends Animal implements Transport {
    @Override
    void sound() {
        System.out.println("Donkey brays");
    }

    @Override
    public void deliver() {
        System.out.println("Donkey is delivering goods");
    }
}

public class TransportDemo {
    public static void main(String[] args) {
        Animal[] animals = {new Tiger(), new Camel(), new Deer(), new Donkey()};

        for (Animal a : animals) {
            a.sound();
            if (a instanceof Transport) {
                ((Transport) a).deliver();
            }
            System.out.println();
        }
    }
}
