package factory_method;

public class KRGameServer extends GameServerV2 {
    private KRTetris krTetris;
    private KRSuperMario krSuperMario;

    public KRGameServer() {
        this.krTetris = new KRTetris();
        this.krSuperMario = new KRSuperMario();
    }

    @Override
    protected Games chooseGame(String game) {
        if (game.equals("supermario")) {
            return this.krSuperMario;
        } else if (game.equals("tetris")) {
            return this.krTetris;
        } else {
            System.out.println("지원하지 않는 게임입니다.");
            return null;
        }
    }
}
