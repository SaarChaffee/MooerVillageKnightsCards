/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JFrame;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

import mooer.ChangeImg;
import mooer.CtoS;
import mooer.Gacha;
import mooer.Golbal;


/**
 * @author Evistix
 */
public class Fight extends javax.swing.JFrame {

    public static int myCards[] = new int[4];//我方卡牌数组
    public static int myChoose = 0;//当前选择卡牌
    public static int lastChoose = 0;//上一轮选择第几张卡  用于摸牌替换
    public static int liftHP = 0;//我放体力值
    public static int rightHP = 0;//对方体力值
    CtoS ctos;

    public static void lock() {//关闭按钮显示，用于卡住用户
        返回.setVisible( false );
        出牌.setVisible( false );
    }

    public static void unlock() {//解锁
        返回.setVisible( true );
        出牌.setVisible( true );
    }

    public static void updateHP() {//更新双方HP
        我方体力值.setText( "HP：" + liftHP );
        对方体力值.setText( "HP：" + rightHP );
    }

    public static void updateCard() {
        ChangeImg.changeImg( 己方卡1, myCards[0] );
        卡1属性.setText( Golbal.cardsList[myCards[0]].type + Golbal.cardsList[myCards[0]].var );
        ChangeImg.changeImg( 己方卡2, myCards[1] );
        卡2属性.setText( Golbal.cardsList[myCards[1]].type + Golbal.cardsList[myCards[1]].var );
        ChangeImg.changeImg( 己方卡3, myCards[2] );
        卡3属性.setText( Golbal.cardsList[myCards[2]].type + Golbal.cardsList[myCards[2]].var );
        ChangeImg.changeImg( 己方卡4, myCards[3] );
        卡4属性.setText( Golbal.cardsList[myCards[3]].type + Golbal.cardsList[myCards[3]].var );
    }

    public static void getCard() {//摸牌
        myCards[lastChoose - 1] = Gacha.result();
        updateCard();
    }

    void recover( CtoS ctos ) {//初始化
        liftHP = 5;
        rightHP = 5;
        updateHP();
        摸牌.setVisible( false );
        this.ctos = ctos;
        ctos.send( "已进入对战界面" );

        for( int i = 0; i < 4; i++ ){//初始摸牌
            myCards[i] = Gacha.result();
        }
        updateCard();
    }


    /**
     * Creates new form Card_Map
     */
    public Fight( CtoS ctos ) {

        initComponents();
        recover( ctos );

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        购买选择 = new javax.swing.ButtonGroup();
        backGround = new javax.swing.JPanel();
        我方展示卡 = new javax.swing.JLabel();
        敌方展示卡 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        己方卡1 = new javax.swing.JLabel();
        己方卡2 = new javax.swing.JLabel();
        己方卡3 = new javax.swing.JLabel();
        己方卡4 = new javax.swing.JLabel();
        返回 = new javax.swing.JButton();
        头像 = new javax.swing.JLabel();
        出牌 = new javax.swing.JButton();
        我方体力值 = new javax.swing.JLabel();
        卡1属性 = new javax.swing.JLabel();
        对方体力值 = new javax.swing.JLabel();
        卡2属性 = new javax.swing.JLabel();
        卡4属性 = new javax.swing.JLabel();
        卡3属性 = new javax.swing.JLabel();
        我方展示卡属性 = new javax.swing.JLabel();
        对方展示卡属性 = new javax.swing.JLabel();
        当前状态 = new javax.swing.JLabel();
        摸牌 = new javax.swing.JButton();
        Front = new javax.swing.JPanel();
        背景 = new javax.swing.JLabel();

        setDefaultCloseOperation( javax.swing.WindowConstants.EXIT_ON_CLOSE );
        setTitle( "对战" );

        backGround.setForeground( new java.awt.Color( 255, 102, 102 ) );
        backGround.setOpaque( false );
        backGround.setPreferredSize( new java.awt.Dimension( 1000, 700 ) );
        backGround.setLayout( new org.netbeans.lib.awtextra.AbsoluteLayout() );

        我方展示卡.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/icon/问号.png" ) ) ); // NOI18N
        backGround.add( 我方展示卡, new org.netbeans.lib.awtextra.AbsoluteConstraints( 250, 150, -1, -1 ) );

        敌方展示卡.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/icon/问号.png" ) ) ); // NOI18N
        backGround.add( 敌方展示卡, new org.netbeans.lib.awtextra.AbsoluteConstraints( 550, 150, -1, -1 ) );

        jLabel3.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/icon/i1.gif" ) ) ); // NOI18N
        backGround.add( jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints( 880, 0, 100, 100 ) );

        己方卡1.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/Img_small/1.jpg" ) ) ); // NOI18N
        己方卡1.addMouseListener( new java.awt.event.MouseAdapter() {
            public void mouseClicked( java.awt.event.MouseEvent evt ) {
                己方卡1MouseClicked( evt );
            }
        } );
        backGround.add( 己方卡1, new org.netbeans.lib.awtextra.AbsoluteConstraints( 40, 440, -1, -1 ) );

        己方卡2.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/Img_small/1.jpg" ) ) ); // NOI18N
        己方卡2.addMouseListener( new java.awt.event.MouseAdapter() {
            public void mouseClicked( java.awt.event.MouseEvent evt ) {
                己方卡2MouseClicked( evt );
            }
        } );
        backGround.add( 己方卡2, new org.netbeans.lib.awtextra.AbsoluteConstraints( 210, 440, -1, -1 ) );

        己方卡3.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/Img_small/1.jpg" ) ) ); // NOI18N
        己方卡3.addMouseListener( new java.awt.event.MouseAdapter() {
            public void mouseClicked( java.awt.event.MouseEvent evt ) {
                己方卡3MouseClicked( evt );
            }
        } );
        backGround.add( 己方卡3, new org.netbeans.lib.awtextra.AbsoluteConstraints( 380, 440, -1, -1 ) );

        己方卡4.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/Img_small/1.jpg" ) ) ); // NOI18N
        己方卡4.addMouseListener( new java.awt.event.MouseAdapter() {
            public void mouseClicked( java.awt.event.MouseEvent evt ) {
                己方卡4MouseClicked( evt );
            }
        } );
        backGround.add( 己方卡4, new org.netbeans.lib.awtextra.AbsoluteConstraints( 550, 440, -1, -1 ) );

        返回.setText( "退出" );
        返回.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                返回ActionPerformed( evt );
            }
        } );
        backGround.add( 返回, new org.netbeans.lib.awtextra.AbsoluteConstraints( 780, 580, 141, 51 ) );

        头像.setFont( new java.awt.Font( "宋体", 0, 18 ) ); // NOI18N
        头像.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/icon/i1.gif" ) ) ); // NOI18N
        backGround.add( 头像, new org.netbeans.lib.awtextra.AbsoluteConstraints( 20, 0, 100, 100 ) );

        出牌.setText( "出牌" );
        出牌.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                出牌ActionPerformed( evt );
            }
        } );
        backGround.add( 出牌, new org.netbeans.lib.awtextra.AbsoluteConstraints( 780, 510, 140, 50 ) );

        我方体力值.setFont( new java.awt.Font( "宋体", 1, 18 ) ); // NOI18N
        我方体力值.setForeground( new java.awt.Color( 255, 51, 102 ) );
        我方体力值.setText( "体力值" );
        backGround.add( 我方体力值, new org.netbeans.lib.awtextra.AbsoluteConstraints( 130, 30, 130, 30 ) );

        卡1属性.setFont( new java.awt.Font( "宋体", 1, 18 ) ); // NOI18N
        卡1属性.setForeground( new java.awt.Color( 51, 102, 0 ) );
        backGround.add( 卡1属性, new org.netbeans.lib.awtextra.AbsoluteConstraints( 90, 400, 70, 30 ) );

        对方体力值.setFont( new java.awt.Font( "宋体", 1, 18 ) ); // NOI18N
        对方体力值.setForeground( new java.awt.Color( 255, 51, 102 ) );
        对方体力值.setText( "体力值" );
        backGround.add( 对方体力值, new org.netbeans.lib.awtextra.AbsoluteConstraints( 730, 30, 130, 30 ) );

        卡2属性.setFont( new java.awt.Font( "宋体", 1, 18 ) ); // NOI18N
        卡2属性.setForeground( new java.awt.Color( 51, 102, 0 ) );
        backGround.add( 卡2属性, new org.netbeans.lib.awtextra.AbsoluteConstraints( 260, 400, 70, 30 ) );

        卡4属性.setFont( new java.awt.Font( "宋体", 1, 18 ) ); // NOI18N
        卡4属性.setForeground( new java.awt.Color( 51, 102, 0 ) );
        backGround.add( 卡4属性, new org.netbeans.lib.awtextra.AbsoluteConstraints( 600, 400, 70, 30 ) );

        卡3属性.setFont( new java.awt.Font( "宋体", 1, 18 ) ); // NOI18N
        卡3属性.setForeground( new java.awt.Color( 51, 102, 0 ) );
        backGround.add( 卡3属性, new org.netbeans.lib.awtextra.AbsoluteConstraints( 420, 400, 70, 30 ) );

        我方展示卡属性.setFont( new java.awt.Font( "宋体", 1, 18 ) ); // NOI18N
        我方展示卡属性.setForeground( new java.awt.Color( 51, 102, 0 ) );
        backGround.add( 我方展示卡属性, new org.netbeans.lib.awtextra.AbsoluteConstraints( 290, 110, 70, 30 ) );

        对方展示卡属性.setFont( new java.awt.Font( "宋体", 1, 18 ) ); // NOI18N
        对方展示卡属性.setForeground( new java.awt.Color( 51, 102, 0 ) );
        backGround.add( 对方展示卡属性, new org.netbeans.lib.awtextra.AbsoluteConstraints( 590, 110, 70, 30 ) );

        当前状态.setFont( new java.awt.Font( "宋体", 1, 24 ) ); // NOI18N
        当前状态.setForeground( new java.awt.Color( 255, 51, 102 ) );
        当前状态.addMouseListener( new java.awt.event.MouseAdapter() {
            public void mouseClicked( java.awt.event.MouseEvent evt ) {
                当前状态MouseClicked( evt );
            }
        } );
        backGround.add( 当前状态, new org.netbeans.lib.awtextra.AbsoluteConstraints( 340, 350, 270, 50 ) );

        摸牌.setText( "摸牌" );
        摸牌.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                摸牌ActionPerformed( evt );
            }
        } );
        backGround.add( 摸牌, new org.netbeans.lib.awtextra.AbsoluteConstraints( 780, 440, 140, 50 ) );

        Front.setOpaque( false );

        背景.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/backGround/b2.png" ) ) ); // NOI18N

        javax.swing.GroupLayout FrontLayout = new javax.swing.GroupLayout( Front );
        Front.setLayout( FrontLayout );
        FrontLayout.setHorizontalGroup(
                FrontLayout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addGap( 0, 1000, Short.MAX_VALUE )
                        .addGroup( FrontLayout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                .addGroup( FrontLayout.createSequentialGroup()
                                        .addComponent( 背景 )
                                        .addGap( 0, 0, Short.MAX_VALUE ) ) )
                                      );
        FrontLayout.setVerticalGroup(
                FrontLayout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addGap( 0, 700, Short.MAX_VALUE )
                        .addGroup( FrontLayout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                .addComponent( 背景, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE ) )
                                    );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout( getContentPane() );
        getContentPane().setLayout( layout );
        layout.setHorizontalGroup(
                layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addGroup( layout.createSequentialGroup()
                                .addComponent( backGround, javax.swing.GroupLayout.PREFERRED_SIZE, 998, javax.swing.GroupLayout.PREFERRED_SIZE )
                                .addGap( 0, 2, Short.MAX_VALUE ) )
                        .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                .addGroup( layout.createSequentialGroup()
                                        .addComponent( Front, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE )
                                        .addGap( 0, 0, Short.MAX_VALUE ) ) )
                                 );
        layout.setVerticalGroup(
                layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addComponent( backGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                        .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                .addGroup( javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap( 0, 0, Short.MAX_VALUE )
                                        .addComponent( Front, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE ) ) )
                               );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void 返回ActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_返回ActionPerformed
        // TODO add your handling code here:
        try{
            ctos.sk.close();
            System.out.println( "连接已断开" );
        }catch( Exception ex ){

        }
        this.setVisible( false );
        new Main_UI().setVisible( true );
    }//GEN-LAST:event_返回ActionPerformed

    private void 己方卡1MouseClicked( java.awt.event.MouseEvent evt ) {//GEN-FIRST:event_己方卡1MouseClicked
        // TODO add your handling code here:
        myChoose = 1;
    }//GEN-LAST:event_己方卡1MouseClicked

    private void 己方卡2MouseClicked( java.awt.event.MouseEvent evt ) {//GEN-FIRST:event_己方卡2MouseClicked
        // TODO add your handling code here:
        myChoose = 2;
    }//GEN-LAST:event_己方卡2MouseClicked

    private void 己方卡3MouseClicked( java.awt.event.MouseEvent evt ) {//GEN-FIRST:event_己方卡3MouseClicked
        // TODO add your handling code here:
        myChoose = 3;
    }//GEN-LAST:event_己方卡3MouseClicked

    private void 己方卡4MouseClicked( java.awt.event.MouseEvent evt ) {//GEN-FIRST:event_己方卡4MouseClicked
        // TODO add your handling code here:
        myChoose = 4;
    }//GEN-LAST:event_己方卡4MouseClicked

    private void 出牌ActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_出牌ActionPerformed
        // TODO add your handling code here:
        if( myChoose != 0 ){
            ChangeImg.changeImg( 我方展示卡, myCards[myChoose - 1] );
            我方展示卡属性.setText( Golbal.cardsList[myCards[myChoose - 1]].type + Golbal.cardsList[myCards[myChoose - 1]].var );

            ctos.send( "C" + myCards[myChoose - 1] );
            lock();
            当前状态.setText( "正在等待对方出牌" );
            lastChoose = myChoose;
            myChoose = 0;
            Golbal.waitCard = 0;

            // unlock();
        }

    }//GEN-LAST:event_出牌ActionPerformed

    private void 当前状态MouseClicked( java.awt.event.MouseEvent evt ) {//GEN-FIRST:event_当前状态MouseClicked
        // TODO add your handling code here:
//        if(Golbal.waitCard==1){
//            unlock();
//        }
    }//GEN-LAST:event_当前状态MouseClicked

    private void 摸牌ActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_摸牌ActionPerformed
        // TODO add your handling code here:
        摸牌.setVisible( false );
        getCard();
        unlock();
        ChangeImg.changeImg( 敌方展示卡, 0 );
        对方展示卡属性.setText( "" );
        ChangeImg.changeImg( 我方展示卡, 0 );
        我方展示卡属性.setText( "" );
    }//GEN-LAST:event_摸牌ActionPerformed

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
            java.util.logging.Logger.getLogger( Fight.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        }catch( InstantiationException ex ){
            java.util.logging.Logger.getLogger( Fight.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        }catch( IllegalAccessException ex ){
            java.util.logging.Logger.getLogger( Fight.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        }catch( javax.swing.UnsupportedLookAndFeelException ex ){
            java.util.logging.Logger.getLogger( Fight.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater( new Runnable() {
            public void run() {
                // new Fight().setVisible(true);
            }
        } );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Front;
    private javax.swing.JPanel backGround;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JButton 出牌;
    public static javax.swing.JLabel 卡1属性;
    public static javax.swing.JLabel 卡2属性;
    public static javax.swing.JLabel 卡3属性;
    public static javax.swing.JLabel 卡4属性;
    private javax.swing.JLabel 头像;
    public static javax.swing.JLabel 对方体力值;
    public static javax.swing.JLabel 对方展示卡属性;
    public static javax.swing.JLabel 己方卡1;
    public static javax.swing.JLabel 己方卡2;
    public static javax.swing.JLabel 己方卡3;
    public static javax.swing.JLabel 己方卡4;
    public static javax.swing.JLabel 当前状态;
    public static javax.swing.JLabel 我方体力值;
    private javax.swing.JLabel 我方展示卡;
    private javax.swing.JLabel 我方展示卡属性;
    public static javax.swing.JButton 摸牌;
    public static javax.swing.JLabel 敌方展示卡;
    private javax.swing.JLabel 背景;
    private javax.swing.ButtonGroup 购买选择;
    public static javax.swing.JButton 返回;
    // End of variables declaration//GEN-END:variables
}
