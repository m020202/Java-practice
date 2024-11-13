package strategy_pattern;

public interface Pokemon {
    void introduce();
    void name();
    void attack(Attack attack);
    void passive(Passive passive);
}
