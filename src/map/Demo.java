package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("bus","train","car","bike","plane");
        List<String> toUpper = new ArrayList<>();

        toUpper = names.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
        System.out.println(toUpper);
    }
}
