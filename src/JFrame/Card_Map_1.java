/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JFrame;

import java.awt.Event;
import javax.swing.JOptionPane;

import lite.util;
import mooer.ChangeImg;
import mooer.Golbal;

/**
 * @author Evistix
 */
public class Card_Map_1 extends javax.swing.JFrame {

    int CardNum = 0;

    /**
     * Creates new form Card_Map
     */
    void updateIcon() {
        if( Golbal.Cards_isHave[1] ) ChangeImg.changeImg( jLabel1, 1 );
        else new ChangeImg().changeImgBlack( jLabel1, 1 );
        if( Golbal.Cards_isHave[2] ) ChangeImg.changeImg( jLabel2, 2 );
        else new ChangeImg().changeImgBlack( jLabel2, 2 );
        if( Golbal.Cards_isHave[3] ) ChangeImg.changeImg( jLabel3, 3 );
        else new ChangeImg().changeImgBlack( jLabel3, 3 );
        if( Golbal.Cards_isHave[4] ) ChangeImg.changeImg( jLabel4, 4 );
        else new ChangeImg().changeImgBlack( jLabel4, 4 );
        if( Golbal.Cards_isHave[5] ) ChangeImg.changeImg( jLabel5, 5 );
        else new ChangeImg().changeImgBlack( jLabel5, 5 );
        if( Golbal.Cards_isHave[6] ) ChangeImg.changeImg( jLabel6, 6 );
        else new ChangeImg().changeImgBlack( jLabel6, 6 );
        if( Golbal.Cards_isHave[7] ) ChangeImg.changeImg( jLabel7, 7 );
        else new ChangeImg().changeImgBlack( jLabel7, 7 );
        if( Golbal.Cards_isHave[8] ) ChangeImg.changeImg( jLabel8, 8 );
        else new ChangeImg().changeImgBlack( jLabel8, 8 );
        if( Golbal.Cards_isHave[9] ) ChangeImg.changeImg( jLabel9, 9 );
        else new ChangeImg().changeImgBlack( jLabel9, 9 );
        if( Golbal.Cards_isHave[10] ) ChangeImg.changeImg( jLabel10, 10 );
        else new ChangeImg().changeImgBlack( jLabel10, 10 );
        等级.setText( "等级：" + Golbal.level );
        点券.setText( "点券：" + Golbal.UserBalance );
        呢称.setText( "昵称：" + Golbal.Account );
        Golbal.CalCardsNum();
        拥有卡牌.setText( "当前拥有卡牌数：" + Golbal.CardNum );
    }

    public Card_Map_1() {
        initComponents();

        updateIcon();

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
        jLabel1 = new javax.swing.JLabel();
        水1 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        水2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        水3 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        水4 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        水5 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        水6 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        水7 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        水8 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        水9 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        水10 = new javax.swing.JRadioButton();
        拥有卡牌 = new javax.swing.JLabel();
        返回 = new javax.swing.JButton();
        购买 = new javax.swing.JButton();
        下一页 = new javax.swing.JButton();
        头像 = new javax.swing.JLabel();
        呢称 = new javax.swing.JLabel();
        等级 = new javax.swing.JLabel();
        点券 = new javax.swing.JLabel();
        Front = new javax.swing.JPanel();
        背景 = new javax.swing.JLabel();

        setDefaultCloseOperation( javax.swing.WindowConstants.EXIT_ON_CLOSE );
        setTitle( "卡牌图鉴" );

        backGround.setOpaque( false );
        backGround.setPreferredSize( new java.awt.Dimension( 1000, 700 ) );
        backGround.setLayout( new org.netbeans.lib.awtextra.AbsoluteLayout() );

        jLabel1.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/Img_small/1.jpg" ) ) ); // NOI18N
        backGround.add( jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints( 34, 128, -1, -1 ) );

        购买选择.add( 水1 );
        水1.setText( "水—1" );
        水1.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                水1ActionPerformed( evt );
            }
        } );
        backGround.add( 水1, new org.netbeans.lib.awtextra.AbsoluteConstraints( 68, 334, -1, -1 ) );

        jLabel2.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/Img_small/1.jpg" ) ) ); // NOI18N
        backGround.add( jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints( 220, 130, -1, -1 ) );

        购买选择.add( 水2 );
        水2.setText( "水—2" );
        水2.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                水2ActionPerformed( evt );
            }
        } );
        backGround.add( 水2, new org.netbeans.lib.awtextra.AbsoluteConstraints( 267, 334, -1, -1 ) );

        jLabel3.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/Img_small/1.jpg" ) ) ); // NOI18N
        backGround.add( jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints( 410, 130, -1, -1 ) );

        购买选择.add( 水3 );
        水3.setText( "水—3" );
        水3.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                水3ActionPerformed( evt );
            }
        } );
        backGround.add( 水3, new org.netbeans.lib.awtextra.AbsoluteConstraints( 460, 330, -1, -1 ) );

        jLabel4.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/Img_small/1.jpg" ) ) ); // NOI18N
        backGround.add( jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints( 610, 130, -1, -1 ) );

        购买选择.add( 水4 );
        水4.setText( "水—4" );
        水4.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                水4ActionPerformed( evt );
            }
        } );
        backGround.add( 水4, new org.netbeans.lib.awtextra.AbsoluteConstraints( 650, 330, -1, -1 ) );

        jLabel5.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/Img_small/1.jpg" ) ) ); // NOI18N
        backGround.add( jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints( 803, 128, -1, -1 ) );

        购买选择.add( 水5 );
        水5.setText( "水—5" );
        水5.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                水5ActionPerformed( evt );
            }
        } );
        backGround.add( 水5, new org.netbeans.lib.awtextra.AbsoluteConstraints( 871, 334, -1, -1 ) );

        jLabel6.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/Img_small/1.jpg" ) ) ); // NOI18N
        backGround.add( jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints( 34, 385, -1, -1 ) );

        购买选择.add( 水6 );
        水6.setText( "水—6" );
        水6.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                水6ActionPerformed( evt );
            }
        } );
        backGround.add( 水6, new org.netbeans.lib.awtextra.AbsoluteConstraints( 81, 591, -1, -1 ) );

        jLabel7.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/Img_small/1.jpg" ) ) ); // NOI18N
        backGround.add( jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints( 220, 390, -1, -1 ) );

        购买选择.add( 水7 );
        水7.setText( "水—7" );
        水7.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                水7ActionPerformed( evt );
            }
        } );
        backGround.add( 水7, new org.netbeans.lib.awtextra.AbsoluteConstraints( 273, 591, -1, -1 ) );

        jLabel8.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/Img_small/1.jpg" ) ) ); // NOI18N
        backGround.add( jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints( 410, 390, -1, -1 ) );

        购买选择.add( 水8 );
        水8.setText( "水—8" );
        水8.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                水8ActionPerformed( evt );
            }
        } );
        backGround.add( 水8, new org.netbeans.lib.awtextra.AbsoluteConstraints( 460, 590, -1, -1 ) );

        jLabel9.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/Img_small/1.jpg" ) ) ); // NOI18N
        backGround.add( jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints( 610, 390, -1, -1 ) );

        购买选择.add( 水9 );
        水9.setText( "水—9" );
        水9.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                水9ActionPerformed( evt );
            }
        } );
        backGround.add( 水9, new org.netbeans.lib.awtextra.AbsoluteConstraints( 660, 590, -1, -1 ) );

        jLabel10.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/Img_small/1.jpg" ) ) ); // NOI18N
        backGround.add( jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints( 803, 385, -1, -1 ) );

        购买选择.add( 水10 );
        水10.setText( "水—10" );
        水10.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                水10ActionPerformed( evt );
            }
        } );
        backGround.add( 水10, new org.netbeans.lib.awtextra.AbsoluteConstraints( 850, 590, -1, -1 ) );

        拥有卡牌.setFont( new java.awt.Font( "宋体", 1, 18 ) ); // NOI18N
        拥有卡牌.setText( "拥有卡牌数X/X" );
        backGround.add( 拥有卡牌, new org.netbeans.lib.awtextra.AbsoluteConstraints( 290, 20, 280, 41 ) );

        返回.setText( "返回" );
        返回.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                返回ActionPerformed( evt );
            }
        } );
        backGround.add( 返回, new org.netbeans.lib.awtextra.AbsoluteConstraints( 780, 10, 141, 51 ) );

        购买.setText( "购买" );
        购买.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                购买ActionPerformed( evt );
            }
        } );
        backGround.add( 购买, new org.netbeans.lib.awtextra.AbsoluteConstraints( 590, 10, 141, 51 ) );

        下一页.setText( "下一页" );
        下一页.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                下一页ActionPerformed( evt );
            }
        } );
        backGround.add( 下一页, new org.netbeans.lib.awtextra.AbsoluteConstraints( 735, 642, 171, 45 ) );

        头像.setFont( new java.awt.Font( "宋体", 0, 18 ) ); // NOI18N
        头像.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/icon/i1.gif" ) ) ); // NOI18N
        backGround.add( 头像, new org.netbeans.lib.awtextra.AbsoluteConstraints( 34, 10, 100, 100 ) );

        呢称.setFont( new java.awt.Font( "宋体", 1, 14 ) ); // NOI18N
        呢称.setText( "呢称" );
        backGround.add( 呢称, new org.netbeans.lib.awtextra.AbsoluteConstraints( 150, 10, 150, 20 ) );

        等级.setFont( new java.awt.Font( "宋体", 1, 14 ) ); // NOI18N
        等级.setText( "等级" );
        backGround.add( 等级, new org.netbeans.lib.awtextra.AbsoluteConstraints( 150, 50, 100, -1 ) );

        点券.setFont( new java.awt.Font( "宋体", 1, 14 ) ); // NOI18N
        点券.setText( "点券" );
        backGround.add( 点券, new org.netbeans.lib.awtextra.AbsoluteConstraints( 150, 90, 270, -1 ) );

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
                                .addComponent( 背景, javax.swing.GroupLayout.PREFERRED_SIZE, 687, Short.MAX_VALUE ) )
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


    private void 水1ActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_水1ActionPerformed
        CardNum = 1;
        // TODO add your handling code here:
    }//GEN-LAST:event_水1ActionPerformed

    private void 下一页ActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_下一页ActionPerformed
        // TODO add your handling code here:
        this.setVisible( false );
        new Card_Map_2().setVisible( true );
    }//GEN-LAST:event_下一页ActionPerformed

    private void 返回ActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_返回ActionPerformed
        // TODO add your handling code here:
        this.setVisible( false );
        new Main_UI().setVisible( true );
    }//GEN-LAST:event_返回ActionPerformed

    private void 水2ActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_水2ActionPerformed
        CardNum = 2;
        // TODO add your handling code here:
    }//GEN-LAST:event_水2ActionPerformed

    private void 水3ActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_水3ActionPerformed
        CardNum = 3;
        // TODO add your handling code here:
    }//GEN-LAST:event_水3ActionPerformed

    private void 水4ActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_水4ActionPerformed
        CardNum = 4;
        // TODO add your handling code here:
    }//GEN-LAST:event_水4ActionPerformed

    private void 水5ActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_水5ActionPerformed
        CardNum = 5;
        // TODO add your handling code here:
    }//GEN-LAST:event_水5ActionPerformed

    private void 水6ActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_水6ActionPerformed
        CardNum = 6;
        // TODO add your handling code here:
    }//GEN-LAST:event_水6ActionPerformed

    private void 水7ActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_水7ActionPerformed
        CardNum = 7;
        // TODO add your handling code here:
    }//GEN-LAST:event_水7ActionPerformed

    private void 水8ActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_水8ActionPerformed
        CardNum = 8;
        // TODO add your handling code here:
    }//GEN-LAST:event_水8ActionPerformed

    private void 水9ActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_水9ActionPerformed
        CardNum = 9;
        // TODO add your handling code here:
    }//GEN-LAST:event_水9ActionPerformed

    private void 水10ActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_水10ActionPerformed
        CardNum = 10;
        // TODO add your handling code here:
    }//GEN-LAST:event_水10ActionPerformed

    private void 购买ActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_购买ActionPerformed
        // TODO add your handling code here:
        int price = 2000;//价格
        if( CardNum == 0 ){
            JOptionPane.showMessageDialog( null, "未选择卡牌", "提示信息", JOptionPane.INFORMATION_MESSAGE );
            return;
        }
        if( JOptionPane.showConfirmDialog( null, "是否用2000点劵购买？", "确认", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE ) == JOptionPane.YES_OPTION ){
            if( Golbal.UserBalance >= 2000 ){

                Golbal.UserBalance -= 2000;
                Golbal.Cards_isHave[CardNum] = true;
                int num = CardNum;
                CardNum = 0;
                updateIcon();
                util.Gacha( Golbal.UserUid, 2000 );
                util.getCard( Golbal.UserUid, Golbal.cardsList[num].type + Golbal.cardsList[num].var );
                util.setCardQuantity( Golbal.UserUid );
                Golbal.CardNum = util.getCardQuantity( Golbal.UserUid );
            }
            else{
                JOptionPane.showMessageDialog( null, "余额不足", "提示信息", JOptionPane.INFORMATION_MESSAGE );
                return;
            }
        }
    }//GEN-LAST:event_购买ActionPerformed

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
            java.util.logging.Logger.getLogger( Card_Map_1.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        }catch( InstantiationException ex ){
            java.util.logging.Logger.getLogger( Card_Map_1.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        }catch( IllegalAccessException ex ){
            java.util.logging.Logger.getLogger( Card_Map_1.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        }catch( javax.swing.UnsupportedLookAndFeelException ex ){
            java.util.logging.Logger.getLogger( Card_Map_1.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater( new Runnable() {
            public void run() {
                new Card_Map_1().setVisible( true );
            }
        } );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Front;
    private javax.swing.JPanel backGround;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton 下一页;
    private javax.swing.JLabel 呢称;
    private javax.swing.JLabel 头像;
    private javax.swing.JLabel 拥有卡牌;
    private javax.swing.JRadioButton 水1;
    private javax.swing.JRadioButton 水10;
    private javax.swing.JRadioButton 水2;
    private javax.swing.JRadioButton 水3;
    private javax.swing.JRadioButton 水4;
    private javax.swing.JRadioButton 水5;
    private javax.swing.JRadioButton 水6;
    private javax.swing.JRadioButton 水7;
    private javax.swing.JRadioButton 水8;
    private javax.swing.JRadioButton 水9;
    private javax.swing.JLabel 点券;
    private javax.swing.JLabel 等级;
    private javax.swing.JLabel 背景;
    private javax.swing.JButton 购买;
    private javax.swing.ButtonGroup 购买选择;
    private javax.swing.JButton 返回;
    // End of variables declaration//GEN-END:variables
}
