public class Paint {
    private Tool currentTool = new PenTool(this);

    public void draw(){
        currentTool.draw();
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
