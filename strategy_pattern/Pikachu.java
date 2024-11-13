package strategy_pattern;

public class Pikachu implements Pokemon {
    private Attack attack;
    private Passive passive;

    public Pikachu(Attack attack, Passive passive) {
        this.attack = attack;
        this.passive = passive;
    }

    @Override
    public void introduce() {
        name();
        attack();
        passive();
    }

    @Override
    public void name() {
        System.out.println("이름: 피카츄, 속성: 번개");
    }

    @Override
    public void attack() {
        attack.motion();
    }

    @Override
    public void passive() {
        passive.detail();
    }
}
