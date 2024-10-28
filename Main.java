import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> toInt = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        };

        Integer number = toInt.apply("100");
        System.out.println("number: " + number);

    }
}
