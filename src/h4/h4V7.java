package h4;


import javax.swing.*;
import java.awt.*;
import java.applet.*;


public class h4V7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.yellow);
        g.setColor(Color.white);
        g.fillRoundRect(20,20,240,240,80,80);
        g.setColor(Color.black);
        g.drawRoundRect(20,20,240,240,80,80);
        g.fillOval(60,60,60,60);
        g.fillOval(160,60,60,60);
        g.fillOval(60,160,60,60);
        g.fillOval(160,160,60,60);
    }
}
