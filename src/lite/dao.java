/**
 * @Name: JavaClosingHomework
 * @Author: SaarChaffee
 * @Code: UTF-8
 * @Date: Created in 2021 2021/6/12
 */
package lite;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dao {
    public static int Update( String str ) {
        Statement stat = drives.getStat();
        int result = 0;
        try{
            result = stat.executeUpdate( str );
        }catch( SQLException throwable ){
            throwable.printStackTrace();
        }
        return result;
    }

    public static ResultSet Search( String str ) {
        Statement stat = drives.getStat();
        ResultSet result = null;
        try{
            result = stat.executeQuery( str );
        }catch( SQLException throwable ){
            throwable.printStackTrace();
        }
        return result;
    }
}
