package filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
    public static void main(String[] args) {
        List<Integer> numlist = Arrays.asList(10,15,20,25,30);
        List<Integer> evenNumList = new ArrayList<>();

        evenNumList = numlist.stream()
                .filter(n ->n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumList);

    }
}
