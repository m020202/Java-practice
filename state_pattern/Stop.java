package state_pattern;

public class Stop implements State {
    public Stop() {
        System.out.println("현재 상태: 정지");
    }

    @Override
    public void on_button(ElecFan elecFan) {
        System.out.println("on 버튼 눌림");
        System.out.println("정지에서 송풍 상태로 변경");
        elecFan.setState(new Wind());
    }

    @Override
    public void off_button(ElecFan elecFan) {
        System.out.println("off 버튼 눌림");
        System.out.println("상태 변화 없음");
    }
}
