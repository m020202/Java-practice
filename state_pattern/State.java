package state_pattern;

public interface State {
    void on_button(ElecFan elecFan);

    void off_button(ElecFan elecFan);
}
