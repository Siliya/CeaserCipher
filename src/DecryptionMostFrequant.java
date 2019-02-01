public class DecryptionMostFrequant {
    //TODO ТОВА ТРЯБВА ДА Е ОКОНЧАТЕЛНАТА ВЕРСИЯ С e t h most frequent

    public static void main(String[] args) {
        String enMessage = "cneg bs gur wbhearl vf gur raq";
        enMessage = enMessage.toLowerCase(); //връща всички char към малки букви
        char[] messageArray = enMessage.trim().toCharArray(); //реже пространствата и разделя масива на  char-ове
        char mostFrequent = ' '; //три променливи, които използвам, едната временна, за да изчисля и завъртя стойностите им по-долу
        int temp = 0;
        int bestNumber = 0;
        for (int i = 0; i < messageArray.length; i++) { //обхождам масива
            if (messageArray[i] != 'e' && messageArray[i] != 't' && messageArray[i] != 'h' && messageArray[i] != 'e') {
                temp++; //проверявам за най-често срещаните букви и му задавам какво да прави, ако не са e t h
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
            System.out.println(i);  //обхождам масива, за да го принтирам

        }

    }

}
