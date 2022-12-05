package Stopwatch;

public class StoppedState implements StopwatchState{
    private Stopwatch stopwatch;

    public StoppedState(Stopwatch stopwatch) {
        this.stopwatch = stopwatch;
    }

    @Override
    public void click() {
        System.out.println("Starting");
        stopwatch.setStopwatchState(new RunningState(stopwatch));
    }
}
