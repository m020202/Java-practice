package adapter_pattern;

public class HamToast implements Toast {
    private Toast toast;

    public HamToast(Toast toast) {
        this.toast = toast;
    }

    @Override
    public void addTopping(String topping) {
        topping += "Ham";
        toast.addTopping(topping);
    }
}
