/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mooer;

import java.io.File;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author Evistix
 */
public class CardsCreat {//构建骑士卡牌数组
    
     CardsCreat(){           
       for(int i=0;i<=60;i++){
           Golbal.cardsList[i].image=new ImageIcon(getClass().getClassLoader().getResource("img_small_color/"+i+".jpg"));
           if(i<=20){
               Golbal.cardsList[i].type="水";
               Golbal.cardsList[i].var=i;
           }
           if(i<=40 && i>20){
               Golbal.cardsList[i].type="木";
               Golbal.cardsList[i].var=i-20;
           }
           if(i<=60 && i>40){
               Golbal.cardsList[i].type="火";
               Golbal.cardsList[i].var=i-40;
           }
       }    
   }
}
