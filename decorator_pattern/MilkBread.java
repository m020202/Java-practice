package decorator_pattern;

public class MilkBread implements Toast {
    @Override
    public String getName() {
        return "우유식빵 토스트";
    }

    @Override
    public Integer getKcal() {
        return 350;
    }
}
