package state_pattern;

public class Sleep implements State {
    public Sleep() {
        System.out.println("현재 상태: 수면");
    }

    @Override
    public void on_button(ElecFan elecFan) {
        System.out.println("on 버튼 눌림");
        System.out.println("수면에서 송풍 상태로 변경");
        elecFan.setState(new Wind());
    }

    @Override
    public void off_button(ElecFan elecFan) {
        System.out.println("off 버튼 눌림");
        System.out.println("수면에서 정지 상태로 변경");
        elecFan.setState(new Stop());
    }
}
