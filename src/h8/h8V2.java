package h8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class h8V2 extends Applet{
    int mannen;
    int vrouwen;
    int pmannen;
    int pvrouwen;
    Button manKnop;
    Button vrouwKnop;
    Button pManKnop;
    Button pVrouwKnop;

    public void init() {

    manKnop = new Button("Mannen");
        add(manKnop);
    vrouwKnop = new Button("Vrouwen");
        add(vrouwKnop);
    pManKnop = new Button("Pot. mannen");
        add(pManKnop);
    pVrouwKnop = new Button("Pot. vrouwen");
       add(pVrouwKnop);
        manKnop.addActionListener(new ManKnopListener());
        vrouwKnop.addActionListener(new VrouwKnopListener());
        pManKnop.addActionListener(new pManKnopListener());
        pVrouwKnop.addActionListener(new pVrouwKnopListener());


    }


    public void paint(Graphics g) {
    g.drawString("Aantal mannen: "+mannen,20, 60);
    g.drawString("Aantal vrouwen: "+vrouwen,20,80);
    g.drawString("Aantal pot. mannen: "+pmannen,20,100);
    g.drawString("Aantal pot. vrouwen: "+pvrouwen,20,120);
    g.drawString("Totaal: "+ (mannen + vrouwen + pmannen + pvrouwen),20, 140);

    }
    class ManKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mannen++;
            repaint();
        }
    }
    class VrouwKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            vrouwen++;
            repaint();

        }

    }
    class pManKnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            pmannen++;
            repaint();
        }

    }

    class pVrouwKnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            pvrouwen++;
            repaint();
        }
    }

}
