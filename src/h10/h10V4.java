package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class h10V4 extends Applet {
    TextField tekstvakmaand;
    TextField tekstvakjaar;
    Label labelJ;
    Label labelM;
    String s, tekst;
    String tekst2;
    int dag;
    int jaartal;

    public void init() {
        tekstvakjaar = new TextField("",5);
        tekstvakmaand = new TextField("", 5);
        labelJ = new Label("Jaartal:");
        labelM = new Label("maandnummer:");
        tekstvakmaand.addActionListener( new TekstvakmaandListener() );
        tekstvakjaar.addActionListener(new TekstvakjaarListener());
        add(labelJ);
        add(tekstvakjaar);
        add(labelM);
        add(tekstvakmaand);
    }

    public void paint(Graphics g) {
        g.drawString(tekst , 20, 80 );
        g.drawString(tekst2,20,100);

    }
    class TekstvakjaarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvakjaar.getText();
            jaartal = Integer.parseInt(s);
            tekstvakjaar.setText("");

            if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0) {
                tekst = "Jaartal "+jaartal+" is een schrikkeljaar";
            }
            else{
                tekst = "Jaartal "+ jaartal + " is geen schrikkeljaar";
            }
            repaint();
        }
    }

    class TekstvakmaandListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvakmaand.getText();
            dag = Integer.parseInt(s);
            tekstvakmaand.setText("");


                if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                        jaartal % 400 == 0){
                    switch (dag){
                            case 1:
                                tekst2 = "Januari, " + "aantal dagen: " + "31.";
                                break;
                            case 2:
                                tekst2 = "Februari, aantal dagen: " + "29.";
                                break;
                            case 3:
                                tekst2 = "Maart, aantal dagen: " + "31.";
                                break;
                            case 4:
                                tekst2 = "April, aantal dagen: " + "30.";
                                break;
                            case 5:
                                tekst2 = "Mei, aantal dagen: " + "31.";
                                break;
                            case 6:
                                tekst2 = "Juni, aantal dagen: " + "30.";
                                break;
                            case 7:
                                tekst2 = "Juli, aantal dagen: " + "31.";
                                break;
                            case 8:
                                tekst = "Augustus, aantal dagen: " + "31.";
                                break;
                            case 9:
                                tekst2 = "September, aantal dagen: " + "30.";
                                break;
                            case 10:
                                tekst2 = "Oktober, aantal dagen: " + "31.";
                                break;
                            case 11:
                                tekst2 = "November, aantal dagen: " + "30.";
                                break;
                            case 12:
                                tekst2 = "December, aantal dagen: " + "31.";
                                break;
                        default:
                            tekst = "U hebt een verkeerd nummer ingetikt ..!";
                            break;

                        }
                    }
                else{

                switch (dag) {
                    case 1:
                        tekst2 = "Januari, " + "aantal dagen: " + "31.";
                        break;
                    case 2:
                        tekst2 = "Februari, aantal dagen: " + "28.";
                        break;
                    case 3:
                        tekst2 = "Maart, aantal dagen: " + "31.";
                        break;
                    case 4:
                        tekst2 = "April, aantal dagen: " + "30.";
                        break;
                    case 5:
                        tekst2 = "Mei, aantal dagen: " + "31.";
                        break;
                    case 6:
                        tekst2 = "Juni, aantal dagen: " + "30.";
                        break;
                    case 7:
                        tekst2 = "Juli, aantal dagen: " + "31.";
                        break;
                    case 8:
                        tekst = "Augustus, aantal dagen: " + "31.";
                        break;
                    case 9:
                        tekst2 = "September, aantal dagen: " + "30.";
                        break;
                    case 10:
                        tekst2 = "Oktober, aantal dagen: " + "31.";
                        break;
                    case 11:
                        tekst2 = "November, aantal dagen: " + "30.";
                        break;
                    case 12:
                        tekst2 = "December, aantal dagen: " + "31.";
                        break;
                    default:
                        tekst = "U hebt een verkeerd nummer ingetikt ..!";
                        break;

                }
                }

            repaint();
                }

            }

        }



