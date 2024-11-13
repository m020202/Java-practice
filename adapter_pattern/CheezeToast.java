package adapter_pattern;

public class CheezeToast implements Toast {
    private Toast toast;

    public CheezeToast(Toast toast) {
        this.toast = toast;
    }

    @Override
    public void addTopping(String topping) {
        topping += "cheeze";
        toast.addTopping(topping);
    }
}
