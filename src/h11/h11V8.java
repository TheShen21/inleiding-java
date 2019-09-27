package h11;

import java.applet.Applet;
import java.awt.*;


public class h11V8 extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        int teller=0;
        int lengte= 0;


        while(teller<100) {
            teller++;

            lengte+=10;

            g.drawOval(20,20,lengte,lengte);

        }
    }
}
