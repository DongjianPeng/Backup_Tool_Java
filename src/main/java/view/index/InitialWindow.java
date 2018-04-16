package view.index;

import seting.CommonSeting;
import seting.config.WindowSeting;

import javax.swing.*;
import java.awt.*;

public class InitialWindow extends JFrame {
    public InitialWindow() throws HeadlessException {
        CommonSeting.base(this);
        setVisible(true);
    }
}
