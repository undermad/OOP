package Stopwatch;

public class RunningState implements StopwatchState{
    private Stopwatch stopwatch;

    public RunningState(Stopwatch stopwatch) {
        this.stopwatch = stopwatch;
    }

    @Override
    public void click() {
        System.out.println("Stopping");
        stopwatch.setStopwatchState(new StoppedState(stopwatch));
    }
}
