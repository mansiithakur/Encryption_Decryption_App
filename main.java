import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Encrypt e = new Encrypt();
        Decrypt d = new Decrypt();

        System.out.println("WELCOME USER!!!");
        System.out.println("What do you want to do? Enter the number accordingly:");
        System.out.println("1. Encrypt");
        System.out.println("2. Decrypt");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                e.cipher();
                break;
            case 2:
                d.decipher();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        sc.close();
    }
}
