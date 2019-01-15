public class Demo {
    //TODO formula  encrypt n + 3 - t = q decrypt n - 3 q=t or the other way around
    //TODO първо си правя шифровката, за да го дешифровам, а и да изпробвам различни варианти
    public static void main(String[] args) {
        char [] alphabetEn = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'g', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

       // alphabetEn [0] = 1;
       // alphabetEn [1] = 2;

    }

    //С условни конструкции и цикли
    public static String encryptCeaser (String text, int encryption){
        if (encryption>26){

        }
        else if (encryption<0){
            encryption =(encryption%26)+26;
            String cipher = "";
            int lenght = text.length();
            for (int i = 0; i < lenght; i++) {
                char ch = text.charAt(i);
                //TODO продължи от тук

            }
            return cipher;


        }

    }
}
