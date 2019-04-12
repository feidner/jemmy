package hfe;

import com.ulcjava.testframework.ServerSideCommand;
import com.ulcjava.testframework.TestContext;
import com.ulcjava.testframework.operator.IComponentChooser;
import com.ulcjava.testframework.operator.ULCFrameOperator;
import com.ulcjava.testframework.operator.ULCLabelOperator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import javax.swing.*;
import java.awt.*;

@ExtendWith(HfeExtension.class)
class HfeFrameTest {

    private HfeFrame frame;

    @Test
    void ulc() {
        TestContext.getInstance().runVoidCommand(new ServerSideCommand() {
            @Override
            protected void proceedOnServer() {
                frame = new HfeFrame("mats");
            }
        });

        ULCFrameOperator op = new ULCFrameOperator(frame);
        ULCLabelOperator labelOperator = (ULCLabelOperator) op.findSubComponent(new IComponentChooser() {
            @Override
            public boolean checkComponent(Component comp) {
                return comp instanceof JLabel;
            }

            @Override
            public String getDescription() {
                return null;
            }
        });
        //assertEquals("mats", labelOperator.getText());
    }
}