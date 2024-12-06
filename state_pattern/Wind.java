package state_pattern;

public class Wind implements State {
    public Wind() {
        System.out.println("현재 상태: 송풍");
    }

    @Override
    public void on_button(ElecFan elecFan) {
        System.out.println("on 버튼 눌림");
        System.out.println("송풍에서 수면 상태로 변경");
        elecFan.setState(new Sleep());
    }

    @Override
    public void off_button(ElecFan elecFan) {
        System.out.println("off 버튼 눌림");
        System.out.println("수면에서 정지 상태로 바뀜");
        elecFan.setState(new Stop());
    }
}
