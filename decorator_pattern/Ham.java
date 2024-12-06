package decorator_pattern;

public class Ham implements Toast {
    Toast toast;
    public Ham(Toast toast) {
        this.toast = toast;
    }

    @Override
    public String getName() {
        return "햄 " + toast.getName();
    }

    @Override
    public Integer getKcal() {
        return 200 + toast.getKcal();
    }
}
