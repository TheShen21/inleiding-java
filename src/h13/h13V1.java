package h13;

import java.awt.*;
import java.applet.*;

public class h13V1 extends Applet {
    int w1 = 50;
    int w2 = 20;
    int w3 = 80;
    int h1 = 20;
    int h2 = 50;
    int h3 = 50;


    public void init() {

    }

    public void paint(Graphics g) {
        tekenDriehoek(g, w1, h1, w2, h2, w3, h3);

    }
         void tekenDriehoek(Graphics g,int x1, int y1, int x2, int y2, int x3, int y3){
            g.drawLine(x1,y1,x2,y2);
            g.drawLine(x2,y2,x3,y3);
            g.drawLine(x1,y1,x3,y3);
        }



}
