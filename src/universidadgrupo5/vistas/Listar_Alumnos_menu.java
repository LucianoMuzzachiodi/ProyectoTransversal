package universidadgrupo5.vistas;

import java.time.LocalDate;
import javax.swing.JOptionPane;
import universidadgrupo5.accesoADatos.AlumnoData;
import universidadgrupo5.entidades.Alumno;

public class Listar_Alumnos_menu extends javax.swing.JInternalFrame {
    LocalDate LD = LocalDate.now();
    AlumnoData AD = new AlumnoData();
    
    public Listar_Alumnos_menu() {
        initComponents();
        jComboBoxAño.setEnabled(false);
        jComboBoxMes.setEnabled(false);
        jComboBoxDia.setEnabled(false);
        jGuardar.setEnabled(false);
        jAplicar.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JID = new javax.swing.JTextField();
        jBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jDNI = new javax.swing.JTextField();
        jApellido = new javax.swing.JTextField();
        jNombre = new javax.swing.JTextField();
        jFecha = new javax.swing.JTextField();
        jEstado = new javax.swing.JTextField();
        jComboBoxDia = new javax.swing.JComboBox<>();
        jEliminar = new javax.swing.JButton();
        jGuardar = new javax.swing.JButton();
        jSalir = new javax.swing.JButton();
        jComboBoxMes = new javax.swing.JComboBox<>();
        jComboBoxAño = new javax.swing.JComboBox<>();
        jNuevo = new javax.swing.JButton();
        jModificar = new javax.swing.JButton();
        jSpinner = new javax.swing.JSpinner();
        jAplicar = new javax.swing.JButton();

        setTitle("Gestión alumnos");
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(321, 370));
        setPreferredSize(new java.awt.Dimension(336, 470));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ID Alumno");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JID.setForeground(new java.awt.Color(153, 153, 153));
        JID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JID.setText("ID");

        jBuscar.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jBuscar.setText("Buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DNI");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Apellido");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nombre");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Estado");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Fecha de Nacimiento");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jDNI.setEditable(false);
        jDNI.setForeground(new java.awt.Color(153, 153, 153));
        jDNI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jDNI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDNIActionPerformed(evt);
            }
        });

        jApellido.setEditable(false);
        jApellido.setForeground(new java.awt.Color(153, 153, 153));
        jApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jApellidoActionPerformed(evt);
            }
        });

        jNombre.setEditable(false);
        jNombre.setForeground(new java.awt.Color(153, 153, 153));
        jNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNombreActionPerformed(evt);
            }
        });

        jFecha.setEditable(false);
        jFecha.setForeground(new java.awt.Color(153, 153, 153));
        jFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFechaActionPerformed(evt);
            }
        });

        jEstado.setEditable(false);
        jEstado.setForeground(new java.awt.Color(153, 153, 153));
        jEstado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jEstado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEstadoActionPerformed(evt);
            }
        });

        jComboBoxDia.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N

        jEliminar.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jEliminar.setText("Eliminar");
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });

        jGuardar.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jGuardar.setText("Guardar");
        jGuardar.setEnabled(false);
        jGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarActionPerformed(evt);
            }
        });

        jSalir.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });

        jComboBoxMes.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N

        jComboBoxAño.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N

        jNuevo.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jNuevo.setText("Nuevo");
        jNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNuevoActionPerformed(evt);
            }
        });

        jModificar.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jModificar.setText("Modificar");
        jModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModificarActionPerformed(evt);
            }
        });

        jSpinner.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jSpinner.setEnabled(false);
        jSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerStateChanged(evt);
            }
        });
        jSpinner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSpinnerMouseClicked(evt);
            }
        });

        jAplicar.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jAplicar.setText("Aplicar");
        jAplicar.setEnabled(false);
        jAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAplicarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jApellido))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JID, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(jEstado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFecha))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jComboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jAplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBoxAño, 0, 100, Short.MAX_VALUE)
                                .addComponent(jSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JID, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(jBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jDNI, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinner, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addComponent(jEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jGuardar)
                    .addComponent(jNuevo)
                    .addComponent(jModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSalir)
                    .addComponent(jEliminar)
                    .addComponent(jAplicar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDNIActionPerformed

    private void jApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jApellidoActionPerformed

    private void jNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNombreActionPerformed

    private void jFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFechaActionPerformed

    private void jEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEstadoActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        try {
            int NUM = Integer.parseInt(JID.getText());
            Alumno alumno = new Alumno();
            if (AD.buscar(NUM) != null) {
                jModificar.setEnabled(true);
                alumno = AD.buscar(NUM);
                jDNI.setText("" + alumno.getDni());
                jApellido.setText(alumno.getApellido());
                jNombre.setText(alumno.getNombre());
                jEstado.setText("" + alumno.isEstado());
                jFecha.setText(String.valueOf(alumno.getFechaNac()));
            } else {
                jDNI.setText("");
                jApellido.setText("");
                jNombre.setText("");
                jEstado.setText("");
                jFecha.setText("");
            }
            
        } catch (NumberFormatException NFE) {
            JOptionPane.showMessageDialog(this, "Tiene que ser un número.");
        }
    }//GEN-LAST:event_jBuscarActionPerformed

    private void jNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNuevoActionPerformed
        if (jBuscar.isEnabled()) {
            JButtonNew();
        } else {
            JButtonNew("Nectar");
        }
    }//GEN-LAST:event_jNuevoActionPerformed

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
        if(jBuscar.isEnabled()){
            AD.eliminarAlumno(Integer.parseInt(JID.getText()));
        }
    }//GEN-LAST:event_jEliminarActionPerformed

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed
        if(jGuardar.isEnabled()){
            try {
                Alumno alumno = (new Alumno(Integer.parseInt(jDNI.getText()),jApellido.getText(),jNombre.getText(),LocalDate.parse(jComboBoxAño.getSelectedItem()+"-"+jComboBoxMes.getSelectedItem()+"-"+jComboBoxDia.getSelectedItem()),Boolean.parseBoolean(jEstado.getText())));
                AD.guardar(alumno);
            } catch (NumberFormatException NFE){
                if (JID.getText().isBlank() || Integer.parseInt(JID.getText()) <= 0){
                    if (JID.getText().isBlank()){
                        JOptionPane.showMessageDialog(this, "Faltan datos.");
                    }else if (Integer.parseInt(JID.getText()) <= 0) {
                        JOptionPane.showMessageDialog(this, "Número inválido.");
                    }
                }
            }
        }
    }//GEN-LAST:event_jGuardarActionPerformed

    private void jModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModificarActionPerformed
        try {
            AlumnoData AD = new AlumnoData();
            if (Integer.parseInt(JID.getText()) >= 1 && AD.buscar(Integer.parseInt(JID.getText())) != null) {
                if (jBuscar.isEnabled()) {
                    jAplicar.setVisible(true);
                    jModificar.setEnabled(false);
                    jBuscar.setEnabled(false);
                    jAplicar.setEnabled(true);
                }
            }
            if (jAplicar.isVisible() && jAplicar.isEnabled()) {
                JOptionPane.showMessageDialog(this, "Ahora puedes modificar el alumno.");
                JID.setEditable(false);
                jDNI.setEditable(true);
                jApellido.setEditable(true);
                jNombre.setEditable(true);
                jFecha.setEditable(true);
                jSpinner.setEnabled(true);
            }
        } catch (NumberFormatException NFE) {
            JOptionPane.showMessageDialog(this, "ID inválido.");
        }
    }//GEN-LAST:event_jModificarActionPerformed

    private void jSpinnerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSpinnerMouseClicked
        
    }//GEN-LAST:event_jSpinnerMouseClicked

    private void jSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerStateChanged
        int aux = (int) jSpinner.getValue();
        if (aux <= -1) {
            jSpinner.setValue(0);
        } else if (aux >= 2) {
            jSpinner.setValue(1);
        }
        if (aux == 0) {
            jEstado.setText("Inactivo");
        } else if (aux == 1) {
            jEstado.setText("Activo");
        }
    }//GEN-LAST:event_jSpinnerStateChanged

    private void jAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAplicarActionPerformed
        try {
            int aux = JOptionPane.showConfirmDialog(this, "¿Realmente quieres modificarlo?");
            if (aux == 0) {
                AlumnoData AD = new AlumnoData();
                Alumno alumno = new Alumno(Integer.parseInt(JID.getText()), Integer.parseInt(jDNI.getText()), jApellido.getText(), jNombre.getText(), LocalDate.parse((String) jFecha.getText()), Boolean.parseBoolean(jEstado.getText()));
                AD.modificar(alumno);
                jAplicar.setVisible(false);
                jAplicar.setEnabled(false);
                //jNuevo.setEnabled(true);
                jBuscar.setEnabled(true);
                jModificar.setEnabled(true);
                jFecha.setEditable(false);
                JID.setEditable(true);
                JID.setEnabled(true);
            } else if (aux == 1) {
                jAplicar.setVisible(false);
                jAplicar.setEnabled(false);
                //jNuevo.setEnabled(true);
                jBuscar.setEnabled(true);
                jModificar.setEnabled(true);
                jFecha.setEditable(false);
                JID.setEditable(true);
                JID.setEnabled(true);
            }
        } catch (NumberFormatException NFE) {}
    }//GEN-LAST:event_jAplicarActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jSalirActionPerformed

    private void JButtonNew() {
        jSpinner.setEnabled(true);
        jModificar.setEnabled(false);
        jEliminar.setEnabled(false);
        for (int dias = 1; dias <= LD.getMonth().maxLength(); dias++) {
            if (dias <= 9) {
                jComboBoxDia.addItem("0" + dias);
            } else {
                jComboBoxDia.addItem("" + dias);
            }
        }
        for (int mes = 1; mes <= 12; mes++) {
            if (mes <= 9) {
                jComboBoxMes.addItem("0" + mes);
            } else {
                jComboBoxMes.addItem("" + mes);
            }
        }
        for (int anio = 1995; anio <= LD.getYear(); anio++) {
            jComboBoxAño.addItem("" + anio);
        }
        JID.setEditable(false);
        jBuscar.setEnabled(false);
        jComboBoxAño.setEnabled(true);
        jComboBoxMes.setEnabled(true);
        jComboBoxDia.setEnabled(true);
        jGuardar.setEnabled(true);
        JID.setText("");
        jDNI.setText("");
        jApellido.setText("");
        jNombre.setText("");
        jEstado.setText("");
        jFecha.setText("");
        jDNI.setEditable(true);
        jApellido.setEditable(true);
        jNombre.setEditable(true);
    }

    private void JButtonNew(String S) {
        jEliminar.setEnabled(true);
        jBuscar.setEnabled(true);
        jGuardar.setEnabled(false);
        jSpinner.setEnabled(false);
        jComboBoxDia.removeAllItems();
        jComboBoxMes.removeAllItems();
        jComboBoxAño.removeAllItems();
        jComboBoxAño.setEnabled(false);
        jComboBoxMes.setEnabled(false);
        jComboBoxDia.setEnabled(false);
        JID.setText("");
        jDNI.setText("");
        jApellido.setText("");
        jNombre.setText("");
        jEstado.setText("");
        jFecha.setText("");
        JID.setEditable(true);
        jDNI.setEditable(false);
        jApellido.setEditable(false);
        jNombre.setEditable(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JID;
    private javax.swing.JTextField jApellido;
    private javax.swing.JButton jAplicar;
    private javax.swing.JButton jBuscar;
    private javax.swing.JComboBox<String> jComboBoxAño;
    private javax.swing.JComboBox<String> jComboBoxDia;
    private javax.swing.JComboBox<String> jComboBoxMes;
    private javax.swing.JTextField jDNI;
    private javax.swing.JButton jEliminar;
    private javax.swing.JTextField jEstado;
    private javax.swing.JTextField jFecha;
    private javax.swing.JButton jGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jModificar;
    private javax.swing.JTextField jNombre;
    private javax.swing.JButton jNuevo;
    private javax.swing.JButton jSalir;
    private javax.swing.JSpinner jSpinner;
    // End of variables declaration//GEN-END:variables
}
