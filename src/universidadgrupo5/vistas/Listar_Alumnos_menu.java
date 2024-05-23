package universidadgrupo5.vistas;


import java.time.LocalDate;
import javax.swing.JOptionPane;
import universidadgrupo5.accesoADatos.AlumnoData;
import universidadgrupo5.entidades.Alumno;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author DANIELALEJANDROMIRAN
 */
public class Listar_Alumnos_menu extends javax.swing.JInternalFrame {
    LocalDate LD = LocalDate.now();
    /**
     * Creates new form Listar_Alumnos_menu
     */
    public Listar_Alumnos_menu() {
        initComponents();
        jComboBox3.setEnabled(false);
        jComboBox2.setEnabled(false);
        jComboBox1.setEnabled(false);
        JGuardar.setEnabled(false);
        JAplicar.setVisible(false);
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
        JID = new javax.swing.JTextField();
        JButtonBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JDNI = new javax.swing.JTextField();
        JApellido = new javax.swing.JTextField();
        JNombre = new javax.swing.JTextField();
        JFecha = new javax.swing.JTextField();
        JEstado = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        JGuardar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        JButtonNuevo = new javax.swing.JButton();
        JModificar = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        JAplicar = new javax.swing.JButton();

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

        JButtonBuscar.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        JButtonBuscar.setText("Buscar");
        JButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonBuscarActionPerformed(evt);
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

        JDNI.setEditable(false);
        JDNI.setForeground(new java.awt.Color(153, 153, 153));
        JDNI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JDNI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JDNIActionPerformed(evt);
            }
        });

        JApellido.setEditable(false);
        JApellido.setForeground(new java.awt.Color(153, 153, 153));
        JApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JApellidoActionPerformed(evt);
            }
        });

        JNombre.setEditable(false);
        JNombre.setForeground(new java.awt.Color(153, 153, 153));
        JNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JNombreActionPerformed(evt);
            }
        });

        JFecha.setEditable(false);
        JFecha.setForeground(new java.awt.Color(153, 153, 153));
        JFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFechaActionPerformed(evt);
            }
        });

        JEstado.setEditable(false);
        JEstado.setForeground(new java.awt.Color(153, 153, 153));
        JEstado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JEstado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JEstadoActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N

        jButton2.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        JGuardar.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        JGuardar.setText("Guardar");
        JGuardar.setEnabled(false);
        JGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JGuardarActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jButton4.setText("Salir");

        jComboBox2.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N

        jComboBox3.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N

        JButtonNuevo.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        JButtonNuevo.setText("Nuevo");
        JButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonNuevoActionPerformed(evt);
            }
        });

        JModificar.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        JModificar.setText("Modificar");
        JModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JModificarActionPerformed(evt);
            }
        });

        jSpinner1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jSpinner1.setEnabled(false);
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        jSpinner1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSpinner1MouseClicked(evt);
            }
        });

        JAplicar.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        JAplicar.setText("Aplicar");
        JAplicar.setEnabled(false);
        JAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JAplicarActionPerformed(evt);
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
                        .addComponent(JApellido))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JID, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JButtonBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(JEstado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JFecha))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(JAplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JButtonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBox3, 0, 100, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(JGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                        .addComponent(JButtonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(JDNI, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(JApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(JNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addComponent(JEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(JFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JGuardar)
                    .addComponent(JButtonNuevo)
                    .addComponent(JModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton2)
                    .addComponent(JAplicar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JDNIActionPerformed

    private void JApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JApellidoActionPerformed

    private void JNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JNombreActionPerformed

    private void JFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JFechaActionPerformed

    private void JEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JEstadoActionPerformed

    private void JButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonBuscarActionPerformed
        try{
            AlumnoData AD = new AlumnoData();
            int NUM = Integer.parseInt(JID.getText());
            Alumno alumno = new Alumno();
            if(AD.buscar(NUM)!=null){
                alumno = AD.buscar(NUM);
                JDNI.setText(""+alumno.getDni());
                JApellido.setText(alumno.getApellido());
                JNombre.setText(alumno.getNombre());
                JEstado.setText(""+alumno.isEstado());
                JFecha.setText(String.valueOf(alumno.getFechaNac()));
            } else{
                JDNI.setText("");
                JApellido.setText("");
                JNombre.setText("");
                JEstado.setText("");
                JFecha.setText("");
            }
            
        }catch(NumberFormatException NFE){
            JOptionPane.showMessageDialog(this, "Tiene que ser un número.");
        }
    }//GEN-LAST:event_JButtonBuscarActionPerformed

    private void JButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonNuevoActionPerformed
        if(JButtonBuscar.isEnabled()){
                JButtonNew();
        } else{
            JButtonNew("Nectar");
            
          }
    }//GEN-LAST:event_JButtonNuevoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AlumnoData AD = new AlumnoData();
        if(JButtonBuscar.isEnabled()){
            AD.eliminarAlumno(Integer.parseInt(JID.getText()));
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void JGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JGuardarActionPerformed
        if(JGuardar.isEnabled()){
            try{
                AlumnoData AD = new AlumnoData();
                Alumno alumno = new Alumno();
                alumno = new Alumno(Integer.parseInt(JDNI.getText()),JApellido.getText(),JNombre.getText(),LocalDate.parse(jComboBox3.getSelectedItem()+"-"+jComboBox2.getSelectedItem()+"-"+jComboBox1.getSelectedItem()),Boolean.parseBoolean(JEstado.getText()));
                AD.guardar(alumno);
            }catch(NumberFormatException NFE){
                if(JID.getText().isBlank() || Integer.parseInt(JID.getText())<=0){
                    if(JID.getText().isBlank()){
                        JOptionPane.showMessageDialog(this, "Faltan datos.");
                    }else if(Integer.parseInt(JID.getText())<=0){
                        JOptionPane.showMessageDialog(this, "Número inválido.");
                    }
                }
            }
        }
    }//GEN-LAST:event_JGuardarActionPerformed

    private void JModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JModificarActionPerformed
        try{
            AlumnoData AD = new AlumnoData();
            
            if(Integer.parseInt(JID.getText())>=1 && AD.buscar(Integer.parseInt(JID.getText()))!=null){
                if(JButtonBuscar.isEnabled()){
                JAplicar.setVisible(true);
                JModificar.setEnabled(false);
                JButtonBuscar.setEnabled(false);
                JButtonNuevo.setEnabled(false);
                JAplicar.setEnabled(true);
            }
            }
            if(JAplicar.isVisible() && JAplicar.isEnabled()){
                JOptionPane.showMessageDialog(this, "Ahora puedes modificar el alumno.");
                JID.setEditable(false);
                JDNI.setEditable(true);
                JApellido.setEditable(true);
                JNombre.setEditable(true);
                JFecha.setEditable(true);
                jSpinner1.setEnabled(true);
            }
        }catch(NumberFormatException NFE){
            JOptionPane.showMessageDialog(this, "ID inválido.");
            
        }
        
    }//GEN-LAST:event_JModificarActionPerformed

    private void jSpinner1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSpinner1MouseClicked
        
    }//GEN-LAST:event_jSpinner1MouseClicked

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        int aux = (int)jSpinner1.getValue();
        if(aux<=-1){
            jSpinner1.setValue(0);
        } else if (aux>=2){
            jSpinner1.setValue(1);
        }
        if(aux==0){
            JEstado.setText("Inactivo");
        } else if (aux==1){
            JEstado.setText("Activo");
        }
    }//GEN-LAST:event_jSpinner1StateChanged

    private void JAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JAplicarActionPerformed
        try{
            int aux = JOptionPane.showConfirmDialog(this, "¿Realmente quieres modificarlo?");
            if(aux==0){
                AlumnoData AD = new AlumnoData();
                Alumno alumno = new Alumno(Integer.parseInt(JID.getText()),Integer.parseInt(JDNI.getText()),JApellido.getText(),JNombre.getText(),LocalDate.parse((String)JFecha.getText()),Boolean.parseBoolean(JEstado.getText()));
                AD.modificar(alumno);
                JAplicar.setVisible(false);
                JAplicar.setEnabled(false);
                JButtonNuevo.setEnabled(true);
                JButtonBuscar.setEnabled(true);
                JModificar.setEnabled(true);
                JFecha.setEditable(false);
                JID.setEditable(true);
                JID.setEnabled(true);
            } else if (aux==1){
                JAplicar.setVisible(false);
                JAplicar.setEnabled(false);
                JButtonNuevo.setEnabled(true);
                JButtonBuscar.setEnabled(true);
                JModificar.setEnabled(true);
                JFecha.setEditable(false);
                JID.setEditable(true);
                JID.setEnabled(true);
            }
        }catch(NumberFormatException NFE){
            
        }
    }//GEN-LAST:event_JAplicarActionPerformed

    public void JButtonNew(){
        jSpinner1.setEnabled(true);
        JModificar.setEnabled(false);
        jButton2.setEnabled(false);
        for(int dias=1;dias<=LD.getMonth().maxLength();dias++){
                if(dias<=9){
                    jComboBox1.addItem("0"+dias);
                } else {
                    jComboBox1.addItem(""+dias);
                }
            }
            for(int mes=1;mes<=12;mes++){
                if(mes<=9){
                    jComboBox2.addItem("0"+mes);
                } else {
                    jComboBox2.addItem(""+mes);
                }
            }
            for(int anio=1995;anio<=LD.getYear();anio++){
                jComboBox3.addItem(""+anio);
            }
        JID.setEditable(false);
        JButtonBuscar.setEnabled(false);
        jComboBox3.setEnabled(true);
        jComboBox2.setEnabled(true);
        jComboBox1.setEnabled(true);
        JGuardar.setEnabled(true);
        JID.setText("");
        JDNI.setText("");
        JApellido.setText("");
        JNombre.setText("");
        JEstado.setText("");
        JFecha.setText("");
        JDNI.setEditable(true);
        JApellido.setEditable(true);
        JNombre.setEditable(true);
        
    }
    public void JButtonNew(String S){
        jButton2.setEnabled(true);
        jSpinner1.setEnabled(false);
        JModificar.setEnabled(true);
        jComboBox1.removeAllItems();
            jComboBox2.removeAllItems();
            jComboBox3.removeAllItems();
        JID.setEditable(true);
        JButtonBuscar.setEnabled(true);
        jComboBox3.setEnabled(false);
        jComboBox2.setEnabled(false);
        jComboBox1.setEnabled(false);
        JGuardar.setEnabled(false);
        JID.setText("");
        JDNI.setText("");
        JApellido.setText("");
        JNombre.setText("");
        JEstado.setText("");
        JFecha.setText("");
        JDNI.setEditable(false);
        JApellido.setEditable(false);
        JNombre.setEditable(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JApellido;
    private javax.swing.JButton JAplicar;
    private javax.swing.JButton JButtonBuscar;
    private javax.swing.JButton JButtonNuevo;
    private javax.swing.JTextField JDNI;
    private javax.swing.JTextField JEstado;
    private javax.swing.JTextField JFecha;
    private javax.swing.JButton JGuardar;
    private javax.swing.JTextField JID;
    private javax.swing.JButton JModificar;
    private javax.swing.JTextField JNombre;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables
}
