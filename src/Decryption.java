import java.util.Scanner;

public class Decryption {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Message can only be upper or lowercase alphabet");
        System.out.print("Enter encrypted Text: ");
        String encypText = in.nextLine();

        System.out.println("Enter key (0-25): ");
        int dcyptkey = in.nextInt();

        String decrypMsg = "";

        for (
                int i = 0; i < encypText.length(); i++) {
            // now type casting
            if ((int) encypText.charAt(i) == 32) {
                decrypMsg += (char) 32;
            } else if (((int) encypText.charAt(i) - dcyptkey) < 97 && ((int) encypText.charAt(i) - dcyptkey) > 90) {
                //lower case
                int temp = ((int) encypText.charAt(i) - dcyptkey) + 26;
                decrypMsg += (char) temp;
            } else if ((encypText.charAt(i) - dcyptkey) < 65) {
                // upper case
                int temp = ((int) encypText.charAt(i) - dcyptkey) + 26;
                decrypMsg += (char) temp;
            } else {
                decrypMsg += (char) ((int) encypText.charAt(i) - dcyptkey);
            }

        }

        System.out.println(decrypMsg);
    }
}