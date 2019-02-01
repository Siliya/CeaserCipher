public class DecryptionMostFrequant
//TODO ТОВА ТРЯБВА ДА Е ОКОНЧАТЕЛНАТА ВЕРСИЯ С e t h most frequent
{
    public static void main(String[] args) {
        String enMessage = "cneg bs gur wbhearl vf gur raq";
        char [] mostOccuring = enMessage.trim().toCharArray();
        char mostFreqent;
        int temp =0;
        int bestNumber =0;


       // char [] mostOccuring = {'e', 't', 'h'};

        enMessage = enMessage.toLowerCase();
        for (int i = 0; i < mostOccuring.length; i++) {
            System.out.println(i);


        }

    } 
    public static void MostFrequent (char [] mostFrequent, String enMessage){
        enMessage = enMessage.trim().toLowerCase();
        char [] mostFreqeunt = enMessage.toCharArray();
        for (int i = 0; i <mostFreqeunt.length ; i++) {
            System.out.println(i);

        }




    }

}
