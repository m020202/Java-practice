package factory_method;

public class Games {
    protected String title;
    protected String version;

    public void bootingGame() {
        System.out.println("게임명: " + title);
        System.out.println("게임 버전: " + version);
    }

    public void runGame() {
        System.out.println(title + "을 시작합니다.");
    }
}
