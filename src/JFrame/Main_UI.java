/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JFrame;

import mooer.ChangeImg;
import mooer.Golbal;

/**
 * @author Administrator
 */
public class Main_UI extends javax.swing.JFrame {

    /**
     * Creates new form UI
     */
    void updateShowCard() {
        int max = 0;
        for( int i = 1; i <= 60; i++ ){
            int now = Golbal.cardsList[i].var % 21;
            if( Golbal.Cards_isHave[i] && now > Golbal.cardsList[max].var ){
                max = i;
            }
        }
        ChangeImg.changeImg( 卡牌展示, max );
    }

    public Main_UI() {
        initComponents();
        等级.setText( "等级：" + Golbal.level );
        点券.setText( "点券：" + Golbal.UserBalance );
        呢称.setText( "昵称：" + Golbal.Account );
        updateShowCard();
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
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel2 = new javax.swing.JPanel();
        背景 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        头像 = new javax.swing.JLabel();
        点券 = new javax.swing.JLabel();
        等级 = new javax.swing.JLabel();
        呢称 = new javax.swing.JLabel();
        商城 = new javax.swing.JButton();
        好友 = new javax.swing.JButton();
        退出 = new javax.swing.JButton();
        卡牌展示 = new javax.swing.JLabel();
        充钱 = new javax.swing.JButton();
        对战 = new javax.swing.JButton();
        关于 = new javax.swing.JButton();
        版本号 = new javax.swing.JLabel();
        卡牌图鉴 = new javax.swing.JButton();

        jScrollPane1.setViewportView( jEditorPane1 );

        setDefaultCloseOperation( javax.swing.WindowConstants.EXIT_ON_CLOSE );
        setTitle( "摩尔x园对战平台" );
        setBounds( new java.awt.Rectangle( 0, 0, 1000, 600 ) );
        setPreferredSize( new java.awt.Dimension( 1000, 600 ) );
        setSize( new java.awt.Dimension( 1000, 600 ) );

        jPanel2.setPreferredSize( new java.awt.Dimension( 1000, 600 ) );

        背景.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/backGround/b1.png" ) ) ); // NOI18N
        背景.setPreferredSize( new java.awt.Dimension( 1000, 600 ) );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout( jPanel2 );
        jPanel2.setLayout( jPanel2Layout );
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addComponent( 背景, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                                        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addComponent( 背景, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                                      );

        jPanel1.setOpaque( false );
        jPanel1.setPreferredSize( new java.awt.Dimension( 1000, 600 ) );

        头像.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/icon/i1.gif" ) ) ); // NOI18N
        头像.setToolTipText( "" );

        点券.setFont( new java.awt.Font( "宋体", 1, 14 ) ); // NOI18N
        点券.setText( "点券" );

        等级.setFont( new java.awt.Font( "宋体", 1, 14 ) ); // NOI18N
        等级.setText( "等级" );

        呢称.setFont( new java.awt.Font( "宋体", 1, 14 ) ); // NOI18N
        呢称.setText( "呢称" );

        商城.setBackground( new java.awt.Color( 255, 102, 255 ) );
        商城.setText( "商城" );
        商城.setCursor( new java.awt.Cursor( java.awt.Cursor.HAND_CURSOR ) );
        商城.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                商城ActionPerformed( evt );
            }
        } );

        好友.setBackground( new java.awt.Color( 255, 102, 255 ) );
        好友.setText( "好友" );
        好友.setCursor( new java.awt.Cursor( java.awt.Cursor.HAND_CURSOR ) );
        好友.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                好友ActionPerformed( evt );
            }
        } );

        退出.setBackground( new java.awt.Color( 255, 51, 255 ) );
        退出.setText( "退出" );
        退出.setCursor( new java.awt.Cursor( java.awt.Cursor.HAND_CURSOR ) );
        退出.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                退出ActionPerformed( evt );
            }
        } );

        卡牌展示.setBackground( new java.awt.Color( 255, 51, 51 ) );
        卡牌展示.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/icon/2.jpg" ) ) ); // NOI18N

        充钱.setBackground( new java.awt.Color( 102, 255, 255 ) );
        充钱.setFont( new java.awt.Font( "宋体", 1, 24 ) ); // NOI18N
        充钱.setText( "请充钱" );
        充钱.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                充钱ActionPerformed( evt );
            }
        } );

        对战.setBackground( new java.awt.Color( 255, 51, 51 ) );
        对战.setFont( new java.awt.Font( "宋体", 1, 24 ) ); // NOI18N
        对战.setText( "对战" );
        对战.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                对战ActionPerformed( evt );
            }
        } );

        关于.setText( "关于" );
        关于.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                关于ActionPerformed( evt );
            }
        } );

        版本号.setText( "ver.114514" );

        卡牌图鉴.setFont( new java.awt.Font( "宋体", 1, 14 ) ); // NOI18N
        卡牌图鉴.setText( "卡牌图鉴" );
        卡牌图鉴.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                卡牌图鉴ActionPerformed( evt );
            }
        } );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout( jPanel1 );
        jPanel1.setLayout( jPanel1Layout );
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addGroup( jPanel1Layout.createSequentialGroup()
                                .addGap( 72, 72, 72 )
                                .addGroup( jPanel1Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                        .addGroup( jPanel1Layout.createSequentialGroup()
                                                .addGap( 16, 16, 16 )
                                                .addGroup( jPanel1Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                                        .addComponent( 卡牌图鉴, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                        .addComponent( 卡牌展示 ) ) )
                                        .addGroup( jPanel1Layout.createSequentialGroup()
                                                .addComponent( 头像, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                .addGap( 18, 18, 18 )
                                                .addGroup( jPanel1Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING, false )
                                                        .addComponent( 等级, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                        .addComponent( 点券, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE )
                                                        .addComponent( 呢称, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE ) ) ) )
                                .addGroup( jPanel1Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                        .addGroup( javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                                                .addComponent( 版本号, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                .addGap( 142, 142, 142 ) )
                                        .addGroup( jPanel1Layout.createSequentialGroup()
                                                .addGap( 176, 176, 176 )
                                                .addGroup( jPanel1Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.TRAILING )
                                                        .addComponent( 关于, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                        .addGroup( jPanel1Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING, false )
                                                                .addComponent( 充钱, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                                                                .addComponent( 对战, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                                                                .addGroup( javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                        .addComponent( 商城, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                                        .addGap( 47, 47, 47 )
                                                                        .addComponent( 好友, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                                        .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE )
                                                                        .addComponent( 退出, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                                        .addGap( 20, 20, 20 ) ) ) )
                                                .addContainerGap( 106, Short.MAX_VALUE ) ) ) )
                                        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addGroup( jPanel1Layout.createSequentialGroup()
                                .addGroup( jPanel1Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                        .addGroup( jPanel1Layout.createSequentialGroup()
                                                .addGap( 57, 57, 57 )
                                                .addGroup( jPanel1Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE )
                                                        .addComponent( 商城, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                        .addComponent( 好友, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                        .addComponent( 退出, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE ) ) )
                                        .addGroup( jPanel1Layout.createSequentialGroup()
                                                .addGap( 21, 21, 21 )
                                                .addGroup( jPanel1Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING, false )
                                                        .addComponent( 头像, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                        .addGroup( jPanel1Layout.createSequentialGroup()
                                                                .addComponent( 呢称, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.UNRELATED )
                                                                .addComponent( 等级, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                                                                .addComponent( 点券, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE ) ) ) ) )
                                .addGap( 122, 122, 122 )
                                .addGroup( jPanel1Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                        .addComponent( 卡牌展示 )
                                        .addGroup( jPanel1Layout.createSequentialGroup()
                                                .addComponent( 充钱, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                .addGap( 18, 18, 18 )
                                                .addComponent( 对战, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE ) ) )
                                .addGroup( jPanel1Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING, false )
                                        .addGroup( jPanel1Layout.createSequentialGroup()
                                                .addGap( 18, 18, 18 )
                                                .addComponent( 关于, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                                                .addComponent( 版本号 ) )
                                        .addGroup( jPanel1Layout.createSequentialGroup()
                                                .addGap( 13, 13, 13 )
                                                .addComponent( 卡牌图鉴, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE ) ) )
                                .addContainerGap( 45, Short.MAX_VALUE ) )
                                      );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout( getContentPane() );
        getContentPane().setLayout( layout );
        layout.setHorizontalGroup(
                layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addComponent( jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE )
                        .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                .addGroup( layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent( jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                                        .addGap( 12, 12, 12 ) ) )
                                 );
        layout.setVerticalGroup(
                layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addComponent( jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                        .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                .addGroup( layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent( jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE )
                                        .addContainerGap( javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE ) ) )
                               );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void 充钱ActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_充钱ActionPerformed
        // TODO add your handling code here:
        this.setVisible( false );
        new Recharge().setVisible( true );
    }//GEN-LAST:event_充钱ActionPerformed

    private void 好友ActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_好友ActionPerformed
        // TODO add your handling code here:
        this.setVisible( false );
        new Friend().setVisible( true );
    }//GEN-LAST:event_好友ActionPerformed

    private void 关于ActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_关于ActionPerformed
        // TODO add your handling code here:
        this.setVisible( false );
        new About().setVisible( true );
    }//GEN-LAST:event_关于ActionPerformed

    private void 退出ActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_退出ActionPerformed
        // TODO add your handling code here:
        this.setVisible( false );
        System.exit( 0 );
    }//GEN-LAST:event_退出ActionPerformed

    private void 商城ActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_商城ActionPerformed
        // TODO add your handling code here:
        this.setVisible( false );
        new Store().setVisible( true );
    }//GEN-LAST:event_商城ActionPerformed

    private void 卡牌图鉴ActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_卡牌图鉴ActionPerformed
        // TODO add your handling code here:
        this.setVisible( false );
        new Card_Map_1().setVisible( true );
    }//GEN-LAST:event_卡牌图鉴ActionPerformed

    private void 对战ActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_对战ActionPerformed
        // TODO add your handling code here:
        this.setVisible( false );
        new Fight_Standby().setVisible( true );
    }//GEN-LAST:event_对战ActionPerformed

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
            java.util.logging.Logger.getLogger( Main_UI.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        }catch( InstantiationException ex ){
            java.util.logging.Logger.getLogger( Main_UI.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        }catch( IllegalAccessException ex ){
            java.util.logging.Logger.getLogger( Main_UI.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        }catch( javax.swing.UnsupportedLookAndFeelException ex ){
            java.util.logging.Logger.getLogger( Main_UI.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater( new Runnable() {
            public void run() {
                new Main_UI().setVisible( true );
            }
        } );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton 充钱;
    private javax.swing.JButton 关于;
    private javax.swing.JButton 卡牌图鉴;
    private javax.swing.JLabel 卡牌展示;
    private javax.swing.JLabel 呢称;
    private javax.swing.JButton 商城;
    private javax.swing.JLabel 头像;
    private javax.swing.JButton 好友;
    private javax.swing.JButton 对战;
    private javax.swing.JLabel 点券;
    private javax.swing.JLabel 版本号;
    private javax.swing.JLabel 等级;
    private javax.swing.JLabel 背景;
    private javax.swing.JButton 退出;
    // End of variables declaration//GEN-END:variables
}
