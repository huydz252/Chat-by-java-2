/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;


import Event.EventImageView;
import Event.EventMain;
import Event.PublicEvent;
import Swing.ThanhPhan;
import com.formdev.flatlaf.intellijthemes.FlatArcIJTheme;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import service.Service;


public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        init();
    }
    private void init() {
         setIconImage(new ImageIcon(getClass().getResource("/icon/wechat.png")).getImage());
        ThanhPhan TP = new ThanhPhan();
         TP.registerComponent(this);
         TP.setMinimumSize(new Dimension(900, 500));
         TP.setMaximumSize(Toolkit.getDefaultToolkit().getScreenSize());
         TP.setSnapSize(new Dimension(10, 10));
        login.setVisible(true);
        loading.setVisible(false);
        V_Image.setVisible(false);
        Home.setVisible(false);
        initEvent();
        Service.getInstance().startServer();
    }

     private void initEvent() {
        PublicEvent.getInstance().addEventMain(new EventMain() {
            @Override
            public void showLoading(boolean show) {
                loading.setVisible(show);
            }

            @Override
            public void initChat() {
                Home.setVisible(true);
            }
        });
        PublicEvent.getInstance().addEventImageView(new EventImageView() {
            @Override
            public void viewImage(Icon image) {
               V_Image.viewImage(image);
            }

            @Override
            public void saveImage(Icon image) {
                System.out.println("Save Image next update");
            }

        });
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Border = new javax.swing.JPanel();
        Background = new javax.swing.JPanel();
        Tcc = new javax.swing.JPanel();
        Minimisize = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        KhungThan = new javax.swing.JLayeredPane();
        loading = new Form.Loading();
        login = new Form.Login();
        V_Image = new Form.View_Image();
        Home = new Form.Trangchu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Border.setBackground(new java.awt.Color(243, 250, 252));

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BackgroundMouseDragged(evt);
            }
        });
        Background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BackgroundMousePressed(evt);
            }
        });

        Tcc.setBackground(new java.awt.Color(172, 198, 252));

        Minimisize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/minimize1.png"))); // NOI18N
        Minimisize.setBorder(null);
        Minimisize.setContentAreaFilled(false);
        Minimisize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimisize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimisizeActionPerformed(evt);
            }
        });

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logout1.png"))); // NOI18N
        Exit.setBorder(null);
        Exit.setContentAreaFilled(false);
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TccLayout = new javax.swing.GroupLayout(Tcc);
        Tcc.setLayout(TccLayout);
        TccLayout.setHorizontalGroup(
            TccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TccLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Minimisize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Exit)
                .addContainerGap())
        );
        TccLayout.setVerticalGroup(
            TccLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Minimisize)
            .addComponent(Exit)
        );

        KhungThan.setLayout(new java.awt.CardLayout());
        KhungThan.add(loading, "card5");
        KhungThan.add(login, "card4");

        V_Image.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        KhungThan.setLayer(V_Image, javax.swing.JLayeredPane.POPUP_LAYER);
        KhungThan.add(V_Image, "card3");

        Home.setBackground(new java.awt.Color(239, 248, 252));
        KhungThan.add(Home, "card2");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tcc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(KhungThan, javax.swing.GroupLayout.PREFERRED_SIZE, 1099, Short.MAX_VALUE)
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Tcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KhungThan, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BorderLayout = new javax.swing.GroupLayout(Border);
        Border.setLayout(BorderLayout);
        BorderLayout.setHorizontalGroup(
            BorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BorderLayout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BorderLayout.setVerticalGroup(
            BorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Border, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Border, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private int pX;
    private int pY;
    private void BackgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMouseDragged
         this.setLocation(this.getLocation().x + evt.getX() - pX, this.getLocation().y + evt.getY() - pY);
    }//GEN-LAST:event_BackgroundMouseDragged

    private void BackgroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMousePressed
         pX = evt.getX();
         pY = evt.getY();
    }//GEN-LAST:event_BackgroundMousePressed

    private void MinimisizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimisizeActionPerformed
       this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MinimisizeActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

       FlatArcIJTheme.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Border;
    private javax.swing.JButton Exit;
    private Form.Trangchu Home;
    private javax.swing.JLayeredPane KhungThan;
    private javax.swing.JButton Minimisize;
    private javax.swing.JPanel Tcc;
    private Form.View_Image V_Image;
    private Form.Loading loading;
    private Form.Login login;
    // End of variables declaration//GEN-END:variables
}
