import javax.swing.*;

public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Hello world!");
        panel.setBorder(BorderFactory.createEmptyBorder(60, 10, 10, 10));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 200);
        frame.add(panel);
        panel.add(label);

        frame.setVisible(true);
    }
}
