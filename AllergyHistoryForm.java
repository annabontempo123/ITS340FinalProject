/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalproject;

import javax.swing.DefaultListModel;
import java.sql.*;
/**
 *  Final Project - Program written and implemented by Anna Bontempo and Patrick Townes
 */
public class AllergyHistoryForm extends javax.swing.JFrame {

    String console = "";
    int id;
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    /**
     * Creates new form AllergyHistoryForm
     */
    public AllergyHistoryForm() {
        
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        patientID = new javax.swing.JTextField();
        allergyID = new javax.swing.JTextField();
        allergen = new javax.swing.JTextField();
        startDate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        allergyDescription = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        editAllergy = new javax.swing.JButton();
        saveAllergy = new javax.swing.JButton();
        deleteAllergy = new javax.swing.JButton();
        closeAllergy = new javax.swing.JButton();
        endDate = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        allergyList = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        present = new javax.swing.JCheckBox();
        loadAllergies = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        allergyEvents = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Allergy History Form");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Patient ID:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Allergy Description:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Allergy ID:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Allergy End Date:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Allergen:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Allergy Start Date:");

        patientID.setEditable(false);

        allergyID.setEditable(false);
        allergyID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allergyIDActionPerformed(evt);
            }
        });

        allergen.setEnabled(false);

        startDate.setText("MM/DD/YYYY");
        startDate.setEnabled(false);

        allergyDescription.setColumns(20);
        allergyDescription.setRows(5);
        allergyDescription.setEnabled(false);
        jScrollPane1.setViewportView(allergyDescription);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Start Interview");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InterviewActionPerformed(evt);
            }
        });

        editAllergy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editAllergy.setText("Edit");
        editAllergy.setEnabled(false);
        editAllergy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        saveAllergy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saveAllergy.setText("Save");
        saveAllergy.setEnabled(false);
        saveAllergy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        deleteAllergy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteAllergy.setText("Delete");
        deleteAllergy.setEnabled(false);
        deleteAllergy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        closeAllergy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        closeAllergy.setText("Close");
        closeAllergy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });

        endDate.setText("MM/DD/YYYY");
        endDate.setEnabled(false);

        allergyList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                allergyListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(allergyList);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Is Still Present?");

        present.setEnabled(false);

        loadAllergies.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loadAllergies.setText("Load Allergies");
        loadAllergies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadAllergiesActionPerformed(evt);
            }
        });

        allergyEvents.setEditable(false);
        allergyEvents.setColumns(20);
        allergyEvents.setRows(5);
        jScrollPane3.setViewportView(allergyEvents);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(present)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(loadAllergies)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(patientID, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(allergen)
                                                .addComponent(allergyID)
                                                .addComponent(startDate, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                                .addComponent(endDate)))))
                                .addGap(26, 26, 26)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteAllergy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saveAllergy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editAllergy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(closeAllergy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(645, Short.MAX_VALUE)
                    .addComponent(jButton2)
                    .addGap(16, 16, 16)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(150, 150, 150)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addGap(26, 26, 26))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(patientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editAllergy))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(allergyID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(allergen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(saveAllergy)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteAllergy)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(closeAllergy)
                        .addGap(33, 33, 33)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(loadAllergies))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(present))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(jButton2)
                    .addContainerGap(406, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* Edit Button  */
    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        // TODO add your handling code here:
        saveAllergy.setEnabled(true);
        deleteAllergy.setEnabled(true);
        allergen.setEnabled(true);
        startDate.setEnabled(true);
        endDate.setEnabled(true);
        allergyDescription.setEnabled(true);
        present.setEnabled(true);
        
    }//GEN-LAST:event_EditButtonActionPerformed
    /* Save Button  */
    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        // TODO add your handling code here:
        int allID = Integer.parseInt(allergyID.getText());
        String all = allergen.getText();
        String start = startDate.getText();
        String end = endDate.getText();
        String desc = allergyDescription.getText();
        int dele = 0;
        
        if (present.isSelected()) {
            dele = 0;
        }
        else {
            dele = 1;
        }
        
        try {
            con = connections.getConnection();
                
            //set up prepared update query
            pst = con.prepareStatement("UPDATE allergyhistorytable SET Allergen=?, AllergyStartDate=?, "
                + "AllergyEndDate=?, AllergyDescription=?, deleted=? WHERE AllergyID=?");
                
            //set values for update query based on text box data inputted
            pst.setString(1, all);
            pst.setString(2, start);
            pst.setString(3, end);
            pst.setString(4, desc);
            pst.setInt(5, dele);
            pst.setObject(6, allID);
            //execute query
            pst.execute();
                
            //terminal at bottom
            java.util.Date date = new java.util.Date();
            System.out.println("Saved Allergy successfully! :D");
            console += date + ": Saved Allergy successfully! :D\n";
            allergyEvents.setText(console);
            
        } catch (Exception ex) {
            //terminal at bottom
            java.util.Date date = new java.util.Date();
            console += date + ": Failed to save Allergy :<\n";
            System.out.println("Failed to save Allergy :<");
            allergyEvents.setText(console);
        }
        
        saveAllergy.setEnabled(false);
        deleteAllergy.setEnabled(false);
        allergen.setEnabled(false);
        startDate.setEnabled(false);
        endDate.setEnabled(false);
        allergyDescription.setEnabled(false);
        present.setEnabled(false);
        
        
    }//GEN-LAST:event_SaveButtonActionPerformed
    /* Delete button  */
    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        //get patient ID
        int aID = Integer.parseInt(allergyID.getText());
        try {
            //connect and prepare delete statement for database
            con = connections.getConnection();
            pst = con.prepareStatement("DELETE FROM allergyhistorytable WHERE AllergyID=?");
            //set ID equal to ?
            pst.setObject(1, aID);
            //execute the query
            pst.execute();
            
            //terminal at bottom
            System.out.println("Deleted Allergy successfully :D");
            java.util.Date date = new java.util.Date();
            console += date + ": Deleted Allergy successfully :D\n\t---You can now refresh the list.";
            allergyEvents.setText(console);
            
        } catch(Exception ex) {
            //terminal at bottom
            System.out.println("Failed to delete allergy :(");
            System.err.println(ex.getMessage());
            java.util.Date date = new java.util.Date();
            console += date + ": " + aID + " Failed to delete allergy :(\n";
            allergyEvents.setText(console);
            
        }
        saveAllergy.setEnabled(false);
        deleteAllergy.setEnabled(false);
        allergen.setEnabled(false);
        startDate.setEnabled(false);
        endDate.setEnabled(false);
        allergyDescription.setEnabled(false);
        present.setEnabled(false);
    }//GEN-LAST:event_DeleteButtonActionPerformed
    /* Close button  */
    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        // TODO add your handling code here:
        int patID = Integer.parseInt(patientID.getText());
        PatientDemographicForm frame3 = new PatientDemographicForm();
        String change = Integer.toString(patID);
        PatientDemographicForm.idField.setText(change);
        
        try {
            con = connections.getConnection();
            pst = con.prepareStatement("Select * From patienttable where PatientID = ?");
            pst.setObject(1, patID);
            rs = pst.executeQuery();
            
            String lName = "";
            String plName = "";
            String fName = "";
            String address1 = "";
            String address2 = "";
            String city = "";
            String state = "";
            String zip = "";
            String country = "";
            String citizen = "";
            String phone = "";
            String emergencyPhone = "";
            String email = "";
            String ssn = "";
            String dob = "";
            String gender = "";
            String ethnic = "";
            String marital = "";
            String hcp = "";
            int active = 0;
            String comment = "";
            String sub = "";
            String nextKin = "";
            String mi = "";
            String nextKinRelation = "";

            while(rs.next()) {
                
                //set strings to equal values drawn from database
                lName = rs.getString("PtLastName");
                plName = rs.getString("PtPreviousLastName");
                fName = rs.getString("PtFirstName");
                address1 = rs.getString("HomeAddress1");
                address2 = rs.getString("HomeAddress2");
                city = rs.getString("HomeCity");
                state = rs.getString("HomeState");
                zip = rs.getString("HomeZip");
                country = rs.getString("Country");
                citizen = rs.getString("Citizenship");
                phone = rs.getString("PtHomePhone");
                emergencyPhone = rs.getString("EmergencyPhoneNumber");
                email = rs.getString("EmailAddress");
                ssn = rs.getString("PtSSN");
                dob = rs.getString("DOB");
                gender = rs.getString("Gender");
                ethnic = rs.getString("EthnicAssociation");
                marital = rs.getString("MaritalStatus");
                hcp = rs.getString("CurrentPrimaryHCPId");
                active = rs.getInt("Active");
                comment = rs.getString("Comments");
                sub = rs.getString("SubscriberRelationship");
                nextKin = rs.getString("NextOfKin");
                mi = rs.getString("PtMiddleInitial");
                nextKinRelation = rs.getString("NextOfKinRelationshipToPatient");
                
                
            }
            
            //send over values from strings to patientdemographic form text boxes
            PatientDemographicForm.lName.setText(lName);
            PatientDemographicForm.plName.setText(plName);
            PatientDemographicForm.fName.setText(fName);
            PatientDemographicForm.address1.setText(address1);
            PatientDemographicForm.address2.setText(address2);
            PatientDemographicForm.city.setText(city);
            PatientDemographicForm.state.setText(state);
            PatientDemographicForm.zip.setText(zip);
            PatientDemographicForm.country.setText(country);
            PatientDemographicForm.citizen.setText(citizen);
            PatientDemographicForm.phone.setText(phone);
            PatientDemographicForm.emergencyPhone.setText(emergencyPhone);
            PatientDemographicForm.email.setText(email);
            PatientDemographicForm.ssn.setText(ssn);
            PatientDemographicForm.dob.setText(dob);
            PatientDemographicForm.gender.setText(gender);
            PatientDemographicForm.ethnic.setText(ethnic);
            PatientDemographicForm.marital.setText(marital);
            PatientDemographicForm.hcp.setText(hcp);
            PatientDemographicForm.middle.setText(mi);
            PatientDemographicForm.comments.setText(comment);
            PatientDemographicForm.subscriber.setText(sub);
            PatientDemographicForm.kin.setText(nextKin);
            PatientDemographicForm.kinRelationship.setText(nextKinRelation);
            
            //check what active equals and set check box based on 0 - 1 values
            if(active == 1) {
                PatientDemographicForm.active.setSelected(true);
            }
            else if (active == 0)
            {
                PatientDemographicForm.active.setSelected(false);
            }
        }
        catch(Exception E)
        {
            //if can't connect to database or something mistyped
            System.out.println("Did not succeed. :<");
            java.util.Date date = new java.util.Date();
            console += date + ": Failed to close :(\n";
            allergyEvents.setText(console);
        }
        
        frame3.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_CloseButtonActionPerformed
    /* We do not know what this button does   */
    private void allergyIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allergyIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_allergyIDActionPerformed
    /* Begin Interview Action Button  */
    private void InterviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InterviewActionPerformed

    }//GEN-LAST:event_InterviewActionPerformed

    private void allergyListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_allergyListValueChanged
        String value = allergyList.getSelectedValue();
        char first = value.charAt(0);
        int newAllergyID = Integer.parseInt(String.valueOf(first));
        
        String alID = Integer.toString(newAllergyID);
        allergyID.setText(alID);
        editAllergy.setEnabled(true);
        
        
        int aID;
        String all;
        String allStartDate;
        String allEndDate;
        String allDesc;
        int del;
        
        try {
            


            
            con = connections.getConnection();
            pst = con.prepareStatement("SELECT * from allergyhistorytable WHERE AllergyID=?;");
            pst.setObject(1, Integer.parseInt(allergyID.getText()));
            rs = pst.executeQuery();
            
            while(rs.next()) {
                
                all = rs.getString("Allergen");
                allStartDate = rs.getString("AllergyStartDate");
                allEndDate = rs.getString("AllergyEndDate");
                allDesc = rs.getString("AllergyDescription");
                del = rs.getInt("deleted");
                
                allergen.setText(all);
                startDate.setText(allStartDate);
                endDate.setText(allEndDate);
                allergyDescription.setText(allDesc);
                if(del == 0) {
                    present.setSelected(true);
                }
                else if (del == 1)
                {
                    present.setSelected(false);
                }
                
            }
            
            
            
            
        }
        catch(Exception e) {
            
            System.out.println("Could not connect successfully! :<");
            java.util.Date date = new java.util.Date();
            console += date + ": Failed to connect :(\n";
            allergyEvents.setText(console);
        }
    }//GEN-LAST:event_allergyListValueChanged

    private void loadAllergiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadAllergiesActionPerformed
        // TODO add your handling code here:
        DefaultListModel allergies = new DefaultListModel();
        try {
            
            //grab all patients from database
            con = connections.getConnection();
            pst = con.prepareStatement("SELECT * from allergyhistorytable WHERE PatientID=?;");
            pst.setObject(1, Integer.parseInt(patientID.getText()));
            rs = pst.executeQuery();
            
            while(rs.next()) {
                int aID = rs.getInt("AllergyID");
                String allergy = rs.getString("Allergen");
                String fullString = aID + "  ---  " + allergy;
                
                allergies.addElement(fullString);
            }
            allergyList.setModel(allergies);
            
            java.util.Date date = new java.util.Date();
            console += date + ": Allergy List Loaded Successfully! :D\n";
            allergyEvents.setText(console);
        }
        catch(Exception e) {
            
            System.out.println("Could not connect successfully! :<");
            java.util.Date date = new java.util.Date();
            console += date + ": Failed to connect :(\n";
            allergyEvents.setText(console);
        }
        System.out.println(patientID.getText());
    }//GEN-LAST:event_loadAllergiesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Implement Runnable to create gui */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllergyHistoryForm().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField allergen;
    public static javax.swing.JTextArea allergyDescription;
    private javax.swing.JTextArea allergyEvents;
    public static javax.swing.JTextField allergyID;
    public static javax.swing.JList<String> allergyList;
    private javax.swing.JButton closeAllergy;
    private javax.swing.JButton deleteAllergy;
    private javax.swing.JButton editAllergy;
    public static javax.swing.JTextField endDate;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton loadAllergies;
    public static javax.swing.JTextField patientID;
    public static javax.swing.JCheckBox present;
    private javax.swing.JButton saveAllergy;
    public static javax.swing.JTextField startDate;
    // End of variables declaration//GEN-END:variables
}
