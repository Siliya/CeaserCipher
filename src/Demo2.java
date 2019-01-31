import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your encrypted message");
        String enMessage = input.nextLine();
        System.out.println();

    }


    public static String CeaserDecryption (String text, int shift){
        char[] alphabet =  {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                'U', 'V', 'W', 'X', 'Y', 'Z'};
        for (char i:alphabet){
            System.out.println(i);
        }
        String cipher = "";
        return cipher;

    }

}
