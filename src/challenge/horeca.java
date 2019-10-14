package challenge;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class horeca extends Applet {
    double fris = 2.25;
    double bier = 2.50;
    double wijn = 2.75;
    double koffie = 2;
    double binnengest = 3;
    double buitengest = 3.75;
    int teller = 0;
    double bedrag;
    double totaal = 0;
    Button knopfris;
    Button knopbier;
    Button knopWijn;
    Button knopKoffie;
    Button knopBinnen;
    Button knopBuiten;
    Button reset;


    public void init() {
        setSize(400,600);
        knopfris = new Button("Fris");
        knopfris.addActionListener(new FrisListener());
        knopbier = new Button("Bier");
        knopbier.addActionListener(new BierListener());
        knopWijn = new Button("Wijn");
        knopWijn.addActionListener(new WijnListener());
        knopKoffie = new Button("Koffie");
        knopKoffie.addActionListener(new KoffieListener());
        knopBinnen = new Button("Binnen gedist");
        knopBinnen.addActionListener(new BinnenListener());
        knopBuiten = new Button("Buiten gedist");
        knopBuiten.addActionListener(new BuitenListener());
        reset = new Button("Nieuwe bestelling");
        reset.addActionListener(new ResetListener());
        add(knopfris);
        add(knopbier);
        add(knopWijn);
        add(knopKoffie);
        add(knopBinnen);
        add(knopBuiten);
        add(reset);



    }

    public void paint(Graphics g) {
        g.drawString("Totaal bedrag: " + bedrag, 40, 80);
        g.drawString("Totaal omzet: " + totaal,40,120);


    }
    class FrisListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            totaal+=fris;
            bedrag+=fris;
            teller++;

            repaint();
        }
    }
    class BierListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            totaal+=bier;
            bedrag+=bier;
            teller++;

            repaint();
        }
    }
    class WijnListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            totaal+=wijn;
            bedrag+=wijn;
            teller++;

            repaint();
        }
    }
    class KoffieListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            totaal+=koffie;
            bedrag+=koffie;
            teller++;

            repaint();
        }
    }
    class BinnenListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            totaal+=binnengest;
            bedrag+=binnengest;
            teller++;

            repaint();
        }
    }
    class BuitenListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            totaal+=buitengest;
            bedrag+=buitengest;
            teller++;

            repaint();
        }
    }
    class ResetListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            bedrag = 0;
            teller = 0;

            repaint();
        }
    }




}