public class StringFunctionsTest {
    public static void main(String[] args) {
        String str = " Hello Java ";
        String str2 = "World";

        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.concat(str2));
        System.out.println(str.indexOf('J'));
        System.out.println(str.equals(str2));
        System.out.println(String.valueOf(123));
        System.out.println(str.toString());
        System.out.println(str.trim());
        System.out.println(str.substring(1, 6));
    }
}
