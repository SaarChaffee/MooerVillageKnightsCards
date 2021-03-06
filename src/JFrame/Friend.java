/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JFrame;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import lite.*;
import mooer.*;


/**
 * @author Administrator
 */
public class Friend extends JFrame {

    /**
     * Creates new form register
     */
    void updateMsg() {
        等级.setText( "等级：" + Golbal.level );
        点券.setText( "点券：" + Golbal.UserBalance + "" );
        呢称.setText( "呢称：" + Golbal.Account + " uid:" + Golbal.UserUid );

    }

    private void updateFriendList() {
        ArrayList list = util.getFriendList( Golbal.UserUid );
        for( Object i : list ){
            好友表.setValueAt( ( Integer ) i, list.indexOf( i ), 0 );
            好友表.setValueAt( util.getUserAccountByUid( ( Integer ) i ), list.indexOf( i ), 1 );
        }

    }

    public Friend() {
        initComponents();
        updateMsg();
        updateFriendList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        背景 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        头像1 = new javax.swing.JLabel();
        CDK = new javax.swing.JLabel();
        删除好友 = new javax.swing.JButton();
        返回 = new javax.swing.JButton();
        呢称 = new javax.swing.JLabel();
        等级 = new javax.swing.JLabel();
        点券 = new javax.swing.JLabel();
        UidTyping = new javax.swing.JTextPane();
        添加好友 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        好友表 = new javax.swing.JTable();
        刷新 = new javax.swing.JButton();

        jLabel1.setText( "jLabel1" );

        setDefaultCloseOperation( javax.swing.WindowConstants.EXIT_ON_CLOSE );
        setTitle( "我的好友" );

        背景.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/backGround/b5.png" ) ) ); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout( jPanel1 );
        jPanel1.setLayout( jPanel1Layout );
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addGroup( javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap( 2, 2, 2 )
                                .addComponent( 背景, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                                .addContainerGap() )
                                        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addComponent( 背景, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                                      );

        jPanel2.setOpaque( false );

        头像1.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/icon/i1.gif" ) ) ); // NOI18N
        头像1.setToolTipText( "" );

        CDK.setFont( new java.awt.Font( "宋体", 1, 14 ) ); // NOI18N
        CDK.setText( "好友列表" );

        删除好友.setFont( new java.awt.Font( "宋体", 1, 14 ) ); // NOI18N
        删除好友.setText( "删除好友" );
        删除好友.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                删除好友ActionPerformed( evt );
            }
        } );

        返回.setFont( new java.awt.Font( "宋体", 1, 14 ) ); // NOI18N
        返回.setText( "返回" );
        返回.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                返回ActionPerformed( evt );
            }
        } );

        呢称.setFont( new java.awt.Font( "宋体", 1, 14 ) ); // NOI18N
        呢称.setText( "呢称" );

        等级.setFont( new java.awt.Font( "宋体", 1, 14 ) ); // NOI18N
        等级.setText( "等级" );

        点券.setFont( new java.awt.Font( "宋体", 1, 14 ) ); // NOI18N
        点券.setText( "点券" );

        UidTyping.setName( "" ); // NOI18N

        添加好友.setFont( new java.awt.Font( "宋体", 1, 14 ) ); // NOI18N
        添加好友.setText( "添加好友" );
        添加好友.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                添加好友ActionPerformed( evt );
            }
        } );

        好友表.setModel( new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        { null, null },
                        { null, null },
                        { null, null },
                        { null, null },
                        { null, null },
                        { null, null },
                        { null, null },
                        { null, null },
                        { null, null },
                        { null, null },
                        { null, null },
                        { null, null },
                        { null, null },
                        { null, null },
                        { null, null },
                        { null, null },
                        { null, null },
                        { null, null },
                        { null, null },
                        { null, null },
                        { null, null },
                        { null, null },
                        { null, null },
                        { null, null },
                        { null, null }
                },
                new String[]{
                        "好友uid", "好友昵称"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.Long.class, java.lang.String.class
            };

            public Class getColumnClass( int columnIndex ) {
                return types[columnIndex];
            }
        } );
        jScrollPane1.setViewportView( 好友表 );

        刷新.setText( "刷新" );
        刷新.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                刷新ActionPerformed( evt );
            }
        } );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout( jPanel2 );
        jPanel2.setLayout( jPanel2Layout );
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addGroup( jPanel2Layout.createSequentialGroup()
                                .addGroup( jPanel2Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                        .addGroup( jPanel2Layout.createSequentialGroup()
                                                .addGap( 29, 29, 29 )
                                                .addComponent( 头像1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                .addGap( 18, 18, 18 )
                                                .addGroup( jPanel2Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                                        .addComponent( 等级, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                        .addComponent( 点券, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                        .addComponent( 呢称, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE ) ) )
                                        .addGroup( jPanel2Layout.createSequentialGroup()
                                                .addGroup( jPanel2Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                                        .addGroup( jPanel2Layout.createSequentialGroup()
                                                                .addGap( 245, 245, 245 )
                                                                .addComponent( jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED ) )
                                                        .addGroup( javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent( CDK, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                                .addGap( 41, 41, 41 ) ) )
                                                .addGroup( jPanel2Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                                        .addComponent( 删除好友, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                        .addComponent( 返回, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                        .addComponent( 添加好友, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                        .addComponent( UidTyping, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                        .addComponent( 刷新, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE ) ) ) )
                                .addContainerGap( 57, Short.MAX_VALUE ) )
                                        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addGroup( jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup( jPanel2Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.TRAILING )
                                        .addComponent( 头像1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE )
                                        .addGroup( jPanel2Layout.createSequentialGroup()
                                                .addComponent( 呢称, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                .addGap( 20, 20, 20 )
                                                .addComponent( 等级 )
                                                .addGap( 24, 24, 24 )
                                                .addComponent( 点券 ) ) )
                                .addGroup( jPanel2Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                        .addGroup( jPanel2Layout.createSequentialGroup()
                                                .addGap( 126, 126, 126 )
                                                .addComponent( UidTyping, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                                                .addComponent( 刷新, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                                                .addComponent( 添加好友, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.UNRELATED )
                                                .addComponent( 删除好友, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                                                .addComponent( 返回, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                .addGap( 0, 85, Short.MAX_VALUE ) )
                                        .addGroup( javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                                                .addComponent( CDK, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                                                .addComponent( jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ) ) ) )
                                      );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout( getContentPane() );
        getContentPane().setLayout( layout );
        layout.setHorizontalGroup(
                layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addComponent( jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                        .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                .addComponent( jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE ) )
                                 );
        layout.setVerticalGroup(
                layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addComponent( jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                        .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                .addComponent( jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE ) )
                               );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void 返回ActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_返回ActionPerformed
        // TODO add your handling code here:
        this.setVisible( false );
        new Main_UI().setVisible( true );
    }//GEN-LAST:event_返回ActionPerformed

    private void 删除好友ActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_删除好友ActionPerformed
        // TODO add your handling code here:
        int uid = Integer.valueOf( UidTyping.getText() );
        if( util.isFriend( Golbal.UserUid, uid ) ){
            if( JOptionPane.showConfirmDialog( null, "确认要删除好友吗？", "确认", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE ) == JOptionPane.YES_OPTION ){
                int result = util.deleteFriend( Golbal.UserUid, uid );
                if( result == 1 ){
                    JOptionPane.showMessageDialog( null, "删除成功", null, JOptionPane.INFORMATION_MESSAGE );
                    this.setVisible( false );
                    new Friend().setVisible( true );
                }
                else{
                    JOptionPane.showMessageDialog( null, "删除失败，请联系系统管理员", null, JOptionPane.INFORMATION_MESSAGE );
                }
            }
        }
        else{
            JOptionPane.showMessageDialog( null, "uid输入错误或不是好友uid，请重新输入", null, JOptionPane.INFORMATION_MESSAGE );
        }
    }//GEN-LAST:event_删除好友ActionPerformed

    private void 添加好友ActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_添加好友ActionPerformed
        // TODO add your handling code here:
        int uid = Integer.valueOf( UidTyping.getText() );
        if( !util.isFriend( Golbal.UserUid, uid ) ){
            int result = util.addFriend( Golbal.UserUid, uid );
            if( result == 1 ){
                JOptionPane.showMessageDialog( null, "添加成功", null, JOptionPane.INFORMATION_MESSAGE );
                this.setVisible( false );
                new Friend().setVisible( true );
            }
            else{
                JOptionPane.showMessageDialog( null, "添加失败，请联系系统管理员", null, JOptionPane.INFORMATION_MESSAGE );
            }
        }
        else{
            JOptionPane.showMessageDialog( null, "uid输入错误或不是好友uid，请重新输入", null, JOptionPane.INFORMATION_MESSAGE );
        }
    }//GEN-LAST:event_添加好友ActionPerformed

    private void 刷新ActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_刷新ActionPerformed
        // TODO add your handling code here:
        this.setVisible( false );
        new Friend().setVisible( true );
    }//GEN-LAST:event_刷新ActionPerformed


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
            for( UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels() ){
                if( "Nimbus".equals( info.getName() ) ){
                    UIManager.setLookAndFeel( info.getClassName() );
                    break;
                }
            }
        }catch( ClassNotFoundException ex ){
            java.util.logging.Logger.getLogger( Friend.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        }catch( InstantiationException ex ){
            java.util.logging.Logger.getLogger( Friend.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        }catch( IllegalAccessException ex ){
            java.util.logging.Logger.getLogger( Friend.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        }catch( UnsupportedLookAndFeelException ex ){
            java.util.logging.Logger.getLogger( Friend.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater( new Runnable() {
            public void run() {
                new Friend().setVisible( true );
            }
        } );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CDK;
    private javax.swing.JTextPane UidTyping;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton 删除好友;
    private javax.swing.JButton 刷新;
    private javax.swing.JLabel 呢称;
    private javax.swing.JLabel 头像1;
    private javax.swing.JTable 好友表;
    private javax.swing.JButton 添加好友;
    private javax.swing.JLabel 点券;
    private javax.swing.JLabel 等级;
    private javax.swing.JLabel 背景;
    private javax.swing.JButton 返回;
    // End of variables declaration//GEN-END:variables
}
