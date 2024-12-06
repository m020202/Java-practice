package factory_method;

public class GameServer {
    private GameServerFactory gsf;
    public GameServer() {
        System.out.println("GameServer - 정상 연결 완료");
    }
    public GameServer(GameServerFactory gsf) {
        System.out.println("GameServer - 정상 연결 완료");
        this.gsf = gsf;
    }

    void execute(String game) {
        Games games = gsf.chooseGame(game);
        if (games != null) {
            games.bootingGame();
            games.runGame();
        }
    }
}
