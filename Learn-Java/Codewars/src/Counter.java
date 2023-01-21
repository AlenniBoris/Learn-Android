import javax.lang.model.type.NullType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Counter {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int res = 0;
        for(Boolean el : arrayOfSheeps){
            if (el != null && el){
                ++res;
            }
        }
        return res;
    }
}
