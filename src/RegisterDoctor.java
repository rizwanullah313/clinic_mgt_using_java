/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muaaz
 */
public class RegisterDoctor extends javax.swing.JFrame {

    /**
     * Creates new form RegisterDoctor
     */
    public RegisterDoctor() {
        initComponents();
        setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DNameTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        DPassTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AgeTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        DMobileTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        DAddressTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        DFieldTxt = new javax.swing.JComboBox<>();
        RegisterButton = new javax.swing.JButton();
        FemaleChk = new javax.swing.JRadioButton();
        MaleChk = new javax.swing.JRadioButton();
        BackGround = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Doctor Registration Form");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 20, 280, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Doctor Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 80, 100, 30);

        DNameTxt.setBackground(new java.awt.Color(102, 102, 102));
        DNameTxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DNameTxt.setForeground(new java.awt.Color(255, 255, 255));
        DNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNameTxtActionPerformed(evt);
            }
        });
        jPanel1.add(DNameTxt);
        DNameTxt.setBounds(140, 80, 170, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Set Password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 120, 100, 30);

        DPassTxt.setBackground(new java.awt.Color(102, 102, 102));
        DPassTxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DPassTxt.setForeground(new java.awt.Color(255, 255, 255));
        DPassTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DPassTxtActionPerformed(evt);
            }
        });
        jPanel1.add(DPassTxt);
        DPassTxt.setBounds(140, 120, 170, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Gender");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 160, 100, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Age");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 200, 100, 30);

        AgeTxt.setBackground(new java.awt.Color(102, 102, 102));
        AgeTxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        AgeTxt.setForeground(new java.awt.Color(255, 255, 255));
        AgeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeTxtActionPerformed(evt);
            }
        });
        jPanel1.add(AgeTxt);
        AgeTxt.setBounds(140, 200, 170, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Mobile No");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 240, 100, 30);

        DMobileTxt.setBackground(new java.awt.Color(102, 102, 102));
        DMobileTxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DMobileTxt.setForeground(new java.awt.Color(255, 255, 255));
        DMobileTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DMobileTxtActionPerformed(evt);
            }
        });
        jPanel1.add(DMobileTxt);
        DMobileTxt.setBounds(140, 240, 170, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Address");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 280, 100, 30);

        DAddressTxt.setBackground(new java.awt.Color(102, 102, 102));
        DAddressTxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DAddressTxt.setForeground(new java.awt.Color(255, 255, 255));
        DAddressTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DAddressTxtActionPerformed(evt);
            }
        });
        jPanel1.add(DAddressTxt);
        DAddressTxt.setBounds(140, 280, 170, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Hiring As");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 320, 100, 30);

        DFieldTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Allergist            (Allergy)", "Cardiologist\t    (Heart)", "General Physician (G.Disease)", "Hematologist\t       (Blood)", "Neurologist\t       (Brain)", "Ophthalmologist   (Eye)", "Urologist\t       (Kidney)" }));
        jPanel1.add(DFieldTxt);
        DFieldTxt.setBounds(140, 320, 170, 30);

        RegisterButton.setText("Register");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });
        jPanel1.add(RegisterButton);
        RegisterButton.setBounds(50, 360, 110, 40);

        FemaleChk.setText("Female");
        FemaleChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleChkActionPerformed(evt);
            }
        });
        jPanel1.add(FemaleChk);
        FemaleChk.setBounds(220, 160, 90, 30);

        MaleChk.setText("Male");
        MaleChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleChkActionPerformed(evt);
            }
        });
        jPanel1.add(MaleChk);
        MaleChk.setBounds(140, 160, 60, 30);

        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DoctorFormBG.jpg"))); // NOI18N
        jPanel1.add(BackGround);
        BackGround.setBounds(0, 0, 626, 417);

        jButton1.setText("jButton1");
        jPanel1.add(jButton1);
        jButton1.setBounds(190, 363, 73, 30);

        jButton2.setText("jButton2");
        jPanel1.add(jButton2);
        jButton2.setBounds(200, 363, 73, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DNameTxtActionPerformed

    private void DPassTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DPassTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DPassTxtActionPerformed

    private void AgeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeTxtActionPerformed

    private void DMobileTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DMobileTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DMobileTxtActionPerformed

    private void DAddressTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DAddressTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DAddressTxtActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        // TODO add your handling code here:
        String Gender;
        String name = DNameTxt.getText();
        String Pass = DPassTxt.getText();
        if(MaleChk.isSelected()){
            Gender = MaleChk.getText();
        }
        else{
            Gender = FemaleChk.getText();
        }
        int age = Integer.parseInt(AgeTxt.getText());
        String Mobile = DMobileTxt.getText();
        String address = DAddressTxt.getText();
        String field = String.valueOf(DFieldTxt.getSelectedItem());
        
        Doctor doctor=new Doctor( name,Pass, Gender,age, Mobile, address, field);
        doctor.AddDoctor();
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void FemaleChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleChkActionPerformed
        // TODO add your handling code here:
        MaleChk.setSelected(false);
    }//GEN-LAST:event_FemaleChkActionPerformed

    private void MaleChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleChkActionPerformed
        // TODO add your handling code here:
        FemaleChk.setSelected(false);
    }//GEN-LAST:event_MaleChkActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AgeTxt;
    private javax.swing.JLabel BackGround;
    private javax.swing.JTextField DAddressTxt;
    private javax.swing.JComboBox<String> DFieldTxt;
    private javax.swing.JTextField DMobileTxt;
    private javax.swing.JTextField DNameTxt;
    private javax.swing.JTextField DPassTxt;
    private javax.swing.JRadioButton FemaleChk;
    private javax.swing.JRadioButton MaleChk;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}