package h8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;



public class h8praktijk extends Applet {
    TextField tekstveldgetal1;
    TextField tekstveldgetal2;
    Button keer;
    Button plus;
    Button min;
    Button delen;
    double uitkomst;
    double getal1;
    double getal2;





    public void init() {
        tekstveldgetal1= new TextField("",15);
        tekstveldgetal2= new TextField("",15);
        plus= new Button("+");
        keer= new Button("*");
        min= new Button("-");
        delen= new Button("/");
        //ActionListener
        plus.addActionListener(new plusListener());
        min.addActionListener(new minListener());
        keer.addActionListener(new keerListener());
        delen.addActionListener(new delenListener());
        //add
        add(tekstveldgetal1);
        add(tekstveldgetal2);
        add(plus);
        add(min);
        add(keer);
        add(delen);




    }
    public void paint(Graphics g) {



    }
    public class plusListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            getal1= Double.parseDouble(tekstveldgetal1.getText());
            getal2= Double.parseDouble(tekstveldgetal2.getText());

            uitkomst=(getal1+getal2);
            tekstveldgetal1.setText("" + uitkomst);
            tekstveldgetal2.setText("");
            repaint();


        }
    }
    public class minListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            getal1= Double.parseDouble(tekstveldgetal1.getText());
            getal2= Double.parseDouble(tekstveldgetal2.getText());

            uitkomst=(getal1-getal2);
            tekstveldgetal1.setText("" + uitkomst);
            tekstveldgetal2.setText("");
        }
    }
    public class keerListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            getal1= Double.parseDouble(tekstveldgetal1.getText());
            getal2= Double.parseDouble(tekstveldgetal2.getText());

            uitkomst=(getal1*getal2);
            tekstveldgetal1.setText("" + uitkomst);
            tekstveldgetal2.setText("");
        }
    }
    public class delenListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            getal1= Double.parseDouble(tekstveldgetal1.getText());
            getal2= Double.parseDouble(tekstveldgetal2.getText());

            uitkomst=(getal1/getal2);
            tekstveldgetal1.setText("" + uitkomst);
            tekstveldgetal2.setText("");
        }
    }
}

 