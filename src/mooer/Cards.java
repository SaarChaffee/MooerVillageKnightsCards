/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mooer;

import javax.swing.ImageIcon;

/**
 *
 * @author Evistix
 */
//Evistix
public class Cards{//骑士卡牌类
    public String type;//属性 水火木
    public int var;//数值
    public String skill;//特殊技能（待定）
    public ImageIcon image;//图片
    Cards(){}
    Cards(String type,int var,ImageIcon image, String skill){
        this.image=image;
        this.skill=skill;
        this.type=type;
        this.var=var;
    }

   
}