/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mooer;

import lite.*;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author a380v
 */
public class template {
    public static void main( String[] args ) {
        int uid = 625412389;
        String phone = "13710622199";
        try{
            System.out.println( util.isPhoneUsed( phone ) );
        }catch( Exception throwables ){
            throwables.printStackTrace();
        }
    }

}
