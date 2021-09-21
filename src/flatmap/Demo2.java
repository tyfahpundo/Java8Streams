package flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {

    public static void main(String[] args) {
        List<String> teamA = Arrays.asList("Tafadzwa","Alex","Lynn");
        List<String> teamB = Arrays.asList("Monalisa","Rodney","Keith");
        List<String> teamC = Arrays.asList("Rivaldo","Stizzo","Shelton");

        List<List<String>> players = new ArrayList<>();
        players.add(teamA);
        players.add(teamB);
        players.add(teamC);

        List<String> names = players.stream()
                .flatMap(n -> n.stream())
                .collect(Collectors.toList());
        System.out.println(names);
    }
}
