package decorator_pattern;

public class ToppingDecorator implements Toast {
    protected Toast toast;

    public ToppingDecorator(Toast toast) {
        this.toast = toast;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Integer getKcal() {
        return null;
    }
}
