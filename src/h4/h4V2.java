package h4;

import java.awt.*;
import java.applet.*;


public class h4V2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.red);
        g.drawLine(100,20,20,120);
        g.drawLine(100,20,180,120);
        g.drawLine(20,120,180,120);
        g.setColor(Color.yellow);
        g.fillRect(20, 121, 160,100);
        g.setColor(Color.red);
        g.fillRect(30,161,40,60);
        g.setColor(Color.gray);
        g.fillOval(32, 190, 8,8);
        g.setColor(Color.CYAN);
        g.fillOval(120,151,40,40);
    }
}