package factory_method;

public abstract class GameServerV2 {
    public GameServerV2() {
        System.out.println("GameServer - 정상 연결 완료");
    }

    public void execute(String game) {
        Games games = chooseGame(game);
        if (games != null) {
            games.bootingGame();
            games.runGame();
        }
    }

    protected abstract Games chooseGame(String game);
}
