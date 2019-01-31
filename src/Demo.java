public class Demo {
    //TODO formula  encrypt n + 3 - t = q decrypt n - 3 q=t or the other way around
    //TODO първо си правя шифровката, за да го дешифровам, а и да изпробвам различни варианти
    public static void main(String[] args) {
        String message = "text please work, why aren't you working?";
        String encryption = encryptCeaser(message, 3);
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
                if (Character.isLowerCase(ch)) {

                } else if (Character.isLowerCase(ch)) {
                    char c = (char) (ch + shift);
                    if (c > 'z') {
                        cipher += (char) (ch - (26 - shift));

                    } else cipher += c;
                }
            } else if (Character.isUpperCase(ch)) {
                char c = (char) (ch + shift);
                if (c > 'Z') {
                    cipher += (char) (ch - (26 - shift));
                }
            } else {
                cipher += ch;

            }
        }
        return cipher;
    }
}


