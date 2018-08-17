/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTAS;

import javax.swing.JOptionPane;



public class FormClientes extends javax.swing.JInternalFrame {

    

    //PARA EL PRIMER CLIENTE
    public static String codigo0 = "C1";
    public static String nombre0 = "Alex";
    public static String apellidos0 = "Ordoñez Bustamante";
    public static int edad0=21;
    public static long dni0=73737272;
    
    //PARA EL PRIMER CLIENTE
    public static String codigo1 = "C2";
    public static String nombre1 = "Juan Gabriel";
    public static String apellidos1 = "Guerrero Fernandez";
    public static int edad1=22;
    public static long dni1=73737222;
    
   //PARA EL PRIMER CLIENTE
    public static String codigo2 = "C3";
    public static String nombre2 = "Dalmer";
    public static String apellidos2 = "Fernandez Vasquez";
    public static int edad2=19;
    public static long dni2=21337272;
    
   //PARA EL PRIMER CLIENTE
    public static String codigo3= "C4";
    public static String nombre3 = "Renato";
    public static String apellidos3 = "Rodriguez Sandoval";
    public static int edad3=40;
    public static long dni3=67565654;
    
     //PARA EL PRIMER CLIENTE
    public static String codigo5= "C5";
    public static String nombre5 = "";
    public static String apellidos5 = "";
    public static int edad5=0;
    public static long dni5=0;
   
   
    

    
    public FormClientes() { // inicia los componentes
        initComponents();

  

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Txt_Nombres = new javax.swing.JTextField();
        Btn_Guardar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Txt_Apellidos = new javax.swing.JTextField();
        Txt_Edad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cb_codigo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Txt_DNI = new javax.swing.JTextField();
        Btn_Nuevo = new javax.swing.JButton();
        Btn_Cancelar = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Mantenimiento de Clientes");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nombre:");

        Txt_Nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_NombresActionPerformed(evt);
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

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Apellidos:");

        Txt_Apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_ApellidosActionPerformed(evt);
            }
        });

        Txt_Edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_EdadActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Edad:");

        cb_codigo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "C1", "C2", "C3", "C4", "C5" }));
        cb_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_codigoActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Código");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("DNI");

        Txt_DNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_DNIActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cb_codigo, 0, 190, Short.MAX_VALUE)
                                    .addComponent(Txt_Nombres)
                                    .addComponent(Txt_Apellidos)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Txt_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(61, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Btn_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btn_Guardar)
                .addGap(18, 18, 18)
                .addComponent(Btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(Txt_Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Txt_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Txt_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Txt_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Nuevo)
                    .addComponent(Btn_Guardar)
                    .addComponent(Btn_Cancelar))
                .addGap(171, 171, 171))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed
modificarDatos();
    }//GEN-LAST:event_Btn_GuardarActionPerformed

    private void Txt_NombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_NombresActionPerformed
    }//GEN-LAST:event_Txt_NombresActionPerformed

    private void Txt_ApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_ApellidosActionPerformed
    }//GEN-LAST:event_Txt_ApellidosActionPerformed

    private void Txt_EdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_EdadActionPerformed

    }//GEN-LAST:event_Txt_EdadActionPerformed

    private void cb_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_codigoActionPerformed
CargarDatosPred();

    }//GEN-LAST:event_cb_codigoActionPerformed

    private void Txt_DNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_DNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_DNIActionPerformed

    private void Btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NuevoActionPerformed
        cb_codigo.setSelectedIndex(0);
        Txt_Nombres.setText("");
        Txt_Apellidos.setText("");
        Txt_Edad.setText("");
        Txt_DNI.setText("");
    }//GEN-LAST:event_Btn_NuevoActionPerformed

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
            java.util.logging.Logger.getLogger(FormClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormClientes().setVisible(true);
            }
        });
    }
    


    void modificarDatos() {
        String nombre;
        String apellidos;
        int edad;
        long dni;
        
        int modelos;

        try {
            nombre = Txt_Nombres.getText();
            apellidos = Txt_Apellidos.getText();
            edad = Integer.parseInt(Txt_Edad.getText()) ;          
            dni = Integer.parseInt(Txt_DNI.getText()) ;          
            modelos = cb_codigo.getSelectedIndex();
            switch (modelos) {
                case 0:
                    Txt_Nombres.setText("");
                    Txt_Apellidos.setText("");
                    Txt_Edad.setText("");
                    Txt_DNI.setText("");
                   
                  break;
                case 1:
                    nombre0 = nombre;
                    apellidos0 = apellidos;
                    edad0 = edad;
                    dni0=dni;
                   
                    break;
                case 2:
                   nombre1 = nombre;
                   apellidos1 = apellidos;
                   edad1 = edad;
                   dni1=dni;
                    break;
                    
                case 3:
                  nombre2 = nombre;
                  apellidos2 = apellidos;
                  edad2 = edad;
                  dni2=dni;
                    
                    break;
                case 4:
                 nombre3 = nombre;
                 apellidos3 = apellidos;
                 edad3 = edad;
                 dni3=dni;
                 
                    break;
                default:

                 nombre5 = nombre;
                 apellidos5 = apellidos;
                 edad5 = edad;
                 dni5=dni;     
                    break;
            }
            mostrarConfirmacion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OPCIÓN NO VALIDA","REVISE",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void mostrarConfirmacion() {
        JOptionPane.showMessageDialog(this, "DATOS GUARDADOS CORECTAMENTE", "CONFIRMACIÓN", JOptionPane.INFORMATION_MESSAGE);
    }
void CargarDatosPred() {
        int modelo;
        modelo = cb_codigo.getSelectedIndex();
        switch (modelo) {
            case 0:
                Txt_Nombres.setText("");
                Txt_Apellidos.setText("");
                Txt_Edad.setText("");
                Txt_DNI.setText("");
                 
                    
                break;
            case 1:
                Txt_Nombres.setText("" + nombre0);
                Txt_Apellidos.setText("" + apellidos0);
                Txt_Edad.setText("" + edad0);               
                Txt_DNI.setText("" + dni0);               
                break;
            case 2:
                Txt_Nombres.setText("" + nombre1);
                Txt_Apellidos.setText("" + apellidos1);
                Txt_Edad.setText("" + edad1);               
                Txt_DNI.setText("" + dni1);       
                break;
            case 3:
                Txt_Nombres.setText("" + nombre2);
                Txt_Apellidos.setText("" + apellidos2);
                Txt_Edad.setText("" + edad2);               
                Txt_DNI.setText("" + dni2);         
                break;
            case 4:
                Txt_Nombres.setText("" + nombre3);
                Txt_Apellidos.setText("" + apellidos3);
                Txt_Edad.setText("" + edad3);               
                Txt_DNI.setText("" + dni3);                 
                
                break;
                
            default:
                Txt_Nombres.setText("" + nombre5);
                Txt_Apellidos.setText("" + apellidos5);
                Txt_Edad.setText("" + edad5);               
                Txt_DNI.setText("" + dni5);       
                break;

        }
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Cancelar;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JButton Btn_Nuevo;
    private javax.swing.JTextField Txt_Apellidos;
    private javax.swing.JTextField Txt_DNI;
    private javax.swing.JTextField Txt_Edad;
    private javax.swing.JTextField Txt_Nombres;
    private javax.swing.JComboBox<String> cb_codigo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
