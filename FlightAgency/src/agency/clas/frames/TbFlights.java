/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agency.clas.frames;

import agency.clas.DbTables.FlightsDB;
import agency.clas.Flight;
import agency.clas.Flighttimes;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author whatup
 */
public class TbFlights extends javax.swing.JFrame {

    /**
     * Creates new form TbFlights
     */
    BookingFlightsForm bookingFlightsForm;
    public TbFlights() {
        initComponents();
    }
    public TbFlights(BookingFlightsForm bookingFlightsForm) {
        initComponents();
        this.bookingFlightsForm=bookingFlightsForm;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);

        btnEdit.setText("jButton1");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(btnEdit)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnEdit)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        bookingFlightsForm.hide();
        FlightsDB flightsDB= new FlightsDB();

        DefaultTableModel model = new DefaultTableModel();
        String[] column = {"Number","from city", "Depart time", "to city","Arrival time"};
        model.setColumnIdentifiers(column);

        //This method to show all the attendence after user select specific event
        ArrayList<Flighttimes> arrayFlights = new ArrayList();

        arrayFlights = flightsDB.AllFlights();

        for (int i = 0; i < arrayFlights.size(); i++) {

            String Number = arrayFlights.get(i).getFlightNumber();
            String fromCity = arrayFlights.get(i).getFcity();
            
            String Depart = arrayFlights.get(i).getDpartDate() +" "+arrayFlights.get(i).getDpartTime();
            
            String toCity = arrayFlights.get(i).getDcity();
            String Arrival =arrayFlights.get(i).getArriveDate() +" "+arrayFlights.get(i).getArriveTime();
            //String description = item.get(i).getType();

            String[] row = {Number,fromCity, Depart,toCity, Arrival};
            model.addRow(row);

        }
        jTable1.setModel(model);
    }//GEN-LAST:event_formWindowOpened

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        bookingFlightsForm.txtFNumber.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0) + "");
        bookingFlightsForm.txtFightInfo.setText("From:\n"+jTable1.getValueAt(jTable1.getSelectedRow(), 1) + "\n"+jTable1.getValueAt(jTable1.getSelectedRow(), 2) + "\nTo: \n"+jTable1.getValueAt(jTable1.getSelectedRow(), 3) + "\n" +jTable1.getValueAt(jTable1.getSelectedRow(), 4) + "\n");
        bookingFlightsForm.ava(jTable1.getValueAt(jTable1.getSelectedRow(), 0) + "");
        bookingFlightsForm.show();
        dispose();
    }//GEN-LAST:event_btnEditActionPerformed

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
            java.util.logging.Logger.getLogger(TbFlights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TbFlights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TbFlights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TbFlights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TbFlights().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
