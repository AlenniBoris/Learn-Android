import java.time.*;

public class Strings {
    public static void main(String[] args) {
//        showSum(2,3);
//        showSum(3,5);

//        String str1 = "oracle";
//        String str2 = new String(str1);

//        String str1 = "           " + null + "         8" + 2 + 11;
//        str1 = str1.strip();
//        System.out.println(str1);

//        String s1 = "java";
//        String s2 = new String(s1);
//        System.out.println(s1==s2);
//        s2 = s2.intern();
//        System.out.println(s1 == s2);

//        StringJoiner joiner = new StringJoiner(":", "<<", ">>");
//        String result = joiner.add("blanc").add("rouge").add("blanc").toString();
//        System.out.println(result);

//        String regex = "\\w{6,}@\\w+\\.\\p{Lower}{2,4}";
//        String input = "адреса эл.почты:blinov@gmail.com, romanchik@bsu.by!";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(input);
//        while (matcher.find()) {
//            System.out.println("e-mail: " + matcher.group());
//        }
//        String regex1 = "\\w+@\\w+\\.\\w{2,4}";
//        Pattern pattern1 = Pattern.compile(regex1);
//        Matcher matcher1 = pattern1.matcher(input);
//        while(matcher1.find()){
//            System.out.println("e-mail: " + matcher1.group());
//        }


//        Date date = new Date();
//        Locale[] locales = DateFormat.getAvailableLocales();
//        for (Locale locale : locales){
//            DateFormat format = DateFormat.getDateInstance(DateFormat.FULL, locale);
//            System.out.println(locale.toString() + "--->" + format.format(date));
//        }

//        Instant time = Instant.now();
//        while(true){
//            System.out.println(time);
//            time = Instant.now();
//        }

//        Clock clock = Clock.systemDefaultZone();
//        System.out.println(clock.instant());
//        System.out.println(clock.millis());
//        System.out.println(clock.getZone());

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
    }

    private static void showSum(Integer n1, Integer n2){
        System.out.println(n1 + n2);
    }
}
