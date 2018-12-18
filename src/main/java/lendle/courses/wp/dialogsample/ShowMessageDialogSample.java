/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.dialogsample;

import javax.swing.JOptionPane;

/**
 *
 * @author lendle
 */
public class ShowMessageDialogSample extends javax.swing.JFrame {

    /**
     * Creates new form ShowMessageDialogSample
     */
    public ShowMessageDialogSample() {
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

        defaultButton = new javax.swing.JButton();
        errorButton = new javax.swing.JButton();
        informationButton = new javax.swing.JButton();
        plainButton = new javax.swing.JButton();
        questionButton = new javax.swing.JButton();
        warningButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(6, 1));

        defaultButton.setText("Default");
        defaultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaultButtonActionPerformed(evt);
            }
        });
        getContentPane().add(defaultButton);

        errorButton.setText("Error");
        errorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                errorButtonActionPerformed(evt);
            }
        });
        getContentPane().add(errorButton);

        informationButton.setText("Information");
        informationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informationButtonActionPerformed(evt);
            }
        });
        getContentPane().add(informationButton);

        plainButton.setText("Plain");
        plainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plainButtonActionPerformed(evt);
            }
        });
        getContentPane().add(plainButton);

        questionButton.setText("Question");
        questionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionButtonActionPerformed(evt);
            }
        });
        getContentPane().add(questionButton);

        warningButton.setText("Warning");
        warningButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warningButtonActionPerformed(evt);
            }
        });
        getContentPane().add(warningButton);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void defaultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defaultButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "hello","",JOptionPane.DEFAULT_OPTION);
    }//GEN-LAST:event_defaultButtonActionPerformed

    private void errorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errorButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "hello","",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_errorButtonActionPerformed

    private void informationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informationButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "hello","",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_informationButtonActionPerformed

    private void plainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plainButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "hello","",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_plainButtonActionPerformed

    private void questionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "hello","",JOptionPane.QUESTION_MESSAGE);
    }//GEN-LAST:event_questionButtonActionPerformed

    private void warningButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warningButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "hello","",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_warningButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ShowMessageDialogSample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowMessageDialogSample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowMessageDialogSample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowMessageDialogSample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowMessageDialogSample().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton defaultButton;
    private javax.swing.JButton errorButton;
    private javax.swing.JButton informationButton;
    private javax.swing.JButton plainButton;
    private javax.swing.JButton questionButton;
    private javax.swing.JButton warningButton;
    // End of variables declaration//GEN-END:variables
}
