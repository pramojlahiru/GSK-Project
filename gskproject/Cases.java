/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gskproject;

import static gskproject.Analyze.tablePersonWise;
import static gskproject.NewCase.userList;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chamod
 */
public class Cases extends javax.swing.JFrame {
    
    static ArrayList<User> userList;
    static ArrayList<Object[]> depArray;
    public static HashMap<Integer,String> depMap;
    //public static HashMap<String,Integer> depMap1;
    public static HashMap<Integer,String> userMap;
    //public static HashMap<String,Integer> userMap1;
    
    DBOperations dbOps=new DBOperations();
    /**
     * Creates new form Cases
     */
    public Cases() {
        initComponents();
        depMap=dbOps.getDepartmentIDNameHasMap();
        userMap=dbOps.getUserHasMap();
        loadField();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ddDepartment = new javax.swing.JComboBox();
        ddObserver = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ddResponsibleParty = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        ddZap = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCases = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        dtFrom = new com.toedter.calendar.JDateChooser();
        dtTo = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        ddAccidentType = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        ddObservationType = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        ddKindOfSource = new javax.swing.JComboBox();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cases");
        setBounds(new java.awt.Rectangle(225, 35, 0, 0));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cases"));

        jLabel1.setText(" From:");

        jLabel2.setText("To");

        jLabel3.setText("Department :");

        jLabel4.setText("Observer :");

        jLabel5.setText("Responsible Party :");

        jLabel6.setText("ZAP State :");

        ddZap.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "Open", "Close" }));

        tblCases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Observation ID", "Kind of Source", "Observation type", "Description", "Accident Type", "Department", "Observer", "Responsible Party", "Target Date", "Closed Date", "ZAP State"
            }
        ));
        jScrollPane1.setViewportView(tblCases);
        if (tblCases.getColumnModel().getColumnCount() > 0) {
            tblCases.getColumnModel().getColumn(8).setMinWidth(50);
        }

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Actions-go-next-view-page-icon.png"))); // NOI18N
        jButton1.setText("View Cases");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Actions-view-list-details-icon.png"))); // NOI18N
        jButton2.setText("Case Details");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/File-New-icon.png"))); // NOI18N
        jButton3.setText("Edit Case");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/File-Delete-icon.png"))); // NOI18N
        jButton4.setText("Delete Case");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chart-icon.png"))); // NOI18N
        jButton5.setText("Chart");

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Document-icon.png"))); // NOI18N
        jButton6.setText("Genarate Report");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Exit");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        dtFrom.setDateFormatString("dd MMM yyyy");

        dtTo.setDateFormatString("dd MMM yyyy");

        jLabel7.setText("Accident Type :");

        ddAccidentType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "First Aid", "Near Miss", "LTI" }));

        jLabel8.setText("Observation Type : ");

        ddObservationType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "Building and Maintenance", "Chemical Handling", "Ejected Machine Parts", "Electricity", "Fire & Emergency Preparedness", "Gravity", "House Keeping", "LOTO", "Manual Handling/ERGO", "Other", "People", "PPE", "PTW", "Sharp Edges/Sharp Objects", "SOP", "TRIP/SLIP", "Waste Management", "Work Equipment", "Work Place Transportation", "Working Environment", "ZA" }));

        jLabel9.setText("Kind of Source :");

        ddKindOfSource.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "BOT", "EHS GEMBA Observation", "First Aid", "L1 AUDIT ACTIONS", "L2 AUDIT ACTIONS", "Nearmiss", "Other Observation" }));

        jButton8.setText("Reset");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dtTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ddObserver, 0, 145, Short.MAX_VALUE)
                                    .addComponent(ddDepartment, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(316, 316, 316)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(ddKindOfSource, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(39, 39, 39)
                                        .addComponent(ddAccidentType, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(ddObservationType, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ddResponsibleParty, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ddZap, 0, 144, Short.MAX_VALUE))))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(dtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dtTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ddDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ddObserver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jButton8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(ddAccidentType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(ddObservationType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(ddResponsibleParty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(ddKindOfSource, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(ddZap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton3)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void loadField(){
        userList=dbOps.getUser();
        ddObserver.addItem("All");
        ddResponsibleParty.addItem("All");
        for(User u:userList){
            ddObserver.addItem(u.getUsername());
            ddResponsibleParty.addItem(u.getUsername());
        }
        
        depArray=dbOps.getDepartmentNameID();
        ddDepartment.addItem("All");
        for(Object[] dep:depArray){
            ddDepartment.addItem(dep[1]);
        }
    }    
    
    boolean isChanged() {
        int count=0;
        if (ddDepartment.getSelectedItem() != "All") {
            count++;
        }
        if (ddObserver.getSelectedItem() != "All") {
            count++;
        }
        if (ddResponsibleParty.getSelectedItem() != "All") {
            count++;
        }
        if (ddZap.getSelectedItem() != "All") {
            count++;
        }
        if (ddAccidentType.getSelectedItem() != "All") {
            count++;
        }
        if (ddObservationType.getSelectedItem() != "All") {
            count++;
        }
        if (ddKindOfSource.getSelectedItem() != "All") {
            count++;
        }
        
        if(count>0){
            return true;
        }else{
            return false;
        }
    }
    
    void resetField(){
        ddDepartment.setSelectedIndex(0);
        ddObserver.setSelectedIndex(0);
        ddResponsibleParty.setSelectedIndex(0);
        ddZap.setSelectedIndex(0);
        ddAccidentType.setSelectedIndex(0);
        ddObservationType.setSelectedIndex(0);
        ddKindOfSource.setSelectedIndex(0);
        dtFrom.setDate(null);
        dtTo.setDate(null);
    }
    
    void loadTable(){
        java.sql.Date from;
        java.sql.Date to;
        
        String quary="";
        if (dtFrom.getDate() == null && dtTo.getDate() == null) {
            quary="SELECT * FROM observation";

        } else if (dtFrom.getDate() == null) {
            //from = null;
            to = new java.sql.Date(dtTo.getDate().getTime());
            quary="SELECT * FROM observation WHERE date <='"+to+"'";

        } else if (dtTo.getDate() == null) {
            from = new java.sql.Date(dtFrom.getDate().getTime());
            //to = null;
            quary="SELECT * FROM observation WHERE date >='"+from+"'";

        } else {
            from = new java.sql.Date(dtFrom.getDate().getTime());
            to = new java.sql.Date(dtTo.getDate().getTime());
            quary="SELECT * FROM observation WHERE (date BETWEEN '"+from+"' AND '"+to+"')";
        }
        
        if (dtFrom.getDate() == null && dtTo.getDate() == null) {
            if (isChanged()) {
                quary += " WHERE";
                int count = 0;
                if (ddDepartment.getSelectedItem() != "All") {
                    quary += " departmentID=" + depArray.get(ddDepartment.getSelectedIndex() - 1)[0];
                    count++;
                }
                if (ddObserver.getSelectedItem() != "All") {
                    if (count == 0) {
                        quary += " observerID=" + userList.get(ddObserver.getSelectedIndex() - 1).getUserID();
                    } else {
                        quary += " AND observerID=" + userList.get(ddObserver.getSelectedIndex() - 1).getUserID();
                    }
                    count++;
                }
                if (ddResponsibleParty.getSelectedItem() != "All") {
                    if (count == 0) {
                        quary += " responsiblePartyID=" + userList.get(ddResponsibleParty.getSelectedIndex() - 1).getUserID();
                    } else {
                        quary += " AND responsiblePartyID=" + userList.get(ddResponsibleParty.getSelectedIndex() - 1).getUserID();
                    }
                    count++;

                }
                if (ddZap.getSelectedItem() != "All") {
                    if (count == 0) {
                        quary += " zapStatus='" + ddZap.getSelectedItem().toString() + "'";
                    } else {
                        quary += " AND zapStatus='" + ddZap.getSelectedItem().toString() + "'";
                    }
                }
                if (ddAccidentType.getSelectedItem() != "All") {
                    if (count == 0) {
                        quary += " accidentType='" + ddAccidentType.getSelectedItem().toString() + "'";
                    } else {
                        quary += " AND accidentType='" + ddAccidentType.getSelectedItem().toString() + "'";
                    }
                }
                if (ddObservationType.getSelectedItem() != "All") {
                    if (count == 0) {
                        quary += " observationType='" + ddObservationType.getSelectedItem().toString() + "'";
                    } else {
                        quary += " AND observationType='" + ddObservationType.getSelectedItem().toString() + "'";
                    }
                }
                if (ddKindOfSource.getSelectedItem() != "All") {
                    if (count == 0) {
                        quary += " kindOfSource='" + ddKindOfSource.getSelectedItem().toString() + "'";
                    } else {
                        quary += " AND kindOfSource='" + ddKindOfSource.getSelectedItem().toString() + "'";
                    }
                }
            }
        } else {
            if (ddDepartment.getSelectedItem() != "All") {
                quary += " AND departmentID=" + depArray.get(ddDepartment.getSelectedIndex() - 1)[0];
            }
            if (ddObserver.getSelectedItem() != "All") {
                quary += " AND observerID=" + userList.get(ddObserver.getSelectedIndex() - 1).getUserID();
            }
            if (ddResponsibleParty.getSelectedItem() != "All") {
                quary += " AND responsiblePartyID=" + userList.get(ddResponsibleParty.getSelectedIndex() - 1).getUserID();
            }
            if (ddZap.getSelectedItem() != "All") {
                quary += " AND zapStatus='" + ddZap.getSelectedItem().toString() + "'";
            }
            if (ddAccidentType.getSelectedItem() != "All") {
                quary += " AND accidentType='" + ddAccidentType.getSelectedItem().toString() + "'";
            }
            if (ddObservationType.getSelectedItem() != "All") {
                quary += " AND observationType='" + ddObservationType.getSelectedItem().toString() + "'";
            }
            if (ddKindOfSource.getSelectedItem() != "All") {
                quary += " AND kindOfSource='" + ddKindOfSource.getSelectedItem().toString() + "'";
            }
        }
        //System.out.println(quary);
        Vector<String> columnNames = new Vector<String>();
        columnNames.addElement("Date");
        columnNames.addElement("Observation ID");
        columnNames.addElement("Kind of Source");
        columnNames.addElement("Observation Type");
        columnNames.addElement("Description");
        columnNames.addElement("Accident Type");
        columnNames.addElement("Department");
        columnNames.addElement("Observer");
        columnNames.addElement("Responsible Party");
        columnNames.addElement("Target Date");
        columnNames.addElement("Closed Date");
        columnNames.addElement("ZAP State");
        Vector<Vector> table=dbOps.getAllCases(quary);
        if(table.size()==0){
            JOptionPane.showMessageDialog(this, "There are no observations!");
        }
        tblCases.setModel(new DefaultTableModel(table, columnNames));
    }
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loadTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        resetField();
        loadTable();
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(Cases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cases().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox ddAccidentType;
    private javax.swing.JComboBox ddDepartment;
    private javax.swing.JComboBox ddKindOfSource;
    private javax.swing.JComboBox ddObservationType;
    private javax.swing.JComboBox ddObserver;
    private javax.swing.JComboBox ddResponsibleParty;
    private javax.swing.JComboBox ddZap;
    private com.toedter.calendar.JDateChooser dtFrom;
    private com.toedter.calendar.JDateChooser dtTo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblCases;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icon.png")));}
}
