/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainScreen;

import java.awt.Color;
import java.awt.Font;
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
public class Paint extends JPanel implements Runnable {

    private Frog fr = new Frog();
    private Pipes pp = new Pipes();
    private CheckFrog check = new CheckFrog();
    private CountScores cs = new CountScores();
    private BufferedImage bg, ground;
    Thread tr;

    public Paint() {
        Thread tr = new Thread(this);
        tr.start();
    }

    @Override
    public void paint(Graphics g) {
        try {
            // paint is function, not set name
//        g.setColor(Color.cyan);
//        g.fillRect(0, 0, getWidth(), getHeight());
            bg = ImageIO.read(new File("D:\\Documents\\Documents\\PRJ311\\HappyFrog\\Image\\flap.png"));
            g.drawImage(bg, 0, 0, null);
            pp.paint(g);
//            g.setColor(Color.green);
//            g.fillRect(0, 400, getWidth(), getHeight());
//            g.setColor(Color.orange);
//            g.fillRect(0, 410, getWidth(), getHeight());
            ground = ImageIO.read(new File("D:\\Documents\\Documents\\PRJ311\\HappyFrog\\Image\\ground.jpg"));
            g.drawImage(ground, 0, 400, null);
            fr.paint(g);
            g.setColor(Color.red);
            g.setFont(new Font("Arial", Font.BOLD, 20));
            g.drawString("Score: " + cs.getScore(), 10, 20);
        } catch (IOException ex) {
            Logger.getLogger(Paint.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void run() {
        while (true) {
            repaint();//re-call paint function
            pp.PipesRun();
            try {
                Thread.sleep(9);
            } catch (InterruptedException ex) {
                Logger.getLogger(Paint.class.getName()).log(Level.SEVERE, null, ex);
            }
            pp.RepeatPipes();
            fr.increaseY();
            if (check.Frogdie() == true) {
                tr.stop();
            }

        }
    }

}
