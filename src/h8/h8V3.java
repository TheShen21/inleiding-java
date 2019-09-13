package h8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class h8V3 extends Applet {
    TextField tekstvak;
    Label label;
    double metBTW;
    Button knop;


    public void init() {
        label= new Label("Voer een bedrag in");
    tekstvak= new TextField("",20);
    knop= new Button("ok");
    add(label);
        add(tekstvak);
    add(knop);
    knop.addActionListener(new KnopListener());
    tekstvak.addActionListener(new TekstvakListener());


    }



    public void paint(Graphics g) {
        g.drawString("Totale bedrag met BTW: "+metBTW+" euro", 20,60);

    }
    public class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            metBTW = Double.parseDouble( s );
            metBTW*=1.21;
            repaint();
        }
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            metBTW = Double.parseDouble( s );
            metBTW*=1.21;
            repaint();
        }
    }
}

