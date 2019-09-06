package h4;

import java.awt.*;
import java.applet.*;

public class h4praktijk extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        //lijn
        g.drawLine(20,10,120,10);
        g.drawString("Lijn", 55,25);
        //rechthoek
        g.drawRect(20,40,100,55);
        g.drawString("Rechthoek",40,110);
        //afgeronde rechthoek
        g.drawRoundRect(20,130,100,55,30,30);
        g.drawString("Afgeronde rechthoek",15,200);
        //gevuld rechthoek ovaal
        g.setColor(Color.magenta);
        g.fillRect(160,40,101,55);
        g.setColor(Color.black);
        g.drawRoundRect(160,40,100,55,100,55);
        g.drawString("Gevuld rechthoek met ovaal",135,110);
        //gevulde ovaal
        g.setColor(Color.magenta);
        g.fillRoundRect(160,130,100,55,100,55);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",170,200);
        //taartpunt met ovaal
        g.drawRoundRect(300,40,100,55,100,55);
        g.setColor(Color.magenta);
        g.fillArc(300,40,101,56,0,45);
        g.setColor(Color.black);
        g.drawString("taartpunt met ovaal eromheen",270,120);
        //cirkel
        g.drawOval(322,130,55,55);
        g.drawString("cirkel",334,200);

    }
}
