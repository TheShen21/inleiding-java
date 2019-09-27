package h11;

import java.applet.Applet;
import java.awt.*;


public class h11V9 extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        int teller=0;
        int lengte= 0;
        int x= 20;
        int xx= 0;



        while(teller<4) {
            teller++;
            x+=40;
            xx+=40;
            lengte=20;


            g.setColor(Color.black);
            g.fillRect(x,20,lengte,lengte);
            g.fillRect(xx,40,lengte,lengte);
            g.fillRect(x,60,lengte,lengte);
            g.fillRect(xx,80,lengte,lengte);
            g.fillRect(x,100,lengte,lengte);
            g.fillRect(xx,120,lengte,lengte);
            g.fillRect(x,140,lengte,lengte);
            g.fillRect(xx,160,lengte,lengte);
            g.drawRect(40,20,160,160);

        }
    }
}
