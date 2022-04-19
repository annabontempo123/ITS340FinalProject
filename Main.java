/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalproject;

/* imports */
import java.sql.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
/**
 *
 * @author annab
 */
public class Main extends javax.swing.JFrame {
    
    int id = 0;
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public Main() {
        initComponents();
        
        //start defaultlistmodel for list box data
        DefaultListModel patients = new DefaultListModel();
        try {
            
            //grab all patients from database
            con = connections.getConnection();
            pst = con.prepareStatement("SELECT * from patienttable;");
            rs = pst.executeQuery();
            
            while(rs.next()) {
                int pID = rs.getInt("PatientID");
                String fn = rs.getString("PtFirstName");
                String ln = rs.getString("PtLastName");
                String fullName = pID + "  ---  " + fn + " " + ln;
                
                patients.addElement(fullName);
            }
            patientList.setModel(patients);
            
        }
        catch(Exception e) {
            
            System.out.println("Could not connect successfully! :<");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientList = new javax.swing.JList<>();
        goButton = new javax.swing.JButton();
        newPatient = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Welcome to the Patient Selection Form");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Please choose a patient to view:");

        patientList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                patientListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(patientList);

        goButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        goButton.setText("Go");
        goButton.setEnabled(false);
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoButtonActionPerformed(evt);
            }
        });

        newPatient.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        newPatient.setText("New Patient");
        newPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel2)))
                .addContainerGap(151, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(goButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(newPatient)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1)
                .addGap(97, 97, 97)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(goButton)
                .addGap(18, 18, 18)
                .addComponent(newPatient)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoButtonActionPerformed
        // TODO add your handling code here:
        
        //Get value of selected patient by grabbing selected value, getting first value, then parsing it and setting it to id variable
        String value = patientList.getSelectedValue();
        char first = value.charAt(0);
        int newID = Integer.parseInt(String.valueOf(first));
        id = newID;
        
        //create new form called frame and send ID to new frame ID text field
        PatientDemographicForm frame = new PatientDemographicForm();
        String change = Integer.toString(id);
        PatientDemographicForm.idField.setText(change);
        
        //declare variables for sending to patientdemographicform
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
        
        
        //get Patient data based off of patient ID collected from List Box
        try {
            con = connections.getConnection();
            pst = con.prepareStatement("Select * From patienttable where PatientID = ?");
            pst.setObject(1, id);
            rs = pst.executeQuery();
            
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
            
        }
        
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_GoButtonActionPerformed

    private void newPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPatientActionPerformed
        // TODO add your handling code here:
        
        //create new frame1 for patientdemographicform
        PatientDemographicForm frame1 = new PatientDemographicForm();
        this.setVisible(false);
        frame1.setVisible(true);
        
        //send over some default values to make it look nicer
        PatientDemographicForm.isNew = true;
        PatientDemographicForm.phone.setText("###-###-####");
        PatientDemographicForm.emergencyPhone.setText("###-###-####");
        
        //enable or disable buttons so no errors can occur when creating new patient
        PatientDemographicForm.saveButton.setEnabled(true);
        PatientDemographicForm.deletedButton.setEnabled(false);
        PatientDemographicForm.newButton.setEnabled(false);
        PatientDemographicForm.editButton.setEnabled(false);
        PatientDemographicForm.generalMedicalButton.setEnabled(false);
        PatientDemographicForm.allergyButton.setEnabled(false);
        
        //set fields to editable, since by default they are not
        PatientDemographicForm.lName.setEnabled(true);
        PatientDemographicForm.fName.setEnabled(true);
        PatientDemographicForm.middle.setEnabled(true);
        PatientDemographicForm.plName.setEnabled(true);
        PatientDemographicForm.address1.setEnabled(true);
        PatientDemographicForm.address2.setEnabled(true);
        PatientDemographicForm.email.setEnabled(true);
        PatientDemographicForm.dob.setEnabled(true);
        PatientDemographicForm.ssn.setEnabled(true);
        PatientDemographicForm.hcp.setEnabled(true);
        PatientDemographicForm.ethnic.setEnabled(true);
        PatientDemographicForm.subscriber.setEnabled(true);
        PatientDemographicForm.kin.setEnabled(true);
        PatientDemographicForm.kinRelationship.setEnabled(true);
        PatientDemographicForm.phone.setEnabled(true);
        PatientDemographicForm.emergencyPhone.setEnabled(true);
        PatientDemographicForm.comments.setEnabled(true);
        PatientDemographicForm.gender.setEnabled(true);
        PatientDemographicForm.city.setEnabled(true);
        PatientDemographicForm.state.setEnabled(true);
        PatientDemographicForm.zip.setEnabled(true);
        PatientDemographicForm.country.setEnabled(true);
        PatientDemographicForm.citizen.setEnabled(true);
        PatientDemographicForm.marital.setEnabled(true);
        PatientDemographicForm.active.setEnabled(true);
    }//GEN-LAST:event_newPatientActionPerformed

    private void patientListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_patientListValueChanged
        // TODO add your handling code here:
        
        //enable go button once a selection has been made
        goButton.setEnabled(true);
    }//GEN-LAST:event_patientListValueChanged

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newPatient;
    private javax.swing.JList<String> patientList;
    // End of variables declaration//GEN-END:variables
}
