import java.util.*;

public class Converter {

    Random rand = new Random();

    /**
     *
     * @param phrase
     * @return "meme" Text
     */
    public String makeMeme(String phrase){
        String output = "";
        for (int index = 0; index < phrase.length(); index++){
            int r = rand.nextInt(2);
            if(r == 0){
                output += phrase.substring(index, index + 1).toUpperCase();
            }
            if (r == 1){
                output += phrase.substring(index, index + 1).toLowerCase();
            }
        }
        return output;
    }

}
