/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package biblioteca_v2;


import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;


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
    
    public void validar(){
        
        if(txt_idLibro.getText().isEmpty()){
            txt_idLibro.setBackground(new Color(251, 197, 197));
        }else{
              txt_idLibro.setBackground(new Color(224, 251, 197));
        }
        
        if(txt_libro.getText().isEmpty()){
         txt_libro.setBackground(new Color(251, 197, 197));
        }else{
              txt_libro.setBackground(new Color(224, 251, 197));
        }
        
        if(txt_autor.getText().isEmpty()){
         txt_autor.setBackground(new Color(251, 197, 197));
        }else{
              txt_autor.setBackground(new Color(224, 251, 197));
        }
        
        if(txt_editorial.getText().isEmpty()){
         txt_editorial.setBackground(new Color(251, 197, 197));
        }else{
              txt_editorial.setBackground(new Color(224, 251, 197));
        }
        
        if(txt_edicion.getText().isEmpty()){
         txt_edicion.setBackground(new Color(251, 197, 197));
        }else{
              txt_edicion.setBackground(new Color(224, 251, 197));
        }
        if(txt_cantidad.getText().isEmpty()){
         txt_cantidad.setBackground(new Color(251, 197, 197));
        }else{
              txt_cantidad.setBackground(new Color(224, 251, 197));
        }
        
         if(txt_idLibro.getText().isEmpty() || txt_libro.getText().isEmpty() || txt_autor.getText().isEmpty() || txt_editorial.getText().isEmpty() || 
                 txt_edicion.getText().isEmpty() || txt_cantidad.getText().isEmpty()){
             
             btn_guardar.setEnabled(false);
         }else{
             btn_guardar.setEnabled(true);
         }
    }
    
    //Metodo para generar QR
    public void QR(){
        
        String id=txt_idLibro.getText().trim();
        String libro=txt_libro.getText().trim();
        String autor=txt_autor.getText().trim();
        String editorial=txt_editorial.getText().trim();
        String ediccion=txt_edicion.getText().trim();
        String fecha=((JTextField)jdate_fecha.getDateEditor().getUiComponent()).getText().trim();
        int cantidad=Integer.parseInt(txt_cantidad.getText());
        
        int size = 1000;
        String FileType = "png";
        
        // Elegir la ruta de la imagen
        String filePath = "";
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            filePath = chooser.getSelectedFile().getAbsolutePath();
        }

        // Generar el nombre
        UUID uuid = UUID.randomUUID();
        String randonName = uuid.toString();

        // Generar el QR 
        QRCodeWriter qrcode = new QRCodeWriter();
        try {
            BitMatrix matrix = qrcode.encode("\nID: "+id +"\nLibro: "+ libro+"\nAutor: "+autor+"\nEditorial: "+editorial+"\nEdicion: "+ediccion+"\nFecha: "+fecha+"\nCantidad: "+cantidad, BarcodeFormat.QR_CODE, size, size);
            File f = new File(filePath + "/" + randonName + "." + FileType);
            int matrixWidth = matrix.getWidth();
            BufferedImage image = new BufferedImage(matrixWidth, matrixWidth, BufferedImage.TYPE_INT_RGB);
            image.createGraphics();

            Graphics2D gd = (Graphics2D) image.getGraphics();
            gd.setColor(Color.WHITE); // Fondo
            gd.fillRect(0, 0, size, size);
            gd.setColor(Color.black); // Qr

            for (int b = 0; b < matrixWidth; b++) {
                for (int j = 0; j < matrixWidth; j++) {
                    if (matrix.get(b, j)) {
                        gd.fillRect(b, j, 1, 1);
                    }
                }
            }
            
            // Mostrar la imagen generada
            ImageIO.write(image, FileType, f);
            Image mImagen = new ImageIcon(filePath + "/" + randonName + "." + FileType).getImage();
            ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(lblQr.getWidth(), lblQr.getHeight(), 0));
            lblQr.setIcon(mIcono);
            
        } catch (WriterException ex) {
            Logger.getLogger(frm_agregarLibro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(frm_agregarLibro.class.getName()).log(Level.SEVERE, null, ex);
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
        btn_tabla = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        jdate_fecha = new com.toedter.calendar.JDateChooser();
        lblQr = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulario agregar libros");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_menu.setBackground(new java.awt.Color(98, 84, 56));
        btn_menu.setForeground(new java.awt.Color(255, 255, 255));
        btn_menu.setText("Menu");
        btn_menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_menuMouseExited(evt);
            }
        });
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });
        jPanel1.add(btn_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 90, 30));

        jLabel1.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setText("Id");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        txt_idLibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_idLibroKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_idLibroKeyTyped(evt);
            }
        });
        jPanel1.add(txt_idLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 79, 30));

        jLabel2.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 204));
        jLabel2.setText("Libro");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        txt_libro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_libroKeyReleased(evt);
            }
        });
        jPanel1.add(txt_libro, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 220, 30));

        jLabel3.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 204));
        jLabel3.setText("Autor");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        txt_autor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_autorKeyReleased(evt);
            }
        });
        jPanel1.add(txt_autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 220, 30));

        jLabel4.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 204));
        jLabel4.setText("Editorial");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        txt_editorial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_editorialKeyReleased(evt);
            }
        });
        jPanel1.add(txt_editorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 220, 30));

        jLabel5.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 204));
        jLabel5.setText("Edicion");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 204));
        jLabel6.setText("Fecha");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 204));
        jLabel7.setText("Cantidad");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, -1));

        txt_edicion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_edicionKeyReleased(evt);
            }
        });
        jPanel1.add(txt_edicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 170, 30));

        btn_tabla.setBackground(new java.awt.Color(85, 151, 96));
        btn_tabla.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btn_tabla.setForeground(new java.awt.Color(102, 0, 102));
        btn_tabla.setText("Mostrar datos");
        btn_tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_tablaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_tablaMouseExited(evt);
            }
        });
        btn_tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tablaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 360, 34));

        btn_guardar.setBackground(new java.awt.Color(85, 151, 96));
        btn_guardar.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btn_guardar.setForeground(new java.awt.Color(102, 0, 102));
        btn_guardar.setText("Guardar");
        btn_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_guardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_guardarMouseExited(evt);
            }
        });
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 100, 33));

        btn_eliminar.setBackground(new java.awt.Color(85, 151, 96));
        btn_eliminar.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(102, 0, 102));
        btn_eliminar.setText("Eliminar");
        btn_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_eliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_eliminarMouseExited(evt);
            }
        });
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 100, 33));

        btn_modificar.setBackground(new java.awt.Color(85, 151, 96));
        btn_modificar.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btn_modificar.setForeground(new java.awt.Color(102, 0, 102));
        btn_modificar.setText("Modificar");
        btn_modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_modificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_modificarMouseExited(evt);
            }
        });
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, -1, 33));

        jdate_fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jdate_fechaKeyReleased(evt);
            }
        });
        jPanel1.add(jdate_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 170, 30));

        lblQr.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblQr, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, 380, 280));

        txt_cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cantidadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cantidadKeyTyped(evt);
            }
        });
        jPanel1.add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 150, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fagregar.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1177, javax.swing.GroupLayout.PREFERRED_SIZE)
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
       JOptionPane.showMessageDialog(null, "Elija la ruta para guardar el QR");
        QR();
       JOptionPane.showMessageDialog(null, "Datos de libro registrado");
     
       
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
                    ((JTextField)jdate_fecha.getDateEditor().getUiComponent()).setText(libro.getFecha());
                    txt_cantidad.setText(Integer.toString(libro.getCantidad()));
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
        
        JOptionPane.showMessageDialog(null, "Elija la ruta para guardar el QR");
        QR();
       
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
         JOptionPane.showMessageDialog(null, "Datos del libro eliminados");
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
        Menu abrir=new Menu();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_menuActionPerformed

    private void btn_tablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tablaActionPerformed
        // Boton mostrar tabla
        csl_libros abrir=new csl_libros();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_tablaActionPerformed

    private void txt_idLibroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idLibroKeyReleased
        // TODO add your handling code here:
        validar();
    }//GEN-LAST:event_txt_idLibroKeyReleased

    private void txt_libroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_libroKeyReleased
        // TODO add your handling code here:
        validar();
    }//GEN-LAST:event_txt_libroKeyReleased

    private void txt_autorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_autorKeyReleased
        // TODO add your handling code here:
        validar();
    }//GEN-LAST:event_txt_autorKeyReleased

    private void txt_editorialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_editorialKeyReleased
        // TODO add your handling code here:
        validar();
    }//GEN-LAST:event_txt_editorialKeyReleased

    private void txt_edicionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_edicionKeyReleased
        // TODO add your handling code here:
        validar();
    }//GEN-LAST:event_txt_edicionKeyReleased

    private void jdate_fechaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jdate_fechaKeyReleased
        // TODO add your handling code here:
        validar();
    }//GEN-LAST:event_jdate_fechaKeyReleased

    private void btn_menuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_menuMouseEntered
        // TODO add your handling code here:
        btn_menu.setBackground(new Color(151,129,85));
    }//GEN-LAST:event_btn_menuMouseEntered

    private void btn_menuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_menuMouseExited
        // TODO add your handling code here:
         btn_menu.setBackground(new Color(98,84,56));
    }//GEN-LAST:event_btn_menuMouseExited

    private void btn_guardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarMouseEntered
        // TODO add your handling code here:
        btn_guardar.setBackground(new Color(85, 151, 96));
    }//GEN-LAST:event_btn_guardarMouseEntered

    private void btn_guardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarMouseExited
        // TODO add your handling code here:
         btn_guardar.setBackground(new Color(107, 151, 85));
    }//GEN-LAST:event_btn_guardarMouseExited

    private void btn_modificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificarMouseEntered
        // TODO add your handling code here:
        btn_modificar.setBackground(new Color(85, 151, 96));
    }//GEN-LAST:event_btn_modificarMouseEntered

    private void btn_modificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_modificarMouseExited
        // TODO add your handling code here:
        btn_modificar.setBackground(new Color(107, 151, 85));
    }//GEN-LAST:event_btn_modificarMouseExited

    private void btn_eliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseEntered
        // TODO add your handling code here:
        btn_eliminar.setBackground(new Color(85, 151, 96));
    }//GEN-LAST:event_btn_eliminarMouseEntered

    private void btn_eliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseExited
        // TODO add your handling code here:
        btn_eliminar.setBackground(new Color(107, 151, 85));
    }//GEN-LAST:event_btn_eliminarMouseExited

    private void btn_tablaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tablaMouseEntered
        // TODO add your handling code here:
         btn_tabla.setBackground(new Color(85, 151, 96));
    }//GEN-LAST:event_btn_tablaMouseEntered

    private void btn_tablaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tablaMouseExited
        // TODO add your handling code here:
         btn_tabla.setBackground(new Color(107, 151, 85));
    }//GEN-LAST:event_btn_tablaMouseExited

    private void txt_cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cantidadKeyTyped
        // TODO add your handling code here:
         char validar=evt.getKeyChar();
        
        if(Character.isLetter((validar))){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo numeros");
        }
    }//GEN-LAST:event_txt_cantidadKeyTyped

    private void txt_cantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cantidadKeyReleased
        // TODO add your handling code here:
        validar();
    }//GEN-LAST:event_txt_cantidadKeyReleased

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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser jdate_fecha;
    private javax.swing.JLabel lblQr;
    private javax.swing.JTextField txt_autor;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_edicion;
    private javax.swing.JTextField txt_editorial;
    private javax.swing.JTextField txt_idLibro;
    private javax.swing.JTextField txt_libro;
    // End of variables declaration//GEN-END:variables
}
