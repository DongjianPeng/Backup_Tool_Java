package boot;

import com.sun.deploy.uitoolkit.ToolkitStore;
import com.sun.deploy.uitoolkit.UIToolkit;
import view.index.InitialWindow;

public class Boot {
    public static void main(String[] args) {
        UIToolkit uiToolkit = ToolkitStore.get();

        InitialWindow window = new InitialWindow();

    }
}
