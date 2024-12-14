package adapter_pattern;

public class AirPods {
    public AirPods() {
        System.out.println("\n새로 구입한 Apple AirPods 입니다.");
    }

    public void playing() {
        System.out.println("Apple Airpods 음악 재생 중 ...");
    }

    public void stopping() {
        System.out.println("Apple AirPods 음악 중지 ...");
    }
}
