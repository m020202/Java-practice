import functional_interface.MyFunction;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // 클래스 상속 받아서 구현
        MyFunction myFunction = new MyFunction();

        String result = myFunction.apply(5);
        System.out.println(result);

        // 람다식 활용해서 구현
        Function<Integer, String> byLambda = (Integer i) -> "Number: " + i;

        String result2 = byLambda.apply(5);
        System.out.println(result2);

        // 익명 클래스 활용해서 구현
        Function<Integer, String> byAnonymous = new Function<Integer, String>() {
            @Override
            public String apply(Integer i) {
                return "Number: " + i;
            }
        };

        String result3 = byAnonymous.apply(5);
        System.out.println(result3);
    }
}
