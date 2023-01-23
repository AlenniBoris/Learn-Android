import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Demo {
    public static void main(String[] args) {
//        ArrayList<String> cities = new ArrayList<String>();
//        Collections.addAll(cities, "Париж", "Лондон", "Мадрид");
//        cities.stream() // получаем поток
//                .filter(s->s.length()==6) // применяем фильтрацию по длине строки
//                .forEach(System.out::println); // выводим отфильтрованные строки на консоль

//        Stream<BigInteger> iterate = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.TEN));

//        String[] cities = {"Париж", "Лондон", "Мадрид"};
//        Stream<String> citiesStream2 =Stream.of(cities);
//
//        IntStream intStream = IntStream.of(1,2,4,5,7);
//        intStream.forEach(i->System.out.println(i));
//
//        LongStream longStream = LongStream.of(100,250,400,5843787,237);
//        longStream.forEach(l->System.out.println(l));
//
//        DoubleStream doubleStream = DoubleStream.of(3.4, 6.7, 9.5, 8.2345, 121);
//        doubleStream.forEach(d->System.out.println(d));


//        List<String> words = List.of("boris", "anton", "alex", "pasha", "kirill", "masha");
//        Stream<Stream<String>> result = words.stream().map(Demo::letters);
//        result.forEach(stringStream -> System.out.println(stringStream.collect(Collectors.joining())));
//        Stream<String> result1 = words.stream().flatMap(Demo::letters);
//        result1.forEach(S -> System.out.print(S + " "));

//        List<String> phones = List.of("iPhone X", "Nokia 9", "Huawei Nexus 6P",
//                "Samsung Galaxy S8", "LG G6", "Xiaomi MI6",
//                "ASUS Zenfone 3", "Sony Xperia Z5", "Meizu Pro 6",
//                "Pixel 2");
//        phones.stream()
//                .filter(p->p.length()<12)
//                .sorted() // сортировка по возрастанию
//                .forEach(s->System.out.println(s));
//        System.out.println();
//        phones.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
//        System.out.println();
//        phones.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);

        Object[] powers = Stream.iterate(1.0, it -> it * 2).peek(e -> System.out.println("Fetching " + e)).
                limit(20).toArray();
    }

    public static Stream<String> letters(String word){
        List<String> result = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            result.add(word.substring(i, i+1));
        }
        return result.stream();
    }
}
