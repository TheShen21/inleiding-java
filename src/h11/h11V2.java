package h11;

import java.applet.*;
import java.awt.*;


public class h11V2 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int x = 0;

        for(teller=20; teller>9 && teller<21;teller--) {
            x += 20;

            g.drawString("" + teller, x, 40 );

        }
    }

}
