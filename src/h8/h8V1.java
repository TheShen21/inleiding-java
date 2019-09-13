package h8;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class h8V1 extends Applet {
    Label label;
    TextField tekstvak;
    String tekst;
    Button knop;
    Button rknop;


    public void init() {
        tekstvak = new TextField(" ", 20);
        label = new Label("Type iets en druk op enter");
        knop = new Button("enter");
        rknop = new Button("reset");
        knop.addActionListener(new KnopListener());
        tekstvak.addActionListener(new TekstvakListener());
        rknop.addActionListener(new RknopListener());
        add(label);
        add(tekstvak);
        add(knop);
        add(rknop);
        tekst = "";

    }

    public void paint(Graphics g) {
        g.drawString(tekst, 20, 80);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekst = tekstvak.getText();
            repaint();
        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekst = tekstvak.getText();
            repaint();
        }
    }

    class RknopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            tekst = tekstvak.getText();

            repaint();
        }
    }
}
