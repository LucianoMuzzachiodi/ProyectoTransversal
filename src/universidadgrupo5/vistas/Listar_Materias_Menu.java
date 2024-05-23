package universidadgrupo5.vistas;

import javax.swing.JOptionPane;
import universidadgrupo5.accesoADatos.MateriaData;
import universidadgrupo5.entidades.Materia;

public class Listar_Materias_Menu extends javax.swing.JInternalFrame {
    public Listar_Materias_Menu() {
        initComponents();
        jModificar.setEnabled(false);
        jEliminar.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jID = new javax.swing.JTextField();
        jBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jAño = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jRadioActivo = new javax.swing.JRadioButton();
        jRadioInactivo = new javax.swing.JRadioButton();
        jNuevo = new javax.swing.JButton();
        jEliminar = new javax.swing.JButton();
        jModificar = new javax.swing.JButton();
        jSalir = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(342, 292));

        jLabel1.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ID Materia");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jID.setForeground(new java.awt.Color(153, 153, 153));
        jID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jID.setText("ID");
        jID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jIDMouseClicked(evt);
            }
        });

        jBuscar.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jBuscar.setText("Buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jNombre.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Año");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jAño.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jAño.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jAño.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Estado");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jRadioActivo.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jRadioActivo.setText("Activo");
        jRadioActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioActivoActionPerformed(evt);
            }
        });

        jRadioInactivo.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jRadioInactivo.setText("Inactivo");
        jRadioInactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioInactivoActionPerformed(evt);
            }
        });

        jNuevo.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jNuevo.setText("Nuevo");
        jNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNuevoActionPerformed(evt);
            }
        });

        jEliminar.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jEliminar.setText("Eliminar");
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });

        jModificar.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jModificar.setText("Modificar");
        jModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModificarActionPerformed(evt);
            }
        });

        jSalir.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioInactivo, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jNombre))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jID, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jAño, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(7, 7, 7))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jID)
                    .addComponent(jBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAño, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioActivo)
                    .addComponent(jRadioInactivo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jModificar)
                    .addComponent(jNuevo)
                    .addComponent(jSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jEliminar)
                .addGap(160, 160, 160))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioActivoActionPerformed
        if(jRadioActivo.isSelected()){
            jRadioInactivo.setSelected(false);
        }
    }//GEN-LAST:event_jRadioActivoActionPerformed

    private void jRadioInactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioInactivoActionPerformed
        if(jRadioInactivo.isSelected()){
            jRadioActivo.setSelected(false);
        }
    }//GEN-LAST:event_jRadioInactivoActionPerformed

    private void jIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIDMouseClicked
        jID.setText("");
    }//GEN-LAST:event_jIDMouseClicked

    private void jNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNuevoActionPerformed
        if(jBuscar.isEnabled()){
            newbutton();
        } else if (!jBuscar.isEnabled()){
            newbutton("");
        }
    }//GEN-LAST:event_jNuevoActionPerformed
    
    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        if(jBuscar.isEnabled()){ //debo confirmar si esta activo el boton buscar para que se ejecute el codigo de abajo, dentro del bloque try catch
            try{ //en este caso no es necesario un if condicional secundario, solamente necesito confirmar si el boton esta activo.                
                Materia materia = new Materia();
                MateriaData MD = new MateriaData();
                if(MD.buscar(Integer.parseInt(jID.getText())) != null){
                    jModificar.setEnabled(true);
                    materia = MD.buscar(Integer.parseInt(jID.getText()));
                    jNombre.setText(materia.getNombre());
                    jAño.setText(""+materia.getAnio());
                    if(materia.isActivo()){
                        jRadioActivo.setSelected(true);
                        jRadioInactivo.setSelected(false);
                    } else {
                        jRadioActivo.setSelected(false);
                        jRadioInactivo.setSelected(true);
                    }
                } else {
                    jNombre.setText("");
                    jAño.setText("");
                }
            }catch(NumberFormatException NFE){
                JOptionPane.showMessageDialog(this, "Tiene que ser un número.");
            }
        }
    }//GEN-LAST:event_jBuscarActionPerformed

    private void jModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModificarActionPerformed
        if (jModificar.getText().equals("Guardar")) {
            try {
                boolean activo = false;
                if (jRadioActivo.isSelected()) {activo = true;}
                if (!jNombre.getText().isBlank() && !jAño.getText().isBlank()) {
                    Materia materia = new Materia(jNombre.getText(), Integer.parseInt(jAño.getText()), activo);
                    MateriaData MD = new MateriaData();
                    MD.guardar(materia);
                } else {
                    if (jNombre.getText().isBlank() && jAño.getText().isBlank()) {
                        JOptionPane.showMessageDialog(this, "Agregar nombre y año.");
                    } else {
                        if (jNombre.getText().isBlank()) {
                            JOptionPane.showMessageDialog(this, "Agregar nombre.");
                        }
                        if (jAño.getText().isBlank()) {
                            JOptionPane.showMessageDialog(this, "Agregar año.");
                        }
                    }
                }
            } catch (NumberFormatException NFE) {
                JOptionPane.showMessageDialog(this, "Tiene que ser un número.");
            }
        } else if (jModificar.getText().equals("Modificar")) {
            try {
                boolean activo = false;
                if (jRadioActivo.isSelected()) {activo = true;}
                Materia materia = new Materia(Integer.parseInt(jID.getText()), jNombre.getText(), Integer.parseInt(jAño.getText()), activo);
                MateriaData MD = new MateriaData();
                MD.modificar(materia);
            } catch (NumberFormatException NFE) {
                JOptionPane.showMessageDialog(this, "Número erróneo.");
            }
        }
    }//GEN-LAST:event_jModificarActionPerformed

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
        if (jBuscar.isEnabled()) {
            try {
                MateriaData MD = new MateriaData();
                MD.eliminarMateria(Integer.parseInt(jID.getText()));
            } catch (NumberFormatException NFE) {
                JOptionPane.showMessageDialog(this, "Tiene que ser un número.");
            }
        }
    }//GEN-LAST:event_jEliminarActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jSalirActionPerformed

    private void newbutton() {
        jModificar.setText("Guardar");
        jModificar.setEnabled(true);
        jEliminar.setEnabled(true);
        jBuscar.setEnabled(false);
        jEliminar.setEnabled(false);
        jID.setText("");
        jID.setEditable(false);
        jNombre.setText("");
        jAño.setText("");
        jRadioActivo.setSelected(false);
        jRadioInactivo.setSelected(false);
    }

    private void newbutton(String NICE) {
        jModificar.setText("Modificar");
        jBuscar.setEnabled(true);
        jEliminar.setEnabled(true);
        jID.setText("");
        jID.setEditable(true);
        jNombre.setText("");
        jAño.setText("");
        jRadioActivo.setSelected(false);
        jRadioInactivo.setSelected(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAño;
    private javax.swing.JButton jBuscar;
    private javax.swing.JButton jEliminar;
    private javax.swing.JTextField jID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jModificar;
    private javax.swing.JTextField jNombre;
    private javax.swing.JButton jNuevo;
    private javax.swing.JRadioButton jRadioActivo;
    private javax.swing.JRadioButton jRadioInactivo;
    private javax.swing.JButton jSalir;
    // End of variables declaration//GEN-END:variables
}
