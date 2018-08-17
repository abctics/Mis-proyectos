/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTAS;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import javax.swing.JOptionPane;


public class FormReserva extends javax.swing.JInternalFrame {

    public FormReserva() { // inicia los componentes
        initComponents();
 txt_Regalo.setText(obs.obsequio);
 Habitacion.setEditable(false);
 Cliente.setEditable(false);
 Bandeja.setEditable(false);
Txt_Costo.setText("0");

//Para ocultar cajita de texto

txt_nombreCliente.setVisible(false);
txtApellidoCliente.setVisible(false);
txt_Regalo.setVisible(false);
txt_descripcionHabitacion.setVisible(false);

  
    }
    
     FormHabitaciones hab = new FormHabitaciones();//Encapsula 
     FormDescuento des = new FormDescuento();//Encapsula 
     FormObsequio obs = new FormObsequio();//Encapsula 
     FormClientes cli=new FormClientes();
     
     

public void limpiar(){
Txt_Codigo.setText("");
cb_Habitacion.setSelectedIndex(0);
cb_Cliente.setSelectedIndex(0);
CB_Reserva.setSelectedIndex(0);
CB_Estado.setSelectedIndex(0);
Txt_Trabajador.setText("");
Txt_Costo.setText("0");

}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CB_Reserva = new javax.swing.JComboBox();
        Btn_Guardar = new javax.swing.JButton();
        Btn_Cancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Txt_Trabajador = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        CB_Estado = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        Txt_FechaR = new javax.swing.JTextField();
        Txt_FechaI = new javax.swing.JTextField();
        Txt_FechaS = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Bandeja = new javax.swing.JTextArea();
        Txt_Codigo = new javax.swing.JTextField();
        cb_Habitacion = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        Txt_Costo = new javax.swing.JTextArea();
        txt_Regalo = new javax.swing.JTextField();
        cb_Cliente = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        Cliente = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        Habitacion = new javax.swing.JTextArea();
        Btn_Nuevo = new javax.swing.JButton();
        txt_nombreCliente = new javax.swing.JTextField();
        txtApellidoCliente = new javax.swing.JTextField();
        txt_descripcionHabitacion = new javax.swing.JTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Panel de reservas");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Reservas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Habitación");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Estado Reserva");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Tipo Reserva");

        CB_Reserva.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Reserva", "Alquiler" }));
        CB_Reserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_ReservaActionPerformed(evt);
            }
        });

        Btn_Guardar.setBackground(new java.awt.Color(0, 204, 204));
        Btn_Guardar.setForeground(new java.awt.Color(0, 0, 204));
        Btn_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/buy.png"))); // NOI18N
        Btn_Guardar.setText("vender");
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

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Cliente");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Trabajador");

        Txt_Trabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_TrabajadorActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Costo ");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Fecha Reserva");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Fecha Salida");

        CB_Estado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pagada", "Anulada" }));
        CB_Estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_EstadoActionPerformed(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Fecha Ingreso");

        Txt_FechaR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_FechaRActionPerformed(evt);
            }
        });

        Txt_FechaI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_FechaIActionPerformed(evt);
            }
        });

        Txt_FechaS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_FechaSActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Código de reserva");

        Bandeja.setColumns(20);
        Bandeja.setRows(5);
        jScrollPane1.setViewportView(Bandeja);

        Txt_Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_CodigoActionPerformed(evt);
            }
        });

        cb_Habitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "H1", "H2", "H3", "H4", " " }));
        cb_Habitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_HabitacionActionPerformed(evt);
            }
        });

        Txt_Costo.setColumns(20);
        Txt_Costo.setRows(5);
        jScrollPane3.setViewportView(Txt_Costo);

        txt_Regalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RegaloActionPerformed(evt);
            }
        });

        cb_Cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "C1", "C2", "C3", "C4", "C5" }));
        cb_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ClienteActionPerformed(evt);
            }
        });

        Cliente.setColumns(20);
        Cliente.setRows(5);
        jScrollPane4.setViewportView(Cliente);

        Habitacion.setColumns(20);
        Habitacion.setRows(5);
        jScrollPane5.setViewportView(Habitacion);

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

        txt_nombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreClienteActionPerformed(evt);
            }
        });

        txtApellidoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoClienteActionPerformed(evt);
            }
        });

        txt_descripcionHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_descripcionHabitacionActionPerformed(evt);
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
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Txt_FechaI, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                            .addComponent(Txt_FechaS)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(CB_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Btn_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(Btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Txt_Trabajador)
                                    .addComponent(CB_Reserva, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Txt_FechaR)
                                    .addComponent(cb_Habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(cb_Cliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Txt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(txt_Regalo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(txt_nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(txtApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(txt_descripcionHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(58, 58, 58))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Regalo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_descripcionHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_Habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cb_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Txt_Trabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CB_Reserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(Txt_FechaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(Txt_FechaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(Txt_FechaS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CB_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Cancelar)
                    .addComponent(Btn_Guardar)
                    .addComponent(Btn_Nuevo))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CB_ReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_ReservaActionPerformed
        CB_Reserva.transferFocus();
    }//GEN-LAST:event_CB_ReservaActionPerformed

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed
String codigo, habitacion,cliente,trabajador,TipoReserva,fechaR,fechaI,FechaS,estadoR,regalo;
String nombre_cliente="", apellido_cliente="", descripcion_habitacion;


double costo;
codigo=Txt_Codigo.getText();
habitacion=(String) cb_Habitacion.getSelectedItem();
cliente=(String) cb_Cliente.getSelectedItem();
trabajador=Txt_Trabajador.getText();
TipoReserva=(String) CB_Reserva.getSelectedItem();
fechaR=Txt_FechaR.getText();
fechaI=Txt_FechaI.getText();
FechaS=Txt_FechaS.getText();
estadoR=(String) CB_Estado.getSelectedItem();
costo=Double.parseDouble(Txt_Costo.getText().trim());
regalo=txt_Regalo.getText();
      
      
      //extra
 nombre_cliente=txt_nombreCliente.getText();
 apellido_cliente=txtApellidoCliente.getText();
 
 descripcion_habitacion=txt_descripcionHabitacion.getText();



        if (costo<=50) {
 costo=costo-costo*(des.precio0/100);           
        }
  if (costo>50 && costo<=70) {
 costo=costo-costo*(des.precio1/100);           
        }
   if (costo>70 && costo<=100) {
 costo=costo-costo*(des.precio2/100);           
        }
     if (costo>100) {
 costo=costo-costo*(des.precio3/100);           
        }

     //Configuracion del obsequio
        if (costo>=obs.precio) {
            regalo=regalo;
        }
        
        else if(costo<obs.precio){
        regalo="No hay obsequio";
        }



      if (cb_Habitacion.getSelectedItem()=="SELECCIONE") {
         JOptionPane.showMessageDialog(rootPane, "debes ingresar una habitación");

        }               
        else {
if (cb_Cliente.getSelectedItem()=="SELECCIONE") {
       JOptionPane.showMessageDialog(rootPane, "debes ingresar un cliente");
     
     }

else{            
            
                            
 Bandeja.append(" RESERVA DE HOTELES  \n\n");
 Bandeja.append("codigo Reserva :" + codigo + "\n"+"Código Habitación :" +habitacion+ "\n"+" Descripción Habitación: " +descripcion_habitacion+ "\n Cliente: "+cliente+"\n Nombre del cliente: "+nombre_cliente+" "+apellido_cliente+
 "\n Trabajador: "+trabajador+"\n Tipo de reserva :"+TipoReserva+"\n fecha Reserva:"+fechaR+"\n Fecha de Ingreso :"+fechaI+"\n Fecha de Salida :"+FechaS+"\n Estado Reserva :"+estadoR+"\n Costo Reserva :"+costo+"\n Regalo :"+regalo+"\n\n");
  Btn_Guardar.setEnabled(false);
 
      
}

     }
        
        
   
    }//GEN-LAST:event_Btn_GuardarActionPerformed

    private void Txt_TrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_TrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_TrabajadorActionPerformed

    private void CB_EstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_EstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_EstadoActionPerformed

    private void Txt_FechaRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_FechaRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_FechaRActionPerformed

    private void Txt_FechaIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_FechaIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_FechaIActionPerformed

    private void Txt_FechaSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_FechaSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_FechaSActionPerformed

    private void Txt_CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_CodigoActionPerformed

    private void Btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CancelarActionPerformed
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_CancelarActionPerformed

    private void cb_HabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_HabitacionActionPerformed

        
        if(cb_Habitacion.getSelectedItem()=="H1"){
      if(Habitacion.getText()=="" && Txt_Costo.getText()==""){ 
  
 Habitacion.append("HABITACIÓN"+"\n Piso :" +hab.piso0+ "\n Descripción: "+hab.descripcion0+"\n\n");
 Txt_Costo.append(""+hab.precio0);
 
        }
        else{
            Habitacion.setText("");
            Txt_Costo.setText("");
Habitacion.append("HABITACIÓN"+"\n Piso :"+hab.piso0+ "\n Descripción: "+hab.descripcion0+"\n\n");
 Txt_Costo.append(""+hab.precio0);            
        }     
        }

        
        
        else if(cb_Habitacion.getSelectedItem()=="H2"){
        if(Habitacion.getText()=="" && Txt_Costo.getText()==""){    
 Habitacion.append("HABITACIÓN"+"\n Piso :"+hab.piso1+ "\n Descripción: "+hab.descripcion1+"\n\n");
 Txt_Costo.append(""+hab.precio1);
 
        }
        else{
            Habitacion.setText("");
            Txt_Costo.setText("0");

Habitacion.append("HABITACIÓN"+"\n Piso :"+hab.piso1+ "\n Descripción: "+hab.descripcion1+"\n\n");
 Txt_Costo.append(""+hab.precio1);            
        }     
        }
        
        
      else  if(cb_Habitacion.getSelectedItem()=="H3"){
        if(Habitacion.getText()=="" && Txt_Costo.getText()==""){    
 Habitacion.append("HABITACIÓN"+"\n Piso :"+hab.piso2+ "\n Descripción: "+hab.descripcion2+"\n\n");
 Txt_Costo.append(""+hab.precio2);
 
        }
        else{
            Habitacion.setText("");
            Txt_Costo.setText("");            
Habitacion.append("HABITACIÓN"+"\n Piso :" +hab.piso2+ "\n Descripción: "+hab.descripcion2+"\n\n");
 Txt_Costo.append(""+hab.precio2);            
        }     
        }
        
        
        
      else  if(cb_Habitacion.getSelectedItem()=="H4"){
        if(Habitacion.getText()=="" && Txt_Costo.getText()==""){    
 Habitacion.append("HABITACIÓN"+"\n Piso :" +hab.piso3+ "\n Descripción: "+hab.descripcion3+"\n\n");
 Txt_Costo.append(""+hab.precio3);
 
        }
        else{
            Habitacion.setText("");
            Txt_Costo.setText("");            
Habitacion.append("HABITACIÓN"+"\n Piso :" +hab.piso3+ "\n Descripción: "+hab.descripcion3+"\n\n");
 Txt_Costo.append(""+hab.precio3);            
        }     
        }


      else  if(cb_Habitacion.getSelectedIndex()==0){
 Habitacion.setText("");
 Txt_Costo.setText("0");
 
        }
        

        //Cragar datos
  if (cb_Habitacion.getSelectedItem()=="H1") {
 txt_descripcionHabitacion.setText(" "+hab.descripcion0);
        }
 if (cb_Habitacion.getSelectedItem()=="H2") {
 txt_descripcionHabitacion.setText(" "+hab.descripcion1);
          
        }
  if (cb_Habitacion.getSelectedItem()=="H3") {
 txt_descripcionHabitacion.setText(" "+hab.descripcion2);
          
        }
   if (cb_Habitacion.getSelectedItem()=="H4") {
 txt_descripcionHabitacion.setText(" "+hab.descripcion3);
            
        }
 
        else{
        }        
                   

          // TODO add your handling code here:
    }//GEN-LAST:event_cb_HabitacionActionPerformed

    private void cb_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ClienteActionPerformed
        
        if(cb_Cliente.getSelectedItem()=="C1"){
        if(Cliente.getText()==""){    
 Cliente.append("CLIENTE"+"\n Nombre :" +cli.nombre0+ "\n Apellidos: "
 +cli.apellidos0+"\n Edad: "+cli.edad0+"\n DNI: "+cli.dni0+"\n\n");
 
        }
        else{
            Cliente.setText("");
Cliente.append("CLIENTE"+"\n Nombre :" +cli.nombre0+ "\n Apellidos: "
+cli.apellidos0+"\n Edad: "+cli.edad0+"\n DNI: "+cli.dni0+"\n\n");       
        }     
        }

        
        
        if(cb_Cliente.getSelectedItem()=="C2"){
        if(Cliente.getText()==""){    
 Cliente.append("CLIENTE"+"\n Nombre :" +cli.nombre1+ "\n Apellidos: "
 +cli.apellidos1+"\n Edad: "+cli.edad1+"\n DNI: "+cli.dni1+"\n\n");
 
        }
        else{
            Cliente.setText("");
Cliente.append("CLIENTE"+"\n Nombre :" +cli.nombre1+ "\n Apellidos: "
+cli.apellidos1+"\n Edad: "+cli.edad1+"\n DNI: "+cli.dni1+"\n\n");       
        }     
        }
        
        
        if(cb_Cliente.getSelectedItem()=="C3"){
        if(Cliente.getText()==""){    
 Cliente.append("CLIENTE"+"\n Nombre :" +cli.nombre2+ "\n Apellidos: "
 +cli.apellidos2+"\n Edad: "+cli.edad2+"\n DNI: "+cli.dni2+"\n\n");
 
        }
        else{
            Cliente.setText("");
Cliente.append("CLIENTE"+"\n Nombre :" +cli.nombre2+ "\n Apellidos: "
+cli.apellidos2+"\n Edad: "+cli.edad2+"\n DNI: "+cli.dni2+"\n\n");       
        }     
        }
        
        
        
        if(cb_Cliente.getSelectedItem()=="C4"){
        if(Cliente.getText()==""){    
 Cliente.append("CLIENTE"+"\n Nombre :" +cli.nombre3+ "\n Apellidos: "
 +cli.apellidos3+"\n Edad: "+cli.edad3+"\n Dni: "+cli.dni3+"\n\n");
 
        }
        else{
            Cliente.setText("");
Cliente.append("CLIENTE"+"\n Nombre :" +cli.nombre3+ "\n Apellidos: "
 +cli.apellidos3+"\n Edad: "+cli.edad3+"\n DNI: "+cli.dni3+"\n\n");    
        }     
        }
        
        if(cb_Cliente.getSelectedItem()=="C5"){
        if(Cliente.getText()==""){    
 Cliente.append("CLIENTE"+"\n Nombre :" +cli.nombre5+ "\n Apellidos: "
 +cli.apellidos5+"\n Edad: "+cli.edad3+"\n Dni: "+cli.dni5+"\n\n");
 
        }
        else{
            Cliente.setText("");
Cliente.append("CLIENTE"+"\n Nombre :" +cli.nombre5+ "\n Apellidos: "
 +cli.apellidos5+"\n Edad: "+cli.edad5+"\n DNI: "+cli.dni5+"\n\n");    
        }     
        }
        
        
        
else  if(cb_Cliente.getSelectedIndex()==0){
 Cliente.setText("");
 
        }
        
        

int modelos;
String nombre_cliente="", apellido_cliente="";

  if (cb_Cliente.getSelectedItem()=="C1") {
 txt_nombreCliente.setText(" "+cli.nombre0);
 txtApellidoCliente.setText(" "+cli.apellidos0);
        }
 if (cb_Cliente.getSelectedItem()=="C2") {
 txt_nombreCliente.setText(" "+cli.nombre1);
 txtApellidoCliente.setText(" "+cli.apellidos1);            
        }
  if (cb_Cliente.getSelectedItem()=="C3") {
 txt_nombreCliente.setText(" "+cli.nombre2);
 txtApellidoCliente.setText(" "+cli.apellidos2);            
        }
   if (cb_Cliente.getSelectedItem()=="C4") {
 txt_nombreCliente.setText(" "+cli.nombre3);
 txtApellidoCliente.setText(" "+cli.apellidos3);            
        }
    if (cb_Cliente.getSelectedItem()=="C5") {
 txt_nombreCliente.setText(" "+cli.nombre5);
 txtApellidoCliente.setText(" "+cli.apellidos5);            
        }
        else{
        }        
        
    }//GEN-LAST:event_cb_ClienteActionPerformed

    private void txt_RegaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RegaloActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_txt_RegaloActionPerformed

    private void Btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NuevoActionPerformed
limpiar();
Bandeja.setText("");
Btn_Guardar.setEnabled(true);
Txt_Codigo.transferFocus();

    }//GEN-LAST:event_Btn_NuevoActionPerformed

    private void txt_nombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreClienteActionPerformed

    private void txtApellidoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoClienteActionPerformed

    private void txt_descripcionHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_descripcionHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_descripcionHabitacionActionPerformed

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
            java.util.logging.Logger.getLogger(FormReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new FormReserva().setVisible(true);
            }
        });
    }
      
               
               
          
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Bandeja;
    private javax.swing.JButton Btn_Cancelar;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JButton Btn_Nuevo;
    private javax.swing.JComboBox CB_Estado;
    private javax.swing.JComboBox CB_Reserva;
    private javax.swing.JTextArea Cliente;
    private javax.swing.JTextArea Habitacion;
    public static javax.swing.JTextField Txt_Codigo;
    private javax.swing.JTextArea Txt_Costo;
    private javax.swing.JTextField Txt_FechaI;
    private javax.swing.JTextField Txt_FechaR;
    private javax.swing.JTextField Txt_FechaS;
    public static javax.swing.JTextField Txt_Trabajador;
    private javax.swing.JComboBox<String> cb_Cliente;
    private javax.swing.JComboBox<String> cb_Habitacion;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField txtApellidoCliente;
    private javax.swing.JTextField txt_Regalo;
    private javax.swing.JTextField txt_descripcionHabitacion;
    private javax.swing.JTextField txt_nombreCliente;
    // End of variables declaration//GEN-END:variables

  
}
