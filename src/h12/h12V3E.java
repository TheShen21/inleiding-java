package h12;

import java.awt.*;
import java.applet.*;
import java.util.*;
import java.awt.event.*;

public class h12V3E extends Applet {
    TextField[] tekst;
    Button knop;
    double[] getalUp;

    public void init() {
        tekst = new TextField[5];
        getalUp = new double[5];
        for (int teller = 0; teller < tekst.length; teller++) {
            tekst[teller] = new TextField("",10);
            add(tekst[teller]);
        }
        getalUp = new double[5];
        knop = new Button("ok");
        knop.addActionListener(new KnopListener());
        add(knop);

    }

    public void paint(Graphics g) {

    }
    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            for (int teller = 0; teller<getalUp.length; teller++){
                getalUp[teller]= Double.parseDouble(tekst[teller].getText());
            }
            Arrays.sort(getalUp);
            for (int i = 0; i<getalUp.length; i++){
                tekst[i].setText(""+getalUp[i]);
            }

            repaint();


        }
    }
}