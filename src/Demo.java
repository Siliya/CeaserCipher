public class Demo {
    //TODO formula  encrypt n + 3 - t = q decrypt n - 3 q=t or the other way around
    //TODO първо си правя шифровката, за да го дешифровам, а и да изпробвам различни варианти
    public static void main(String[] args) {
    //    char [] alphabetEn = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'g', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

       // alphabetEn [0] = 1;
       // alphabetEn [1] = 2;

    }

    //С условни конструкции и цикли
    public static String encryptCeaser (String text, int shift) {
        if (shift > 26) {

        } else if (shift < 0) {
            shift = (shift % 26) + 26;
        }
        String cipher = "";
        int length = text.length();
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isLowerCase(ch)) {

                }
                else if (Character.isLowerCase(ch)) {
                char c = (char)(ch+shift);


                    //TODO тук

                }
            } else {
                cipher += ch;

            }
        }
            return cipher;


        }

    }


