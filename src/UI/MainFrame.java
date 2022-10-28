/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Model.Admin;
import Model.Person;
import Model.Resident;
import java.awt.CardLayout;
import java.util.ArrayList;

/**
 *
 * @author kunal
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
  Admin admin;
    
    public MainFrame() {
        initComponents();
        admin = new Admin();
        Resident residence = new Resident("1225","Mission Main","Boston");
        Person person1 = new Person("Kirti",25,"Female", "NA","NA", residence, false, 125.0, 12.0);
        Person person2;
        person2 = new Person("Ritika",21,"Female", "NA","NA", new Resident("0125", "Mission Main", "Brighton"), true, 180.00d, 66.00d, new ArrayList<>());
        Person person3;
        person3 = new Person("Sree",23,"Male", "Cold","knee surgery", new Resident("0112", "City View", "Roxbury"), false, 192.0, 50.00d, new ArrayList<>());
        Person person4;
        person4 = new Person("Cristene",27,"Female", "NA","diabetes", new Resident("1797", "Boylston", "Boston"), false, 160.00d, 70.00d, new ArrayList<>());
        Person person5;
        person5 = new Person("Neil",26,"Male", "Fever","diabetes", new Resident("1223", "Longwood", "Roxbury"), true, 170.00d, 62.00d, new ArrayList<>());
        Person person6;
        person6 = new Person("Anu",26,"Female", "Acne","allergy", new Resident("1112", "Longwood", "Roxbury"), true, 130.00d, 72.00d, new ArrayList<>());

        ArrayList<Person> personDirectory = new ArrayList<>();
        personDirectory.add(person1);
        personDirectory.add(person2);
        personDirectory.add(person3);
        personDirectory.add(person4);
        personDirectory.add(person5);
        personDirectory.add(person6);
        admin.setPersonDirectory(personDirectory);
        ArrayList<Person> patientDirectory = new ArrayList<>();
        admin.setPatientDirectory(patientDirectory);
        setSize(830,600);

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
        jSplitPane1 = new javax.swing.JSplitPane();
        upperPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lowerPanel = new javax.swing.JPanel();
        homeLowerPanel = new javax.swing.JPanel();
        adminButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        commAdminBtn = new javax.swing.JButton();
        adminButton2 = new javax.swing.JButton();
        adminButton3 = new javax.swing.JButton();
        adminButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        upperPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 48)); // NOI18N
        jLabel2.setText("WELCOME TO BOSTON HOSPITAL!");

        javax.swing.GroupLayout upperPanelLayout = new javax.swing.GroupLayout(upperPanel);
        upperPanel.setLayout(upperPanelLayout);
        upperPanelLayout.setHorizontalGroup(
            upperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upperPanelLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel2)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        upperPanelLayout.setVerticalGroup(
            upperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, upperPanelLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18))
        );

        jSplitPane1.setTopComponent(upperPanel);

        lowerPanel.setBackground(new java.awt.Color(204, 204, 255));
        lowerPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lowerPanel.setLayout(new java.awt.CardLayout());

        homeLowerPanel.setBackground(new java.awt.Color(204, 255, 255));

        adminButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        adminButton.setText("ADMIN");
        adminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButtonActionPerformed(evt);
            }
        });

        homeButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        homeButton.setText("<< BACK");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        commAdminBtn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        commAdminBtn.setText("Community Admin");
        commAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commAdminBtnActionPerformed(evt);
            }
        });

        adminButton2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        adminButton2.setText("Doctor");
        adminButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButton2ActionPerformed(evt);
            }
        });

        adminButton3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        adminButton3.setText("Patient");
        adminButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButton3ActionPerformed(evt);
            }
        });

        adminButton4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        adminButton4.setText("Hospital Admin");
        adminButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout homeLowerPanelLayout = new javax.swing.GroupLayout(homeLowerPanel);
        homeLowerPanel.setLayout(homeLowerPanelLayout);
        homeLowerPanelLayout.setHorizontalGroup(
            homeLowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLowerPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLowerPanelLayout.createSequentialGroup()
                .addContainerGap(444, Short.MAX_VALUE)
                .addGroup(homeLowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(commAdminBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(440, 440, 440))
        );
        homeLowerPanelLayout.setVerticalGroup(
            homeLowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLowerPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(commAdminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        lowerPanel.add(homeLowerPanel, "card2");

        jSplitPane1.setRightComponent(lowerPanel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButtonActionPerformed
        // TODO add your handling code here:
        AdminWindow adminWindow = new AdminWindow(lowerPanel, admin);
        lowerPanel.add("AdminWindow", adminWindow);
        CardLayout layout = (CardLayout)lowerPanel.getLayout();
        layout.next(lowerPanel);
    }//GEN-LAST:event_adminButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        Home homePanel = new Home(lowerPanel);
        lowerPanel.add("HomePanel",homePanel);
        CardLayout layout = (CardLayout)lowerPanel.getLayout();
        layout.next(lowerPanel);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void commAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commAdminBtnActionPerformed
        // TODO add your handling code here:
        communityLoginPanel commWindow = new communityLoginPanel(lowerPanel, admin);
        lowerPanel.add("AdminWindow", commWindow);
        CardLayout layout = (CardLayout)lowerPanel.getLayout();
        layout.next(lowerPanel);
    }//GEN-LAST:event_commAdminBtnActionPerformed

    private void adminButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminButton2ActionPerformed

    private void adminButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminButton3ActionPerformed

    private void adminButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminButton;
    private javax.swing.JButton adminButton2;
    private javax.swing.JButton adminButton3;
    private javax.swing.JButton adminButton4;
    private javax.swing.JButton commAdminBtn;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel homeLowerPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel lowerPanel;
    private javax.swing.JPanel upperPanel;
    // End of variables declaration//GEN-END:variables
}
