class Animal {
   void sound(){System.out.println("Hi I am Normal");};
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Animal obj = new Animal() {
            void sound() {
                System.out.println("Hi I am Anonymous");
            }
        };
        obj.sound();
    }
}
