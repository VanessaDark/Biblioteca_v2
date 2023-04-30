/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package biblioteca_v2;

import java.util.LinkedList;
import javax.swing.JTextField;

/**
 *
 * @author vanes
 */
public class frm_prestamo extends javax.swing.JFrame {

    public static LinkedList contenedorPrestamos = new LinkedList();
    public int buscar;
    
    public frm_prestamo() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_idPrestamo = new javax.swing.JTextField();
        jdate_inicio = new com.toedter.calendar.JDateChooser();
        jdate_devolucion = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        txt_IdUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_idLibro = new javax.swing.JTextField();
        txt_libro = new javax.swing.JTextField();
        txt_autor = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_tablaPrestamos = new javax.swing.JButton();
        brn_guardar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prestamo de libros");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Menu");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel1.setText("Id prestamo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        jLabel2.setText("fecha de inicio");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        jLabel3.setText("Fecha de devolucion");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));
        jPanel1.add(txt_idPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 80, 30));
        jPanel1.add(jdate_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 170, -1));
        jPanel1.add(jdate_devolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 170, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(txt_IdUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 80, -1));

        jLabel4.setText("id usuario");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel6.setText("Nombre");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));
        jPanel2.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 160, -1));

        jLabel9.setText("Telefono");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel10.setText("Correo");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel11.setText("Direccion");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));
        jPanel2.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 160, -1));
        jPanel2.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 160, -1));
        jPanel2.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 160, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 360, 250));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Id libro");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, -1));

        jLabel12.setText("Id libro");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel13.setText("Libro");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 40, -1));

        jLabel14.setText("Autor");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));
        jPanel3.add(txt_idLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 80, -1));
        jPanel3.add(txt_libro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 160, -1));
        jPanel3.add(txt_autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 160, -1));

        jLabel16.setText("Cantidad");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));
        jPanel3.add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 160, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 320, 250));

        jLabel7.setText("Datos de usuario");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        jLabel8.setText("Datos del libro");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 690, 20));

        btn_tablaPrestamos.setText("Mostrar prestamos");
        jPanel1.add(btn_tablaPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 570, 320, -1));

        brn_guardar.setText("Guardar");
        brn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brn_guardarActionPerformed(evt);
            }
        });
        jPanel1.add(brn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, -1, -1));

        btn_modificar.setText("Modificar");
        jPanel1.add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, -1, -1));

        btn_eliminar.setText("Eliminar");
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, -1, -1));

        jLabel15.setText("Prestamo de libros");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 26, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void brn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brn_guardarActionPerformed
        // Boton guardar
       String idPrestamo = txt_idPrestamo.getText();
       String fechaInicio=((JTextField)jdate_inicio.getDateEditor().getUiComponent()).getText();
       String fechaDevolucion=((JTextField)jdate_devolucion.getDateEditor().getUiComponent()).getText();
       
       String idUsuario= txt_IdUsuario.getText();
       String nombre=txt_nombre.getText();
       int telefono=Integer.parseInt(txt_telefono.getText());
       String correo=txt_correo.getText();
       String direccion=txt_direccion.getText();
       
       String IdLibro=txt_idLibro.getText();
       String libro=txt_libro.getText();
       String autor=txt_autor.getText();
       int cantidad=Integer.parseInt(txt_cantidad.getText());
       
       class_usuario prestamoUsuario=new class_usuario(IdLibro, libro, autor, idUsuario, nombre, telefono, correo, direccion, idPrestamo, fechaInicio, fechaDevolucion);
       contenedorPrestamos.add(prestamoUsuario);
       
       //Al registrar los datos los campos se vacian
       //Datos del prestamos
       txt_idPrestamo.setText("");
       jdate_inicio.setCalendar(null);
       jdate_devolucion.setCalendar(null);
       //campos del usuario
       txt_IdUsuario.setText("");
       txt_nombre.setText("");
       txt_telefono.setText("");
       txt_correo.setText("");
       txt_direccion.setText("");
       //campos del libro
       txt_idLibro.setText("");
       txt_libro.setText("");
       txt_autor.setText("");
       txt_cantidad.setText("");
          
        
    }//GEN-LAST:event_brn_guardarActionPerformed

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
            java.util.logging.Logger.getLogger(frm_prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_prestamo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brn_guardar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_tablaPrestamos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private com.toedter.calendar.JDateChooser jdate_devolucion;
    private com.toedter.calendar.JDateChooser jdate_inicio;
    private javax.swing.JTextField txt_IdUsuario;
    private javax.swing.JTextField txt_autor;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_idLibro;
    private javax.swing.JTextField txt_idPrestamo;
    private javax.swing.JTextField txt_libro;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
