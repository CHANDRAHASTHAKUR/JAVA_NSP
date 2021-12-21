import java.applet.*;  
import java.awt.*;
import java.awt.event.*; 

public class movingcar extends Applet implements ActionListener {
    int a=0,b=0,c=0,f=0,x=0,y=0;
    Button u = new Button("Up");
    Button d = new Button("Down");
    Button l = new Button("Left");
    Button r = new Button("Right");
    
    public void init() {
        add(u);
        u.addActionListener(this);
        add(d);
        d.addActionListener(this);
        add(l);
        l.addActionListener(this);
        add(r);
        r.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == u) {
           y=y-1;
           a++;
        }
        else if (e.getSource() == d) {
            y=y+1;
            b++;
        }
        else if (e.getSource() == l) {
            x=x+1;
            c++;
        }
        else if (e.getSource() == r) {
            x=x-1;
            f++;
        }
        repaint();
    }

    public void paint(Graphics g){
        if(x>=0||y>=0){
            g.setColor(Color.BLUE);
            g.fillRect(200+x, 250+y, 500, 250);
            g.setColor(Color.RED);
            g.fillOval(250+x, 500+y, 100, 100);
            g.fillOval(500+x, 500+y, 100, 100);
            g.setColor(Color.BLACK);
            g.fillOval(275+x, 525+y, 50, 50);
            g.fillOval(525+x, 525+y, 50, 50);
        }
    }
}  
/* 
<applet code="niket.class" width="1000" height="1000"> 
</applet> 
*/