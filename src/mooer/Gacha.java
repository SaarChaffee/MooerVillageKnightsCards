/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mooer;

import java.util.Random;

  /*
卡牌顺序1-60  按照水木火的属性，每种属性从1排到20(数值越大越稀有)

点数

1-5 小概率   14%

6-10  超大概率   40%

11-15 中概率     30%

16-18 小概率    15.8%

19-20 极低概率  0.2%

*/

/**
 * @author Evistix 已测试成功
 */
public class Gacha {
    Gacha() {

    }

    static long t = 0;

    public static int result() { //直接调用返回抽到的序号
        int re = 0;
        t = System.nanoTime();
        Random rand = new Random( t );
        int ran;
        ran = Math.abs( rand.nextInt() ) % 1000 + 1;
        if( ran >= 1 && ran <= 140 ){
            re = Math.abs( rand.nextInt() ) % 5 + 1 + ( Math.abs( rand.nextInt() ) % 3 ) * 20;
        }
        if( ran > 140 && ran <= 540 ){
            re = Math.abs( rand.nextInt() ) % 5 + 6 + ( Math.abs( rand.nextInt() ) % 3 ) * 20;
        }
        if( ran > 540 && ran <= 840 ){
            re = Math.abs( rand.nextInt() ) % 5 + 11 + ( Math.abs( rand.nextInt() ) % 3 ) * 20;
        }
        if( ran > 840 && ran <= 998 ){
            re = Math.abs( rand.nextInt() ) % 3 + 16 + ( Math.abs( rand.nextInt() ) % 3 ) * 20;
        }
        if( ran > 998 && ran <= 1000 ){
            re = Math.abs( rand.nextInt() ) % 2 + 19 + ( Math.abs( rand.nextInt() ) % 3 ) * 20;
        }
        return re;
    }

}
