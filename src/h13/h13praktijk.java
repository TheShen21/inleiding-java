package h13;

import java.awt.*;
import java.applet.Applet;

public class h13praktijk extends Applet {
    int beginX = 50;
    int beginY = 50;
    int boomW = 75;
    int boomStamW = 25;
    int boomStamH = 75;
    int boomStamp = 75;

    public void init() {

    }


    public void paint(Graphics g) {
        boomen(g, beginX,beginY,boomW,boomStamW,boomStamH,boomStamp);
    }
    void boomen(Graphics g,int startX, int startY, int blaad, int stamW, int stamH, int stamp){
        int teller = 0;
        int teller2 = 0;
        while(teller < 5) {
            g.setColor(Color.ORANGE);
            g.fillRect(stamp, 75, stamW, stamH);
            g.setColor(Color.GREEN);
            g.fillOval(startX, startY, blaad, blaad);
            stamp+=100;
            startX+=100;
            teller++;
        }
        startY= 250;
        startX= 50;
        stamp= 75;
        while(teller2 < 5) {
            g.setColor(Color.ORANGE);
            g.fillRect(stamp, 275, stamW, stamH);
            g.setColor(Color.GREEN);
            g.fillOval(startX, startY, blaad, blaad);
            stamp+=100;
            startX+=100;
            teller2++;
        }
    }
}
