/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainScreen;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


/**
 *
 * @author DELL
 */
public class Frog extends JPanel{
     private static int y = 200;
     private static int x = 200;
     private BufferedImage bird;
     @Override
    public int getY() {
        return y;
    }

    public static void setY(int y) {
        Frog.y = y;
    }

     @Override
    public int getX() {
        return x;
    }

    public static void setX(int x) {
        Frog.x = x;
    }

  
    
    @Override
    public void paint(Graphics g){
         try {
             //        g.setColor(Color.red);
             //        g.fillRect(x, y, 40, 40);
                bird = ImageIO.read(new File("D:\\Documents\\Documents\\PRJ311\\HappyFrog\\Image\\bird.jpg"));
                g.drawImage(bird, x, y, null);
         } catch (IOException ex) {
             Logger.getLogger(Frog.class.getName()).log(Level.SEVERE, null, ex);
         }

    }
    public void increaseY(){
        y++;
    }
    public void decreaseY(){
        y = y - 45;
    }
}
