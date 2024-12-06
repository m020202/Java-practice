package factory_method;

public class App {
    public static void main(String[] args) {
        GameServer gameServer = new GameServer(new GameServerFactory());
        gameServer.execute("supermario");

        System.out.println();

        GameServerV2 gameServerV2 = new KRGameServer();
        gameServerV2.execute("supermario");

    }
}
