package stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamEx2 {
    public static void main(String[] args) {
        //filter
        // 1~5까지 있는 int[]를 생성 후, 3보다 크거나 같은 값들만 리턴함.
//        int[] numbers = new int[]{1, 2, 3, 4, 5};
//        Arrays.stream(numbers).filter(i -> i >= 3).forEach((i) -> System.out.println(i));
//        Arrays.stream(numbers).map(operand -> operand * 10).forEach(i -> System.out.println(i));

        String[] fruit = new String[]{"apple","pineapple","plum"};

        String result = String.join(",",fruit);
        System.out.println(result);

        System.out.println(Arrays.stream(fruit).collect(Collectors.joining(",")));
        Arrays.stream(fruit).map(String::toUpperCase).forEach(i-> System.out.println(i));
        Arrays.stream(fruit).map(String::toUpperCase).filter(i -> i.contains("A")).forEach(i-> System.out.println(i));
    }
}
