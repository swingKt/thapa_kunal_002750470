/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Admin;
import Model.Person;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JPanel;

/**
 *
 * @author kunal
 */
public class updatePersonByCommunityPanel extends javax.swing.JPanel {

    private JPanel lowerPanel;
    Person person;
    Admin admin;
    private ArrayList<Person> patientDir;
    /**
     * Creates new form updatePersonByCommunityPanel
     */
    public updatePersonByCommunityPanel(JPanel lowerPanel, Person person, Admin admin) {
        initComponents();
        this.lowerPanel = lowerPanel;
        this.person = person;
        this.admin = admin;
        getPersonDetails();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addPersonPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        idTF = new javax.swing.JTextField();
        nameTF = new javax.swing.JTextField();
        genderTF = new javax.swing.JTextField();
        ageTF = new javax.swing.JTextField();
        communityTF = new javax.swing.JTextField();
        cityTF = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        editDetailsButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        houseTF = new javax.swing.JTextField();
        saveDetailsButton = new javax.swing.JButton();
        nameVal = new javax.swing.JLabel();
        ageVal = new javax.swing.JLabel();
        pulseVal = new javax.swing.JLabel();
        bpVal = new javax.swing.JLabel();
        houseVal = new javax.swing.JLabel();
        comVal = new javax.swing.JLabel();
        cityVal = new javax.swing.JLabel();
        illVal = new javax.swing.JLabel();
        genderVal = new javax.swing.JLabel();
        pastIllVal = new javax.swing.JLabel();

        addPersonPanel.setBackground(new java.awt.Color(204, 255, 255));
        addPersonPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("UPDATE PERSON");
        addPersonPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("ID :");
        addPersonPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 113, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("NAME :");
        addPersonPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 163, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("GENDER :");
        addPersonPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 217, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("AGE :");
        addPersonPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 272, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("COMMUNITY :");
        addPersonPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setText("CITY :");
        addPersonPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, -1, -1));

        idTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTFActionPerformed(evt);
            }
        });
        addPersonPanel.add(idTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 112, 154, -1));

        nameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTFActionPerformed(evt);
            }
        });
        nameTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameTFKeyReleased(evt);
            }
        });
        addPersonPanel.add(nameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 162, 154, -1));

        genderTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                genderTFKeyReleased(evt);
            }
        });
        addPersonPanel.add(genderTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 216, 154, -1));

        ageTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ageTFKeyReleased(evt);
            }
        });
        addPersonPanel.add(ageTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 271, 154, -1));

        communityTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                communityTFKeyReleased(evt);
            }
        });
        addPersonPanel.add(communityTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 150, -1));

        cityTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cityTFKeyReleased(evt);
            }
        });
        addPersonPanel.add(cityTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 150, -1));

        backButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        backButton.setText("<< BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        addPersonPanel.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 28, 107, 41));

        editDetailsButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        editDetailsButton.setText("EDIT DETAILS");
        editDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editDetailsButtonActionPerformed(evt);
            }
        });
        addPersonPanel.add(editDetailsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 450, -1, 41));

        clearButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        clearButton.setText("CLEAR");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        addPersonPanel.add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 450, 114, 41));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel13.setText("HOUSE :");
        addPersonPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        houseTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                houseTFActionPerformed(evt);
            }
        });
        houseTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                houseTFKeyReleased(evt);
            }
        });
        addPersonPanel.add(houseTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 150, -1));

        saveDetailsButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        saveDetailsButton.setText("SAVE DETAILS");
        saveDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveDetailsButtonActionPerformed(evt);
            }
        });
        addPersonPanel.add(saveDetailsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 450, -1, 41));
        addPersonPanel.add(nameVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 140, 20));
        addPersonPanel.add(ageVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 130, 20));
        addPersonPanel.add(pulseVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 150, 10));
        addPersonPanel.add(bpVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 140, 10));
        addPersonPanel.add(houseVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 140, 20));
        addPersonPanel.add(comVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 140, 10));
        addPersonPanel.add(cityVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 150, 20));
        addPersonPanel.add(illVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 120, 20));
        addPersonPanel.add(genderVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 130, 20));
        addPersonPanel.add(pastIllVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 70, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addPersonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addPersonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void idTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTFActionPerformed

    private void nameTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTFKeyReleased
        // TODO add your handling code here:
        String Name ="^[a-zA-Z\\s]{0,30}$";
        Pattern p = Pattern.compile(Name);
        Matcher match= p.matcher(nameTF.getText());
        if(!match.matches()){
            nameVal.setText("Invalid input!");
        }
        else {
            nameVal.setText("");
        }
    }//GEN-LAST:event_nameTFKeyReleased

    private void genderTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_genderTFKeyReleased
        // TODO add your handling code here:
        String Name ="^[a-zA-Z\\s]{0,30}$";
        Pattern p = Pattern.compile(Name);
        Matcher match= p.matcher(genderTF.getText());
        if(!match.matches()){
            genderVal.setText("Invalid input!");
        }
        else {
            genderVal.setText("");
        }
    }//GEN-LAST:event_genderTFKeyReleased

    
    private void communityTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_communityTFKeyReleased
        // TODO add your handling code here:
        String str ="^[a-zA-Z\\s]{0,30}$";
        Pattern p = Pattern.compile(str);
        Matcher match= p.matcher(communityTF.getText());
        if(!match.matches()){
            comVal.setText("Invalid input!");
        }
        else {
            comVal.setText("");
        }
    }//GEN-LAST:event_communityTFKeyReleased

    private void cityTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cityTFKeyReleased
        // TODO add your handling code here:
        String str ="^[a-zA-Z\\s]{0,30}$";
        Pattern p = Pattern.compile(str);
        Matcher match= p.matcher(cityTF.getText());
        if(!match.matches()){
            cityVal.setText("Invalid input!");
        }
        else {
            cityVal.setText("");
        }
    }//GEN-LAST:event_cityTFKeyReleased

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        communityMainPanel communityMainPanel = new communityMainPanel(lowerPanel, admin);
        lowerPanel.add("communityMainPanel",communityMainPanel);
        CardLayout layout = (CardLayout)lowerPanel.getLayout();
        layout.next(lowerPanel);
    }//GEN-LAST:event_backButtonActionPerformed

    private void editDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editDetailsButtonActionPerformed
        // TODO add your handling code here:
        saveDetailsButton.setEnabled(true);
        editDetailsButton.setEnabled(false);

        idTF.setEnabled(false);
        nameTF.setEnabled(true);
        genderTF.setEnabled(true);
        ageTF.setEnabled(true);
//        illnessTF.setEnabled(true);
//        pastIllnessTF.setEnabled(true);
//        hgTF.setEnabled(true);
//        bpTF.setEnabled(true);
        houseTF.setEnabled(true);
        cityTF.setEnabled(true);
        communityTF.setEnabled(true);

//        if (patientStatusTF.getText().equals("YES")) {
//            isPatientCB.setSelected(true);
//        } else {
//            isPatientCB.setSelected(false);
//        }
//
//        patientStatusTF.setVisible(false);
//        isPatientCB.setEnabled(true);
    }//GEN-LAST:event_editDetailsButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        nameTF.setText("");
        genderTF.setText("");
        ageTF.setText("");
//        illnessTF.setText("");
//        pastIllnessTF.setText("");
//        hgTF.setText("");
//        bpTF.setText("");
        houseTF.setText("");
        communityTF.setText("");
        cityTF.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void houseTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_houseTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_houseTFActionPerformed

    private void houseTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_houseTFKeyReleased
        // TODO add your handling code here:
        String str ="^[a-zA-Z\\s]{0,30}$";
        Pattern p = Pattern.compile(str);
        Matcher match= p.matcher(houseTF.getText());
        if(!match.matches()){
            houseVal.setText("Invalid input!");
        }
        else {
            houseVal.setText("");
        }
    }//GEN-LAST:event_houseTFKeyReleased

    private void saveDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveDetailsButtonActionPerformed
        // TODO add your handling code here:
        saveDetailsButton.setEnabled(false);
        editDetailsButton.setEnabled(true);

//        isPatientCB.setEnabled(false);

        nameTF.setEnabled(false);
        genderTF.setEnabled(false);
        ageTF.setEnabled(false);
//        illnessTF.setEnabled(false);
//        pastIllnessTF.setEnabled(false);
//        hgTF.setEnabled(false);
//        bpTF.setEnabled(false);
        houseTF.setEnabled(false);
        communityTF.setEnabled(false);
        cityTF.setEnabled(false);

//        if (isPatientCB.isSelected()) {
//            patientStatusTF.setText("YES");
//        } else {
//            patientStatusTF.setText("NO");
//        }
//
//        patientStatusTF.setVisible(true);

//        person.setIsPatient(isPatientCB.isSelected());
        person.setName(nameTF.getText());
        person.setGender(genderTF.getText());
        person.setAge(Integer.parseInt(ageTF.getText()));
//        person.setIllness(illnessTF.getText());
//        person.setPastIllness(pastIllnessTF.getText());
//        person.setHB(Double.parseDouble(hgTF.getText()));
//        person.setBloodPressure(Double.parseDouble(bpTF.getText()));
        person.getResidence().setCity(cityTF.getText());
        person.getResidence().setCommunity(communityTF.getText());
        person.getResidence().setHouse(houseTF.getText());

    }//GEN-LAST:event_saveDetailsButtonActionPerformed

    private void nameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTFActionPerformed

    private void ageTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageTFKeyReleased
        // TODO add your handling code here:
        String age ="^[0-9]{0,10}$";
        Pattern p = Pattern.compile(age);
        Matcher match= p.matcher(ageTF.getText());
        if(!match.matches()){
            ageVal.setText("Invalid! Only numeric input");
        }
        else {
            ageVal.setText("");
    }//GEN-LAST:event_ageTFKeyReleased

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addPersonPanel;
    private javax.swing.JTextField ageTF;
    private javax.swing.JLabel ageVal;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel bpVal;
    private javax.swing.JTextField cityTF;
    private javax.swing.JLabel cityVal;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel comVal;
    private javax.swing.JTextField communityTF;
    private javax.swing.JButton editDetailsButton;
    private javax.swing.JTextField genderTF;
    private javax.swing.JLabel genderVal;
    private javax.swing.JTextField houseTF;
    private javax.swing.JLabel houseVal;
    private javax.swing.JTextField idTF;
    private javax.swing.JLabel illVal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameTF;
    private javax.swing.JLabel nameVal;
    private javax.swing.JLabel pastIllVal;
    private javax.swing.JLabel pulseVal;
    private javax.swing.JButton saveDetailsButton;
    // End of variables declaration//GEN-END:variables

private void getPersonDetails() {
//        if(person.isIsPatient() == true){
//            patientStatusTF.setText("YES");
//        }
//        else{
//            patientStatusTF.setText("NO");
//        }
//        isPatientCB.setEnabled(false);
        idTF.setText(String.valueOf(person.getId()));
        idTF.setEnabled(false);
        nameTF.setText(person.getName());
        nameTF.setEnabled(false);
        genderTF.setText(person.getGender());
        genderTF.setEnabled(false);
        ageTF.setText(String.valueOf(person.getAge()));
        ageTF.setEnabled(false);
//        illnessTF.setText(person.getIllness());
//        illnessTF.setEnabled(false);
//        pastIllnessTF.setText(person.getPastIllness());
//        pastIllnessTF.setEnabled(false);
//        hgTF.setText(String.valueOf(person.getHB()));
//        hgTF.setEnabled(false);
//        bpTF.setText(String.valueOf(person.getBloodPressure()));
//        bpTF.setEnabled(false);
        cityTF.setText(person.getResidence().getCity());
        cityTF.setEnabled(false);
        communityTF.setText(person.getResidence().getCommunity());
        communityTF.setEnabled(false);
        houseTF.setText(person.getResidence().getHouse());
        houseTF.setEnabled(false);

        saveDetailsButton.setEnabled(false);
    }
}
