package flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        //map()
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        List<Integer> list1 = list.stream()
                .map(n -> n+ 10)
                .collect(Collectors.toList());
        System.out.println(list1);

        //flatmap()
        List<Integer> lst1 = Arrays.asList(1,2);
        List<Integer> lst2 = Arrays.asList(3,4);
        List<Integer> lst3 = Arrays.asList(5,6);

        List<List<Integer>> finallist = Arrays.asList(lst1,lst2,lst3);

        List<Integer>result = finallist.stream()
                .flatMap(x -> x.stream())
                .map(x -> x + 5)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
