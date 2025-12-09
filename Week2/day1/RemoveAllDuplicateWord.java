package Week2.day1;

public class RemoveAllDuplicateWord {
public static void main(String[] args) {
        
        String text = "We learn Java basics as part of java sessions in java week1";
        
        String[] words = text.split(" ");
        int count;

        for (int i = 0; i < words.length; i++) {
            count = 1; // reset count for each word

            for (int j = i + 1; j < words.length; j++) {

                // compare ignoring case
                if (words[i].equalsIgnoreCase(words[j]) && !words[i].equals("")) {
                    count++;
                    words[j] = "";   // replace duplicate with empty string
                }
            }

            // If a duplicate was found, replace the first occurrence also?
            // NO — because expected output keeps first appearance.
            // So we don't touch words[i], only duplicates.
        }

        // Printing final result (skip empty strings)
        System.out.print("Output: ");
        for (String w : words) {
            if (!w.equals("")) {
                System.out.print(w + " ");
            }
        }
    }
}
