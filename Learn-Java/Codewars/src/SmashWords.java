import java.util.Arrays;

public class SmashWords {
    public static String smash(String... words) {
        StringBuilder str = new StringBuilder();
        if (words.length != 0){
            for(String string : words){
                str.append(string + " ");
            }
            str.deleteCharAt(str.lastIndexOf(" "));
            return str.toString();
        } else return null;
    }
}