public class PenTool implements Tool{
    private Paint paint;

    public PenTool(Paint paint) {
        this.paint = paint;
    }

    @Override
    public void draw() {
        System.out.println("Drawing with pen.");
    }
}
