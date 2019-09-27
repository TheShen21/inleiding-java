package h11;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class h11praktijk2 extends Applet{
    TextField tekstvak;
    Button knop;
    Button knopMin;
    int tafel;
    String text;

    public void init() {
        tekstvak= new TextField("",5);
        knop= new Button("ok");
        knopMin= new Button("NotOk");
        knop.addActionListener(new KnopListener());
        knopMin.addActionListener(new KnopMinListener());
        
        add(knop);
        add(knopMin);
    }

    public void paint(Graphics g) {
        int teller=0;
        int ant;
        int y=20;

        while(teller<10) {
            teller++;
            ant = teller * tafel;
            y += 20;
            g.drawString(teller + "*" + tafel + "= " + ant, 20, y);
        }


    }
    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            tafel++;

            repaint();

        }
    }
    class KnopMinListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            tafel--;

            repaint();

        }
    }
}
