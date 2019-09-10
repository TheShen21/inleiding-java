package h6;

import java.awt.*;
import java.applet.*;

public class h6V3 extends Applet{
    int getal1;
    int getal2;
    int uitkomst;


    public void init() {
        getal1=2147483647;
        getal2=1;

        uitkomst= getal1+getal2;
    }


    public void paint(Graphics g) {
        g.drawString("De uitkomst is "+uitkomst,20,20);

    }
}
