package h2;

import java.awt.*;
import java.applet.*;


public class H2V2 extends Applet {

        //een (lege) methode die de Applet initialiseert
        public void init() {setBackground(Color.white);

        }
        //een methode die de inhoud van het scherm tekent
        public void paint(Graphics g) {
            g.setColor(Color.blue);
            g.drawString("Bo", 150, 160 );
            g.setColor(Color.red);
            g.drawString("Shen", 150, 170 );
        }

    }

