package h6;

import java.awt.*;
import java.applet.*;

public class h6V2 extends Applet{
    int sec;
    int uur;
    int dag;
    int jaar;
    int tijduur;
    int tijddag;
    int tijdjaar;

    public void init() {
    sec=60;
    uur=60;
    dag=24;
    jaar=365;

    tijduur= sec * uur;
    tijddag= tijduur * dag;
    tijdjaar= tijddag * jaar;


    }

    public void paint(Graphics g) {
        g.drawString("Een uur heeft "+ tijduur +" seconde.", 20,20);
        g.drawString("Een dag heeft "+ tijddag +" seconde.",20,35);
        g.drawString("Een jaar heeft "+ tijdjaar +" seconde.", 20,50);

    }
}
