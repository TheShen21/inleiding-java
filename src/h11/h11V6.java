package h11;
import java.applet.Applet;
import java.awt.*;


public class h11V6 extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        int teller=0;
        int y = 0;
        int x = 0;
        int lengte= 60;


        while(teller<5) {
            teller++;
            x+=5;
            y+=5;
            lengte-=10;

            g.drawOval(x,y,lengte,lengte);

        }
    }
}
