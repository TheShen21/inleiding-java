package h12;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class h12praktijk extends Applet {
    String[] namen;
    String[] nummers;
    TextField tekstNamen;
    TextField tekstNummers;
    int teller = 0;
    Button knop;
    boolean zoek;

    public void init() {
        tekstNamen = new TextField("", 10);
        tekstNummers = new TextField("", 10);
        namen = new String[10];
        nummers = new String[10];

        add(tekstNamen);
        add(tekstNummers);
        knop = new Button("k");
        knop.addActionListener(new KnopListener());
        add(knop);
        zoek = false;


    }


    public void paint(Graphics g) {
        if (zoek) {
            for (int i = 0; i < namen.length; i++) {


                g.drawString("" + namen[i], 60, 20 * i + 60);
                g.drawString("" + nummers[i], 160, 20 * i + 60);

            }

        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            namen[teller] = tekstNamen.getText();
            nummers[teller] = tekstNummers.getText();
            teller++;


            if (teller > 9) {
                zoek = true;
            }
            tekstNummers.setText("");
            tekstNamen.setText("");
            repaint();


        }
    }
}
