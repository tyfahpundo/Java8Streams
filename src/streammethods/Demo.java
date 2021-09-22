package streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//distinct()  limit()
//count()
public class Demo {
    public static void main(String[] args) {
        List<String> vehiclesList = Arrays.asList("bus","car","bicycle","bus","car","car","bike");

//        List<String> distinctVehicles = vehiclesList.stream().distinct().collect(Collectors.toList());
//        System.out.println(distinctVehicles);

        vehiclesList.stream().distinct().forEach(value -> System.out.println(value));
    }
}
