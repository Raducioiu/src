package joctable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RaduCanu
 */
import javax.swing.*;
public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    public Frame() {
        initComponents();
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane2 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        Rules = new javax.swing.JLabel();
        Play = new javax.swing.JLabel();
        File = new javax.swing.JLabel();
        Backgammon = new javax.swing.JLabel();
        Dice = new javax.swing.JLabel();
        Backg1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Back2 = new javax.swing.JLabel();
        Home2 = new javax.swing.JLabel();
        Next2 = new javax.swing.JLabel();
        Backg2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Next3 = new javax.swing.JLabel();
        Home3 = new javax.swing.JLabel();
        Back3 = new javax.swing.JLabel();
        Backg3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Next4 = new javax.swing.JLabel();
        Home4 = new javax.swing.JLabel();
        Back4 = new javax.swing.JLabel();
        Backg4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(870, 650));

        jPanel1.setLayout(null);

        Rules.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/Rules.png"))); // NOI18N
        Rules.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RulesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RulesMouseEntered(evt);
            }
        });
        jPanel1.add(Rules);
        Rules.setBounds(-50, 450, 300, 230);

        Play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/PLay.png"))); // NOI18N
        Play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlayMouseClicked(evt);
            }
        });
        jPanel1.add(Play);
        Play.setBounds(220, 450, 300, 230);

        File.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/File.png"))); // NOI18N
        File.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel1.add(File);
        File.setBounds(510, 450, 300, 230);

        Backgammon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/backgamon.png"))); // NOI18N
        jPanel1.add(Backgammon);
        Backgammon.setBounds(120, -20, 460, 260);

        Dice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/2.png"))); // NOI18N
        Dice.setText("jLabel6");
        jPanel1.add(Dice);
        Dice.setBounds(520, 80, 80, 90);

        Backg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/capture2.png"))); // NOI18N
        Backg1.setName("Background"); // NOI18N
        jPanel1.add(Backg1);
        Backg1.setBounds(0, 0, 870, 650);

        jPanel2.setMaximumSize(new java.awt.Dimension(870, 650));
        jPanel2.setMinimumSize(new java.awt.Dimension(850, 650));
        jPanel2.setLayout(null);

        Back2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/Back.png"))); // NOI18N
        Back2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back2MouseClicked(evt);
            }
        });
        jPanel2.add(Back2);
        Back2.setBounds(-50, 450, 300, 230);

        Home2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/Home.png"))); // NOI18N
        Home2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home2MouseClicked(evt);
            }
        });
        jPanel2.add(Home2);
        Home2.setBounds(220, 450, 300, 230);

        Next2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/Next.png"))); // NOI18N
        Next2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Next2MouseClicked(evt);
            }
        });
        jPanel2.add(Next2);
        Next2.setBounds(510, 450, 300, 230);

        Backg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/Rules1.png"))); // NOI18N
        jPanel2.add(Backg2);
        Backg2.setBounds(0, 0, 870, 650);

        jPanel3.setMaximumSize(new java.awt.Dimension(870, 650));
        jPanel3.setMinimumSize(new java.awt.Dimension(870, 650));
        jPanel3.setLayout(null);

        Next3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/Next.png"))); // NOI18N
        Next3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Next3MouseClicked(evt);
            }
        });
        jPanel3.add(Next3);
        Next3.setBounds(510, 450, 300, 230);

        Home3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/Home.png"))); // NOI18N
        Home3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home3MouseClicked(evt);
            }
        });
        jPanel3.add(Home3);
        Home3.setBounds(220, 450, 300, 230);

        Back3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/Back.png"))); // NOI18N
        Back3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back3MouseClicked(evt);
            }
        });
        jPanel3.add(Back3);
        Back3.setBounds(-50, 450, 300, 230);

        Backg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/Rules2_1.png"))); // NOI18N
        jPanel3.add(Backg3);
        Backg3.setBounds(0, 0, 870, 650);

        jPanel4.setMaximumSize(new java.awt.Dimension(870, 650));
        jPanel4.setMinimumSize(new java.awt.Dimension(870, 650));
        jPanel4.setPreferredSize(new java.awt.Dimension(870, 650));
        jPanel4.setLayout(null);

        Next4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/Next.png"))); // NOI18N
        Next4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Next4MouseClicked(evt);
            }
        });
        jPanel4.add(Next4);
        Next4.setBounds(510, 450, 300, 230);

        Home4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/Home.png"))); // NOI18N
        Home4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home4MouseClicked(evt);
            }
        });
        jPanel4.add(Home4);
        Home4.setBounds(220, 450, 300, 230);

        Back4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/Back.png"))); // NOI18N
        Back4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back4MouseClicked(evt);
            }
        });
        jPanel4.add(Back4);
        Back4.setBounds(-50, 450, 300, 230);

        Backg4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/Rules3.png"))); // NOI18N
        jPanel4.add(Backg4);
        Backg4.setBounds(0, 0, 870, 650);

        jPanel5.setMaximumSize(new java.awt.Dimension(870, 650));
        jPanel5.setMinimumSize(new java.awt.Dimension(870, 650));
        jPanel5.setPreferredSize(new java.awt.Dimension(870, 650));
        jPanel5.setLayout(null);

        jPanel8.setOpaque(false);
        jPanel8.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/Roll.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel2);
        jLabel2.setBounds(310, 280, 100, 100);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/Tableta.png"))); // NOI18N
        jPanel8.add(jLabel3);
        jLabel3.setBounds(6, 0, 700, 650);

        jPanel5.add(jPanel8);
        jPanel8.setBounds(0, 0, 700, 650);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/About.png"))); // NOI18N
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1);
        jButton1.setBounds(700, 0, 170, 109);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/History.png"))); // NOI18N
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2);
        jButton2.setBounds(700, 550, 170, 100);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/Help.png"))); // NOI18N
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3);
        jButton3.setBounds(700, 110, 170, 109);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/NewGame.png"))); // NOI18N
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4);
        jButton4.setBounds(700, 220, 170, 109);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/Save.png"))); // NOI18N
        jButton5.setOpaque(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5);
        jButton5.setBounds(700, 330, 170, 109);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/Undo.png"))); // NOI18N
        jButton6.setOpaque(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton6);
        jButton6.setBounds(700, 440, 170, 109);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagini/capture2.png"))); // NOI18N
        jPanel5.add(jLabel1);
        jLabel1.setBounds(4, -6, 870, 660);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1305, Short.MAX_VALUE)
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                    .addContainerGap(176, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
                    .addContainerGap(435, Short.MAX_VALUE)))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                    .addContainerGap(444, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
                    .addGap(425, 425, 425)))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                    .addContainerGap(125, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                    .addContainerGap(325, Short.MAX_VALUE)))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                    .addContainerGap(334, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                    .addGap(315, 315, 315)))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jLayeredPane2.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jPanel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RulesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RulesMouseEntered

// TODO add your handling code here:
    }//GEN-LAST:event_RulesMouseEntered

    private void RulesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RulesMouseClicked
    jPanel1.setVisible(false);
    jPanel2.setVisible(true);
    }//GEN-LAST:event_RulesMouseClicked

    private void Back2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back2MouseClicked
      javax.swing.JOptionPane.showMessageDialog(this, "This is the first page!", "Can't perform action.", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_Back2MouseClicked

    private void Home2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home2MouseClicked
    jPanel1.setVisible(true);
    jPanel2.setVisible(false);
    }//GEN-LAST:event_Home2MouseClicked

    private void Next2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Next2MouseClicked
    jPanel2.setVisible(false);
    jPanel3.setVisible(true);
    }//GEN-LAST:event_Next2MouseClicked

    private void Back3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back3MouseClicked
    jPanel3.setVisible(false);
    jPanel2.setVisible(true);
    }//GEN-LAST:event_Back3MouseClicked

    private void Next3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Next3MouseClicked
    jPanel3.setVisible(false);
    jPanel4.setVisible(true);        
    }//GEN-LAST:event_Next3MouseClicked

    private void Next4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Next4MouseClicked
        javax.swing.JOptionPane.showMessageDialog(this, "This is the last page!", "Can't perform action.", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_Next4MouseClicked

    private void Home3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home3MouseClicked
    jPanel3.setVisible(false);
    jPanel1.setVisible(true);     
    }//GEN-LAST:event_Home3MouseClicked

    private void Home4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home4MouseClicked
    jPanel4.setVisible(false);
    jPanel1.setVisible(true);     
    }//GEN-LAST:event_Home4MouseClicked

    private void Back4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back4MouseClicked
    jPanel4.setVisible(false);
    jPanel3.setVisible(true);     
    }//GEN-LAST:event_Back4MouseClicked

    private void PlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayMouseClicked
       jPanel1.setVisible(false);
       jPanel5.setVisible(true);
       
    }//GEN-LAST:event_PlayMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
 Zar zar = new Zar();
        zar.start();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back2;
    private javax.swing.JLabel Back3;
    private javax.swing.JLabel Back4;
    private javax.swing.JLabel Backg1;
    private javax.swing.JLabel Backg2;
    private javax.swing.JLabel Backg3;
    private javax.swing.JLabel Backg4;
    private javax.swing.JLabel Backgammon;
    private javax.swing.JLabel Dice;
    private javax.swing.JLabel File;
    private javax.swing.JLabel Home2;
    private javax.swing.JLabel Home3;
    private javax.swing.JLabel Home4;
    private javax.swing.JLabel Next2;
    private javax.swing.JLabel Next3;
    private javax.swing.JLabel Next4;
    private javax.swing.JLabel Play;
    private javax.swing.JLabel Rules;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
