package challenge;

import h8.h8V3;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class chalstaaf extends Applet {
    int valerie;
    int jeroen;
    int hans;
    int valeriegetal;
    int jeroengetal;
    int hansgetal;
    int yas = 420;
    TextField tekstval;
    TextField tekstjer;
    TextField teksthans;
    Button knop;


    public void init() {
        setSize(500,500);

        tekstval = new TextField("",10);
        tekstjer = new TextField("",10);
        teksthans = new TextField("",10);
        knop = new Button("ok");
        knop.addActionListener(new KnopListener());
        add(tekstval);
        add(tekstjer);
        add(teksthans);
        add(knop);
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.white);
        g.drawLine(80, 60, 80, 420);
        g.drawLine(80, 420, 420, 420);
        g.drawLine(40, 220, 40, 200);
        g.drawLine(35, 200, 45, 200);
        g.drawLine(35, 200, 40, 190);
        g.drawLine(40, 190, 45, 200);
        g.drawString("kg", 20, 210);
        g.setColor(Color.orange);
        g.drawLine(80, 360, 420, 360);
        g.drawLine(80, 300, 420, 300);
        g.drawLine(80, 240, 420, 240);
        g.drawLine(80, 180, 420, 180);
        g.drawLine(80, 120, 420, 120);
        g.drawLine(80, 60, 420, 60);
        g.drawString("120", 55, 65);
        g.drawString("100", 55, 125);
        g.drawString("80", 60, 185);
        g.drawString("60", 60, 245);
        g.drawString("40", 60, 305);
        g.drawString("20", 60, 365);
        g.drawString("0", 60, 425);

        g.setColor(Color.red);
        g.drawString("Valerie", 115, 40);
        g.drawString("Valerie", 118, 435);
        g.fillRect(110,yas - valerie,60,valerie);

        g.setColor(Color.CYAN);
        g.drawString("Jeroen", 215, 40);
        g.drawString("Jeroen", 228, 435);
        g.fillRect(220,yas - jeroen,60,jeroen);

        g.setColor(Color.magenta);
        g.drawString("Hans", 320, 40);
        g.drawString("Hans", 340, 435);
        g.fillRect(330,yas - hans,60,hans);
    }

    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
        valeriegetal = Integer.parseInt(tekstval.getText());
        jeroengetal = Integer.parseInt(tekstjer.getText());
        hansgetal = Integer.parseInt(teksthans.getText());
            valerie = valeriegetal * 3;
            jeroen = jeroengetal * 3;
            hans = hansgetal * 3;
            repaint();
        }
    }
}