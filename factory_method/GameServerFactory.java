package factory_method;

public class GameServerFactory {
    private SuperMario superMario;
    private Tetris tetris;

    public GameServerFactory() {
        this.superMario = new SuperMario();
        this.tetris = new Tetris();
    }

    Games chooseGame(String game) {
        if (game.equals("supermario")) {
            return superMario;
        } else if (game.equals("tetris")) {
            return tetris;
        } else {
            System.out.println("지원하지 않는 게임입니다.");
            return null;
        }
    }
}
