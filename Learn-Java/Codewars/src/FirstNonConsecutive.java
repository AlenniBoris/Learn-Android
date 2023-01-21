import java.util.Arrays;
import java.util.Comparator;

import static java.lang.Math.abs;
import static java.lang.Math.nextUp;

public class FirstNonConsecutive {
    static Integer find(final int[] array) {
//        int res = 0;
//        boolean found = false;
//        if (array.length <= 1)
//            return null;
//        for (int i = 0; i < array.length - 2; i++) {
//            if (array[i + 1] - array[i] > 1){
//                res = array[i + 1];
//                found = true;
//                break;
//            }
//        }
//        return found ? res : null;
        int res = 0;
        boolean found = false;

        if (array.length <= 1){
            return null;
        }
        else{
            for (int i = 0; i < array.length - 2; i++) {
                if (Math.abs(array[i] - array[i + 1]) != 1){
                    res = array[ i + 1 ];
                    break;
                }
            }
        }

        return res;
    }
}
