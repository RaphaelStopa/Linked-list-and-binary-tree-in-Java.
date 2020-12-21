package ATP;

import java.io.File;
import java.nio.file.Paths;
import static ATP.WordCount.WordsAccount;
import static ATP.WordCount.ConvertingWords;

public class linked_list {

    private ListArchives listArchives;

    public  void  insert(String filename, int frequency){
        listArchives = insert(listArchives, frequency, filename);
    }


    private ListArchives insert(ListArchives listArchives, int frequency, String filename){
        if(listArchives == null) {
            return new ListArchives(filename, frequency);
        } else {
            if(listArchives.getFrequency() < frequency) {
                ListArchives newListArchives = new ListArchives(filename, frequency);
                newListArchives.setNext(listArchives);
                return newListArchives;
            } else {
                listArchives.setNext(insert(listArchives.getNext(), frequency, filename));
            }
        }
        return listArchives;
    }

    // Method of cascading the list files.
    public static void insertList (linked_list listaencadeada, File directory, File[] files, String word){
        try {

            for(int i = 0; i < files.length; i++){

                // Limiter to get only .txt
                if(Paths.get(String.valueOf(files[i])).getFileName().toString().endsWith(".txt") == true) {

                    String slanted_words = ConvertingWords(Paths.get(String.valueOf(files[i])));

                    int incidence = WordsAccount(word, slanted_words);

                    ListArchives listing = new ListArchives(files[i].getName().replace(".txt", ""), incidence);

                    listaencadeada.insert(listing.getFilename(), listing.getFrequency());
                }
            }
        }catch (Exception e) {
            System.out.println("Directory not valid");
        }
    }


    public  static int seek_one(String directory, String Filename, String search_word){
        String slanted_words = ConvertingWords(Paths.get(directory + Filename));
        int incidence = WordsAccount(search_word, slanted_words);
        return incidence;
    }

    public void Print_out() {
        Print_out(listArchives);
    }

    private void Print_out(ListArchives listArchives) {
        if(listArchives != null) {
            System.out.println(listArchives.getFilename() + " => " + listArchives.getFrequency() );
            Print_out(listArchives.getNext());
        }
    }


    public ListArchives getListArchives() {
        return listArchives;
    }

    public void setListArchives(ListArchives listArchives) {
        this.listArchives = listArchives;
    }



    @Override
    public String toString() {
        return listArchives + "\n" ;
    }
}
