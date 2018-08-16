/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainScreen;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.accessibility.AccessibleContext;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;

/**
 *
 * @author DELL
 */
public class Pipes extends JPanel {

    private static int x1 = 500, x2 = x1 + 140, x3 = x2 + 140, x4 = x3 + 140;
    private static int h1, h2, h3, h4;
    private static boolean flag1 = false;
    private static boolean flag2 = false;
    private static boolean flag3 = false;
    private static boolean flag4 = false;
    private BufferedImage pipeUp, pipeDown;

    public static int getX1() {
        return x1;
    }

    public static void setX1(int x1) {
        Pipes.x1 = x1;
    }

    public static int getX2() {
        return x2;
    }

    public static void setX2(int x2) {
        Pipes.x2 = x2;
    }

    public static int getX3() {
        return x3;
    }

    public static void setX3(int x3) {
        Pipes.x3 = x3;
    }

    public static int getX4() {
        return x4;
    }

    public static void setX4(int x4) {
        Pipes.x4 = x4;
    }

    public static int getH1() {
        return h1;
    }

    public static void setH1(int h1) {
        Pipes.h1 = h1;
    }

    public static int getH2() {
        return h2;
    }

    public static void setH2(int h2) {
        Pipes.h2 = h2;
    }

    public static int getH3() {
        return h3;
    }

    public static void setH3(int h3) {
        Pipes.h3 = h3;
    }

    public static int getH4() {
        return h4;
    }

    public static void setH4(int h4) {
        Pipes.h4 = h4;
    }

    public static boolean isFlag1() {
        return flag1;
    }

    public static void setFlag1(boolean flag1) {
        Pipes.flag1 = flag1;
    }

    public static boolean isFlag2() {
        return flag2;
    }

    public static void setFlag2(boolean flag2) {
        Pipes.flag2 = flag2;
    }

    public static boolean isFlag3() {
        return flag3;
    }

    public static void setFlag3(boolean flag3) {
        Pipes.flag3 = flag3;
    }

    public static boolean isFlag4() {
        return flag4;
    }

    public static void setFlag4(boolean flag4) {
        Pipes.flag4 = flag4;
    }

    public ComponentUI getUi() {
        return ui;
    }

    public void setUi(ComponentUI ui) {
        this.ui = ui;
    }

    public EventListenerList getListenerList() {
        return listenerList;
    }

    public void setListenerList(EventListenerList listenerList) {
        this.listenerList = listenerList;
    }

    public AccessibleContext getAccessibleContext() {
        return accessibleContext;
    }

    public void setAccessibleContext(AccessibleContext accessibleContext) {
        this.accessibleContext = accessibleContext;
    }

    public void RandomH() {
        Random rd = new Random();
        if (flag1 == false) {
            h1 = rd.nextInt(200);
            flag1 = true;
        }
        if (flag2 == false) {
            h2 = rd.nextInt(200);
            flag2 = true;
        }
        if (flag3 == false) {
            h3 = rd.nextInt(200);
            flag3 = true;
        }
        if (flag4 == false) {
            h4 = rd.nextInt(200);
            flag4 = true;
        }
    }

    @Override
    public void paint(Graphics g) {

        try {
            RandomH();
//        g.setColor(Color.green);
//        g.fillRect(x1, 0, 50, h1);
//        
//        g.setColor(Color.green);
//        g.fillRect(x1, h1 + 100, 50, 500);
            pipeUp = ImageIO.read(new File("D:\\Documents\\Documents\\PRJ311\\HappyFrog\\Image\\pipes.jpg"));
            pipeDown = ImageIO.read(new File("D:\\Documents\\Documents\\PRJ311\\HappyFrog\\Image\\pipes2.jpg"));
            g.drawImage(pipeUp, x1, 0, 50, h1, null);
            g.drawImage(pipeDown, x1, h1 + 100, 50, 500, null);
//            g.setColor(Color.green);
//            g.fillRect(x2, 0, 50, h2);
//
//            g.setColor(Color.green);
//            g.fillRect(x2, h2 + 100, 50, 500);
            g.drawImage(pipeUp, x2, 0, 50, h2, null);
            g.drawImage(pipeDown, x2, h2 + 100, 50, 500, null);
            g.setColor(Color.green);
//            g.fillRect(x3, 0, 50, h3);
//
//            g.setColor(Color.green);
//            g.fillRect(x3, h3 + 100, 50, 500);
             g.drawImage(pipeUp, x3, 0, 50, h3, null);
            g.drawImage(pipeDown, x3, h3 + 100, 50, 500, null);
//            g.setColor(Color.green);
//            g.fillRect(x4, 0, 50, h4);
//
//            g.setColor(Color.green);
//            g.fillRect(x4, h4 + 100, 50, 500);
             g.drawImage(pipeUp, x4, 0, 50, h4, null);
            g.drawImage(pipeDown, x4, h4 + 100, 50, 500, null);
        } catch (IOException ex) {
            Logger.getLogger(Pipes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void PipesRun() {
        x1--;
        x2--;
        x3--;
        x4--;
    }

    public void RepeatPipes() {
        if (x1 == -50) {
            x1 = 500;
            flag1 = false;
        }
        if (x2 == -50) {
            x2 = 500;
            flag2 = false;
        }
        if (x3 == -50) {
            x3 = 500;
            flag3 = false;
        }
        if (x4 == -50) {
            x4 = 500;
            flag4 = false;
        }
    }
}
