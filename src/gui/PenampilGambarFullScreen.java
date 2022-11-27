/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.CardLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author X441m
 */
public class PenampilGambarFullScreen extends javax.swing.JFrame {

    /**
     * Creates new form PenampilGambarFullScreen
     */
    public PenampilGambarFullScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonPanel = new javax.swing.JPanel();
        gbr1Btn = new javax.swing.JButton();
        gbr2Btn = new javax.swing.JButton();
        gbr3Btn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        imagePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        gbr1Btn.setText("Gambar 1");
        gbr1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gbr1BtnActionPerformed(evt);
            }
        });
        ButtonPanel.add(gbr1Btn);

        gbr2Btn.setText("Gambar 2");
        gbr2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gbr2BtnActionPerformed(evt);
            }
        });
        ButtonPanel.add(gbr2Btn);

        gbr3Btn.setText("Gambar 3");
        gbr3Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gbr3BtnActionPerformed(evt);
            }
        });
        ButtonPanel.add(gbr3Btn);

        exitbtn.setText("Exit");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });
        ButtonPanel.add(exitbtn);

        getContentPane().add(ButtonPanel, java.awt.BorderLayout.PAGE_START);

        imagePanel.setLayout(new java.awt.CardLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Gambar1.jpeg"))); // NOI18N
        imagePanel.add(jLabel1, "1");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Gambar2.jpeg"))); // NOI18N
        imagePanel.add(jLabel2, "2");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Gambar3.jpeg"))); // NOI18N
        imagePanel.add(jLabel3, "3");

        getContentPane().add(imagePanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gbr1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gbr1BtnActionPerformed
        // TODO add your handling code here:
        CardLayout c1 = (CardLayout) (imagePanel.getLayout());
        c1.show(imagePanel, "1");
    }//GEN-LAST:event_gbr1BtnActionPerformed

    private void gbr2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gbr2BtnActionPerformed
        // TODO add your handling code here:
        CardLayout c1 = (CardLayout) (imagePanel.getLayout());
        c1.show(imagePanel, "2");
    }//GEN-LAST:event_gbr2BtnActionPerformed

    private void gbr3BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gbr3BtnActionPerformed
        // TODO add your handling code here:
        CardLayout c1 = (CardLayout) (imagePanel.getLayout());
        c1.show(imagePanel, "3");
    }//GEN-LAST:event_gbr3BtnActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {            
        PenampilGambarButton fullFrame = new PenampilGambarButton();        
        GraphicsDevice device =
            GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        device.setFullScreenWindow(fullFrame);        
        fullFrame.setVisible(true);        
        }
    });
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
            java.util.logging.Logger.getLogger(PenampilGambarFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenampilGambarFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenampilGambarFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenampilGambarFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JButton exitbtn;
    private javax.swing.JButton gbr1Btn;
    private javax.swing.JButton gbr2Btn;
    private javax.swing.JButton gbr3Btn;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
