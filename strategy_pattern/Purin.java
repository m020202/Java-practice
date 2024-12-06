package strategy_pattern;

public class Purin implements Pokemon {
    private Attack attack;
    private Passive passive;

    public Purin() {
        attack = new Flame();
        passive = new Defensibility();
    }

    @Override
    public void introduce() {
        name();
        attack.motion();
        passive.detail();
    }

    @Override
    public void name() {
        System.out.println("이름: 푸린, 속성: 노멀");
    }

    @Override
    public void attack(Attack attack) {
        this.attack = attack;
    }

    @Override
    public void passive(Passive passive) {
        this.passive = passive;
    }
}
