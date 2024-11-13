package adapter_pattern;

public class DefaultToast implements Toast {

    @Override
    public void addTopping(String topping) {
        System.out.println(topping + " toast");
    }
}
