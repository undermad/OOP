import java.util.ArrayList;
import java.util.List;

public class Canvas {
    private int height;
    private final int width = 300;
    private String dialog;

    private List<String> answers;

    private Canvas(CanvasBuilder builder) {
        this.height = builder.height;
        this.dialog = builder.dialog;
        this.answers = builder.answers;
    }

    public String toString() {
        answers.forEach(String -> {
            System.out.println(String);
        });
        System.out.println("Height: " + this.height);
        return null;
    }

    public static class CanvasBuilder {
        private int height = 100;
        private String dialog;

        private List<String> answers;

        public CanvasBuilder(String dialog) {
            this.dialog = dialog;
            this.answers = new ArrayList<>();
        }

        public CanvasBuilder addAnswer(String answer) {
            if (answers.size() == 0)
                this.height += 30;
            this.answers.add(answer);
            return this;
        }

        public Canvas build() {
            return new Canvas(this);
        }
    }
}
