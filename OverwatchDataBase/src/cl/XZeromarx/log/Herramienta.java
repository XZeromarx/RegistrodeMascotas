package cl.XZeromarx.log;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author XZeroMarx
 */
public class Herramienta {
    Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
    
    

    public Herramienta() {
    }
    
    public int getAltoPantalla(){
        
        int altoPantalla = pantalla.height;
        
        return altoPantalla;
    }
    
    public int getAnchoPantalla(){
        int anchoPantalla = pantalla.width;
        return anchoPantalla;
    }
    
    
    
}
