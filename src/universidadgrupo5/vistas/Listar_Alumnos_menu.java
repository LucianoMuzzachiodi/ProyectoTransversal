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
    AlumnoData AD = new AlumnoData();
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(JApellido))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(JDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(JEstado)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JFecha))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JButtonNuevo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(JEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
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
                    .addComponent(JButtonNuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton2))
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
            Alumno alumno = AD.buscar(NUM);
            JDNI.setText(""+alumno.getDni());
            JApellido.setText(alumno.getApellido());
            JNombre.setText(alumno.getNombre());
            JEstado.setText(""+alumno.isEstado());
            JFecha.setText(String.valueOf(alumno.getFechaNac()));
        }catch(NumberFormatException NFE){
            JOptionPane.showMessageDialog(this, "tiene que ser un numero.");
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
                Alumno alumno = new Alumno();
                alumno = new Alumno(Integer.parseInt(JDNI.getText()),JApellido.getText(),JNombre.getText(),LocalDate.parse(jComboBox3.getSelectedItem()+"-"+jComboBox2.getSelectedItem()+"-"+jComboBox1.getSelectedItem()),true);
                AD.guardar(alumno);
            }catch(NumberFormatException NFE){
                if(JID.getText().isBlank() || Integer.parseInt(JID.getText())<=0){
                    if(JID.getText().isBlank()){
                        JOptionPane.showMessageDialog(this, "faltan datos.");
                    }else if(Integer.parseInt(JID.getText())<=0){
                        JOptionPane.showMessageDialog(this, "Numero invalido.");
                    }
                }
            }
        }
    }//GEN-LAST:event_JGuardarActionPerformed

    public void JButtonNew(){
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
        JEstado.setEditable(true);
        
    }
    public void JButtonNew(String S){
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
        JEstado.setEditable(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JApellido;
    private javax.swing.JButton JButtonBuscar;
    private javax.swing.JButton JButtonNuevo;
    private javax.swing.JTextField JDNI;
    private javax.swing.JTextField JEstado;
    private javax.swing.JTextField JFecha;
    private javax.swing.JButton JGuardar;
    private javax.swing.JTextField JID;
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
    // End of variables declaration//GEN-END:variables
}
