import java.awt.*;

public class LabelExample {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Label Example");

        Label label = new Label("This is a label");
        label.setBounds(50, 50, 150, 30);

        frame.add(label);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}