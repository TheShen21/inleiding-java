package h11;

import java.applet.Applet;
import java.awt.*;


public class h11V4 extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        int teller=0;
        int y = 0;
        int ant;

        while(teller<10) {
            teller++;
            y += 15;
            ant=teller*3;

            g.drawString("3*" + teller+"= "+ant, 20, y );

        }
    }
}
