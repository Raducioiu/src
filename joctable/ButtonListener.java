package joctable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import javax.swing.JLabel;
/**
 *
 * @author RaduCanu
 */
public class ButtonListener implements ActionListener{
    
    public final JLabel zar1;
    public final JLabel zar2;
    public final JLabel text;
    
        public ButtonListener (JLabel zar1, JLabel zar2, JLabel text) {
            
            this.zar1= zar1;
            this.zar2=zar2;
            this.text=text;
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new AruncaZar(zar1, zar2, text), 0, 100);
    }
    
}
