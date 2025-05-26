public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        System.out.println(sb);

        sb.insert(5, " Java");
        System.out.println(sb);

        sb.delete(5, 10);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.charAt(3));
        System.out.println(sb.capacity());
        System.out.println(sb.toString());

        sb.replace(0, 5, "Test");
        System.out.println(sb);
    }
}
