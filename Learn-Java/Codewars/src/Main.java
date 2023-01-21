import javax.swing.text.StyleContext;

public class Main {
    public static void main(String[] args) {
//        System.out.println(SmashWords.smash());

        Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true };

        System.out.println(Counter.countSheeps(array1));
    }
}
