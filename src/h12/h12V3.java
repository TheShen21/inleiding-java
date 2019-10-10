package h12;

import java.awt.*;
import java.applet.*;
import java.util.*;
import java.awt.event.*;

public class h12V3 extends Applet {
    TextField tekst1;
    TextField tekst2;
    TextField tekst3;
    TextField tekst4;
    TextField tekst5;
    Button knop;
    double[] getalUp;

    public void init() {

        tekst1 = new TextField("",10);
        tekst2 = new TextField("",10);
        tekst3 = new TextField("",10);
        tekst4 = new TextField("",10);
        tekst5 = new TextField("",10);
        knop = new Button("ok");
        knop.addActionListener(new KnopListener());
        getalUp = new double[5];
        add(tekst1);
        add(tekst2);
        add(tekst3);
        add(tekst4);
        add(tekst5);
        add(knop);

    }

    public void paint(Graphics g) {

    }
    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
                getalUp[0] = Double.parseDouble(tekst1.getText());
                getalUp[1] = Double.parseDouble(tekst2.getText());
                getalUp[2] = Double.parseDouble(tekst3.getText());
                getalUp[3] = Double.parseDouble(tekst4.getText());
                getalUp[4] = Double.parseDouble(tekst5.getText());
                Arrays.sort(getalUp);
                tekst1.setText(""+getalUp[0]);
                tekst2.setText(""+getalUp[1]);
                tekst3.setText(""+getalUp[2]);
                tekst4.setText(""+getalUp[3]);
                tekst5.setText(""+getalUp[4]);

            repaint();


        }
    }
}