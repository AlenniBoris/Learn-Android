import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Kata{
    public static double find_average(int[] array){
        return Arrays.stream(array).asDoubleStream().average().getAsDouble();
    }
    public static String countingSheep(int num) {
        if (num > 0){
            StringBuilder str = new StringBuilder();
            for (int i = 1; i <= num; ++i){
                str.append(i + " sheep...");
            }
            return str.toString();
        } else return "";
    }

    public static int makeNegative(final int x) {
        return x < 0 ? x : -x;
    }

    public static int rentalCarCost(int d) {
        if (d >= 7){
            return 40*d - 50;
        }
        else if (3 <= d){
            return 40*d - 20;
        }
        else
            return 40*d;
    }

    public static int[] countPositivesSumNegatives(int[] input)
    {
        if (input == null ||input.length < 1){
            return new int[]{};
        }
        int[] positive = Arrays.stream(input).filter(i -> i > 0).toArray();
        int negative = Arrays.stream(input).filter(i -> i < 0).sum();
        return new int[]{positive.length, negative}; //return an array with count of positives and sum of negatives
    }

    public static boolean getXO (String str) {
        return str.toLowerCase().chars().filter(i -> i == 'x').count() == str.toLowerCase().chars().filter(i -> i == 'o').count();
    }

    public static String printerError(String s) {
        return "" + s.chars().filter(i -> i > 'm').count() + "/" + s.length();
    }

    public static String accum(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.toCharArray().length; i++) {
            str.append(Character.toUpperCase(s.toCharArray()[i]));
            for (int j = 0; j < i; j++) {
                str.append(Character.toLowerCase(s.toCharArray()[i]));
            }
            if (i < s.toCharArray().length){
                str.append("-");
            }else break;
        }
        return str.toString();
    }

    public static String fakeBin(String numberString) {
        char[] arr = numberString.toCharArray();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (Character.getNumericValue(arr[i]) < 5)
                str.append("0");
            else str.append("1");
        }
        return str.toString();
    }

    public static int squareSum(int[] n){
        return IntStream.of(n).map(i -> (int) Math.pow(i,2)).sum();
    }

    public static String binaryAddition(int a, int b){
        return Integer.toBinaryString(a + b);
    }

    public int GetSum(int a, int b)
    {
        return a < b ? IntStream.rangeClosed(a,b).sum() : IntStream.rangeClosed(b,a).sum();
    }

    public static int countPassengers(ArrayList<int[]> stops) {
        return stops.stream().mapToInt(i -> i[0]).sum() > stops.stream().mapToInt(i -> i[1]).sum() ? stops.stream().mapToInt(i -> i[0]).sum() - stops.stream().mapToInt(i -> i[1]).sum() : null;
    }

    public static String findNeedle(Object[] haystack) {
        return Arrays.asList(haystack).contains("needle") ? "found the needle at position " + Arrays.stream(haystack).toList().indexOf("needle") : "";
    }

    public static String solution(String str) {
        // Your code here...
        return new StringBuilder(str).reverse().toString();
    }

    public static long findNextSquare(long sq) {
        return Math.sqrt(sq) % 1 == 0 ? (long) Math.pow(Math.sqrt(sq) + 1, 2) : -1;
    }

    public static boolean setAlarm(boolean employed, boolean vacation) {
        return employed && !vacation;
    }

    public static String highAndLow(String numbers) {
        // Code here or
        return Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).max().getAsInt() + " " + Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).min().getAsInt();
    }

    static int find(int[] integers){
        return Arrays.stream(integers).filter(i -> i % 2 == 0).count() == 1 ? Arrays.stream(integers).filter(i -> i % 2 == 0).sum() : Arrays.stream(integers).filter(i -> i % 2 != 0).sum();
    }

    public static boolean validParentheses(String parens)
    {
        Stack<String> open = new Stack<>();
        String[] arr = parens.split("");

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].equals("(")) {
                open.push(arr[i]);
            }
            if (arr[i+1].equals(")")){
                open.pop();
            }
        }

        return open.size() == 0;
    }

    public static String pigIt(String str) {
        return Arrays.stream(str.split(" ")).map(i -> Character.isLetter(i.charAt(0)) ? i.substring(1) + i.charAt(0) + "ay" : i).toList().stream().collect(Collectors.joining(" "));
    }
}