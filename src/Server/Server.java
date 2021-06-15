/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Server;

import mooer.Golbal;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Evistix
 */
public class Server extends javax.swing.JFrame {

    /**
     * Creates new form Server
     */
    ServerSocket sSo;//接收
    ServerSocket sSo2;//接收另一个客户端
    SimpleDateFormat sdf;
    Socket handle;//发给第一个客户端
    Socket handle2;//发给第二个客户端
    int card1;//客户端1的卡序号
    int card2;//客户端2的卡序号
    int HP1;//客户端1体力值
    int HP2;//客户端2体力值
    int VS_result;//战斗结果

    int standby1 = 0;//客户端1准备状态
    int standby2 = 0;//客户段2准备状态

    public void standby() {//双方都准备好，向双方发送信息
        send( handle, "standby" );
        send( handle2, "standby" );
        standby1 = 0;
        standby2 = 0;
    }

    public void vs() {//返回  0平局  1:8888端口赢  2:7777端口赢

        System.out.println( Golbal.cardsList[card1].type + Golbal.cardsList[card1].var );
        System.out.println( Golbal.cardsList[card2].type + Golbal.cardsList[card1].var );

        if( Golbal.cardsList[card1].type.equals( Golbal.cardsList[card2].type ) ){
            if( Golbal.cardsList[card1].var == Golbal.cardsList[card2].var ){//属性点数都相等
                VS_result = 0;
                return;
            }
            else if( Golbal.cardsList[card1].var > Golbal.cardsList[card2].var ){//属性相同比点数
                VS_result = 1;
                return;
            }
            else if( Golbal.cardsList[card1].var < Golbal.cardsList[card2].var ){
                VS_result = 2;
                return;
            }
        }
        else{
            if( Golbal.cardsList[card1].type.equals( "火" ) ){//点数不同比属性
                if( Golbal.cardsList[card2].type.equals( "水" ) ){
                    VS_result = 2;
                    return;
                }
                if( Golbal.cardsList[card2].type.equals( "木" ) ){
                    VS_result = 1;
                    return;
                }

            }
            if( Golbal.cardsList[card1].type.equals( "水" ) ){
                if( Golbal.cardsList[card2].type.equals( "火" ) ){
                    VS_result = 1;
                    return;
                }
                if( Golbal.cardsList[card2].type.equals( "木" ) ){
                    VS_result = 2;
                    return;
                }
            }
            if( Golbal.cardsList[card1].type.equals( "木" ) ){
                if( Golbal.cardsList[card2].type.equals( "水" ) ){
                    VS_result = 1;
                    return;
                }
                if( Golbal.cardsList[card2].type.equals( "火" ) ){
                    VS_result = 2;
                    return;
                }
            }
        }
        VS_result = -1;//程序出错
    }

    public void updateVS() throws IOException {//对胜负信息进行处理
        System.out.println( "VSresult：" + VS_result );
        if( VS_result == 1 ){
            send( handle, "W" + card2 );//给客户端1发送信息
            send( handle2, "L" + card1 );//给客户端2发送信息
            HP2--;
        }
        if( VS_result == 2 ){
            send( handle, "L" + card2 );//给客户端1发送信息
            send( handle2, "W" + card1 );//给客户端2发送信息
            HP1--;
        }
        if( VS_result == 0 ){
            send( handle, "P" + card2 );//给客户端1发送信息
            send( handle2, "P" + card1 );//给客户端2发送信息

        }
        if( VS_result == -1 ){
            System.out.println( "判断结果出错 代码：-1" );
        }
        card1 = 0;
        card2 = 0;

        if( HP1 == 0 ){
            send( handle2, "win" );
            send( handle, "lose" );
            handle.close();
            handle2.close();
            sSo.close();
            sSo2.close();
        }
        if( HP2 == 0 ){
            send( handle, "win" );
            send( handle2, "lose" );
            handle.close();
            handle2.close();
            sSo.close();
            sSo2.close();
        }

    }

    public void send( Socket sk, String string ) {//服务器发送信息给客户端
        try{
            OutputStream os = sk.getOutputStream();
            DataOutputStream dos = new DataOutputStream( os );
            dos.writeUTF( string );
            dos.flush();
            text_r.append( "服务端 " + sdf.format( new Date( System.currentTimeMillis() ) ) + "\n" );
            text_r.append( text_l.getText() + "\n\n" );
            text_l.setText( "" );
            text_r.setCaretPosition( text_r.getText().length() );
        }catch( IOException ex ){
            ex.printStackTrace();
        }
    }


    public Server() {
        initComponents();

        standby1 = 0;
        standby2 = 0;
        card1 = 0;
        card2 = 0;
        HP1 = 5;
        HP2 = 5;


        sdf = new SimpleDateFormat( "HH:mm:ss" );
        try{
            sSo = new ServerSocket( 8888 );
            sSo2 = new ServerSocket( 7777 );

            new Thread( new Runnable() {

                public void run() {
                    try{
                        while( ( handle = sSo.accept() ) != null ){
                            InputStream is;
                            try{
                                is = handle.getInputStream();
                                DataInputStream dis = new DataInputStream( is );
                                String rec;
                                while( ( rec = dis.readUTF() ) != null ){
                                    text_r.append( "客户端 " + sdf.format( new Date( System.currentTimeMillis() ) ) + "\n" );
                                    text_r.append( rec + "\n\n" );
                                    text_l.setText( "" );
                                    text_r.setCaretPosition( text_r.getText().length() );
                                    if( rec.equals( "standby" ) ){
                                        Server.this.standby1 = 1;
                                    }
                                    if( standby1 == 1 && standby2 == 1 ){//双方都准备好
                                        standby();
                                    }
                                    if( rec.substring( 0, 1 ).equals( "C" ) ){ //接收到卡牌信息
                                        card1 = Integer.parseInt( rec.substring( 1, rec.length() ) );//取出卡牌序号长度
                                    }
                                    if( card1 != 0 && card2 != 0 ){//双方都接收到卡牌信息
                                        vs();
                                        updateVS();
                                    }
                                }
                            }catch( IOException ex ){
                                Logger.getLogger( Server.class.getName() ).log( Level.SEVERE, null, ex );
                            }
                        }
                    }catch( IOException ex ){
                        Logger.getLogger( Server.class.getName() ).log( Level.SEVERE, null, ex );
                    }
                }
            } ).start();

            new Thread( new Runnable() {

                public void run() {
                    try{
                        while( ( handle2 = sSo2.accept() ) != null ){
                            InputStream is2;
                            try{
                                is2 = handle2.getInputStream();
                                DataInputStream dis2 = new DataInputStream( is2 );
                                String rec2;
                                while( ( rec2 = dis2.readUTF() ) != null ){
                                    text_r.append( "客户端 " + sdf.format( new Date( System.currentTimeMillis() ) ) + "\n" );
                                    text_r.append( rec2 + "\n\n" );
                                    text_l.setText( "" );
                                    text_r.setCaretPosition( text_r.getText().length() );
                                    if( rec2.equals( "standby" ) ){
                                        Server.this.standby2 = 1;
                                    }
                                    if( standby1 == 1 && standby2 == 1 ){//双方都准备好
                                        standby();
                                    }
                                    if( rec2.substring( 0, 1 ).equals( "C" ) ){ //接收到卡牌信息
                                        card2 = Integer.parseInt( rec2.substring( 1, rec2.length() ) );//取出卡牌序号长度
                                    }
                                    if( card1 != 0 && card2 != 0 ){//双方都接收到卡牌信息
                                        vs();
                                        updateVS();
                                    }
                                }
                            }catch( IOException ex ){
                                Logger.getLogger( Server.class.getName() ).log( Level.SEVERE, null, ex );
                            }
                        }
                    }catch( IOException ex ){
                        Logger.getLogger( Server.class.getName() ).log( Level.SEVERE, null, ex );
                    }
                }
            } ).start();

        }catch( IOException e ){
            e.printStackTrace();
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        text_r = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        text_l = new javax.swing.JTextArea();
        link = new javax.swing.JButton();
        send = new javax.swing.JButton();
        ps = new javax.swing.JLabel();
        send2 = new javax.swing.JButton();

        setDefaultCloseOperation( javax.swing.WindowConstants.EXIT_ON_CLOSE );

        text_r.setColumns( 20 );
        text_r.setRows( 5 );
        jScrollPane1.setViewportView( text_r );

        text_l.setColumns( 20 );
        text_l.setRows( 5 );
        jScrollPane2.setViewportView( text_l );

        link.setText( "连接" );
        link.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                linkActionPerformed( evt );
            }
        } );

        send.setText( "发送" );
        send.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                sendActionPerformed( evt );
            }
        } );

        ps.setText( "先点这个" );

        send2.setText( "发送2" );
        send2.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                send2ActionPerformed( evt );
            }
        } );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout( getContentPane() );
        getContentPane().setLayout( layout );
        layout.setHorizontalGroup(
                layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addGroup( javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap( 19, 19, 19 )
                                .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                        .addGroup( layout.createSequentialGroup()
                                                .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                                        .addComponent( link, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                        .addComponent( jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE ) )
                                                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE ) )
                                        .addGroup( javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.TRAILING )
                                                        .addGroup( layout.createSequentialGroup()
                                                                .addGap( 0, 0, Short.MAX_VALUE )
                                                                .addComponent( send, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE ) )
                                                        .addGroup( layout.createSequentialGroup()
                                                                .addGap( 21, 21, 21 )
                                                                .addComponent( ps, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                                                                .addComponent( send2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE ) ) )
                                                .addGap( 39, 39, 39 ) ) )
                                .addComponent( jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE )
                                .addGap( 24, 24, 24 ) )
                                 );
        layout.setVerticalGroup(
                layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addGroup( layout.createSequentialGroup()
                                .addGap( 23, 23, 23 )
                                .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                        .addGroup( layout.createSequentialGroup()
                                                .addComponent( jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                .addGap( 26, 26, 26 )
                                                .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                                                        .addComponent( link, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                        .addComponent( send, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE ) )
                                                .addGap( 18, 18, 18 )
                                                .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                                        .addComponent( ps )
                                                        .addComponent( send2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE ) ) )
                                        .addComponent( jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE ) )
                                .addContainerGap( 24, Short.MAX_VALUE ) )
                               );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_sendActionPerformed
        // TODO add your handling code here:
        try{
            OutputStream os = handle.getOutputStream();
            DataOutputStream dos = new DataOutputStream( os );
            dos.writeUTF( text_l.getText() );
            dos.flush();
            text_r.append( "服务端 " + sdf.format( new Date( System.currentTimeMillis() ) ) + "\n" );
            text_r.append( text_l.getText() + "\n\n" );
            text_l.setText( "" );
            text_r.setCaretPosition( text_r.getText().length() );
        }catch( IOException ex ){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_sendActionPerformed

    private void linkActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_linkActionPerformed
        System.out.println( card1 );
        System.out.println( card2 );
        System.out.println( "standby1" + standby1 );
        System.out.println( "standby2" + standby2 );
        System.out.println( VS_result );
// TODO add your handling code here:
//       try {
//            OutputStream os2 = handle2.getOutputStream();
//            DataOutputStream dos2 = new DataOutputStream(os2);
//            dos2.writeUTF(text_l.getText());
//            dos2.flush();
//           text_r.append("服务端 " + sdf.format(new Date(System.currentTimeMillis())) + "\n");
//           text_r.append(text_l.getText() + "\n\n");
//            text_l.setText("");
//           text_r.setCaretPosition(text_r.getText().length());      
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
    }//GEN-LAST:event_linkActionPerformed

    private void send2ActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_send2ActionPerformed
        // TODO add your handling code here:
        try{
            OutputStream os2 = handle2.getOutputStream();
            DataOutputStream dos2 = new DataOutputStream( os2 );
            dos2.writeUTF( text_l.getText() );
            dos2.flush();
            text_r.append( "服务端 " + sdf.format( new Date( System.currentTimeMillis() ) ) + "\n" );
            text_r.append( text_l.getText() + "\n\n" );
            text_l.setText( "" );
            text_r.setCaretPosition( text_r.getText().length() );
        }catch( IOException ex ){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_send2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main( String args[] ) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try{
            for( javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels() ){
                if( "Nimbus".equals( info.getName() ) ){
                    javax.swing.UIManager.setLookAndFeel( info.getClassName() );
                    break;
                }
            }
        }catch( ClassNotFoundException ex ){
            java.util.logging.Logger.getLogger( Server.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        }catch( InstantiationException ex ){
            java.util.logging.Logger.getLogger( Server.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        }catch( IllegalAccessException ex ){
            java.util.logging.Logger.getLogger( Server.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        }catch( javax.swing.UnsupportedLookAndFeelException ex ){
            java.util.logging.Logger.getLogger( Server.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater( new Runnable() {
            public void run() {
                new Server().setVisible( true );
            }
        } );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton link;
    private javax.swing.JLabel ps;
    private javax.swing.JButton send;
    private javax.swing.JButton send2;
    private javax.swing.JTextArea text_l;
    private javax.swing.JTextArea text_r;
    // End of variables declaration//GEN-END:variables
}
