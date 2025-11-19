import java.util.Scanner;

public class Encrypt {

    private int key;
    private String text;

    public void cipher() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\nenter numeric key between 0-26: \n\n");
        key = sc.nextInt();

        System.out.println("\n\nenter text you want to encrypt:\n \n");
        sc.nextLine();   
        text = sc.nextLine();

        StringBuilder result = new StringBuilder(text);

        for (int i = 0; i < result.length(); i++) {

            char ch = result.charAt(i);

            if (ch == ' ') continue;

            if (Character.isUpperCase(ch)) {
                ch = Character.toLowerCase(ch);
            }

            if (Character.isDigit(ch) ||
                (!Character.isLetter(ch)) ||
                Character.isWhitespace(ch)) {
                continue;
            }

            int encryptedChar = (ch + key - 97) % 26 + 97;
            ch = (char) encryptedChar;

            result.setCharAt(i, ch);
        }

        System.out.println("\n\nencrypted text: \n" + result.toString());
        System.out.println("\n\n your message is safe now!!!\n\n");
    }
}
