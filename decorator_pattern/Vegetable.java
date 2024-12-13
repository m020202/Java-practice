package decorator_pattern;

public class Vegetable extends ToppingDecorator {
    public Vegetable(Toast toast) {
        super(toast);
    }

    @Override
    public String getName() {
        return "야채" + super.getName();
    }

    @Override
    public Integer getKcal() {
        return 10 + super.getKcal();
    }
}
