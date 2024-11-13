package strategy_pattern;

public class Pikachu implements Pokemon {
    private Attack attack;
    private Passive passive;

    public Pikachu() {
        this.attack = new MillionVolt();
        this.passive = new Defensibility();
    }

    @Override
    public void introduce() {
        name();
        attack.motion();
        passive.detail();
    }

    @Override
    public void name() {
        System.out.println("이름: 피카츄, 속성: 번개");
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
