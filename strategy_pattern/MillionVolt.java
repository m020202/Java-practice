package strategy_pattern;

public class MillionVolt implements Attack {
    @Override
    public void motion() {
        System.out.println("공격 스킬 - 백만 볼트: 백만 볼트의 강력한 진압으로 공격");
    }
}
