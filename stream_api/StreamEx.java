package stream_api;

import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {
    public void transition(List<Integer> arr) {
        List<Integer> result = arr.stream().map(
                i -> i * 2
        ).toList();

        for (Integer i : result) {
            System.out.println(i);
        }
    }
}
