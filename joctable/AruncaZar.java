package joctable;

import java.util.Random;
import java.util.TimerTask;
import javax.swing.Icon;
import javax.swing.JLabel;
/**
 *
 * @author RaduCanu
 */
 class AruncaZar extends TimerTask {
    public final JLabel zar1;
    public final JLabel zar2;
    public final JLabel text;
    public final Random rg= new Random();
    public final IconAct getter;
    public int c;
    
    public AruncaZar (JLabel zar1, JLabel zar2, JLabel text){
            this.zar1= zar1;
            this.zar2=zar2;
            this.text=text;
            c=25;
            getter=new IconAct();
    }
    public void run(){
        if(c>0){
            c--;
            int n1=rg.nextInt(6);
            int n2=rg.nextInt(6);
            Icon icon1= getter.getIcon("stone"+ (n1+1 + ".png"));
            Icon icon2= getter.getIcon("stone"+ (n2+1 + ".png"));      
            zar1.setIcon(icon1);
            zar2.setIcon(icon2);
            text.setText("Total:" + (n1+n2+2));
        }
        else {
            this.cancel();
        }
    }
  
    }
    

