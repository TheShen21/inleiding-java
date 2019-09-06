package h4;

import java.awt.*;
import java.applet.*;

public class h4V4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.white);
        g.drawLine(80,20,80,220);
        g.drawLine(80,220,280,220);
        g.drawLine(40,220,40,200);
        g.drawLine(35,200,45,200);
        g.drawLine(35,200,40,190);
        g.drawLine(40,190,45,200);
        g.drawString("kg",20,210);
        g.setColor(Color.orange);
        g.drawLine(80,180,280,180);
        g.drawLine(80,140,280,140);
        g.drawLine(80,100,280,100);
        g.drawLine(80,60,280,60);
        g.drawLine(80,20,280,20);
        g.setColor(Color.orange);
        g.drawString("100",55,25  );
        g.drawString("80",60,65);
        g.drawString("60", 60,105);
        g.drawString("40",60,145);
        g.drawString("20",60,185);
        g.drawString("0",65,225);
        g.setColor(Color.red);
        g.fillRect(100,140,40,80);
        g.fillRect(80,240,10,10);
        g.drawString("Valerie",95,250);
        g.setColor(Color.CYAN);
        g.fillRect(160,20,40,200);
        g.fillRect(80,255,10,10);
        g.drawString("Jeroen",95,265);
        g.setColor(Color.green);
        g.fillRect(220,60,40,160);
        g.fillRect(80,270,10,10);
        g.drawString("Hans",95,280);

    }
}