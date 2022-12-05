package Stopwatch;

public class Stopwatch {
    StopwatchState stopwatchState = new StoppedState(this);

    public Stopwatch() {
    }
    public void click(){
        stopwatchState.click();
    }

    public void setStopwatchState(StopwatchState stopwatchState) {
        this.stopwatchState = stopwatchState;
    }
}
