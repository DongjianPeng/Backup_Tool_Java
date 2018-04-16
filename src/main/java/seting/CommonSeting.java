package seting;

import seting.config.WindowSeting;

import java.awt.*;

public class CommonSeting {
    public static void base(Component co){
        co.setSize(WindowSeting.WINDOW_SIZE);
        co.setLocation(WindowSeting.WINDOW_LOCATION);
    }
}
