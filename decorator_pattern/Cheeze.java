package decorator_pattern;

public class Cheeze implements Toast {
    private Toast toast;

    public Cheeze(Toast toast) {
        this.toast = toast;
    }

    @Override
    public String getName() {
        return "치즈 " + toast.getName();
    }

    @Override
    public Integer getKcal() {
        return 50 + toast.getKcal();
    }
}
