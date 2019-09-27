package h11;

import java.awt.*;
import java.applet.*;

public class h11V3 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int x = 0;
        int teller=1;
        int getal=-1;
        int getal2=1;
        int getal3;

        while(teller<15) {
            teller++;
            getal3 =getal+getal2;
            getal= getal2;
            getal2=getal3;
            x += 25;
            g.drawString("" + getal3, x, 40 );

        }
    }


}
