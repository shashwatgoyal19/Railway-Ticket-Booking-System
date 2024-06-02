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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class authenticate extends javax.swing.JFrame {

    /**
     * Creates new form authenticate
     */
    String source;
    String destination;
    String dateofJourney;
    String travelClass;
    public authenticate() {
        initComponents();
        tfWalletBalance.setVisible(false);
        lbWallet.setVisible(false);
        checkButtonWallet.setVisible(false);
    }
    String AuthenCLASSTRAIN;
    String idMain;
    String Asource;
    String Adestination;
    String Adate;
    String AtrainID;
    String AtrainName;
    String AdepartureTime;
    String AarrivalTime;
    int AseatsAvailableauthen;
    public authenticate(String classA,String source,String destination,String journeyDate,
            String trainID,String trainName,String departureTime,
            String arrivalTime,int ASeatsavailable,String id) {
        initComponents();
        tfWalletBalance.setVisible(false);
        lbWallet.setVisible(false);
        checkButtonWallet.setVisible(false);
        this.idMain=id;
        
         AuthenCLASSTRAIN=classA;
         this.Asource=source;
         this.Adestination=destination;
         this.Adate=journeyDate;
         this.AtrainID=trainID;
         this.AtrainName=trainName;
         this.AdepartureTime=departureTime;
         this.AarrivalTime=arrivalTime;
         this.AseatsAvailableauthen=ASeatsavailable;
         
        
       
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tbuserID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        lbWallet = new javax.swing.JLabel();
        tfWalletBalance = new javax.swing.JTextField();
        checkButtonWallet = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("EXIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setText("EXIT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Authenticate Wallet Balance To Continue!");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("ENTER THE USER ID");

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("SUBMIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        lbWallet.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbWallet.setText("Wallet");

        checkButtonWallet.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkButtonWallet.setText("CHECK");
        checkButtonWallet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonWalletActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(63, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tbuserID, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbWallet, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfWalletBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkButtonWallet)))
                        .addGap(26, 26, 26))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbuserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbWallet, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfWalletBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkButtonWallet))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setText("BACK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jButton2))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(23, Short.MAX_VALUE))
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
    Connection con ;
    PreparedStatement pst ;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(tbuserID.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Please Fill the User ID");
        }
        String id=tbuserID.getText();
        idMain=tbuserID.getText();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
                String url="jdbc:mysql://localhost:3306/";
                String dbname="railway";
                String userName="root";
                String password="Vectors123";
                con=DriverManager.getConnection(url+dbname,userName,password);
                pst=con.prepareStatement("select * from user where user_id=?");
                pst.setString(1,id);
                ResultSet rs=pst.executeQuery();
                if (rs.next()==false) {
                     JOptionPane.showMessageDialog(this,"Record Not Found");
                }
                else {
                    String balance=rs.getString("wallet_balance");
                    tfWalletBalance.setVisible(true);
                    lbWallet.setVisible(true);
                    checkButtonWallet.setVisible(true);
                    tfWalletBalance.setText(balance.trim());
                    tfWalletBalance.setEditable(false);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(editPersonalDetail.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(editPersonalDetail.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        railDisplay my=new railDisplay();
        my.setSize(818,345);
        my.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed
    
    Connection con1;
    PreparedStatement ps5;
    String outterCoach;
    String outterSeatNumber;
    String outterBerth;
    private void checkButtonWalletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonWalletActionPerformed
        // TODO add your handling code here:
        if ("SLEEPER".equals(AuthenCLASSTRAIN)) {
            
        if (tbuserID.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter a valid User ID.");
                return;
            }
            int check = 150;
            double walletBalance = Double.parseDouble(tfWalletBalance.getText());

            System.out.println("sleeper"+walletBalance);
            if (walletBalance >= check) {
                JOptionPane.showMessageDialog(this, "Wallet balance is sufficient. Proceeding to booking.");
                walletBalance = walletBalance - check;
                String newBalance = String.valueOf(walletBalance);
                System.out.println("newBalance"+newBalance);
                System.out.println("USERID"+idMain);
                // Update wallet balance in the database and proceed to booking
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    String url="jdbc:mysql://localhost:3306/";
                    String dbname="railway";
                    String userName="root";
                    String password="Vectors123";
                    con=DriverManager.getConnection(url+dbname,userName,password);
                pst=con.prepareStatement("update user set wallet_balance=? where user_id=? ");
                
                
                pst.setString(1,newBalance);
                pst.setString(2,idMain);
                pst.executeUpdate();
                
                ps5=con.prepareStatement("SELECT * FROM seat " + 
                        "WHERE status='Available' AND class=? and train_id=? Limit 1");
                ps5.setString(1,AuthenCLASSTRAIN);
                ps5.setString(2,AtrainID);
                ResultSet seatRs = ps5.executeQuery();
                while (seatRs.next()) {
                int seatNumber = seatRs.getInt("seat_number");
                String berth = seatRs.getString("berth");
                String coach = seatRs.getString("coach");

                 this.outterCoach=coach;
                outterSeatNumber=String.valueOf(seatNumber);
                outterBerth=berth;

                String updateSeatQuery = "UPDATE seat SET status='booked' WHERE seat_number=? AND coach=?";  
                PreparedStatement updateSeatPst = con.prepareStatement(updateSeatQuery);
                updateSeatPst.setInt(1, seatNumber);  
                updateSeatPst.setString(2, coach);    
                updateSeatPst.executeUpdate();
                updateSeatPst.close();
            }
                
   
                setVisible(false);
        bookingDetails booking = new bookingDetails(AuthenCLASSTRAIN,Asource,
                Adestination,Adate,AtrainID,AtrainName,AdepartureTime,
                AarrivalTime,AseatsAvailableauthen,150,idMain,outterCoach,outterBerth,outterSeatNumber);
        booking.setSize(639, 464);
        booking.setVisible(true);
        
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(userRegister3.class.getName()).log(Level.SEVERE, null, ex);
                }
                catch (SQLException ex) {
                    Logger.getLogger(userRegister3.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            } else {
                JOptionPane.showMessageDialog(this, "Insufficient wallet balance. Please recharge||Seat Not Available.");
                // Redirect user to recharge page or display recharge options
            }
        }
        if ("FIRST".equals(AuthenCLASSTRAIN)) {
            System.out.println("FIRST");
        if (tbuserID.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter a valid User ID.");
                return;
            }
            int check = 200;
            double walletBalance = Double.parseDouble(tfWalletBalance.getText());

            System.out.println(walletBalance);
            if (walletBalance >= check) {
                JOptionPane.showMessageDialog(this, "Wallet balance is sufficient. Proceeding to booking.");
                walletBalance = walletBalance - check;
                String newBalance = String.valueOf(walletBalance);

                // Update wallet balance in the database and proceed to booking
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    String url="jdbc:mysql://localhost:3306/";
                    String dbname="railway";
                    String userName="root";
                    String password="Vectors123";
                    con=DriverManager.getConnection(url+dbname,userName,password);
                pst=con.prepareStatement("update user set wallet_balance=? where user_id=? ");
                pst.setString(1,newBalance);
                pst.setString(2,idMain);
                pst.executeUpdate();
                
                ps5=con.prepareStatement("SELECT * FROM seat " + 
                        "WHERE status='Available' AND class=? and train_id=? Limit 1");
                ps5.setString(1,AuthenCLASSTRAIN);
                ps5.setString(2,AtrainID);
                ResultSet seatRs = ps5.executeQuery();
                while (seatRs.next()) {
                int seatNumber = seatRs.getInt("seat_number");
                String berth = seatRs.getString("berth");
                String coach = seatRs.getString("coach");

                this.outterCoach=coach;
                outterSeatNumber=String.valueOf(seatNumber);
                outterBerth=berth;

                String updateSeatQuery = "UPDATE seat SET status='booked' WHERE seat_number=? AND coach=?";  
                PreparedStatement updateSeatPst = con.prepareStatement(updateSeatQuery);
                updateSeatPst.setInt(1, seatNumber);  
                updateSeatPst.setString(2, coach);    
                updateSeatPst.executeUpdate();
                updateSeatPst.close();
            }
                
                setVisible(false);
      bookingDetails booking = new bookingDetails(AuthenCLASSTRAIN,Asource,
                Adestination,Adate,AtrainID,AtrainName,AdepartureTime,
                AarrivalTime,AseatsAvailableauthen,150,idMain,outterCoach,outterBerth,outterSeatNumber);
        booking.setSize(639, 464);
        booking.setVisible(true);
        
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(userRegister3.class.getName()).log(Level.SEVERE, null, ex);
                }
                catch (SQLException ex) {
                    Logger.getLogger(userRegister3.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            } else {
                JOptionPane.showMessageDialog(this, "Insufficient wallet balance. Please recharge.");
                // Redirect user to recharge page or display recharge options
            }
        }
        if ("SECOND".equals(AuthenCLASSTRAIN)) {
            System.out.println("SECOND");
        if (tbuserID.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter a valid User ID.");
                return;
            }
            int check = 300;
            double walletBalance = Double.parseDouble(tfWalletBalance.getText());

            System.out.println(walletBalance);
            if (walletBalance >= check) {
                JOptionPane.showMessageDialog(this, "Wallet balance is sufficient. Proceeding to booking.");
                walletBalance = walletBalance - check;
                String newBalance = String.valueOf(walletBalance);

                // Update wallet balance in the database and proceed to booking
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    String url="jdbc:mysql://localhost:3306/";
                    String dbname="railway";
                    String userName="root";
                    String password="Vectors123";
                    con=DriverManager.getConnection(url+dbname,userName,password);
                pst=con.prepareStatement("update user set wallet_balance=? where user_id=? ");
                pst.setString(1,newBalance);
                pst.setString(2,idMain);
                pst.executeUpdate();
                
                ps5=con.prepareStatement("SELECT * FROM seat " + 
                        "WHERE status='Available' AND class=? and train_id=? Limit 1");
                ps5.setString(1,AuthenCLASSTRAIN);
                ps5.setString(2,AtrainID);
                ResultSet seatRs = ps5.executeQuery();
                while (seatRs.next()) {
                int seatNumber = seatRs.getInt("seat_number");
                String berth = seatRs.getString("berth");
                String coach = seatRs.getString("coach");

                this.outterCoach=coach;
                outterSeatNumber=String.valueOf(seatNumber);
                outterBerth=berth;

                String updateSeatQuery = "UPDATE seat SET status='booked' WHERE seat_number=? AND coach=?";  
                PreparedStatement updateSeatPst = con.prepareStatement(updateSeatQuery);
                updateSeatPst.setInt(1, seatNumber);  
                updateSeatPst.setString(2, coach);    
                updateSeatPst.executeUpdate();
                updateSeatPst.close();
            }
                
                setVisible(false);
        bookingDetails booking = new bookingDetails(AuthenCLASSTRAIN,Asource,
                Adestination,Adate,AtrainID,AtrainName,AdepartureTime,
                AarrivalTime,AseatsAvailableauthen,150,idMain,outterCoach,outterBerth,outterSeatNumber);
        booking.setSize(639, 464);
        booking.setVisible(true);
        
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(userRegister3.class.getName()).log(Level.SEVERE, null, ex);
                }
                catch (SQLException ex) {
                    Logger.getLogger(userRegister3.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            } else {
                JOptionPane.showMessageDialog(this, "Insufficient wallet balance. Please recharge.");
                // Redirect user to recharge page or display recharge options
            }
        }
        if ("THIRD".equals(AuthenCLASSTRAIN)) {
            System.out.println("THIRD");
        if (tbuserID.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter a valid User ID.");
                return;
            }
            double check = 400;
            double walletBalance = Double.parseDouble(tfWalletBalance.getText());

            System.out.println(walletBalance);
            if (walletBalance >= check) {
                JOptionPane.showMessageDialog(this, "Wallet balance is sufficient. Proceeding to booking.");
                walletBalance = walletBalance - check;
                String newBalance = String.valueOf(walletBalance);
                 System.out.println("newBalance"+newBalance);
                // Update wallet balance in the database and proceed to booking
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    String url="jdbc:mysql://localhost:3306/";
                    String dbname="railway";
                    String userName="root";
                    String password="Vectors123";
                    con=DriverManager.getConnection(url+dbname,userName,password);
                    pst=con.prepareStatement("update user set wallet_balance=? where user_id=? ");
                    pst.setString(1,newBalance);
                    pst.setString(2,idMain);
                    pst.executeUpdate();
                    
                    ps5=con.prepareStatement("SELECT * FROM seat " + 
                        "WHERE status='Available' AND class=? and train_id=? Limit 1");
                ps5.setString(1,AuthenCLASSTRAIN);
                ps5.setString(2,AtrainID);
                ResultSet seatRs = ps5.executeQuery();
                while (seatRs.next()) {
                int seatNumber = seatRs.getInt("seat_number");
                String berth = seatRs.getString("berth");
                String coach = seatRs.getString("coach");

                this.outterCoach=coach;
                outterSeatNumber=String.valueOf(seatNumber);
                outterBerth=berth;

                String updateSeatQuery = "UPDATE seat SET status='booked' WHERE seat_number=? AND coach=?";  
                PreparedStatement updateSeatPst = con.prepareStatement(updateSeatQuery);
                updateSeatPst.setInt(1, seatNumber);  
                updateSeatPst.setString(2, coach);    
                updateSeatPst.executeUpdate();
                updateSeatPst.close();
            }
                
                setVisible(false);
                
                
                 bookingDetails booking = new bookingDetails(AuthenCLASSTRAIN,Asource,
                Adestination,Adate,AtrainID,AtrainName,AdepartureTime,
                AarrivalTime,AseatsAvailableauthen,150,idMain,outterCoach,outterBerth,outterSeatNumber);
        booking.setSize(639, 464);
        booking.setVisible(true);
        
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(userRegister3.class.getName()).log(Level.SEVERE, null, ex);
                }
                catch (SQLException ex) {
                    Logger.getLogger(userRegister3.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            } else {
                JOptionPane.showMessageDialog(this, "Insufficient wallet balance. Please recharge.");
                // Redirect user to recharge page or display recharge options
            }
        }
    }//GEN-LAST:event_checkButtonWalletActionPerformed

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
            java.util.logging.Logger.getLogger(authenticate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(authenticate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(authenticate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(authenticate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new authenticate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkButtonWallet;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbWallet;
    private javax.swing.JTextField tbuserID;
    private javax.swing.JTextField tfWalletBalance;
    // End of variables declaration//GEN-END:variables
}
