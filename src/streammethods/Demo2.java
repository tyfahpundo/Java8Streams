package streammethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Demo2 {
    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //count()
        long evenNumbers = numberList.stream()
                .filter(num -> num%2 ==0)
                .count();
        System.out.println(evenNumbers);
        //min()
        Optional<Integer> min = numberList.stream()
                .min(Comparator.naturalOrder());
        System.out.println(min.get());
    }
}
