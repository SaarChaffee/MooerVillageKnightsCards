/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mooer;

import JFrame.Fight;
import JFrame.Fight_Standby;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Evistix
 */
public class CtoS {
    public Socket sk;
    public SimpleDateFormat sdf;
    public Socket handle;

    public void send( String sendMsg ) {
        try{

            OutputStream os = sk.getOutputStream();
            DataOutputStream dos = new DataOutputStream( os );
            dos.writeUTF( sendMsg );
            dos.flush();
//            text_r.append("客户端 " + sdf.format(new Date(System.currentTimeMillis())) + "\n");
//           text_r.append(text_l.getText() + "\n\n");
//            text_l.setText("");
//           text_r.setCaretPosition(text_r.getText().length());      
        }catch( IOException ex ){
            ex.printStackTrace();
        }
    }

    public CtoS( String socket ) {//"127.0.0.1"

        sdf = new SimpleDateFormat( "HH:mm:ss" );
        try{
            sk = new Socket( socket, Golbal.端口 );
            new Thread( () -> {
                InputStream is;
                try{
                    is = sk.getInputStream();
                    DataInputStream dis = new DataInputStream( is );
                    String read;
                    while( ( read = dis.readUTF() ) != null ){
                        System.out.print( read );
                        if( read.equals( "win" ) ){
                            Fight.当前状态.setText( "获得胜利，点击返回退出" );
                            Fight.出牌.setVisible( false );
                            Fight.返回.setVisible( true );

                        }
                        if( read.equals( "lose" ) ){
                            Fight.当前状态.setText( "对战失败，点击返回退出" );
                            Fight.出牌.setVisible( false );
                            Fight.返回.setVisible( true );

                        }

                        if( read.equals( "standby" ) ){
                            Golbal.standby = 1;
                            Fight_Standby.准备信息.setText( "对方已准备" );

                        }
                        else if( read.substring( 0, 1 ).equals( "W" ) || read.substring( 0, 1 ).equals( "L" ) || read.substring( 0, 1 ).equals( "P" ) ){//W胜利 L输
                            Golbal.waitCard = 1;
                            // Fight.unlock();//解锁

                            int numLen = Integer.parseInt( read.substring( 1, read.length() ) );//取出卡牌序号长度
                            ChangeImg.changeImg( Fight.敌方展示卡, numLen );
                            Fight.对方展示卡属性.setText( Golbal.cardsList[numLen].type + Golbal.cardsList[numLen].var );

                            if( read.substring( 0, 1 ).equals( "W" ) ){//胜利
                                Fight.当前状态.setText( "胜利！" );
                                Fight.rightHP -= 1;
                            }
                            else if( read.substring( 0, 1 ).equals( "L" ) ){//失败
                                Fight.当前状态.setText( "失败" );
                                Fight.liftHP -= 1;
                            }
                            else if( read.substring( 0, 1 ).equals( "P" ) ){//平局
                                Fight.当前状态.setText( "平局" );

                            }
                            Fight.updateHP();//更新双方体力值
                            Fight.摸牌.setVisible( true );

                        }
                        //text_r.append("服务端 " + sdf.format(new Date(System.currentTimeMillis())) + "\n");
                        //text_r.append(read + "\n\n");
                        // text_l.setText("");
                        // text_r.setCaretPosition( text_r.getText().length());
                    }
                }catch( IOException ex ){
                    //Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }
            } ).start();
        }catch( IOException ex ){
            ex.printStackTrace();
        }

    }
}
