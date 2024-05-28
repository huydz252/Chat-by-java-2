/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package component;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author admibn
 */
public class People extends javax.swing.JPanel {

    /**
     * Creates new form People
     */
    public People(String name) {
        initComponents();
        lb.setText(name);
        init();
    }
// Đổi màu ô có chuột di chuyển đến
    private void init() {
       addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                setBackground(new Color(255, 255, 204));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                setBackground(new Color(239,248,252));
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        av = new Swing.Avatar();
        lb = new javax.swing.JLabel();

        setBackground(new java.awt.Color(239, 248, 252));
        setPreferredSize(new java.awt.Dimension(200, 50));

        av.setBorderSize(0);
        av.setImage(new javax.swing.ImageIcon(getClass().getResource("/Icon/profile.png"))); // NOI18N
        av.setLayout(new java.awt.BorderLayout());

        lb.setBackground(new java.awt.Color(255, 255, 255));
        lb.setText("Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(av, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lb, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(av, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.Avatar av;
    private javax.swing.JLabel lb;
    // End of variables declaration//GEN-END:variables
}
