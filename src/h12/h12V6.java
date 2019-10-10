package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class h12V6 extends Applet {
    TextField tekstvak;
    Button knop;
    double[] getallen = {2, 2, 2, 3, 4, 4, 2, 5, 5, 5, 6, 7, 7, 7, 8, 9, 10, 10, 10, 10, 11, 12, 12};
    double userInput;
    int teller;
    boolean zoek;


    public void init() {
        tekstvak = new TextField("", 10);
        knop = new Button("ok");
        knop.addActionListener(new KnopsListener());
        add(tekstvak);
        add(knop);
        zoek = true;


    }

    public void paint(Graphics g) {
        if (zoek){
            g.drawString("" + userInput + " komt " + teller + " keer voor.",40, 40);
        }

    }

    class KnopsListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            userInput = Integer.parseInt(tekstvak.getText());



                for(double none : getallen){


                if (none == userInput) {
                    System.out.println("MATCH!");
                    teller++;


                }
            }
            repaint();
        }
    }
}






