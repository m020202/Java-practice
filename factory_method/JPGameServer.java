package factory_method;

public class JPGameServer extends GameServerV2 {
    private JPTetris tetris;
    private JPSuperMario supermario;

    public JPGameServer() {
        this.tetris = new JPTetris();
        this.supermario = new JPSuperMario();
    }

    @Override
    protected Games chooseGame(String game) {
        if (game.equals("supermario")) {
            return supermario;
        } else if (game.equals("tetris")) {
            return tetris;
        } else {
            System.out.println("없는 게임.");
            return null;
        }
    }
}
