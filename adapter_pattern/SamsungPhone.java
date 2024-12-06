package adapter_pattern;

public class SamsungPhone {
    private AirpodsAdapter airpodsAdapter;

    void installAirPods() {
        airpodsAdapter = new AirpodsAdapter();
        System.out.println("새로 구입한 에어팟을 연결합니다.");
    }

    void testAirPods() {
        if (airpodsAdapter != null) {
            airpodsAdapter.play();
            airpodsAdapter.stop();
        }
    }
}
