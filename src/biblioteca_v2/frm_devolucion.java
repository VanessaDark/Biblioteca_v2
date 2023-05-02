/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package biblioteca_v2;

import com.toedter.calendar.JDateChooser;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author vanes
 */
public class frm_devolucion extends javax.swing.JFrame {

      public static LinkedList contenedorDevoluciones = new LinkedList();
      public int buscar;
      
    public frm_devolucion() {
        initComponents();
      
    }
    
    public void calculardias(JDateChooser fechainicio, JDateChooser fechatermino){
        if(fechainicio.getDate()!=null&&fechatermino.getDate()!=null){
            Calendar inicio=fechainicio.getCalendar();
            Calendar termino=fechatermino.getCalendar();
            int dias=-1;
            
            while(inicio.before(termino)|| inicio.equals(termino)){
                dias++;
                inicio.add(Calendar.DATE, 1);
            }
               txt_dias.setText(""+dias);
        }else{
        JOptionPane.showMessageDialog(null, "Seleccione los dias");
        }
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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_idUsuario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_idLibro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_libro = new javax.swing.JTextField();
        btn_tabla = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jdate_inicio = new com.toedter.calendar.JDateChooser();
        jdate_devolucion = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        txt_idDevolucion = new javax.swing.JTextField();
        txt_idPrestamo = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jdate_hoy = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        txt_dias = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Devoluciones");

        jPanel1.setBackground(new java.awt.Color(216, 249, 134));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Devoluciones");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        jButton1.setBackground(new java.awt.Color(168, 227, 218));
        jButton1.setText("Menu");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 70, 30));

        jLabel2.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jLabel2.setText("Id prestamo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jPanel2.setBackground(new java.awt.Color(134, 249, 167));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jLabel4.setText("id");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));
        jPanel2.add(txt_idUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 90, -1));

        jLabel9.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jLabel9.setText("Nombre");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));
        jPanel2.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 140, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 280, 200));

        jPanel3.setBackground(new java.awt.Color(159, 249, 134));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jLabel5.setText("Id");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));
        jPanel3.add(txt_idLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 98, -1));

        jLabel12.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jLabel12.setText("Libro");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));
        jPanel3.add(txt_libro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 130, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 320, 130));

        btn_tabla.setBackground(new java.awt.Color(168, 227, 218));
        btn_tabla.setText("Mostrar tabla");
        btn_tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tablaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, 320, 30));

        jLabel6.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jLabel6.setText("Fecha de prestamo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jLabel7.setText("Fecha devolucion");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));
        jPanel1.add(jdate_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 160, -1));
        jPanel1.add(jdate_devolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 160, -1));

        jLabel8.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jLabel8.setText("Id devolucion");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        txt_idDevolucion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_idDevolucionKeyTyped(evt);
            }
        });
        jPanel1.add(txt_idDevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 100, -1));

        txt_idPrestamo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_idPrestamoKeyTyped(evt);
            }
        });
        jPanel1.add(txt_idPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 100, -1));

        jButton3.setBackground(new java.awt.Color(168, 227, 218));
        jButton3.setText("Calcular");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 155, -1, 30));

        btn_guardar.setBackground(new java.awt.Color(168, 227, 218));
        btn_guardar.setText("Guardar");
        btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 495, 80, 30));

        btn_modificar.setBackground(new java.awt.Color(168, 227, 218));
        btn_modificar.setText("Modificar");
        btn_modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 495, -1, 30));

        btn_eliminar.setBackground(new java.awt.Color(168, 227, 218));
        btn_eliminar.setText("Eliminar");
        btn_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 495, -1, 30));

        jLabel11.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jLabel11.setText("Fecha de hoy");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, -1));
        jPanel1.add(jdate_hoy, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 160, -1));

        jLabel10.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        jLabel10.setText("Dias transcurridos de la fecha devolucion a la actual");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 300, 30));
        jPanel1.add(txt_dias, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 70, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 690, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        calculardias(jdate_devolucion, jdate_hoy);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_tablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tablaActionPerformed
        // TODO add your handling code here:
        csl_devoluciones abrir=new csl_devoluciones();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_tablaActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        // TODO add your handling code here:
        String idDevolucion=txt_idDevolucion.getText();
        String idPrestamo=txt_idPrestamo.getText();
        String idUsuario=txt_idUsuario.getText();
        String nombre=txt_nombre.getText();
        String idLibro=txt_idLibro.getText();
        String libro=txt_libro.getText();
        String fechaInicio=((JTextField)jdate_inicio.getDateEditor().getUiComponent()).getText();
        String fechaDevolucion=((JTextField)jdate_devolucion.getDateEditor().getUiComponent()).getText();
        String fechaHoy=((JTextField)jdate_hoy.getDateEditor().getUiComponent()).getText();
        
        
        class_usuario devolucion=new class_usuario(idDevolucion,idPrestamo, idUsuario, nombre, idLibro, libro, fechaInicio, fechaDevolucion, fechaHoy);
        contenedorDevoluciones.add(devolucion);
        
        JOptionPane.showMessageDialog(null, "Datos de devolucion guardados");
        
        txt_idDevolucion.setText("");
        txt_idPrestamo.setText("");
        txt_idUsuario.setText("");
        txt_nombre.setText("");
        txt_idLibro.setText("");
        txt_libro.setText("");
        jdate_inicio.setCalendar(null);
        jdate_devolucion.setCalendar(null);
        jdate_hoy.setCalendar(null);
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        contenedorDevoluciones.remove(buscar);
        txt_idDevolucion.setText("");
        txt_idPrestamo.setText("");
        txt_idUsuario.setText("");
        txt_nombre.setText("");
        txt_idLibro.setText("");
        txt_libro.setText("");
        jdate_inicio.setCalendar(null);
        jdate_devolucion.setCalendar(null);
        jdate_hoy.setCalendar(null);
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void txt_idPrestamoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idPrestamoKeyTyped
        // Busca el prestamo para llenar los campos
        int press=evt.getKeyChar();
        if(press==10){
            String idEncontrado=txt_idPrestamo.getText().trim();
            class_usuario usuario;
            for(int i = 0; i < frm_prestamo.contenedorPrestamos.size(); i++){
                usuario=(class_usuario)frm_prestamo.contenedorPrestamos.get(i);
                if(idEncontrado.equalsIgnoreCase(usuario.getId_Usuario())){
                    
                    ((JTextField)jdate_inicio.getDateEditor().getUiComponent()).setText(usuario.getFechaInicio());
                    ((JTextField)jdate_devolucion.getDateEditor().getUiComponent()).setText(usuario.getFechaDevolucion());
                    
                    txt_idUsuario.setText(usuario.getId_Usuario());
                    txt_nombre.setText(usuario.getNombre());
                    txt_idLibro.setText(usuario.getId_libro());
                    txt_libro.setText(usuario.getLibro());
                    buscar=i;
                    break;
                    
                }//Fin if
                    
            }//fin for
            
        }//Fin if
        
    }//GEN-LAST:event_txt_idPrestamoKeyTyped

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        
        String idDevolucion=txt_idDevolucion.getText();
        String idPrestamo=txt_idPrestamo.getText();
        String idUsuario=txt_idUsuario.getText();
        String nombre=txt_nombre.getText();
        String idLibro=txt_idLibro.getText();
        String libro=txt_libro.getText();
        String fechaInicio=((JTextField)jdate_inicio.getDateEditor().getUiComponent()).getText();
        String fechaDevolucion=((JTextField)jdate_devolucion.getDateEditor().getUiComponent()).getText();
        String fechaHoy=((JTextField)jdate_hoy.getDateEditor().getUiComponent()).getText();
        
        
        int dias=Integer.parseInt(txt_dias.getText());
   
        if(dias >0){
             double total=dias*5;
            JOptionPane.showMessageDialog(null, "Cobro por los dias que tardo en entregar el libro: $"+total);
        }
        
        class_usuario devolucion=new class_usuario(idDevolucion,idPrestamo, idUsuario, nombre, idLibro, libro, fechaInicio, fechaDevolucion, fechaHoy);
        contenedorDevoluciones.add(devolucion);
        
        JOptionPane.showMessageDialog(null, "Datos de devolucion guardados");
        
        frm_prestamo.contenedorPrestamos.remove(buscar);
        
        txt_idDevolucion.setText("");
        txt_idPrestamo.setText("");
        txt_idUsuario.setText("");
        txt_nombre.setText("");
        txt_idLibro.setText("");
        txt_libro.setText("");
        jdate_inicio.setCalendar(null);
        jdate_devolucion.setCalendar(null);
        jdate_hoy.setCalendar(null);
        
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void txt_idDevolucionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idDevolucionKeyTyped
        // TODO add your handling code here:
         int press=evt.getKeyChar();
        if(press==10){
            String idEncontrado=txt_idPrestamo.getText().trim();
            class_usuario usuario;
            for(int i = 0; i < contenedorDevoluciones.size(); i++){
                usuario=(class_usuario)contenedorDevoluciones.get(i);
                if(idEncontrado.equalsIgnoreCase(usuario.getId_Usuario())){
                    
                    ((JTextField)jdate_inicio.getDateEditor().getUiComponent()).setText(usuario.getFechaInicio());
                    ((JTextField)jdate_devolucion.getDateEditor().getUiComponent()).setText(usuario.getFechaDevolucion());
                    txt_idDevolucion.setText(usuario.getIdDevolucion());
                    txt_idPrestamo.setText(usuario.getId_prestamo());
                    txt_idUsuario.setText(usuario.getId_Usuario());
                    txt_nombre.setText(usuario.getNombre());
                    txt_idLibro.setText(usuario.getId_libro());
                    txt_libro.setText(usuario.getLibro());
                    ((JTextField)jdate_inicio.getDateEditor().getUiComponent()).setText(usuario.getFechaInicio());
                    ((JTextField)jdate_devolucion.getDateEditor().getUiComponent()).setText(usuario.getFechaDevolucion());
                    ((JTextField)jdate_hoy.getDateEditor().getUiComponent()).setText(usuario.getFechaHoy());
                    buscar=i;
                    break;
                    
                }//Fin if
                    
            }//fin for
            
        }//Fin if
    }//GEN-LAST:event_txt_idDevolucionKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Menu abrir=new Menu();
        abrir.setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(frm_devolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_devolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_devolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_devolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_devolucion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_tabla;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private com.toedter.calendar.JDateChooser jdate_hoy;
    private com.toedter.calendar.JDateChooser jdate_inicio;
    private javax.swing.JTextField txt_dias;
    private javax.swing.JTextField txt_idDevolucion;
    private javax.swing.JTextField txt_idLibro;
    private javax.swing.JTextField txt_idPrestamo;
    private javax.swing.JTextField txt_idUsuario;
    private javax.swing.JTextField txt_libro;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
