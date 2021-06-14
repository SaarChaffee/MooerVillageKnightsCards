/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mooer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import lite.util;

/**
 * @author Evistix
 */
public class User_Msg_Load {//导入角色数据

    public User_Msg_Load() {
        new CardsCreat();
        UserDataLoad();
        Golbal.CalCardsNum();
    }

    public static void UserDataLoad() {
        ResultSet re = util.getAllUserData( Golbal.UserUid );
        try{
            re.next();
            Golbal.Account = re.getString( "Account" );
            Golbal.UserBalance = re.getInt( "UserBalance" );
            Golbal.level = re.getInt( "UserLevel" );
            Golbal.Cards_isHave = util.colles( Golbal.UserUid );
        }catch( SQLException ex ){
            Logger.getLogger( User_Msg_Load.class.getName() ).log( Level.SEVERE, null, ex );
        }

    }

}
