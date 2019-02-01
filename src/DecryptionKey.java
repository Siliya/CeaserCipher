import java.util.Scanner;
//TODO РАБОТИ, но не това е прокта. Версията с ключ

public class DecryptionKey {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Message can only be upper or lowercase alphabet"); //разлимни стойности
        System.out.print("Enter encrypted Text: ");
        String encypText = in.nextLine();

        System.out.println("Enter key (0-25): "); //key
        int dcyptkey = in.nextInt();

        String decrypMsg = "";

        for (
                int i = 0; i < encypText.length(); i++) {

            if ((int) encypText.charAt(i) == 32) {
                decrypMsg += (char) 32;
            } else if (((int) encypText.charAt(i) - dcyptkey) < 97 && ((int) encypText.charAt(i) - dcyptkey) > 90) {
                //малки букви
                int temp = ((int) encypText.charAt(i) - dcyptkey) + 26;
                decrypMsg += (char) temp;
            } else if ((encypText.charAt(i) - dcyptkey) < 65) {
                // главни букви
                int temp = ((int) encypText.charAt(i) - dcyptkey) + 26;
                decrypMsg += (char) temp;
            } else {
                decrypMsg += (char) ((int) encypText.charAt(i) - dcyptkey);
            }

        }

        System.out.println(decrypMsg);
    }
}