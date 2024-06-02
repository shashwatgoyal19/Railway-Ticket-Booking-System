/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.railway_reservation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class sleeper extends javax.swing.JFrame {

    /**
     * Creates new form sleeper
     */
    public sleeper() {
        initComponents();
        bseats.setVisible(false);
        labelSeats.setVisible(false);
        textboxSeats.setVisible(false);
    }
    String trainID ;
    public sleeper(String trainID) {
        initComponents();
        bseats.setVisible(false);
        labelSeats.setVisible(false);
        textboxSeats.setVisible(false);
        this.trainID = trainID; // Set the received train ID to the class variable
        trainIDLabel.setText(trainID); // Update the train ID label on the form
    }
    Connection con ;
    PreparedStatement pst ;
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        TextNoOFCoaches = new javax.swing.JTextField();
        sleeperSubmit = new javax.swing.JButton();
        labelSeats = new javax.swing.JLabel();
        textboxSeats = new javax.swing.JTextField();
        bseats = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        trainIDLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        sleeperSubmit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sleeperSubmit.setText("SUBMIT");
        sleeperSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sleeperSubmitActionPerformed(evt);
            }
        });

        labelSeats.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelSeats.setText("Enter the No of compartment in each coach");

        bseats.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bseats.setText("SUBMIT");
        bseats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bseatsActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("TRAIN ID");

        trainIDLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        trainIDLabel.setText("skjdjs");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Enter the No of sleeper coaches added to the train");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextNoOFCoaches, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bseats)
                            .addComponent(sleeperSubmit))
                        .addGap(41, 41, 41))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(labelSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textboxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(trainIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trainIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextNoOFCoaches, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sleeperSubmit))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textboxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bseats))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("CONTINUE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(76, 76, 76))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sleeperSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sleeperSubmitActionPerformed
        // TODO add your handling code here:
        if (TextNoOFCoaches.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter the number of coaches.");
        return;
    }

    try {
        int numCoaches = Integer.parseInt(TextNoOFCoaches.getText());
        if (numCoaches <= 0 || numCoaches > 10) {
            JOptionPane.showMessageDialog(null, "Number of coaches must be an integer between 1 and 10.");
        } else {
            // Perform the desired action with the valid number of coaches
            bseats.setVisible(true);
            labelSeats.setVisible(true);
            textboxSeats.setVisible(true);
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Please enter a valid integer for the number of coaches.");
    }
    }//GEN-LAST:event_sleeperSubmitActionPerformed

    private void bseatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bseatsActionPerformed
        // TODO add your handling code here:
       if (textboxSeats.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter the number of seats in each coach.");
            return;
        }

        try {
            int numSeats = Integer.parseInt(textboxSeats.getText());
            if (numSeats <= 0 || numSeats > 70) {
                JOptionPane.showMessageDialog(null, "Number of seats must be an integer between 1 and 70.");
            } else {
                // Allocate and insert seats
                allocateAndInsertSeats(numSeats);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid integer for the number of seats.");
        }
        
    }//GEN-LAST:event_bseatsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        manageTrain1 my=new manageTrain1();
        my.setVisible(true);
        my.setSize(625,450);
    }//GEN-LAST:event_jButton1ActionPerformed
    
  
 
private void allocateAndInsertSeats(int numSeatsPerCoach) {
    try {
        int numCoaches = Integer.parseInt(TextNoOFCoaches.getText());
        if (numCoaches <= 0 || numCoaches > 10) {
            JOptionPane.showMessageDialog(null, "Number of coaches must be an integer between 1 and 10.");
            return;
        }

        String[] berthTypes = { "upper", "lower", "middle" };

        int seatNumberCounter = 1; // Initialize seatNumberCounter outside the loop

        // Retrieve the maximum coach number from the database
        int maxCoachNumber = getMaxCoachNumberFromDatabase(); // Add this method call

        int nextCoachNumber = maxCoachNumber + 1;

        for (int coachNumber = nextCoachNumber; coachNumber < nextCoachNumber + numCoaches; coachNumber++) {
            String coachName = "S" + String.format("%03d", coachNumber);

            for (int seatNumber = 1; seatNumber <= numSeatsPerCoach; seatNumber++) {
                for (String berth : berthTypes) {
                    insertSeat(berth, coachName, seatNumberCounter);
                    seatNumberCounter++;
                }
            }

            // Reset seatNumberCounter to 1 for the next coach
            seatNumberCounter = 1;
        }

        JOptionPane.showMessageDialog(null, "All seats have been successfully added.");
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Please enter valid integer values.");
    }
}

private int getMaxCoachNumberFromDatabase() {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/railway";
        String userName = "root";
        String password = "Vectors123";
        con = DriverManager.getConnection(url, userName, password);

        String getMaxCoachNumberQuery = "SELECT MAX(CAST(SUBSTRING(coach, 2) AS UNSIGNED)) FROM seat WHERE coach LIKE 'S%'";
        pst = con.prepareStatement(getMaxCoachNumberQuery);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            return rs.getInt(1); // Return the maximum coach number
        } else {
            return 0; // Or any other appropriate default value
        }
    } catch (ClassNotFoundException | SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error retrieving maximum coach number: " + ex.getMessage());
    } finally {
        try {
            if (pst != null) {
                pst.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error closing connection: " + ex.getMessage());
        }
    }
    return 0; // Default value if retrieval fails
}


    






    private void insertSeat(String berth, String coach, int seatNumberCounter) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/railway";
            String userName = "root";
            String password = "Vectors123";
            con = DriverManager.getConnection(url, userName, password);

            String getMaxSeatIdQuery = "SELECT MAX(seat_id) FROM seat";
            pst = con.prepareStatement(getMaxSeatIdQuery);
            ResultSet rs = pst.executeQuery();

            String newSeatId;
            if (rs.next()) {
                String maxSeatId = rs.getString(1);
                if (maxSeatId == null) {
                    newSeatId = "ST001";
                } else {
                    int maxId = Integer.parseInt(maxSeatId.substring(2));
                    newSeatId = "ST" + String.format("%03d", maxId + 1);
                }
            } else {
                newSeatId = "ST001";
            }

            String sql = "INSERT INTO seat (seat_id, status, coach, berth, seat_number, train_id,class) VALUES (?, ?, ?, ?, ?, ?,?)";
            pst = con.prepareStatement(sql);

            pst.setString(1, newSeatId);
            pst.setString(2, "Available");
            pst.setString(3, coach);
            pst.setString(4, berth);
            pst.setInt(5, seatNumberCounter);
            pst.setString(6, trainID);
            pst.setString(7, "sleeper");
            pst.executeUpdate();

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error inserting seat data: " + ex.getMessage());
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error closing connection: " + ex.getMessage());
            }
        }
    }
 



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
            java.util.logging.Logger.getLogger(sleeper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sleeper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sleeper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sleeper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sleeper().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextNoOFCoaches;
    private javax.swing.JButton bseats;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelSeats;
    private javax.swing.JButton sleeperSubmit;
    private javax.swing.JTextField textboxSeats;
    private javax.swing.JLabel trainIDLabel;
    // End of variables declaration//GEN-END:variables
}
