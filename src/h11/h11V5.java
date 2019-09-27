package h11;

import java.applet.Applet;
import java.awt.*;


public class h11V5 extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        int teller=0;
        int y = 0;
        int x = 0;


        while(teller<5) {
            teller++;
            x+=40;
            y+=40;

            g.drawRect(x,y,40,40);

        }
    }
}
