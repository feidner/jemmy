package hfe;

import com.ulcjava.base.application.ULCBoxPane;
import com.ulcjava.base.application.ULCFrame;
import com.ulcjava.base.application.ULCLabel;
import com.ulcjava.base.application.event.IWindowListener;
import com.ulcjava.base.application.util.Dimension;


public class HfeFrame extends ULCFrame {

    public HfeFrame(String labelText) {

        ULCBoxPane contentPane = new ULCBoxPane(1, 1);
        contentPane.add(new ULCLabel(labelText));

        setSize(new Dimension(800, 400));
        setContentPane(contentPane);
        setVisible(true);
        setLocationRelativeTo(null);
        addWindowListener((IWindowListener) windowEvent -> System.exit(0));

    }
}
