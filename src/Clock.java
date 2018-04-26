/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eric
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TimeZone;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.Timer;

public class Clock extends javax.swing.JFrame{  
    
    public Object tz;
    public Object otz;
    //public Object tz2;
    //public Object tznow;

    /**
     * Creates new form Clock
     */
    public Clock() {
        initComponents();
        showUTC();
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
        cTimeZone = new javax.swing.JLabel();
        oTimeZone = new javax.swing.JLabel();
        cTimeLabel = new javax.swing.JLabel();
        oTimeLabel = new javax.swing.JLabel();
        cTimeZoneScroll = new javax.swing.JComboBox<>();
        oTimeZoneScroll = new javax.swing.JComboBox<>();
        convertButton = new javax.swing.JButton();
        utcLabel = new javax.swing.JLabel();
        currentTime = new javax.swing.JLabel();
        utcTime = new javax.swing.JLabel();
        otherTime = new javax.swing.JLabel();
        timeDiff = new javax.swing.JLabel();
        timeDiffLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("World Time");

        cTimeZone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cTimeZone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cTimeZone.setText("My Time Zone");

        oTimeZone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        oTimeZone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oTimeZone.setText("Dest. Time Zone");

        cTimeLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cTimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cTimeLabel.setText("My Current Time");

        oTimeLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        oTimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oTimeLabel.setText("Dest. Time");

        cTimeZoneScroll.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Time Zone", "Default - GMT", "America/Chicago", "America/New_York", "America/Los_Angeles", "America/Denver", " " }));
        cTimeZoneScroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cTimeZoneScrollActionPerformed(evt);
            }
        });

        oTimeZoneScroll.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Time Zone", "Default - GMT", "America/Chicago", "America/New_York", "America/Los_Angeles", "America/Denver" }));
        oTimeZoneScroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oTimeZoneScrollActionPerformed(evt);
            }
        });

        convertButton.setText("Convert Time Diff.");
        convertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertButtonActionPerformed(evt);
            }
        });

        utcLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        utcLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        utcLabel.setText("UTC");
        utcLabel.setToolTipText("");

        currentTime.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        currentTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        utcTime.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        utcTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        utcTime.setText("00:00");

        otherTime.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        otherTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        timeDiff.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        timeDiff.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeDiff.setText("+ 00:00");
        timeDiff.setToolTipText("");

        timeDiffLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        timeDiffLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeDiffLabel.setText("Time Diff.");
        timeDiffLabel.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cTimeZoneScroll, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cTimeZone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cTimeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(currentTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(utcLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(utcTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 99, 99))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(timeDiff, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timeDiffLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(oTimeZoneScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oTimeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(oTimeZone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(otherTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(159, 159, 159))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(convertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cTimeZone, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oTimeZone, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(utcLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cTimeZoneScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(oTimeZoneScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(utcTime, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(convertButton)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oTimeLabel)
                    .addComponent(cTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(otherTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(currentTime, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(timeDiffLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timeDiff)))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    Timer t;
    
    public void showTime(String cz){ 
        t = new Timer(100, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Date currzone = new Date();
                SimpleDateFormat time = new SimpleDateFormat("hh:mma z");
                time.setTimeZone(TimeZone.getTimeZone(cz)); 
                currentTime.setText(time.format(currzone));
            }
        });
        t.setRepeats(false);
        t.start();
    }
    
    Timer t2;
    
    void showTime2(String ocz){ 
        t2 = new Timer(100, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Date currzone = new Date();
                SimpleDateFormat time = new SimpleDateFormat("hh:mma z");
                time.setTimeZone(TimeZone.getTimeZone(ocz)); 
                otherTime.setText(time.format(currzone));
            }
        });
        t2.setRepeats(false);
        t2.start();
    }
    
    void showUTC(){
        new Timer(100, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Date utczone = new Date();
                SimpleDateFormat time = new SimpleDateFormat("hh:mma");
                time.setTimeZone(TimeZone.getTimeZone("UTC")); 
                utcTime.setText(time.format(utczone));
            }
        }).start();
    }
    
    private void cTimeZoneScrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cTimeZoneScrollActionPerformed
        // TODO add your handling code here:
        tz = cTimeZoneScroll.getSelectedItem();
        
        String stz = tz.toString();
        
        if(stz != "Select Time Zone"){
            showTime(stz);
        }
    }//GEN-LAST:event_cTimeZoneScrollActionPerformed

    
    private void convertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertButtonActionPerformed
        // TODO add your handling code here:
        
            
            // get current time and subtract from other time
            
            // display new time as time difference
    }//GEN-LAST:event_convertButtonActionPerformed

    private void oTimeZoneScrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oTimeZoneScrollActionPerformed
        // TODO add your handling code here:
  
        otz = oTimeZoneScroll.getSelectedItem();
        
        String sotz = otz.toString();
        
        if(sotz != "Select Time Zone") {
            showTime2(sotz);
        }
    }//GEN-LAST:event_oTimeZoneScrollActionPerformed

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
            java.util.logging.Logger.getLogger(Clock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cTimeLabel;
    private javax.swing.JLabel cTimeZone;
    private javax.swing.JComboBox<String> cTimeZoneScroll;
    private javax.swing.JButton convertButton;
    private javax.swing.JLabel currentTime;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel oTimeLabel;
    private javax.swing.JLabel oTimeZone;
    private javax.swing.JComboBox<String> oTimeZoneScroll;
    private javax.swing.JLabel otherTime;
    private javax.swing.JLabel timeDiff;
    private javax.swing.JLabel timeDiffLabel;
    private javax.swing.JLabel utcLabel;
    private javax.swing.JLabel utcTime;
    // End of variables declaration//GEN-END:variables
}
