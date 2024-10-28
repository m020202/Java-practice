package functional_interface;

import java.util.function.Function;

public class MyFunction implements Function<Integer, String> {
    @Override
    public String apply(Integer i) {
        return "Number: " + i;
    }
}
