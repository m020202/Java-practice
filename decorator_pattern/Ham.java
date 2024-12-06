package decorator_pattern;

public class Ham extends ToppingDecorator {
    public Ham(Toast toast) {
        super(toast);

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
