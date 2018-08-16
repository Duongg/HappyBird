/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainScreen;

/**
 *
 * @author DELL
 */
public class CountScores {
    private static int score =0;
    private Frog fr = new Frog();
    private Pipes pp = new Pipes();
    private static boolean flag = false;
    public static int getScore() {
        return score;
    }
    
    
    public void addScore(){
        
        if(fr.getX() + 40 > pp.getX1() && fr.getX() < pp.getX1() + 50){
           
            flag = true;
        }
        if(flag == true &&fr.getX() > pp.getX1() +50){
            score ++;
            flag = false;
        }
        if(fr.getX() + 40 > pp.getX2() && fr.getX() < pp.getX2() + 50){
            flag = true;
        }
        if(flag == true &&fr.getX() > pp.getX2() +50){
            score ++;
            flag = false;
        }
        if(fr.getX() + 40 > pp.getX3() && fr.getX() < pp.getX3() + 50){
            flag = true;
        }
        if(flag == true &&fr.getX() > pp.getX3() +50){
            score ++;
            flag = false;
        }
        if(fr.getX() + 40 > pp.getX4() && fr.getX() < pp.getX4() + 50){
            flag = true;
        }
        if(flag == true &&fr.getX() > pp.getX4() +50){
            score ++;
            flag = false;
        }
    }
    
}
