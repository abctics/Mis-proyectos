/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTAS;

import javax.swing.JOptionPane;



public class FormHabitaciones extends javax.swing.JInternalFrame {

    

    //PARA La PRIMERA HABITACION
    public static String codigo0 = "H1";
    public static String piso0 = "";
    public static String descripcion0 = "";
    public static Double precio0=0.0;
    
    
    
     //PARA La 2DA HABITACION
    public static String codigo1 = "H2";
    public static String piso1 = "2";
    public static String descripcion1 = "Habitación para pareja";
    public static Double precio1=21.3;
    
     //PARA La 3RA HABITACION
    public static String codigo2 = "H3";
    public static String piso2 = "3";
    public static String descripcion2 = "Habitación pareja con hijos";
    public static Double precio2=32.1;
    
     //PARA La 4TA HABITACION
    public static String codigo3 = "H4";
    public static String piso3= "4";
    public static String descripcion3 = "Habitación baño compartido";
    public static Double precio3=123.3;
   
   
    

    
    public FormHabitaciones() { // inicia los componentes
        initComponents();

  

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Txt_Piso = new javax.swing.JTextField();
        Btn_Nuevo = new javax.swing.JButton();
        Btn_Guardar = new javax.swing.JButton();
        Btn_Cancelar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Txt_Descripcion = new javax.swing.JTextField();
        Txt_Precio = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cb_codigo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Mantenimiento de Habitaciones");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de habitaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Piso");

        Txt_Piso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_PisoActionPerformed(evt);
            }
        });

        Btn_Nuevo.setBackground(new java.awt.Color(0, 204, 204));
        Btn_Nuevo.setForeground(new java.awt.Color(0, 0, 204));
        Btn_Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Nuevo.png"))); // NOI18N
        Btn_Nuevo.setText("Limpiar");
        Btn_Nuevo.setDoubleBuffered(true);
        Btn_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_NuevoActionPerformed(evt);
            }
        });

        Btn_Guardar.setBackground(new java.awt.Color(0, 204, 204));
        Btn_Guardar.setForeground(new java.awt.Color(0, 0, 204));
        Btn_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Agregar.png"))); // NOI18N
        Btn_Guardar.setText("Guardar");
        Btn_Guardar.setDoubleBuffered(true);
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });

        Btn_Cancelar.setBackground(new java.awt.Color(0, 204, 204));
        Btn_Cancelar.setForeground(new java.awt.Color(0, 0, 204));
        Btn_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Cancelar.png"))); // NOI18N
        Btn_Cancelar.setText("Salir");
        Btn_Cancelar.setDoubleBuffered(true);
        Btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CancelarActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Decripción");

        Txt_Descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_DescripcionActionPerformed(evt);
            }
        });

        Txt_Precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_PrecioActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Precio ");

        cb_codigo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "H1", "H2", "H3", "H4" }));
        cb_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_codigoActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Código");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cb_codigo, 0, 190, Short.MAX_VALUE)
                        .addComponent(Txt_Piso)
                        .addComponent(Txt_Descripcion)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Btn_Nuevo)
                .addGap(55, 55, 55)
                .addComponent(Btn_Guardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(Btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Txt_Piso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Txt_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Txt_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Nuevo)
                    .addComponent(Btn_Guardar)
                    .addComponent(Btn_Cancelar))
                .addGap(243, 243, 243))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NuevoActionPerformed
        cb_codigo.setSelectedIndex(0);
        Txt_Descripcion.setText("");
        Txt_Piso.setText("");
        Txt_Precio.setText("");

    }//GEN-LAST:event_Btn_NuevoActionPerformed

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed
Grabar();
    }//GEN-LAST:event_Btn_GuardarActionPerformed

    private void Txt_PisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_PisoActionPerformed
    }//GEN-LAST:event_Txt_PisoActionPerformed

    private void Txt_DescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_DescripcionActionPerformed
    }//GEN-LAST:event_Txt_DescripcionActionPerformed

    private void Txt_PrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_PrecioActionPerformed

    }//GEN-LAST:event_Txt_PrecioActionPerformed

    private void cb_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_codigoActionPerformed
CargarDatosPred();

    }//GEN-LAST:event_cb_codigoActionPerformed

    private void Btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CancelarActionPerformed
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_CancelarActionPerformed

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
            java.util.logging.Logger.getLogger(FormHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormHabitaciones().setVisible(true);
            }
        });
    }
    
     private void Grabar() {
        modificarDatos();
    }
     

    void modificarDatos() {
        String piso;
        String descripcion;
        double precio;
        
        int modelos;

        try {
            piso = Txt_Piso.getText();
            descripcion = Txt_Descripcion.getText();
            precio = Double.parseDouble(Txt_Precio.getText()) ;          
            modelos = cb_codigo.getSelectedIndex();
            switch (modelos) {
                case 0:
                    Txt_Piso.setText("");
                    Txt_Descripcion.setText("");
                    Txt_Precio.setText("");
                   
                  break;
                case 1:
                    piso0 = piso;
                    descripcion0 = descripcion;
                    precio0 = precio;
                   
                    break;
                case 2:
                    piso1 = piso;
                    descripcion1 = descripcion;
                    precio1 = precio;
                    break;
                case 3:
                   piso2 = piso;
                    descripcion2 = descripcion;
                    precio2 = precio;
                    break;
                default:
                  piso3 = piso;
                    descripcion3 = descripcion;
                    precio3 = precio;
                    break;
            }
        JOptionPane.showMessageDialog(this, "DATOS GUARDADOS CORECTAMENTE", "CONFIRMACIÓN", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OPCIÓN NO VALIDA","REVISE",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    
  
    
void CargarDatosPred() {
        int modelo;
        modelo = cb_codigo.getSelectedIndex();
        switch (modelo) {
            case 0:
                Txt_Piso.setText("");
                Txt_Descripcion.setText("");
                Txt_Precio.setText("");
                 
                    
                break;
            case 1:
                Txt_Piso.setText("" + piso0);
                Txt_Descripcion.setText("" + descripcion0);
                Txt_Precio.setText("" + precio0);               
                break;
            case 2:
                Txt_Piso.setText("" + piso1);
                Txt_Descripcion.setText("" + descripcion1);
                Txt_Precio.setText("" + precio1);   
                break;
            case 3:
              Txt_Piso.setText("" + piso2);
                Txt_Descripcion.setText("" + descripcion2);
                Txt_Precio.setText("" + precio2);   
                break;
            default:
                 Txt_Piso.setText("" + piso3);
                Txt_Descripcion.setText("" + descripcion3);
                Txt_Precio.setText("" + precio3);   
                break;

        }
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Cancelar;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JButton Btn_Nuevo;
    private javax.swing.JTextField Txt_Descripcion;
    private javax.swing.JTextField Txt_Piso;
    private javax.swing.JTextField Txt_Precio;
    private javax.swing.JComboBox<String> cb_codigo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
