package h13;

import java.applet.Applet;
import java.awt.*;

public class h13V2 extends Applet {
    int xas = 50;
    int yas = 50;
    int plusx = 95;
    int plusy = 50;

    public void init() {

    }

    public void paint(Graphics g) {
    baksteen(g,xas ,yas, plusx, plusy);

    }


        void baksteen(Graphics g, int beginx, int beginy, int x, int y) {
        int teller = 0;
        int teller2 = 0;
            int teller1 = 0;
        int teller3 = 0;

        while (teller<5){
            g.setColor(Color.red);
            g.fillRect(beginx,beginy,x,y);
            g.setColor(Color.black);
            g.drawRect( beginx, beginy,x,y);
            beginx+=95;
            teller++;

        }
        beginx= 97;
        while (teller1< 5){
            beginy= 100;
            g.setColor(Color.red);
            g.fillRect(beginx,beginy,x,y);
            g.setColor(Color.black);
            g.drawRect(beginx,beginy,x,y);
            beginx+=95;
            teller1++;
        }
            beginx= 50;
            while (teller2< 5){
                beginy= 150;
                g.setColor(Color.red);
                g.fillRect(beginx,beginy,x,y);
                g.setColor(Color.black);
                g.drawRect( beginx, beginy,x,y);
                beginx+=95;
                teller2++;
            }
            beginx= 97;
            while (teller3< 5){
                beginy= 200;
                g.setColor(Color.red);
                g.fillRect(beginx,beginy,x,y);
                g.setColor(Color.black);
                g.drawRect( beginx, beginy,x,y);
                beginx+=95;
                teller3++;
            }

    }

}
