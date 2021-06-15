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
            Golbal.端口 = 7777;
            Golbal.ip = "localhost";
        }
        if( i == 2 ){
            Golbal.端口 = 7777;
            Golbal.ip = "192.168.1.140";
        }
    }

}
