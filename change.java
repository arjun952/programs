
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
/**
 *
 * @author ARJUN
 */
public class change extends Applet implements ItemListener{
    CheckboxGroup grp=new CheckboxGroup();
    Checkbox blue,pink,green,orange;
    TextArea ta;
    String s="text area. in this text are you can add words and change color";
    CheckboxGroup gp=new CheckboxGroup();
    Checkbox blue1,pink1,green1,orange1;
   
    public void init() {
       
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(600,400);
        Label label1 = new Label();
        label1. setText("click to change background colour--->");
       
        add(label1);
        blue=new Checkbox("blue",grp,false);
        pink=new Checkbox("pink",grp,false);
        green=new Checkbox("green",grp,false);
        orange=new Checkbox("orange",grp,false);
       
        add(blue);
        add(pink);
        add(green);
        add(orange);
       
        blue.addItemListener(this);
        pink.addItemListener(this);
        green.addItemListener(this);
        orange.addItemListener(this);
       
        ta=new TextArea(s,10,45);
        add(ta);
        Label label2 = new Label("click to change background colour--->");
        add(label2);
       
        blue1=new Checkbox("blue1",gp,false);
        pink1=new Checkbox("pink1",gp,false);
        green1=new Checkbox("green1",gp,false);
        orange1=new Checkbox("orange1",gp,false);
       
        add(blue1);
        add(pink1);
        add(green1);
        add(orange1);
       
        blue1.addItemListener(this);
        pink1.addItemListener(this);
        green1.addItemListener(this);
        orange1.addItemListener(this);
       
       
       
       
    }
    public void paint(){
       
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(grp.getSelectedCheckbox().getLabel()=="blue")
            setBackground(Color.BLUE);
        if(grp.getSelectedCheckbox().getLabel()=="green")
            setBackground(Color.GREEN);
        if(grp.getSelectedCheckbox().getLabel()=="pink")
            setBackground(Color.PINK);
        if(grp.getSelectedCheckbox().getLabel()=="orange")
            setBackground(Color.ORANGE);
       
        if (gp.getSelectedCheckbox().getLabel()=="blue1")
            ta.setForeground(Color.BLUE);
       
        if (gp.getSelectedCheckbox().getLabel()=="green1")
            ta.setForeground(Color.GREEN);
       
        if (gp.getSelectedCheckbox().getLabel()=="pink1")
            ta.setForeground(Color.PINK);
       
        if (gp.getSelectedCheckbox().getLabel()=="orange1")
            ta.setForeground(Color.ORANGE);
       
    }

  }