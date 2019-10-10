package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class h12V4 extends Applet{
    TextField tekstvak;
    Button knop;
    double[] getallen= {2,3,4,5,6,7,8,9,10,11,12};
    int userInput;
    double tekst;
    String none;
    boolean zoek;



    public void init() {
        tekstvak = new TextField("",10);
        knop = new Button("ok");
        knop.addActionListener(new KnopsListener());
        add(tekstvak);
        add(knop);
        zoek =false;






    }
    public void paint(Graphics g) {
        for(int i = 0;i<getallen.length; i++){

            g.drawString(""+getallen[i],40,20*i+20);

        }
        if (zoek) {
            g.drawString("Getal gevonden: " + userInput, 80, 40);
            g.drawString("Index cijfer: " + tekst, 80 , 80);
        }
        else {
            g.drawString("getal niet gevonden",80,60);
            g.drawString("Index cijfer: " + none, 80,80);
        }




    }
    class KnopsListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            userInput = Integer.parseInt(tekstvak.getText());
            System.out.println("getalTekst: " + userInput);
            int counter = 0;
            while (counter < getallen.length){
                System.out.println("getallen[i]: " + getallen[counter]);
                if (getallen[counter] == userInput) {
                    System.out.println("MATCH!");
                    zoek = true;
                    break;
                }
                else {
                    zoek = false;
                }

                counter++;
            }
            switch(userInput) {
                case 2:
                    tekst = 0;
                    break;
                case 3:
                    tekst = 1;
                    break;
                case 4:
                    tekst = 2;
                    break;
                case 5:
                    tekst = 3;
                    break;
                case 6:
                    tekst = 4;
                    break;
                case 7:
                    tekst = 5;
                    break;
                case 8:
                    tekst = 6;
                    break;
                case 9:
                    tekst = 7;
                    break;
                case 10:
                    tekst = 8;
                    break;
                case 11:
                    tekst = 9;
                    break;
                case 12:
                    tekst = 10;
                    break;
                default:
                    none = "geen";
                    break;
            }


            repaint();
        }
    }

}
