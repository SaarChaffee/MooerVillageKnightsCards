/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JFrame;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

import lite.*;
import mooer.*;


/**
 * @author Administrator
 */
public class AddFriend extends JFrame {

    /**
     * Creates new form register
     */
    void updateMsg() {
        等级.setText( "等级：" + Golbal.level );
        点券.setText( "点券：" + Golbal.UserBalance + "" );
        呢称.setText( "呢称：" + Golbal.Account );
    }

    public AddFriend() {
        initComponents();
        updateMsg();
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
        好友码 = new javax.swing.JLabel();
        购买信息 = new javax.swing.JLabel();
        CDK输入区 = new javax.swing.JTextField();
        CDK = new javax.swing.JLabel();
        确认兑换 = new javax.swing.JButton();
        返回 = new javax.swing.JButton();
        呢称 = new javax.swing.JLabel();
        等级 = new javax.swing.JLabel();
        点券 = new javax.swing.JLabel();

        jLabel1.setText( "jLabel1" );

        setDefaultCloseOperation( javax.swing.WindowConstants.EXIT_ON_CLOSE );
        setTitle( "充值" );

        背景.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/backGround/b5.png" ) ) ); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout( jPanel1 );
        jPanel1.setLayout( jPanel1Layout );
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addComponent( 背景, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                                        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addComponent( 背景, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                                      );

        jPanel2.setOpaque( false );

        头像1.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/icon/i1.gif" ) ) ); // NOI18N
        头像1.setToolTipText( "" );

        好友码.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/icon/好友码.png" ) ) ); // NOI18N

        购买信息.setFont( new java.awt.Font( "宋体", 1, 14 ) ); // NOI18N
        购买信息.setText( "请用微信扫描二维码，添加作者购买" );

        CDK.setFont( new java.awt.Font( "宋体", 1, 14 ) ); // NOI18N
        CDK.setText( "请输入兑换码（CDK）：" );

        确认兑换.setFont( new java.awt.Font( "宋体", 1, 14 ) ); // NOI18N
        确认兑换.setText( "确认兑换" );
        确认兑换.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                确认兑换ActionPerformed( evt );
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
                                                        .addComponent( 呢称, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                        .addComponent( 等级, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                        .addComponent( 点券, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE ) )
                                                .addGap( 0, 0, Short.MAX_VALUE ) )
                                        .addGroup( jPanel2Layout.createSequentialGroup()
                                                .addGap( 298, 298, 298 )
                                                .addGroup( jPanel2Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                                        .addGroup( jPanel2Layout.createSequentialGroup()
                                                                .addComponent( CDK, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                                .addGap( 0, 0, Short.MAX_VALUE ) )
                                                        .addGroup( jPanel2Layout.createSequentialGroup()
                                                                .addGroup( jPanel2Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.TRAILING, false )
                                                                        .addComponent( 确认兑换, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                                                                        .addComponent( CDK输入区 )
                                                                        .addComponent( 返回, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE ) )
                                                                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE )
                                                                .addGroup( jPanel2Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                                                        .addComponent( 购买信息, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                                        .addGroup( javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                                                .addComponent( 好友码 )
                                                                                .addGap( 29, 29, 29 ) ) ) ) ) ) )
                                .addContainerGap() )
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
                                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE )
                                .addComponent( CDK, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE )
                                .addGap( 18, 18, 18 )
                                .addGroup( jPanel2Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                        .addGroup( javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent( 购买信息, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.UNRELATED ) )
                                        .addGroup( javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent( CDK输入区, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                .addGap( 36, 36, 36 ) ) )
                                .addGroup( jPanel2Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                        .addComponent( 好友码 )
                                        .addGroup( jPanel2Layout.createSequentialGroup()
                                                .addComponent( 确认兑换, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                .addGap( 45, 45, 45 )
                                                .addComponent( 返回, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE ) ) )
                                .addGap( 23, 23, 23 ) )
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

    private void 确认兑换ActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_确认兑换ActionPerformed
        // TODO add your handling code here:
        String cdk = CDK输入区.getText();
        int uid = Golbal.UserUid;
        if( util.isRedemptionExist( cdk ) && util.isRedemptionUsed( cdk ) ){
//            util.recharge( uid, cdk );
            ResultSet re = util.getRedemptionInfo( cdk );
            int value = 0;
            try{
                re.next();
                value = re.getInt( "RedemptionCodeValue" );
                Golbal.UserBalance += value;
                updateMsg();
                String str1 = "update mooer.dbo.UserData set UserBalance = " + Golbal.UserBalance + " where UserUid = " + Golbal.UserUid;
                dao.Update( str1 );
                String str2 = "update mooer.dbo.Redemption set RedemptionUsed = " + Golbal.UserUid + " where RedemptionCode = '" + cdk + "'";
                dao.Update( str2 );
            }catch( SQLException ex ){
                Logger.getLogger( AddFriend.class.getName() ).log( Level.SEVERE, null, ex );
            }
            JOptionPane.showMessageDialog( null, "充值成功！按确定返回商店界面", "充值成功！", JOptionPane.INFORMATION_MESSAGE );
        }
        else{
            JOptionPane.showMessageDialog( null, "充值失败！激活码无效或已被使用", "充值失败！", JOptionPane.INFORMATION_MESSAGE );
        }
    }//GEN-LAST:event_确认兑换ActionPerformed

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
            java.util.logging.Logger.getLogger( AddFriend.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        }catch( InstantiationException ex ){
            java.util.logging.Logger.getLogger( AddFriend.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        }catch( IllegalAccessException ex ){
            java.util.logging.Logger.getLogger( AddFriend.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        }catch( UnsupportedLookAndFeelException ex ){
            java.util.logging.Logger.getLogger( AddFriend.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater( new Runnable() {
            public void run() {
                new AddFriend().setVisible( true );
            }
        } );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CDK;
    private javax.swing.JTextField CDK输入区;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel 呢称;
    private javax.swing.JLabel 头像1;
    private javax.swing.JLabel 好友码;
    private javax.swing.JLabel 点券;
    private javax.swing.JButton 确认兑换;
    private javax.swing.JLabel 等级;
    private javax.swing.JLabel 背景;
    private javax.swing.JLabel 购买信息;
    private javax.swing.JButton 返回;
    // End of variables declaration//GEN-END:variables
}
