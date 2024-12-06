package decorator_pattern;

public class NormalBread implements Toast {
    @Override
    public String getName() {
        return "식빵 토스트";
    }

    @Override
    public Integer getKcal() {
        return 300;
    }
}
