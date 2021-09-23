package streammethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,2,1,3,7,5,9);

        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);//ascending order

        List<Integer> reverseSorted = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSorted);//descending order

        //Strings
        List<String> nameList = Arrays.asList("Tafadzwa","Rodney","Lionnel","Shelton","Keith","Rivaldo");
        List<String> sortedNames = nameList.stream().sorted().collect(Collectors.toList());//ascending order
        System.out.println(sortedNames);

        List<String> descendingNames = nameList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());//descending
        System.out.println(descendingNames);
    }


}
