import javax.swing.JApplet;
import javax.swing.JLabel;
import java.awt.Container;

public class SimpleApplet extends JApplet {
    public void init() {
        Container contentPane = getContentPane();
        JLabel label = new JLabel("Hello, World!", JLabel.CENTER);
        contentPane.add(label);
    }
}

/*
* <applet code = "simpleApplet.class" width="500" height="500"></applet>
*/
