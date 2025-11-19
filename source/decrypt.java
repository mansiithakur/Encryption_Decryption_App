import java.util.Scanner;

public class Decrypt {

    private int key;
    private String text;

    public void decipher() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\nenter numeric key: \n\n");
        key = sc.nextInt();

        System.out.println("\n\nenter cipher text: \n\n");
        sc.nextLine();  // clear buffer
        text = sc.nextLine();

        StringBuilder result = new StringBuilder(text);

        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);

            // Skip spaces
            if (ch == ' ') continue;

            // Convert uppercase → lowercase
            if (Character.isUpperCase(ch)) {
                ch = Character.toLowerCase(ch);
            }

            // Skip digits, punctuation, whitespace
            if (Character.isDigit(ch) ||
                (!Character.isLetter(ch)) ||
                Character.isWhitespace(ch)) {
                continue;
            }

            // Actual Caesar decryption logic
            int decryptedChar = (ch + (26 - key) - 97) % 26 + 97;
            ch = (char) decryptedChar;

            result.setCharAt(i, ch);
        }

        System.out.println("\n\ndecrypted text: \n\n" + result.toString());
        System.out.println("\n\nyour message is decrypted enjoy! reading your private message\n\n");
    }
}
