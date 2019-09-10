package h6;

import java.awt.*;
import java.applet.*;

public class h6V1 extends Applet{

    int euroverdiend;

    public void init() {
        euroverdiend=113;
        euroverdiend/=4;

    }


    public void paint(Graphics g) {
        g.drawString("Ik krijg: "+ euroverdiend,20,20);
        g.drawString("Jan krijgt: "+ euroverdiend,20,35);
        g.drawString("Ali krijgt: "+ euroverdiend,20,50);
        g.drawString("Jeannette krijgt: "+euroverdiend,20,65);
    }
}