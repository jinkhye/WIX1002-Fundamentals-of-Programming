package fopnetbeans;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author shawn
 */
public class PromptDate extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public static String startdate = "06/12";
    public static String enddate = "12/24";
    public static String test;
    
    DefaultTableModel model;
    
    public PromptDate() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public boolean validateMenu() {
        startdate = StartDate.getText();
        enddate = EndDate.getText();
        
        if (startdate.equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter start date");
            return false;
        }
        if (enddate.equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter end date");
            return false;
        }
        return true;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        EndDate = new app.bolivia.swing.JCTextField();
        StartDate = new app.bolivia.swing.JCTextField();
        Enter = new rojerusan.RSMaterialButtonCircle();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(300, 400));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EndDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndDateActionPerformed(evt);
            }
        });
        jPanel4.add(EndDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        StartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartDateActionPerformed(evt);
            }
        });
        jPanel4.add(StartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        Enter.setText("Enter");
        Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterActionPerformed(evt);
            }
        });
        jPanel4.add(Enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 220, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(12, 12, 12));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("End Date (MM/DD)");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 200, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(12, 12, 12));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Start Date (MM/DD)");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 200, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EndDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EndDateActionPerformed

    private void StartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StartDateActionPerformed

    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterActionPerformed
        if (validateMenu()) {
            Errors.Errors(Main.line);
            KillRequest.KillRequest(Main.line);
            JobsByPartitions.JobsByPartitions(Main.line);
            findInitPrio.findInitPrio(Main.line);
            MonthlyReport.MonthlyReport(Main.line);
            SuccessRate.SuccessRate(Main.line);
            try {
                FileProperties.FileProperties(Main.line);
            } catch (ParseException ex) {
                Logger.getLogger(PromptDate.class.getName()).log(Level.SEVERE, null, ex);
            }
            HomePage dashboard = new HomePage();
            dashboard.setVisible(true);
            this.dispose();
            try {
                AvgExecTime.AvgExecTime(Main.line);
            } catch (ParseException ex) {
                Logger.getLogger(PromptDate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_EnterActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private app.bolivia.swing.JCTextField EndDate;
    private rojerusan.RSMaterialButtonCircle Enter;
    private app.bolivia.swing.JCTextField StartDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
