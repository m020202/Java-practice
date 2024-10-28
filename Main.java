import functional_interface.MyFunction;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        MyFunction myFunction = new MyFunction();

        String result = myFunction.apply(5);
        System.out.println(result);

        Function<Integer, String> byLambda = (Integer i) -> "Number: " + i;

        String result2 = byLambda.apply(5);
        System.out.println(result2);

    }
}
