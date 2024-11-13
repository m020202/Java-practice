package strategy_pattern;

public class App {
    public static void main(String[] args) {
        Pokemon pikachu = new Pikachu(new MillionVolt(), new Defensibility());
        pikachu.introduce();

    }
}
