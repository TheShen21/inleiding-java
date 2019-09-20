package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class h10V5 extends Applet{
    double getal;
    double gemGetal;
    double totaal;
    TextField tekstvak;
    String tekst;
    String score;
    String geslaagd;
    String cijfer;
    String gemCijfer;

    int aantal;
    Button knop;

    public void init() {
    tekstvak= new TextField("",20);
    tekstvak.addActionListener(new tekstvakListener());
    knop= new Button("Bereken");
    knop.addActionListener(new knopListener());
    add(tekstvak);
    add(knop);
    tekst="";

    }


    public void paint(Graphics g) {
        g.drawString(cijfer,20,60);
        g.drawString(gemCijfer,20,80);
        g.drawString(geslaagd,20,100);

    }
    class tekstvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            tekst = tekstvak.getText();
            getal = Double.parseDouble( tekst );
            tekstvak.setText("");
            if(getal>5.49){
                score=" en het is voldoende";
            }
            else{
                score=" en het is onvoldoende";
            }
            cijfer=("Cijfer is "+tekst+score);
            totaal+=getal;
            aantal++;

            repaint();

        }
    }
    class knopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            gemGetal=totaal/aantal;
            gemCijfer=("Gemiddeld cijfer is "+gemGetal);

            if(gemGetal>5.49) {
                geslaagd ="Leerling is geslaagd";
            }
            else{
                geslaagd="Leerling is gezakt";
            }
            cijfer="";

            repaint();
        }
    }
}
