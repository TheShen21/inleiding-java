package h4;

import java.awt.*;
import java.applet.*;

public class h4V6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.CYAN);
        g.setColor(Color.lightGray);
        g.fillRect(170,280,20,100);
        g.setColor(Color.white);
        g.fillRoundRect(115,15,130,270,65,65);
        g.setColor(Color.DARK_GRAY);
        g.fillRoundRect(120,20,120,260,60,60);
        g.setColor(Color.gray);
        g.fillRoundRect(150,35,60,65,60,60);
        g.fillRoundRect(150,110,60,65,60,60);
        g.fillRoundRect(150,185,60,65,60,60);
        g.setColor(Color.GREEN);
        g.fillOval(150,45,60,55);
        g.setColor(Color.ORANGE);
        g.fillOval(150,120,60,55);
        g.setColor(Color.RED);
        g.fillOval(150,195,60,55);
    }
}
