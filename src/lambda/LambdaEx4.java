package lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LambdaEx4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        //list의 모든 요소 출력
        list.forEach(i -> System.out.print(i + " "));
        System.out.println("\n");

        //list에서 2 또는 3의 배수를 제거함
        list.removeIf(x -> x % 2 == 0 || x % 3 == 0);
        list.forEach(x -> System.out.print(x + " "));
        System.out.println();

        //list의 각 요소에 10을 곱함
        list.replaceAll(x -> x * 10);
        list.forEach(i -> System.out.print(i + " "));
        System.out.println();

        Map<String, String> map = new HashMap();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");
        map.put("5", "5");
        map.put("6", "6");

        //map의 모든 요소를 k,v 형태로 출력함
        map.forEach((k, v) -> System.out.print(("(" + k + ":" + v + ") ")));
    }
}
