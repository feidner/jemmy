package hfe;

import org.junit.jupiter.api.Test;
import org.netbeans.jemmy.ComponentChooser;
import org.netbeans.jemmy.operators.FrameOperator;

import javax.swing.*;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class HfeFrameTest {

    @Test
    void swinging() {
        FrameOperator op = new FrameOperator(new HfeFrame("henrik"));
        JLabel label = (JLabel) op.findSubComponent(new ComponentChooser() {
            @Override
            public boolean checkComponent(Component comp) {
                return comp instanceof JLabel;
            }

            @Override
            public String getDescription() {
                return null;
            }
        });
        assertEquals("henrik", label.getText());
    }
}