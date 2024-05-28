/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Form;

import component.People;
import Swing.ScrollBar;
import net.miginfocom.swing.MigLayout;


public class Trang_Trai extends javax.swing.JPanel {

    public Trang_Trai() {
        initComponents();
        init();
    }
    private void init() {
         sp.setVerticalScrollBar(new ScrollBar());
        menuList.setLayout(new MigLayout("fillx", "0[]0", "0[]0"));
        showMessage();
    }
     private void showMessage() {
        // Kiểm tra dữ liệu
        menuList.removeAll();
        for (int i = 0; i < 21; i++) {
            menuList.add(new People("People " + i), "wrap");
        }
        refreshMenuList();
    }

    private void showGroup() {
        //  Kiểm tra dữ liệu
        menuList.removeAll();
        for (int i = 0; i < 5; i++) {
            menuList.add(new People("Group " + i), "wrap");
        }
        refreshMenuList();
    }

    private void showBox() {
        // Kiểm tra dữ liệu
        menuList.removeAll();
        for (int i = 0; i < 10; i++) {
            menuList.add(new People("Box " + i), "wrap");
        }
        refreshMenuList();
    }

    private void refreshMenuList() {
        menuList.repaint();
        menuList.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JLayeredPane();
        Message = new component.Button();
        Group = new component.Button();
        Box = new component.Button();
        sp = new javax.swing.JScrollPane();
        menuList = new javax.swing.JLayeredPane();

        setBackground(new java.awt.Color(239, 248, 252));

        Menu.setBackground(new java.awt.Color(153, 204, 255));
        Menu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Menu.setLayout(new java.awt.GridLayout(1, 3));

        Message.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/comments.png"))); // NOI18N
        Message.setIconSelected(new javax.swing.ImageIcon(getClass().getResource("/Icon/comments.png"))); // NOI18N
        Message.setIconSimple(new javax.swing.ImageIcon(getClass().getResource("/Icon/comments (1).png"))); // NOI18N
        Message.setSelected(true);
        Message.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MessageActionPerformed(evt);
            }
        });
        Menu.add(Message);

        Group.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/chat-group (1).png"))); // NOI18N
        Group.setIconSelected(new javax.swing.ImageIcon(getClass().getResource("/Icon/chat-group.png"))); // NOI18N
        Group.setIconSimple(new javax.swing.ImageIcon(getClass().getResource("/Icon/chat-group (1).png"))); // NOI18N
        Group.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GroupActionPerformed(evt);
            }
        });
        Menu.add(Group);

        Box.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/email (1).png"))); // NOI18N
        Box.setIconSelected(new javax.swing.ImageIcon(getClass().getResource("/Icon/email.png"))); // NOI18N
        Box.setIconSimple(new javax.swing.ImageIcon(getClass().getResource("/Icon/email (1).png"))); // NOI18N
        Box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxActionPerformed(evt);
            }
        });
        Menu.add(Box);

        sp.setBorder(null);
        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        menuList.setBackground(new java.awt.Color(239, 248, 252));
        menuList.setOpaque(true);

        javax.swing.GroupLayout menuListLayout = new javax.swing.GroupLayout(menuList);
        menuList.setLayout(menuListLayout);
        menuListLayout.setHorizontalGroup(
            menuListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        menuListLayout.setVerticalGroup(
            menuListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
        );

        sp.setViewportView(menuList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
            .addComponent(sp)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sp))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void GroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GroupActionPerformed
         if (!Group.isSelected()) {
          Message.setSelected(false);
          Group.setSelected(true);
          Box.setSelected(false);
          showGroup();
         }
    }//GEN-LAST:event_GroupActionPerformed

    private void MessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MessageActionPerformed
         if (!Message.isSelected()) {
          Message.setSelected(true);
          Group.setSelected(false);
          Box.setSelected(false);
          showMessage();     
         }
    }//GEN-LAST:event_MessageActionPerformed

    private void BoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxActionPerformed
        if (!Box.isSelected()) {  
          Message.setSelected(false);
          Group.setSelected(false);
          Box.setSelected(true);
          showBox();
        }
    }//GEN-LAST:event_BoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.Button Box;
    private component.Button Group;
    private javax.swing.JLayeredPane Menu;
    private component.Button Message;
    private javax.swing.JLayeredPane menuList;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}
