package adapter_pattern;

public class App {
    public static void main(String[] args) {
        Toast toast = new DefaultToast();

        toast = new HamToast(toast);
        toast = new CheezeToast(toast);

        toast.addTopping("");
    }
}
