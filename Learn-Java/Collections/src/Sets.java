import java.util.*;

public class Sets {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//
//        set.add("Харьков");
//        set.add("Киев");
//        set.add("Львов");
//        set.add("Кременчуг");
//        set.add("Харьков");
//
//        System.out.println(set);

//        Set<String> set = new LinkedHashSet<>();
//
//        set.add("Бета");
//        set.add("Aльфa");
//        set.add("Этa");
//        set.add("Гaммa");
//        set.add("Эпсилон");
//        set.add("Oмeгa");
//
//        System.out.println(set);

        Set<String> set = Set.of("1A", "45A", "5A","-4A" ,"0A");
        System.out.println(set);
        Set<String> treeSet = new TreeSet<>(set);
        System.out.println(treeSet);
        SortedSet<String> sortedSet = new TreeSet<>(set);
        System.out.println(sortedSet);


    }
}
