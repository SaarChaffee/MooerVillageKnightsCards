/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mooer;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Evistix
 */
//Evistix
public class ChangeImg {//给标签换图片
    public static void changeImg(JLabel jlabel,int i){
        jlabel.setIcon(Golbal.cardsList[i].image);
    }
     public  void changeImgBlack(JLabel jlabel,int i){
        jlabel.setIcon(new ImageIcon(getClass().getClassLoader().getResource("img_small/"+i+".jpg")));
    }
    
    
}
