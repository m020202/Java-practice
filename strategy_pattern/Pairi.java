package strategy_pattern;

public class Pairi implements Pokemon {
    private Attack attack;
    private Passive passive;

    public Pairi() {
        attack = new MillionVolt();
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
        System.out.println("이름: 파이리, 속성: 불");
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
