/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PaqueteFacturas;

import javax.swing.JOptionPane;

/**
 *
 * @author MARTHA
 */
public class AgregarPapeleria extends javax.swing.JFrame {

    /**
     * Creates new form AgregarPapeleria
     */
    public AgregarPapeleria() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CajaSeccion = new javax.swing.JTextField();
        CajaProducto = new javax.swing.JTextField();
        CajaImportado = new javax.swing.JTextField();
        CajaMarca = new javax.swing.JTextField();
        CajaPrecio = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar Producto Papeleria");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 386, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Seccion:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 47, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Producto:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 85, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Marca:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 123, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Importado:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 154, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Precio:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 196, -1, -1));
        getContentPane().add(CajaSeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 47, 163, -1));
        getContentPane().add(CajaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 85, 163, -1));
        getContentPane().add(CajaImportado, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 154, 162, -1));
        getContentPane().add(CajaMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 123, 160, -1));

        CajaPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaPrecioActionPerformed(evt);
            }
        });
        getContentPane().add(CajaPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 196, 160, -1));

        jButton1.setText("Agregar Producto");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CajaPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CajaPrecioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        VentanaSeccionPapeleria seccionP = new VentanaSeccionPapeleria();
        
        dispose();
        
        seccionP.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        
        ArchivoPapelera ArchPapelera = new ArchivoPapelera();
        
            ArchPapelera.crearArchivoPapeleria();
        
            String seccion,producto,marca,importado,precio;
            //Obtenemos los datos de las cajas de texto
        
            seccion = CajaSeccion.getText();
            producto = CajaProducto.getText();
            marca = CajaMarca.getText();
            importado = CajaImportado.getText();
            precio = CajaPrecio.getText();
        
            //Creamos un objeto de la clase "ClaseFerreteria"
        
            ClasePapeleria ObjPapeleria = new ClasePapeleria(seccion,producto,marca,importado,precio);
        
            //escribimos los datos del nuevo producto en nuestro archivo de texto
        
            ArchPapelera.escribirTexto(ObjPapeleria);
        
            JOptionPane.showMessageDialog(null, "Producto Agregado");
            CajaSeccion.setText("");
            CajaProducto.setText("");
            CajaMarca.setText("");
            CajaImportado.setText("");
            CajaPrecio.setText("");
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarPapeleria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarPapeleria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarPapeleria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarPapeleria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarPapeleria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CajaImportado;
    private javax.swing.JTextField CajaMarca;
    private javax.swing.JTextField CajaPrecio;
    private javax.swing.JTextField CajaProducto;
    private javax.swing.JTextField CajaSeccion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
