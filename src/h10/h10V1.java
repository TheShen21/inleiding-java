package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class h10V1 extends Applet {
    TextField tekstvak;
    Label label;
    int getal;
    int tekst;


    public void init() {
        //new
        tekstvak= new TextField("",20);
        label= new Label("Type een getal in en druk op enter");



        //add
        add(label);
        add(tekstvak);
        //Listener
        tekstvak.addActionListener(new tekstvakListener());

    }


    public void paint(Graphics g) {
        g.drawString("De grootste getal is: "+tekst,20,60);

    }

    class tekstvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String s;
        s= tekstvak.getText();
        getal= Integer.parseInt(s);
        if(getal > tekst){
            tekst=getal;
            tekstvak.setText("");
            repaint();
        }

        }
    }
}