import java.util.Scanner;

public class Version2Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your encrypted message");
        String enMessage = input.nextLine();
        System.out.println();


        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                'U', 'V', 'W', 'X', 'Y', 'Z'};
        alphabet[0] = 'A' - 3;
        alphabet[1] = 'B' -3;
        alphabet[2] = 'C' - 3;
        alphabet[3] = 'D' - 3;
        alphabet[4] = 'E' - 3;
        alphabet[5] = 'F' - 3;
        alphabet[6] = 'G' - 3;
        alphabet[7] = 'H' - 3;
        alphabet[8] = 'I' - 3;
        alphabet[9] = 'J' - 3;
        alphabet[10] = 'K' - 3;
        alphabet[11] = 'L' - 3;
        alphabet[12] = 'M' - 3;
        alphabet[13] = 'N' - 3;
        alphabet[14] = 'O' - 3;
        alphabet[15] = 'P' - 3;
        alphabet[16] = 'Q' - 3;
        alphabet[17] = 'R' - 3;
        alphabet[18] = 'S' - 3;
        alphabet[19] = 'T' - 3;
        alphabet[20] = 'U' - 3;
        alphabet[21] = 'V' - 3;
        alphabet[22] = 'W' - 3;
        alphabet[23] = 'X' - 3;
        alphabet[24] = 'Y' - 3;
        alphabet[25] = 'Z' - 3;

        if (('A' - 3) < 'A') {
            alphabet[0] = ('A' - 3) + 26;
        }
        if (('B' - 3) < 'A') {
            alphabet[1] = ('B' - 3) + 26;
        }
        if (('C' - 3) < 'A') {
            alphabet[2] = ('C' - 3) + 26;
        }
        for (char i : alphabet) {
            System.out.println(i); }




        String cipher = "";


    }

}

