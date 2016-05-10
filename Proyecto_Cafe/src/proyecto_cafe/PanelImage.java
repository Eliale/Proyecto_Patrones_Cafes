/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_cafe;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author laloO
 */
public class PanelImage extends JPanel {
    
    
        
    @Override
    public void paintComponent(Graphics g){
        Dimension tam = getSize();
        
        ImageIcon imagen = new ImageIcon(new ImageIcon(getClass().getResource("/imagen/cafe1.jpg")).getImage());
        g.drawImage(imagen.getImage(), 0, 0, tam.width, tam.height, null);
    }
           
}
