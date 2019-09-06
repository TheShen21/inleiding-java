package h4;

import java.awt.*;
import java.applet.*;

public class h4V3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.CYAN);
        g.setColor(Color.red);
        g.fillRect(30,20,180,40);
        g.setColor(Color.white);
        g.fillRect(30,60,180,40);
        g.setColor(Color.blue);
        g.fillRect(30,100,180,40);
        g.setColor(Color.lightGray);
        g.fillRect(25,20,5,240);
    }
}