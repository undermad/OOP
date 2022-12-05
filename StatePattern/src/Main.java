import Stopwatch.Stopwatch;

public class Main {
    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.draw();
        paint.setCurrentTool(new BrushTool(paint));
        paint.draw();


        Stopwatch stopwatch = new Stopwatch();
        stopwatch.click();
        stopwatch.click();
        stopwatch.click();
    }
}