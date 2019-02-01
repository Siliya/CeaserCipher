public class DecryptionMostFrequant
//TODO ТОВА ТРЯБВА ДА Е ОКОНЧАТЕЛНАТА ВЕРСИЯ С e t h most frequent
{
    public static void main(String[] args) {
        String enMessage = "cneg bs gur wbhearl vf gur raq";
        enMessage = enMessage.toLowerCase();
        char[] messageArray = enMessage.trim().toCharArray();
        char mostFrequent = ' ';
        int temp = 0;
        int bestNumber = 0;
        for (int i = 0; i < messageArray.length; i++) {
            if (messageArray[i] != 'e' && messageArray[i] != 't' && messageArray[i] != 'h' && messageArray[i] != 'e') {
                temp++;
                if (temp > bestNumber) {
                    bestNumber = temp;
                    mostFrequent = messageArray[i];
                    temp = 0;
                }
            }
        }
        ShiftAndPrint(messageArray, mostFrequent);

    }

    public static void ShiftAndPrint(char[] allLetters, char letter) {
        for (int i = 0; i < allLetters.length; i++) {
            System.out.println(i);

        }

    }

}




