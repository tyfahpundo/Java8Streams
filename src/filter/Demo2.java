package filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tafadzwa","John","Sansas","Samsung","Alex","Merlin");
        List<String> longnames = new ArrayList<>();
        List<String> filtered = new ArrayList<>();

//        longnames = names.stream().filter(str -> str.length()> 6 && str.length()< 8).collect(Collectors.toList());
//        System.out.println(longnames);
        names.stream().filter(str -> str.length()> 6 && str.length()< 8).forEach(str -> System.out.println(str));


    }
}
