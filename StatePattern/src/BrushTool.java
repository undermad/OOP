public class BrushTool implements Tool{
    private Paint paint;

    public BrushTool(Paint paint) {
        this.paint = paint;
    }

    @Override
    public void draw() {
        System.out.println("Drawing with brush!");
    }
}
