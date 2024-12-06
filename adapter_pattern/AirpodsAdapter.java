package adapter_pattern;

public class AirpodsAdapter extends AirPods implements AirPodsInterface {
    public AirpodsAdapter() {
        System.out.println("에어팟과 삼성이 호환됩니다.");
    }

    @Override
    public void play() {
        super.playing();
    }

    @Override
    public void stop() {
        super.stopping();
    }
}
