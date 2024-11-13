package strategy_pattern;

public class Pairi implements Pokemon {
    @Override
    public void introduce() {
        name();
        attack();
        passive();
    }

    @Override
    public void name() {
        System.out.println("이름: 파이리, 속성: 불");
    }

    @Override
    public void attack() {

    }

    @Override
    public void passive() {

    }
}
