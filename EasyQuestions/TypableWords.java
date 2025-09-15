public class TypableWords {
    public static int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int count = 0;
        for (String word : words) {
            boolean canType = true;
            for (char ch : brokenLetters.toCharArray()) {
                if (word.indexOf(ch) != -1) {
                    canType = false;
                    break;
                }
            }
            // if (canType) {
            //     count++;
            // }
        }
        return count;
    }

    public static void main(String[] args) {
        String text = "hello world";
        String brokenLetters = "ad";
        System.out.println(canBeTypedWords(text, brokenLetters)); // Output: 1
    }
}
