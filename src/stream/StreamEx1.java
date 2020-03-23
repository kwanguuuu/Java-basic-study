package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        String[] arr = new String[]{"A","B","C"};
        Arrays.stream(arr,1,2).forEach(s -> System.out.println(s));

        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(10,20,30,40,50);
        list1.stream().parallel().forEach(a-> System.out.println(a));
        list2.stream().parallel().forEach(a-> System.out.println(a));

        List<Integer> list3 = Stream.<Integer>builder().add(100).add(500).add(100).build().collect(Collectors.toList());
        list3.forEach(s-> System.out.println(s));

    }
}
