package Lab_23.Q1.pkg2;
import Lab_23.Q1.pkg1.Base;

public class Derived extends Base {
    public void show() {
        // System.out.println(privateVar); // Not accessible
        // System.out.println(defaultVar); // Not accessible
        System.out.println(protectedVar);
        System.out.println(publicVar);
    }
}
