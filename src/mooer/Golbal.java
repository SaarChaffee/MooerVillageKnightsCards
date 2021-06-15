/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mooer;

import javax.swing.ImageIcon;


/**
 * @author Evistix
 */
//Evistix
public class Golbal {//全局变量
    public static Cards[] cardsList = new Cards[61];//骑士卡牌数组
    public static int standby = 0;//用于等待对手准备卡线程
    public static int waitCard = 0;//等对面出牌
    public static int 端口 = 8888;
    public static String ip = "localhost";
    public static int UserUid;//Uid
    public static String Account;//昵称
    public static int UserBalance;//点券余额
    public static boolean[] Cards_isHave = new boolean[61];
    public static int CardNum = 0;//拥有卡牌数量
    //是否拥有某张卡牌
    public static int level;//等级
    public static int win;//胜场
    public static int lose;//负场

    static {
        for( int i = 0; i < 61; i++ ){//骑士卡牌数组添加空对象
            cardsList[i] = new Cards();
        }
    }

    public static void CalCardsNum() {
        int num = 0;
        for( int i = 1; i <= 60; i++ ){
            if( Golbal.Cards_isHave[i] ) num++;
        }
        Golbal.CardNum = num;
    }

}