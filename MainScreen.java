 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainScreen;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

/**
 *
 * @author DELL      
 */
public class MainScreen extends JFrame{
    Paint pm = new Paint();
    private Frog fr = new Frog();
    public MainScreen() {            
        this.setSize(600, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(300, 100);
        this.setResizable(false);
        this.add(pm);     
        addKeyListener(new KeyAdapter() {     
            @Override
            public void keyPressed(KeyEvent e) {
                fr.decreaseY();
            }
                
        });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               fr.decreaseY();
            }
            
        });
    }   
     public static void main(String[] args) {
        MainScreen ms = new MainScreen();        
    }
}
