package h5;

import java.awt.*;
import java.applet.*;

public class h5V1 extends Applet {
    Color kleurRose;
    Color kleurBlack;
    int breedte1;
    int lengte1;

    public void init() {
        kleurRose=Color.magenta;
        kleurBlack=Color.BLACK;
        breedte1=100;
        lengte1=55;
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        //lijn
        g.drawLine(20,10,120,10);
        g.drawString("Lijn", 55,25);
        //rechthoek
        g.drawRect(20,40,breedte1,lengte1);
        g.drawString("Rechthoek",40,110);
        //afgeronde rechthoek
        g.drawRoundRect(20,130,breedte1,lengte1,30,30);
        g.drawString("Afgeronde rechthoek",15,200);
        //gevuld rechthoek ovaal
        g.setColor(kleurRose);
        g.fillRect(160,40,breedte1,lengte1);
        g.setColor(Color.black);
        g.drawRoundRect(160,40,breedte1,lengte1,100,55);
        g.drawString("Gevuld rechthoek met ovaal",135,110);
        //gevulde ovaal
        g.setColor(kleurRose);
        g.fillRoundRect(160,130,breedte1,lengte1,100,55);
        g.setColor(kleurBlack);
        g.drawString("Gevulde ovaal",170,200);
        //taartpunt met ovaal
        g.drawRoundRect(300,40,breedte1,lengte1,100,55);
        g.setColor(kleurRose);
        g.fillArc(300,40,breedte1,lengte1,0,45);
        g.setColor(kleurBlack);
        g.drawString("taartpunt met ovaal eromheen",270,120);
        //cirkel
        g.drawOval(322,130,lengte1,lengte1);
        g.drawString("cirkel",334,200);

    }
}
