import java.awt.*;

public class TextFieldExample {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT TextField Example");

        TextField textField = new TextField("Enter text here");
        textField.setBounds(50, 100, 200, 30);

        frame.add(textField);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}