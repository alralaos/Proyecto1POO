/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Objetos.ArchivosTXT;
import java.io.File;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import java.text.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Alcides
 */
public final class MostrarTabla extends javax.swing.JFrame {
    private DefaultTableModel model=new DefaultTableModel(); // variables donde se almacena informacion
    private String tabla=""; // variables donde se almacena informacion
    private File archivo;
   
    public MostrarTabla(boolean certificacion) {                
        if(certificacion){
            model.addColumn("Nombre"); // agrago una columna a la tabla
            model.addColumn("Codigo"); // agrago una columna a la tabla
            model.addColumn("Peso"); // agrago una columna a la tabla
            initComponents();   // envio de informacion para mostrar tabla desde un archivo de texto
            TablaCertificacion();
            archivo=new File("Certificaciones");
            TablaCertificacion();
        }else{
            model.addColumn("Nombre"); // agrago una columna a la tabla
            model.addColumn("Codigo"); // agrago una columna a la tabla
            model.addColumn("Certificaciones"); // agrago una columna a la tabla
            model.addColumn("Estado");
            initComponents();   // envio de informacion para mostrar tabla desde un archivo de texto
            archivo=new File("Certificaciones");
            TablaCertificador();
        }
    }
        
    private void TablaCertificacion(){ // metodo que crea la tabla de manera grafica
        ArchivosTXT archivo= new ArchivosTXT("certificaciones");                
        String info=archivo.leer();
        String inf[]=info.split("%");
        int cont=0;
        while(cont!=inf.length){
            String data[]=inf[cont].split("!");
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); // crear canal para poder agregar una fila a la tabla
            model.addRow(new Object[]{data[0],data[1],data[2]}); // asignacion de datos a cada casilla de la fila
            cont++;
        }
    }
    
    public void TablaCertificador(){        
        ArchivosTXT archivo= new ArchivosTXT("certificadores");                
        String info=archivo.leer();
        String inf[]=info.split("%");
        int cont=0;
        while(cont!=inf.length){
            String data[]=inf[cont].split("!");
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); // crear canal para poder agregar una fila a la tabla
            model.addRow(new Object[]{data[0],data[1],data[2],data[3]}); // asignacion de datos a cada casilla de la fila
            cont++;
        }
    }
    
//Convierte un numero en notacion cientifica a numero normal
    public String conversion(double valor){
      Locale.setDefault(Locale.US);
      DecimalFormat num = new DecimalFormat("#,###.00");
      return num.format(valor);
    }

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
            java.util.logging.Logger.getLogger(Contraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarTabla(true).setVisible(true);
            }
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane7 = new javax.swing.JScrollPane();
        jTable1 = new JTable(model);
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTable1.setAutoCreateColumnsFromModel(true);
        jTable1.setModel(model);
        jTable1.setEnabled(false);
        jScrollPane7.setViewportView(jTable1);

        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 978, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose(); // oculta la ventana actual
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane7;
    public javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
