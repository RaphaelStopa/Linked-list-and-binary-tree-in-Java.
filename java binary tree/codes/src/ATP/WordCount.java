package ATP;

import java.nio.file.Files;
import java.nio.file.Path;

public class WordCount {

    //Converts text to be readable and counted in the future
    public static String ConvertingWords(Path path){
        String reading;
        try{
            reading = new String(Files.readAllBytes(path));
            // used a replace to have a future search pattern
            return reading.replace(" ", "\r");

        } catch (Exception error) {
            System.out.println("it was not");
        }
        return "no return";
    }

    //Método que conta quantas vezes a word aparece.
    public static int WordsAccount(String word, String text) {

        int amount = 0;

        String [] arrayString = text.split("\\r\\n|\\n|\\r");

        for(int i=0;i<arrayString.length;i++){

            if(arrayString[i].equalsIgnoreCase(word)){
                amount++;
            }
        }
        return amount;
    }
}
