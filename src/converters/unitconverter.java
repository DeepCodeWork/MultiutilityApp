/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package converters;
import javax.swing.JOptionPane;
/**
 *
 * @author Teji
 */
public class unitconverter extends javax.swing.JFrame {

    /**
     * Creates new form unitconverter
     */
    public unitconverter() {
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

        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        fromm = new javax.swing.JComboBox();
        to = new javax.swing.JComboBox();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton2.setText("Temperature");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton5.setText("Time");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton6.setText("Mass");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton7.setText("Length");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 3, 18)); // NOI18N
        jLabel1.setText("                      Unit Converter");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("From:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("To:");

        jButton1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fromm, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton5))
                .addGap(28, 28, 28)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fromm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     fromm.removeAllItems();
     to.removeAllItems();
     fromm.addItem("Seconds");
     fromm.addItem("MilliSeconds");
     fromm.addItem("minutes");
     fromm.addItem("Hours");
     fromm.addItem("Days");
     to.addItem("Seconds");
     to.addItem("MilliSeconds");
     to.addItem("minutes");
     to.addItem("Hours");
     to.addItem("Days");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  double from=1,val=1;
  try{
      from=Double.parseDouble(jTextField1.getText());
  }
     catch(NumberFormatException e)
     {
         JOptionPane.showMessageDialog(null,"please enter numbers");
     }
      //  <-------------------Time------------------>
        if(fromm.getSelectedItem().toString().equals("MilliSeconds")){
        if(to.getSelectedItem().toString().equals("Seconds")){
          val=from/1000;        
        }
        else if(to.getSelectedItem().toString().equals("MilliSeconds")){
       val=from;
        }
        else if(to.getSelectedItem().toString().equals("Minutes")){
       val=from/60000;
    }
        
        else if(to.getSelectedItem().toString().equals("Hours")){
       val=from/3600000;
    }   
        else if(to.getSelectedItem().toString().equals("Days")){
       val=from/(3600000*24);
    }   
        jTextField2.setText(""+val);
       
        }  
        if(fromm.getSelectedItem().toString().equals("Seconds")){
        if(to.getSelectedItem().toString().equals("Seconds")){
        val=from;
        }
        else if(to.getSelectedItem().toString().equals("MilliSeconds"))
           {
               val=from*1000;
           }
        else if(to.getSelectedItem().toString().equals("Minutes"))
           {
               val=from/60;
           }
        else if(to.getSelectedItem().toString().equals("Hours"))
           {
               val=from/3600;
           }
        else if(to.getSelectedItem().toString().equals("Days"))
           {
               val=from/(3600*24);
           }
        jTextField2.setText(""+val);
        }
          if (fromm.getSelectedItem().toString().equals("Minutes")){
           if(to.getSelectedItem().toString().equals("Seconds")){
          
           val=from*60;
           }
           else if(to.getSelectedItem().toString().equals("MilliSeconds"))
           {
               val=from*60000;
           }
            else if(to.getSelectedItem().toString().equals("Minutes"))
           {
               val=from;
           }
            else if(to.getSelectedItem().toString().equals("Hours"))
           {
               val=from/60;
           }
            else if(to.getSelectedItem().toString().equals("Days"))
           {
               val=from/1440;
           }    
           jTextField2.setText(""+val);
       }
           if (fromm.getSelectedItem().toString().equals("Hours")){
           if(to.getSelectedItem().toString().equals("Seconds")){
          
           val=from*3600;
           }
           else if(to.getSelectedItem().toString().equals("MilliSeconds"))
           {
               val=from*3600000;
           }
            else if(to.getSelectedItem().toString().equals("Minutes"))
           {
               val=from*60;
           }
            else if(to.getSelectedItem().toString().equals("Hours"))
           {
               val=from;
           }
            else if(to.getSelectedItem().toString().equals("Days"))
           {
               val=from/24;
           }    
           jTextField2.setText(""+val);
       }
           if (fromm.getSelectedItem().toString().equals("Days")){
           if(to.getSelectedItem().toString().equals("Seconds")){
          
           val=from*(3600*24);
           }
           else if(to.getSelectedItem().toString().equals("MilliSeconds"))
           {
               val=from*(3600000*24);
           }
            else if(to.getSelectedItem().toString().equals("Minutes"))
           {
               val=from*24*3600;
           }
            else if(to.getSelectedItem().toString().equals("Hours"))
           {
               val=from*24;
           }
            else if(to.getSelectedItem().toString().equals("Days"))
           {
               val=from;
           }    
           jTextField2.setText(""+val);
       }
           //     <------------length----------->
       if (fromm.getSelectedItem().toString().equals("Killometers")){
           if(to.getSelectedItem().toString().equals("Killometers")){
          
           val=from;
           }
           else if(to.getSelectedItem().toString().equals("Centimeters"))
           {
               val=from*100000;
           }
            else if(to.getSelectedItem().toString().equals("Inches"))
           {
               val=from*39370.078740157;
           }
            else if(to.getSelectedItem().toString().equals("Feet"))
           {
               val=from*3280.8398950131;
           }
            else if(to.getSelectedItem().toString().equals("Meters"))
           {
               val=from*1000;
           }
           jTextField2.setText(""+val);
       }
       if (fromm.getSelectedItem().toString().equals("Centimeters")){
           if(to.getSelectedItem().toString().equals("Killometers")){
          
           val=from/100000;
           }
           else if(to.getSelectedItem().toString().equals("Centimeters"))
           {
               val=from;
           }
            else if(to.getSelectedItem().toString().equals("Inches"))
           {
               val=from*0.39370078740157;
           }
            else if(to.getSelectedItem().toString().equals("Feet"))
           {
               val=from*0.032808398950131;
           }
            else if(to.getSelectedItem().toString().equals("Meters"))
           {
               val=from/100;
           }
            jTextField2.setText(""+val);
       }
           if (fromm.getSelectedItem().toString().equals("Inches")){
           if(to.getSelectedItem().toString().equals("Killometers")){
          
           val=from*0.0000254;
           }
           else if(to.getSelectedItem().toString().equals("Centimeters"))
           {
               val=from*2.54;
           }
            else if(to.getSelectedItem().toString().equals("Inches"))
           {
               val=from;
           }
            else if(to.getSelectedItem().toString().equals("Feet"))
           {
               val=from*0.083333333333333;
           }
            else if(to.getSelectedItem().toString().equals("Meters"))
           {
               val=from*0.0254;
           }
        //   jTextField2.setText(""+val);
       
           jTextField2.setText(""+val);
       }
            if (fromm.getSelectedItem().toString().equals("Meters")){
           if(to.getSelectedItem().toString().equals("Killometers")){
          
           val=from/1000;
           }
           else if(to.getSelectedItem().toString().equals("Centimeters"))
           {
               val=from*100;
           }
            else if(to.getSelectedItem().toString().equals("Inches"))
           {
               val=from*39.370078740157;
           }
            else if(to.getSelectedItem().toString().equals("Feet"))
           {
               val=from/3.2808398950131;
           }
            else if(to.getSelectedItem().toString().equals("Meters"))
           {
               val=from;
           }
        //   jTextField2.setText(""+val);
       
           jTextField2.setText(""+val);
       }
             if (fromm.getSelectedItem().toString().equals("Feet")){
           if(to.getSelectedItem().toString().equals("Killometers")){
          
           val=from*0.0003048;
           }
           else if(to.getSelectedItem().toString().equals("Centimeters"))
           {
               val=from*30.48;
           }
            else if(to.getSelectedItem().toString().equals("Inches"))
           {
               val=from*12;
           }
            else if(to.getSelectedItem().toString().equals("Feet"))
           {
               val=from;
           }
            else if(to.getSelectedItem().toString().equals("Meters"))
           {
               val=from*0.3048;
           }
        //   jTextField2.setText(""+val);
       
           jTextField2.setText(""+val);
       }
        
         //   <-------------------Mass------------->
          if (fromm.getSelectedItem().toString().equals("Grams")){
           if(to.getSelectedItem().toString().equals("Grams")){
          
           val=from;
           }
           else if(to.getSelectedItem().toString().equals("Milligrams"))
           {
               val=from*1000;
           }
            else if(to.getSelectedItem().toString().equals("Kilograms"))
           {
               val=from/1000;
           }
            
           jTextField2.setText(""+val);
       }
          if (fromm.getSelectedItem().toString().equals("Milligrams")){
           if(to.getSelectedItem().toString().equals("Grams")){
          
           val=from/1000;
           }
           else if(to.getSelectedItem().toString().equals("Milligrams"))
           {
               val=from;
           }
            else if(to.getSelectedItem().toString().equals("Killograms"))
           {
               val=from/1000000;
           }
            
           jTextField2.setText(""+val);
       }
          if (fromm.getSelectedItem().toString().equals("Killograms")){
           if(to.getSelectedItem().toString().equals("Grams")){
          
           val=from*1000;
           }
           else if(to.getSelectedItem().toString().equals("Milligrams"))
           {
               val=from*1000000;
           }
            else if(to.getSelectedItem().toString().equals("Killograms"))
           {
               val=from;
           }
            
           jTextField2.setText(""+val);
       }
          //   <-----------------Temperature---------->
       if (fromm.getSelectedItem().toString().equals("Fahrenheit")){
           if(to.getSelectedItem().toString().equals("Fahrenheit")){
          
           val=from;
           }
           else if(to.getSelectedItem().toString().equals("Celsius"))
           {
               val=5/9*(from-32);
           }
            else if(to.getSelectedItem().toString().equals("Kelvin"))
           {
               val=(from - 32) * 5/9 + 273.15;
           }
            
           jTextField2.setText(""+val);
       }
        if (fromm.getSelectedItem().toString().equals("Celsius")){
           if(to.getSelectedItem().toString().equals("Fahrenheit")){
          
           val=(from * 9/5) + 32;
           }
           else if(to.getSelectedItem().toString().equals("Celsius"))
           {
               val=from;
           }
            else if(to.getSelectedItem().toString().equals("Kelvin"))
           {
               val=from + 273.15;
           }
            
           jTextField2.setText(""+val);
       }
         if (fromm.getSelectedItem().toString().equals("kelvin")){
           if(to.getSelectedItem().toString().equals("Fahrenheit")){
          
           val=(from - 273.15) * 9/5 + 32;
           }
           else if(to.getSelectedItem().toString().equals("Celsius"))
           {
               val=from - 273.15;
           }
            else if(to.getSelectedItem().toString().equals("Kelvin"))
           {
               val=from;
           }
            
           jTextField2.setText(""+val);
       }
        
        
        
        
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
 fromm.removeAllItems();
 to.removeAllItems();
 fromm.addItem("Meters");
 fromm.addItem("Killometers");       
 fromm.addItem("Centimeters");
 fromm.addItem("Feet");
 fromm.addItem("Inches");
 to.addItem("Meters");
 to.addItem("Killometers");       
 to.addItem("Centimeters");
 to.addItem("Feet");
 to.addItem("Inches");
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      fromm.removeAllItems();  
to.removeAllItems(); // TODO add your handling code here:
fromm.addItem("Grams");
fromm.addItem("Milligrams");
fromm.addItem("Killograms");
to.addItem("Grams");
to.addItem("Milligrams");
to.addItem("Kilograms");
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
fromm.removeAllItems();  
to.removeAllItems(); // TODO add your handling code here:
fromm.addItem("Fahrenheit");
fromm.addItem("Celsius");
fromm.addItem("Kelvin");
to.addItem("Fahrenheit");
to.addItem("Celsius");
to.addItem("Kelvin");
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(unitconverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(unitconverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(unitconverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(unitconverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new unitconverter().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox fromm;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JComboBox to;
    // End of variables declaration//GEN-END:variables
}
