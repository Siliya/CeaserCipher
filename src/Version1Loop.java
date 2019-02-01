import java.util.Scanner;

public class Version1Loop {
    //TODO formula  encrypt n + 3 - t = q decrypt n - 3 q=t or the other way around

    //TODO НЕ Е ПРАВИЛНОТО РЕШЕНИЕ! а и не работи

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your encrypted message");
        String deMessage = input.nextLine();
        System.out.println();
        String encryption = encryptCeaser(deMessage, 5); //shift
        System.out.println(encryption);

    }

    //С условни конструкции и цикли
    public static String encryptCeaser(String text, int shift) {
        if (shift > 26) {

        } else if (shift < 0) {
            shift = (shift % 26) + 26;
        }
        String cipher = " ";

        int length = text.length();
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isLowerCase(ch)) {  //за малки букви

                } else if (Character.isLowerCase(ch)) {
                    char c = (char) (ch + shift);
                    if (c > 'z') {
                        cipher += (char) (ch - (26 - shift)); //когато извърти азбуката

                    } else cipher += c;
                }
            } else if (Character.isUpperCase(ch)) { //главни букви, имат различни ASCII стойности
                char c = (char) (ch + shift);
                if (c > 'Z') {
                    cipher += (char) (ch - (26 - shift));
                }
            } else {
                cipher += ch;

            }
        }
        return cipher;  //връща
    }
}


