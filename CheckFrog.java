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
public class CheckFrog {
    private Frog fr = new Frog();
    private Pipes pp = new Pipes();
    public boolean Frogdie(){
        //when frog tough ground
        if(fr.getY()  + 40 >= 400){
            return true;
        }
        //when frog tough pipes
        if(fr.getY() <= pp.getH1() && (((fr.getX()+40) >= pp.getX1())) && fr.getX() <= (pp.getX1() + 50)){
            return true;
        }
        if((fr.getY()+40)>=(pp.getH1()+100)&&((fr.getX()+40)>=pp.getX1()&&fr.getX()<=(pp.getX1()+50))){
            return true;
        }
        //--------------------------
        if(fr.getY() <= pp.getH2() && (((fr.getX()+50) >= pp.getX2())) && fr.getX() <= (pp.getX2() + 50)){
            return true;
        }
        if((fr.getY()+40)>=(pp.getH2()+100)&&((fr.getX()+40)>=pp.getX2()&&fr.getX()<=(pp.getX2()+50))){
            return true;
        }
        //----------------------------
        if(fr.getY() <= pp.getH3() && (((fr.getX()+40) >= pp.getX3())) && fr.getX() <= (pp.getX3() + 50)){
            return true;
        }
        if((fr.getY()+40)>=(pp.getH3()+100)&&((fr.getX()+40)>=pp.getX3()&&fr.getX()<=(pp.getX3()+50))){
            return true;
        }
        //-----------------------------
         if(fr.getY() <= pp.getH4() && (((fr.getX()+40) >= pp.getX4())) && fr.getX() <= (pp.getX4() + 50)){
            return true;
        }
        if((fr.getY()+40)>=(pp.getH4()+100)&&((fr.getX()+40)>=pp.getX4()&&fr.getX()<=(pp.getX4()+50))){
            return true;
        }
        return false;
    }
}
