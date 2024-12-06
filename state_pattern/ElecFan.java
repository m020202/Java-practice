package state_pattern;

public class ElecFan {
    public ElecFan() {
        this.state = new Stop();
    }

    void setState(State state) {
        this.state = state;
    }

    void on_push() {
        this.state.on_button(this);
    }

    void off_push() {
        this.state.off_button(this);
    }

    void operation() {
        off_push();
        on_push();
        on_push();
        on_push();
        off_push();
    }

    private State state;
}
