package Lab_23.Q1.pkg1;

public class Base {
    private int privateVar = 1;
    int defaultVar = 2;
    protected int protectedVar = 3;
    public int publicVar = 4;

    public void display() {
        System.out.println("privateVar: " + privateVar);
        System.out.println("defaultVar: " + defaultVar);
        System.out.println("protectedVar: " + protectedVar);
        System.out.println("publicVar: " + publicVar);
    }
}
