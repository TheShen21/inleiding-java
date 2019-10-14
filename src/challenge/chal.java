package challenge;

import java.applet.*;
import java.awt.*;

public class chal extends Applet {
    int main = 44;
    int mainsec1 = 42;
    int mainsec2 = 46;
    int main2 = 88;
    int main2sec1 = 86;
    int main2sec2 = 90;
    int main3 = 132;
    int main3sec1 = 130;
    int main3sec2 = 134;
    int main4 = 176;
    int main4sec1 = 174;
    int main4sec2 = 178;
    int main50 = 110;
    int main50sec1 = 108;
    int main50sec2= 112;
    int main25= 55;
    int main25sec1= 53;
    int main25sec2= 57;

    public void init() {
        setSize(700,500);

    }




    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(64,64,main4,main4);
        g.fillRect(350,108,main50,main2);
        g.fillRect(240,372,main50,main2);


        g.setColor(Color.yellow);
        g.fillRect(152, 372, main,main2);
        g.fillRect(20,284,main,main3);
        g.fillRect(240,20,main50,main);
        g.fillRect(240,64,main50,main2);
        g.fillRect(350,328,main50,main2);
        g.fillRect(636,64,main,main3);
        g.fillRect(460,20,main,main);
        g.fillRect(460,64,main2,main);

        g.setColor(Color.blue);
        g.fillRect(350,20,main50,main2);
        g.fillRect(240,284,main50,main2);
        g.fillRect(460,240,main4,main4);

        g.setColor(Color.black);
        g.drawRect(20,20,660,440);
        g.drawRect(19,19,662,442);
        g.drawRect(18,18,664,444);
        g.drawRect(20,416,main3, main);
        g.drawRect(19,415,main3sec2, mainsec2);
        g.drawRect(21,417,main3sec1, mainsec1);
        g.drawRect(152, 372, main,main2);
        g.drawRect(151, 371, mainsec2,main2sec2);
        g.drawRect(153, 373, mainsec1,main2sec1);
        g.drawRect(196, 372, main,main2);
        g.drawRect(195, 371, mainsec2,main2sec2);
        g.drawRect(197, 373, mainsec1,main2sec1);
        g.drawRect(20,284,main,main3);
        g.drawRect(19,283,mainsec2,main3sec2);
        g.drawRect(21,285,mainsec1,main3sec1);
        g.drawRect(64,328,main2,main2);
        g.drawRect(63,327,main2sec2,main2sec2);
        g.drawRect(65,329,main2sec1,main2sec1);
        g.drawRect(64,240,main2,main2);
        g.drawRect(63,239,main2sec2,main2sec2);
        g.drawRect(65,241,main2sec1,main2sec1);
        g.fillRect(64,240,main2,main2);
        g.drawRect(152,328,main2,main);
        g.drawRect(151,327,main2sec2,mainsec2);
        g.drawRect(153,329,main2sec1,mainsec1);
        g.fillRect(152,328,main2,main);
        g.drawRect(152,284,main2,main);
        g.drawRect(151,285,main2sec2,mainsec2);
        g.drawRect(153,286,main2sec1,mainsec1);
        g.drawRect(152,240,main2,main);
        g.drawRect(151,239,main2sec2,mainsec2);
        g.drawRect(153,241,main2sec1,mainsec1);
        g.drawRect(64,64,main4,main4);
        g.drawRect(63,63,main4sec2,main4sec2);
        g.drawRect(65,65,main4sec1,main4sec1);
        g.drawRect(20,20,80,main);
        g.drawRect(19,19,82,mainsec2);
        g.drawRect(21,21,78,mainsec1);
        g.drawRect(20,64,main,main2);
        g.drawRect(19,63,mainsec2,main2sec2);
        g.drawRect(21,65,mainsec1,main2sec1);
        g.drawRect(20,152,main,main3);
        g.drawRect(19,151,mainsec2,main3sec2);
        g.drawRect(21,153,mainsec1,main3sec1);
        g.drawRect(100,20,140,main);
        g.drawRect(99,19,142,mainsec2);
        g.drawRect(101,21,138,mainsec1);

        g.drawRect(240,20,main50,main);
        g.drawRect(239,19,main50sec2,mainsec2);
        g.drawRect(241,21,main50sec1,mainsec1);

        g.drawRect(350,20,main50,main2);
        g.drawRect(349,19,main50sec2,main2sec2);
        g.drawRect(351,21,main50sec1,main2sec1);

        g.drawRect(240,64,main50,main2);
        g.drawRect(239,63,main50sec2,main2sec2);
        g.drawRect(241,65,main50sec1,main2sec1);

        g.drawRect(240,152,main25,main2);
        g.drawRect(239,151,main25sec2,main25sec2);
        g.drawRect(241,153,main25sec1,main2sec1);

        g.drawRect(295,152,main25,main2);
        g.drawRect(294,151,main25sec2,main2sec2);
        g.drawRect(296,153,main25sec1,main2sec1);

        g.drawRect(350,108,main50,main2);
        g.drawRect(349,107,main50sec2,main2sec2);
        g.drawRect(351,109,main50sec1,main2sec1);

        g.drawRect(350,196,main50,main);
        g.drawRect(349,195,main50sec2,mainsec2);
        g.drawRect(351,197,main50sec1,mainsec1);

        g.drawRect(240,240,main50,main);
        g.drawRect(239,239,main50sec2,mainsec2);
        g.drawRect(241,241,main50sec1,mainsec1);

        g.drawRect(240,284,main50,main2);
        g.drawRect(239,283,main50sec2,main2sec2);
        g.drawRect(241,285,main50sec1,main2sec1);

        g.drawRect(240,372,main50,main2);
        g.drawRect(239,371,main50sec2,main2sec2);
        g.drawRect(241,373,main50sec1,main2sec1);

        g.drawRect(350,240,main25,main2);
        g.drawRect(349,239,main25sec2,main2sec2);
        g.drawRect(351,241,main25sec1,main2sec1);

        g.drawRect(405,240,main25,main2);
        g.drawRect(404,239,main25sec2,main2sec2);
        g.drawRect(406,241,main25sec1,main2sec1);

        g.drawRect(350,328,main50,main2);
        g.drawRect(349,327,main50sec2,main2sec2);
        g.drawRect(351,329,main50sec1,main2sec1);

        g.drawRect(350,416,main25,main);
        g.drawRect(349,415,main25sec2,mainsec2);
        g.drawRect(351,417,main25sec1,mainsec1);

        g.drawRect(405,416,main25,main);
        g.drawRect(404,415,main25sec2,mainsec2);
        g.drawRect(406,417,main25sec1,mainsec1);
        g.fillRect(405,416,main25,main);


        g.drawRect(460,240,main4,main4);
        g.drawRect(459,239,main4sec2,main4sec2);
        g.drawRect(461,241,main4sec1,main4sec1);

        g.drawRect(460,416,140,main);
        g.drawRect(459,415,142,mainsec2);
        g.drawRect(461,417,138,mainsec1);

        g.drawRect(600,416,80,main);
        g.drawRect(599,415,82,mainsec2);
        g.drawRect(601,417,78,mainsec1);

        g.drawRect(636,328,main,main2);
        g.drawRect(635,327,mainsec2,main2sec2);
        g.drawRect(637,329,mainsec1,main2sec1);

        g.drawRect(636,196,main,main3);
        g.drawRect(635,195,mainsec2,main3sec2);
        g.drawRect(637,197,mainsec1,main3sec1);

        g.drawRect(636,64,main,main3);
        g.drawRect(635,63,mainsec2,main3sec2);
        g.drawRect(637,65,mainsec1,main3sec1);

        g.drawRect(548,64,main2,main2);
        g.drawRect(547,63,main2sec2,main2sec2);
        g.drawRect(549,65,main2sec1,main2sec1);

        g.drawRect(548,152,main2,main2);
        g.drawRect(547,151,main2sec2,main2sec2);
        g.drawRect(549,153,main2sec1,main2sec1);

        g.fillRect(548,152,main2,main2);

        g.drawRect(548,20,main3,main);
        g.drawRect(547,19,main3sec2,mainsec2);
        g.drawRect(549,21,main3sec1,mainsec1);

        g.drawRect(460,20,main,main);
        g.drawRect(459,19,mainsec2,mainsec2);
        g.drawRect(461,21,mainsec1,mainsec1);

        g.drawRect(504,20,main,main);
        g.drawRect(503,19,mainsec2,mainsec2);
        g.drawRect(505,21,mainsec1,mainsec1);

        g.fillRect(504,20,main,main);
        g.drawRect(460,64,main2,main);
        g.drawRect(459,63,main2sec2,mainsec2);
        g.drawRect(461,65,main2sec1,mainsec1);

        g.drawRect(460,108,main2,main);
        g.drawRect(459,107,main2sec2,mainsec2);
        g.drawRect(461,109,main2sec1,mainsec1);

        g.fillRect(460,108,main2,main);
        g.drawRect(460,152,main2,main);
        g.drawRect(459,151,main2sec2,mainsec2);
        g.drawRect(461,153,main2sec1,mainsec1);

        g.drawRect(460,196,main2,main);
        g.drawRect(459,195,main2sec2,mainsec2);
        g.drawRect(461,197,main2sec1,mainsec1);

        g.setColor(Color.white);
        g.fillRect(242,196,52,mainsec1);


    }
}
