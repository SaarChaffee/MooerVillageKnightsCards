/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JFrame;

/**
 * @author Evistix
 */
public class About extends javax.swing.JFrame {

    /**
     * Creates new form Store
     */
    public About() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Up = new javax.swing.JPanel();
        返回 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BackGround = new javax.swing.JPanel();
        BackGroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation( javax.swing.WindowConstants.EXIT_ON_CLOSE );
        setTitle( "关于" );

        Up.setOpaque( false );

        返回.setBackground( new java.awt.Color( 153, 153, 255 ) );
        返回.setFont( new java.awt.Font( "宋体", 1, 36 ) ); // NOI18N
        返回.setForeground( new java.awt.Color( 0, 51, 204 ) );
        返回.setText( "返回" );
        返回.addActionListener( new java.awt.event.ActionListener() {
            public void actionPerformed( java.awt.event.ActionEvent evt ) {
                返回ActionPerformed( evt );
            }
        } );

        jLabel1.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/backGround/收款码.png" ) ) ); // NOI18N

        jLabel2.setFont( new java.awt.Font( "宋体", 1, 14 ) ); // NOI18N
        jLabel2.setText( "捐赠开发人员" );

        jLabel3.setFont( new java.awt.Font( "宋体", 1, 18 ) ); // NOI18N
        jLabel3.setText( "开发人员：Evistix   雨哥   苏维    霞飞" );

        jLabel4.setFont( new java.awt.Font( "宋体", 1, 18 ) ); // NOI18N
        jLabel4.setText( "日期：2021/6/5" );

        javax.swing.GroupLayout UpLayout = new javax.swing.GroupLayout( Up );
        Up.setLayout( UpLayout );
        UpLayout.setHorizontalGroup(
                UpLayout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addGroup( UpLayout.createSequentialGroup()
                                .addContainerGap( 598, Short.MAX_VALUE )
                                .addGroup( UpLayout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                        .addGroup( javax.swing.GroupLayout.Alignment.TRAILING, UpLayout.createSequentialGroup()
                                                .addComponent( 返回, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                .addGap( 61, 61, 61 ) )
                                        .addGroup( javax.swing.GroupLayout.Alignment.TRAILING, UpLayout.createSequentialGroup()
                                                .addGroup( UpLayout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                                        .addComponent( jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                        .addComponent( jLabel1 ) )
                                                .addGap( 71, 71, 71 ) )
                                        .addGroup( javax.swing.GroupLayout.Alignment.TRAILING, UpLayout.createSequentialGroup()
                                                .addGroup( UpLayout.createParallelGroup( javax.swing.GroupLayout.Alignment.TRAILING )
                                                        .addComponent( jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                        .addComponent( jLabel4 ) )
                                                .addGap( 24, 24, 24 ) ) ) )
                                   );
        UpLayout.setVerticalGroup(
                UpLayout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addGroup( UpLayout.createSequentialGroup()
                                .addContainerGap( 204, Short.MAX_VALUE )
                                .addComponent( jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE )
                                .addGap( 38, 38, 38 )
                                .addComponent( jLabel4 )
                                .addGap( 90, 90, 90 )
                                .addComponent( jLabel1 )
                                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED )
                                .addComponent( jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE )
                                .addGap( 18, 18, 18 )
                                .addComponent( 返回, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE )
                                .addGap( 62, 62, 62 ) )
                                 );

        BackGroundLabel.setIcon( new javax.swing.ImageIcon( getClass().getResource( "/backGround/b3.png" ) ) ); // NOI18N
        BackGroundLabel.setOpaque( true );

        javax.swing.GroupLayout BackGroundLayout = new javax.swing.GroupLayout( BackGround );
        BackGround.setLayout( BackGroundLayout );
        BackGroundLayout.setHorizontalGroup(
                BackGroundLayout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addGroup( javax.swing.GroupLayout.Alignment.TRAILING, BackGroundLayout.createSequentialGroup()
                                .addComponent( BackGroundLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                                .addContainerGap() )
                                           );
        BackGroundLayout.setVerticalGroup(
                BackGroundLayout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addGroup( javax.swing.GroupLayout.Alignment.TRAILING, BackGroundLayout.createSequentialGroup()
                                .addComponent( BackGroundLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                                .addContainerGap() )
                                         );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout( getContentPane() );
        getContentPane().setLayout( layout );
        layout.setHorizontalGroup(
                layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addComponent( Up, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                        .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                .addComponent( BackGround, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE ) )
                                 );
        layout.setVerticalGroup(
                layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addComponent( Up, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                        .addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                .addComponent( BackGround, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE ) )
                               );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void 返回ActionPerformed( java.awt.event.ActionEvent evt ) {//GEN-FIRST:event_返回ActionPerformed
        // TODO add your handling code here:
        this.setVisible( false );
        new Main_UI().setVisible( true );
    }//GEN-LAST:event_返回ActionPerformed

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
            java.util.logging.Logger.getLogger( About.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        }catch( InstantiationException ex ){
            java.util.logging.Logger.getLogger( About.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        }catch( IllegalAccessException ex ){
            java.util.logging.Logger.getLogger( About.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        }catch( javax.swing.UnsupportedLookAndFeelException ex ){
            java.util.logging.Logger.getLogger( About.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater( new Runnable() {
            public void run() {
                new About().setVisible( true );
            }
        } );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JLabel BackGroundLabel;
    private javax.swing.JPanel Up;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton 返回;
    // End of variables declaration//GEN-END:variables
}
