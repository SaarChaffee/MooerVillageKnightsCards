/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mooer;

/**
 * @author Evistix
 */
public class Client {
    public static void loadIP( int i ) {
        if( i == 1 ){
            Golbal.端口 = 8888;
            Golbal.ip = "127.0.0.1";
        }
        if( i == 2 ){
            Golbal.端口 = 8888;
            Golbal.ip = "10.10.36.12";
        }
    }

}
