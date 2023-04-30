/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package biblioteca_v2;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author vanes
 */

public class frm_agregarLibro extends javax.swing.JFrame {

    public static LinkedList contenedorLibros = new LinkedList();
    public int buscar;
    
    public frm_agregarLibro() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        btn_menu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_idLibro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_libro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_autor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_editorial = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_edicion = new javax.swing.JTextField();
        txt_cantidad = new javax.swing.JTextField();
        btn_tabla = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        jdate_fecha = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulario agregar libros");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_menu.setText("Menu");
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });
        jPanel1.add(btn_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel1.setText("Id");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        txt_idLibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_idLibroKeyTyped(evt);
            }
        });
        jPanel1.add(txt_idLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 79, 30));

        jLabel2.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel2.setText("Libro");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));
        jPanel1.add(txt_libro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 172, 240, 30));

        jLabel3.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel3.setText("Autor");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));
        jPanel1.add(txt_autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 240, 30));

        jLabel4.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel4.setText("Editorial");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));
        jPanel1.add(txt_editorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 240, 30));

        jLabel5.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel5.setText("Edicion");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel6.setText("Fecha");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel7.setText("Cantidad");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, -1));
        jPanel1.add(txt_edicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 230, 30));
        jPanel1.add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 230, 30));

        btn_tabla.setText("Mostrar datos");
        btn_tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btn_tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 347, 34));

        btn_guardar.setText("Guardar");
        btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 90, 33));

        btn_eliminar.setText("Eliminar");
        btn_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 91, 33));

        btn_modificar.setText("Modificar");
        btn_modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 93, 33));
        jPanel1.add(jdate_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 230, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // Boton guardar libro
        String id=txt_idLibro.getText();
        String libro=txt_libro.getText();
        String autor=txt_autor.getText();
        String editorial=txt_editorial.getText();
        String ediccion=txt_edicion.getText();
        String fecha=((JTextField)jdate_fecha.getDateEditor().getUiComponent()).getText();
        int cantidad=Integer.parseInt(txt_cantidad.getText());
        
        
       class_libro libros = new class_libro(id, libro, autor, editorial, ediccion, fecha, cantidad);
       contenedorLibros.add(libros);
        
        JOptionPane.showMessageDialog(null, "Auto registrado y guardado exitosamente");
        
        txt_idLibro.setText("");
        txt_libro.setText("");
        txt_autor.setText("");
        txt_editorial.setText("");
        txt_edicion.setText("");
        jdate_fecha.setCalendar(null);
        txt_cantidad.setText("");
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void txt_idLibroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idLibroKeyTyped
        // Codigo para buscar los datos
        int press=evt.getKeyChar();
        if(press==10){
            String idEncontrado=txt_idLibro.getText().trim();
            class_libro libro;
            for(int i = 0; i < contenedorLibros.size(); i++){
                libro=(class_libro)contenedorLibros.get(i);
                if(idEncontrado.equalsIgnoreCase(libro.getId_libro())){
                    txt_libro.setText(libro.getLibro());
                    txt_autor.setText(libro.getAutor());
                    txt_editorial.setText(libro.getEditorial());
                    txt_edicion.setText(libro.getEdicion());
                    buscar=i;
                    break;
                    
                }//Fin if
                    
            }//fin for
            
        }//Fin if
        
        
        
    }//GEN-LAST:event_txt_idLibroKeyTyped

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        // Boton modificar
         String id=txt_idLibro.getText();
        String libro=txt_libro.getText();
        String autor=txt_autor.getText();
        String editorial=txt_editorial.getText();
        String ediccion=txt_edicion.getText();
         String fecha=((JTextField)jdate_fecha.getDateEditor().getUiComponent()).getText();
        int cantidad=Integer.parseInt(txt_cantidad.getText());
        
        
        class_libro libros = new class_libro(id, libro, autor, editorial, ediccion, fecha, cantidad);
        contenedorLibros.set(buscar, libros);
        
        JOptionPane.showMessageDialog(null, "Datos de libro modificados");
        
        txt_idLibro.setText("");
        txt_libro.setText("");
        txt_editorial.setText("");
        txt_edicion.setText("");
        jdate_fecha.setCalendar(null);
        txt_cantidad.setText("");
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        //Boton para borrar los datos
         contenedorLibros.remove(buscar);
         txt_idLibro.setText("");
         txt_libro.setText("");
         txt_autor.setText("");
         txt_editorial.setText("");
         txt_edicion.setText("");
         jdate_fecha.setCalendar(null);
         txt_cantidad.setText("");
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
        // Boton menu
        
    }//GEN-LAST:event_btn_menuActionPerformed

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
            java.util.logging.Logger.getLogger(frm_agregarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_agregarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_agregarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_agregarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_agregarLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_menu;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_tabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser jdate_fecha;
    private javax.swing.JTextField txt_autor;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_edicion;
    private javax.swing.JTextField txt_editorial;
    private javax.swing.JTextField txt_idLibro;
    private javax.swing.JTextField txt_libro;
    // End of variables declaration//GEN-END:variables
}
