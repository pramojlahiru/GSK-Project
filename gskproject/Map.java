/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gskproject;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author chamod
 */
public class Map extends javax.swing.JFrame {

    /**
     * Creates new form Map
     */
   DBOperations dbOps=new DBOperations();
    
   static int x,y,count,map;
   static String color;
   static ImageIcon icon;
   static public Graphics2D g,end;
   static BufferedImage image,test;
   //static String department;
    public Map() {
        initComponents();
        setIcon();
        loadDepartments();
        lblMap.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
        map=0;
        try {
            ImportImage(map);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        color="red";
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    void loadDepartments(){
        ArrayList<String> depArray=dbOps.getDepartmentNames();
        for(String dep:depArray){
            ddDepartment.addItem(dep);
        }
    }
    
    public void drawCircle(int x, int y,String color) {

            Graphics end =lblMap.getGraphics();
            Graphics2D g1 =image.createGraphics();
        if(color=="Near Miss"){
            end.setColor(Color.yellow);
            end.fillOval(x, y , 10, 10);
            g1.setColor(Color.yellow);
            g1.fillOval(x, y-32, 15, 15);
        }
        else if(color=="First Aid"){
            end.setColor(Color.red);
            end.fillOval(x, y, 10, 10);
            g1.setColor(Color.red);
            g1.fillOval(x, y-32, 15, 15);
        }
        else if(color=="LTI"){
            end.setColor(Color.pink);  
            end.fillOval(x, y, 10, 10);
            g1.setColor(Color.pink);
            g1.fillOval(x, y-32, 15, 15);
        }
        else if(color=="Eraser"){
            end.setColor(Color.white);
            end.fillOval(x, y, 20, 20);
            g1.setColor(Color.white);
            g1.fillOval(x, y-32, 15, 15);
        }
        else {
            end.setColor(Color.red);
            end.fillOval(x, y, 10, 10);
            g1.setColor(Color.red);
            g1.fillOval(x, y-32, 15, 15);
        }  
    }
        
    public void ImportImage(int map) throws IOException {   
        String pic =("C:\\Users\\sumi\\Desktop\\project codes\\Iteration5\\GskProject\\src\\Images\\"+map+".jpg");
        File imagefile = new File(pic);
        image = ImageIO.read(imagefile);
        Graphics2D g =image.createGraphics();
        ImageIcon icon =new ImageIcon(image);
        lblMap.setIcon(icon);
        Graphics end =lblMap.getGraphics();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMap = new javax.swing.JLabel();
        ddDepartment = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ddColor = new javax.swing.JComboBox();
        btnSave = new javax.swing.JButton();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnUndo = new javax.swing.JButton();
        btnRedo = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Map");

        lblMap.setPreferredSize(new java.awt.Dimension(500, 500));
        lblMap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMapMouseClicked(evt);
            }
        });

        ddDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddDepartmentActionPerformed(evt);
            }
        });

        jLabel2.setText("Select the Department");

        jLabel5.setText("Accident Type");

        ddColor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "First Aid", "LTI", "Near Miss", "Eraser" }));
        ddColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddColorActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save-icon (1).png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txt1.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N

        txt2.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Urdu Typesetting", 1, 18)); // NOI18N
        jLabel4.setText("Y");

        jLabel3.setFont(new java.awt.Font("Urdu Typesetting", 1, 18)); // NOI18N
        jLabel3.setText("X");

        btnUndo.setText("Undo");

        btnRedo.setText("Redo");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Windows-Close-Program-icon.png"))); // NOI18N
        jButton4.setText("Cancal");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblMap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 297, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUndo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ddDepartment, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ddColor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt2, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(btnRedo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ddDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ddColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUndo)
                    .addComponent(btnRedo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave)
                    .addComponent(jButton4))
                .addContainerGap(234, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(lblMap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void lblMapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMapMouseClicked
        
        x = evt.getX();
        y = evt.getY();

        txt1.setText(Integer.toString(x));
        txt2.setText(Integer.toString(y));
        drawCircle(x-5,y-5,color);
    }//GEN-LAST:event_lblMapMouseClicked

    private void ddDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddDepartmentActionPerformed
        Object obj = evt.getSource();
        if (obj == ddDepartment) {
            //department=ddDepartment.getSelectedIndex();
            map = ddDepartment.getSelectedIndex();
            try {
                ImportImage(map);
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_ddDepartmentActionPerformed

    private void ddColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddColorActionPerformed
        color = ddColor.getSelectedItem().toString();
        System.out.println(color);
    }//GEN-LAST:event_ddColorActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        NewCase.x=x;
        NewCase.y=y;
        NewCase.departmentID=ddDepartment.getSelectedIndex()+1;
        //System.out.println(ddDepartment.getSelectedIndex()+1);
        NewCase.accidentType=ddColor.getSelectedItem().toString();
        this.dispose();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Map().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRedo;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUndo;
    private javax.swing.JComboBox ddColor;
    private javax.swing.JComboBox ddDepartment;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMap;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icon.png")));}
}
