/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhanvien;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JDesktopPane;

/**
 *
 * @author Vi Vi
 */
public class DesktopPane extends JDesktopPane{
     @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Image img=Toolkit.getDefaultToolkit().getImage("vi/hinhnen.png");
        if(img!=null)
            g.drawImage(img, 0,0,this.getWidth(),this.getHeight(),this);
    
}
}
