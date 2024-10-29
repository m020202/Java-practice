import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = IntStream.range(1, 11).boxed().collect(Collectors.toList());
        List<Integer> newArr = arr.stream().map(
                i -> i * 2
        ).collect(Collectors.toList());

        arr.stream().forEach(num -> System.out.print(num + " "));
        System.out.println();
        newArr.stream().forEach(num -> System.out.print(num + " "));

        System.out.println();
        List<String> collect = arr.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i + " is even number")
                .collect(Collectors.toList());
        collect.stream().forEach(str -> System.out.println(str));
    }
}
