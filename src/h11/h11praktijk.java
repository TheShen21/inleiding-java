package h11;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class h11praktijk extends Applet{
    TextField tekstvak;
    Button knop;
    int tafel;
    String text;

    public void init() {
        tekstvak= new TextField("",5);
        knop= new Button("ok");
        knop.addActionListener(new KnopListener());
        add(tekstvak);
        add(knop);
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
            text = tekstvak.getText();
            tafel = Integer.parseInt( text);
            tekstvak.setText("");


            repaint();

        }
    }
}
