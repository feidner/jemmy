package hfe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HfeFrame extends JFrame {

    public HfeFrame(String labelText) {

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(new JLabel(labelText), BorderLayout.CENTER);

        setSize(new Dimension(800, 400));
        setContentPane(contentPane);
        setVisible(true);
        setLocationRelativeTo(null);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });

    }

    public static void main(String[] args) {
        new HfeFrame("goodies");
    }
}
