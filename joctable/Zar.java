package joctable;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author RaduCanu
 */
public class Zar {
    public final IconAct getter;
    
    public Zar() {
    getter = new IconAct();
    }
    
    public void start() {
     
       JLabel zar1=new JLabel(getter.getIcon("stone1.png"));
       JLabel zar2=new JLabel(getter.getIcon("stone1.png"));
       JButton button = new JButton("Arunca");
       JLabel text= new JLabel("Total: 2");
       JFrame window = new JFrame("Arunca zarurile ");
       Container cp = window.getContentPane();
     
       cp.setLayout(new FlowLayout());
       cp.add(zar1);
       cp.add(zar2);
       cp.add(button);
       cp.add (text);
       
       button.addActionListener(new ButtonListener(zar1, zar2, text));
       
        window.pack();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
   }
    
    
}
