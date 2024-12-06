package decorator_pattern;

public class WheatBread implements Toast {
    @Override
    public String getName() {
        return "호밀 식빵 토스트";
    }

    @Override
    public Integer getKcal() {
        return 250;
    }
}
