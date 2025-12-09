package Week2.day1;

public class ReverseOddWords {
    public static void main(String[] args) {

        String test = "I am a software tester";

        // Split into words
        String[] words = test.split(" ");

        // Loop through each word
        for (int i = 0; i < words.length; i++) {

            // Odd index → reverse the word
            if (i % 2 == 1) {

                // Convert to char array
                char[] ch = words[i].toCharArray();

                // Reverse using nested loop
                for (int j = ch.length - 1; j >= 0; j--) {
                    System.out.print(ch[j]);
                }
                System.out.print(" ");  // space after each word

            } else {
                // Even index → print as is
                System.out.print(words[i] + " ");
            }
        }
    }
}

