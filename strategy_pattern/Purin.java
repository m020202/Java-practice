package strategy_pattern;

public class Purin implements Pokemon {
    @Override
    public void introduce() {
        name();
        attack();
        passive();
    }

    @Override
    public void name() {
        System.out.println("이름: 푸린, 속성: 노멀");
    }

    @Override
    public void attack() {

    }

    @Override
    public void passive() {

    }
}
