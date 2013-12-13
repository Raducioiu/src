package joctable;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author RaduCanu
 */
public class IconAct {
   
    public Icon getIcon( String name){
        return new ImageIcon(Zar.class.getResource("/joctable/images/" + name));
        
    }


}
