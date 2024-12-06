package strategy_pattern;

public class App {
    public static void main(String[] args) {
        Pokemon pikachu = new Pikachu();
        pikachu.introduce();

        System.out.println();

        Purin purin = new Purin();
        purin.introduce();
    }
}
