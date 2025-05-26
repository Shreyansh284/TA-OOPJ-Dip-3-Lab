public class EvenLengthWords {
    public static void main(String[] args) {
        String sentence = "Java is an awesome language";
        String[] words = sentence.split(" ");

        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }
}
