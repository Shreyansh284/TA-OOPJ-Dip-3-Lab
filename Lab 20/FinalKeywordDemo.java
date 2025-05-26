final class FinalClass {
    final int finalVar = 50;

    final void finalMethod() {
        System.out.println("This is a final method.");
    }
}


class TestFinal {
    final int CONSTANT = 10;

}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.finalMethod();
        
        TestFinal test = new TestFinal();
        System.out.println("Final variable: " + test.CONSTANT);
    }
}
