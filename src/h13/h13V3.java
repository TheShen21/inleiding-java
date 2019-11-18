package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class h13V3 extends Applet {
    int xas = 50;
    int yas = 50;
    int plusx = 95;
    int plusy = 50;
    int xas2 = 50;
    int yas2 = 50;
    int plusx2 = 120;
    int plusy2 = 60;
    int getal = 0;
    Button knopRood;
    Button knopGrijs;
    Button knopReset;

    public void init() {
        knopRood = new Button("Red");
        knopRood.addActionListener(new KnopRoodListener());
        knopGrijs = new Button("Gray");
        knopGrijs.addActionListener(new KnopGrijsListener());
        knopReset = new Button("Clear");
        knopReset.addActionListener(new KnopResetListener());
        add(knopGrijs);
        add(knopRood);
        add(knopReset);
    }


    public void paint(Graphics g) {
        if(getal == 1) {
            baksteen(g, xas, yas, plusx, plusy);
        }
        if (getal == 2) {
            betonMuur(g, xas2, yas2, plusx2, plusy2);
        }
    }
    class KnopRoodListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal = 1;
            repaint();

        }
    }
    class KnopGrijsListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal = 2;
            repaint();
        }
    }
    class KnopResetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal = 0;
            repaint();
        }
    }

    void baksteen(Graphics g, int beginx, int beginy, int x, int y) {
        int teller = 0;
        int teller2 = 0;
        int teller1 = 0;
        int teller3 = 0;

        while (teller < 5) {
            g.setColor(Color.red);
            g.fillRect(beginx, beginy, x, y);
            g.setColor(Color.black);
            g.drawRect(beginx, beginy, x, y);
            beginx += 95;
            teller++;

        }
        beginx = 97;
        while (teller1 < 5) {
            beginy = 100;
            g.setColor(Color.red);
            g.fillRect(beginx, beginy, x, y);
            g.setColor(Color.black);
            g.drawRect(beginx, beginy, x, y);
            beginx += 95;
            teller1++;
        }
        beginx = 50;
        while (teller2 < 5) {
            beginy = 150;
            g.setColor(Color.red);
            g.fillRect(beginx, beginy, x, y);
            g.setColor(Color.black);
            g.drawRect(beginx, beginy, x, y);
            beginx += 95;
            teller2++;
        }
        beginx = 97;
        while (teller3 < 5) {
            beginy = 200;
            g.setColor(Color.red);
            g.fillRect(beginx, beginy, x, y);
            g.setColor(Color.black);
            g.drawRect(beginx, beginy, x, y);
            beginx += 95;
            teller3++;
        }

    }
    void betonMuur(Graphics g,int beginx2, int beginy2, int x2, int y2){

        int counter = 0;
        int counter2 = 0;
        int counter1 = 0;
        int counter3 = 0;

        while (counter < 5) {
            g.setColor(Color.gray);
            g.fillRect(beginx2, beginy2, x2, y2);
            g.setColor(Color.black);
            g.drawRect(beginx2, beginy2, x2, y2);
            beginx2 += 95;
            counter++;

        }
        beginx2 = 110;
        while (counter1 < 5) {
            beginy2 = 110;
            g.setColor(Color.gray);
            g.fillRect(beginx2, beginy2, x2, y2);
            g.setColor(Color.black);
            g.drawRect(beginx2, beginy2, x2, y2);
            beginx2 += 95;
            counter1++;
        }
        beginx2 = 50;
        while (counter2 < 5) {
            beginy2 = 170;
            g.setColor(Color.gray);
            g.fillRect(beginx2, beginy2, x2, y2);
            g.setColor(Color.black);
            g.drawRect(beginx2, beginy2, x2, y2);
            beginx2 += 95;
            counter2++;
        }
        beginx2 = 97;
        while (counter3 < 5) {
            beginy2 = 230;
            g.setColor(Color.gray);
            g.fillRect(beginx2, beginy2, x2, y2);
            g.setColor(Color.black);
            g.drawRect(beginx2, beginy2, x2, y2);
            beginx2 += 95;
            counter3++;
        }

    }
}
