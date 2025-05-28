package Lab_23.Q4.Pkg4;

import Lab_23.Q4.Pkg2.B;
import Lab_23.Q4.Pkg3.C;

public class ProtectedDemo {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        b.display();
        c.display();
    }
}
