/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gskproject;

import java.awt.Toolkit;
import java.io.File;
import java.sql.Connection;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author sumi
 */
public class BackupDB extends javax.swing.JFrame {

    Connection con = null;

    DBOperations dbops = new DBOperations();

    /**
     * Creates new form BackupDB
     */
    public BackupDB() {
        initComponents();
        setIcon();

        try {
            con = dbops.backupDB();
            FileChooser.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", 2);
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        FileChooser = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Save Backup File");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("save your backup"));

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Save-icon.png"))); // NOI18N
        btnSave.setText("Create Database Backup");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel-icon.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        FileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileChooserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(btnSave)
                        .addGap(89, 89, 89)
                        .addComponent(btnExit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(FileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit)
                    .addComponent(btnSave))
                .addGap(84, 84, 84)
                .addComponent(FileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(576, 192));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            
            //setIcon();
            String filename = null;//arquivo

            FileChooser.setVisible(true);

            int result = FileChooser.showSaveDialog(null);

            if (result == JFileChooser.APPROVE_OPTION) {
                filename = FileChooser.getSelectedFile().toString().concat(".sql");

                File file = new File(filename);

                if (file.exists()) {
                    Object option[] = {"Sim", "Nao"};

                    //int opcao = JOptionPane.showOptionDialog(null,"aaaaa",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,option,option[0]);
                    int opcao = JOptionPane.showOptionDialog(null, "aaa", "bbbb", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
                    if (opcao == JOptionPane.YES_OPTION) {
                        Runtime backup = Runtime.getRuntime();
                        backup.exec("C:\\wamp\\bin\\mysql\\mysql5.6.17\\bin\\mysqldump.exe -v -v -v --host=localhost --user=root --port=3306 --protocol=tcp --force --allow-keywords --compress --add-drop-table --result-file=" + filename + " --databases gskproject");
                        JOptionPane.showMessageDialog(null, "Backup succesfully");
                    } else {
                        FileChooserActionPerformed(evt);
                    }
                } else {
                    Runtime backup = Runtime.getRuntime();
                    backup.exec("C:\\wamp\\bin\\mysql\\mysql5.6.17\\bin\\mysqldump.exe -v -v -v --host=localhost --user=root --port=3306 --protocol=tcp --force --allow-keywords --compress --add-drop-table --result-file=" + filename + " --databases gskproject");
                    JOptionPane.showMessageDialog(null, "Backup succesfully");
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error.!", 2);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void FileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileChooserActionPerformed

    }//GEN-LAST:event_FileChooserActionPerformed

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
            java.util.logging.Logger.getLogger(BackupDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BackupDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BackupDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BackupDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BackupDB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser FileChooser;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSave;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icon.png")));
    }
}
