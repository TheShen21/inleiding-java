package h4;

import java.awt.*;
import java.applet.*;

public class h4V5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(100,100,100,50,0,360);

    }
}