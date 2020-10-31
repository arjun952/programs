
import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
/**
 *
 * @author ARJUN
 */
public class snowman extends Applet implements ItemListener {
    Frame f=new Frame();
    int fovalx=150-20,fovaly=50,fovalw=40,fovalh=40;
    int sovalx=150-35,sovaly=50+35,sovalw=70,sovalh=50;
    int tovalx=150-50,tovaly=50+80,tovalw=100,tovalh=60;
    int leyex=150-10,leyey=50+10,leyew=5,leyeh=5;
    int reyex=150+5,reyey=50+10,reyew=5,reyeh=5;
    int a1=150 - 10, a2=50 + 20, a3=20, a4=10,a5= 190,a6= 160;
    int rectx=150 - 15,recty= 50 - 20,rectw= 30,recth= 25;
    CheckboxGroup buttons=new CheckboxGroup();
    public void init() {
       Checkbox upButton = new Checkbox("up",buttons,false);
       Checkbox downButton = new Checkbox("down",buttons,false);
       Checkbox leftButton = new Checkbox("left",buttons,false);
Checkbox rightButton = new Checkbox("right",buttons,false);
               
                add(upButton);
                add(downButton);
                add(leftButton);
                add(rightButton);
               
                upButton.addItemListener(this);
                downButton.addItemListener(this);
                leftButton.addItemListener(this);
                rightButton.addItemListener(this);
               
                setBackground(Color.CYAN);
         
    }
    public void paint(Graphics g){
       
        g.setColor(Color.WHITE);
       
        g.fillOval (fovalx,fovaly,fovalw,fovalh);
        g.fillOval (sovalx,sovaly,sovalw,sovalh);
        g.fillOval (tovalx,tovaly,tovalw,tovalh);
       
        g.setColor(Color.BLACK);
       
        g.fillOval (leyex,leyey,leyew,leyeh);
g.fillOval (reyex,reyey,reyew,reyeh);
       
        g.drawArc (a1,a2,a3,a4,a5,a6);
       
       g.setColor(Color.ORANGE);
       

        g.fillRect (rectx,recty,rectw,recth);
           
           
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
       
       
        if(buttons.getSelectedCheckbox().getLabel()=="right"){
           fovalx+=20;sovalx+=20;tovalx+=20;
           leyex+=20;reyex+=20;rectx+=20;
           a1+=20;
           repaint();
        }
        if(buttons.getSelectedCheckbox().getLabel()=="left"){
           fovalx-=20;sovalx-=20;tovalx-=20;
           leyex-=20;reyex-=20;rectx-=20;
           a1-=20;
           repaint();
        }
        if(buttons.getSelectedCheckbox().getLabel()=="down"){
           fovaly+=20;sovaly+=20;tovaly+=20;
           leyey+=20;reyey+=20;recty+=20;
           a2+=20;
           repaint();
        }
        if(buttons.getSelectedCheckbox().getLabel()=="up"){
           fovaly-=20;sovaly-=20;tovaly-=20;
           leyey-=20;reyey-=20;recty-=20;
           a2-=20;
           repaint();
        }

   
}
}