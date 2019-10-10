package h12;

import java.awt.*;
import java.applet.*;


public class h12V2 extends Applet  {
    double[] salaris;
    Button knop;



    public void init() {
        salaris = new double[25];




        for (int teller = 0; teller < salaris.length ;teller ++) {
            salaris[teller] = 100 * teller + 100;
            knop = new Button(""+salaris[teller]);
            add(knop);
        }



    }





}