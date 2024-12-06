package decorator_pattern;

public class Cheeze extends ToppingDecorator {

    public Cheeze(Toast toast) {
        super(toast);
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
