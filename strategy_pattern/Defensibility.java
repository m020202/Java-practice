package strategy_pattern;

public class Defensibility implements Passive {
    @Override
    public void detail() {
        System.out.println("패시브 스킬 - 방어: 받는 피해 40% 감소시킴");
    }
}
