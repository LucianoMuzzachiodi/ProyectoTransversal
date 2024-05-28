package universidadgrupo5.vistas;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import universidadgrupo5.accesoADatos.*;
import universidadgrupo5.entidades.*;

public class Listar_Alumnos extends javax.swing.JInternalFrame {
    DefaultTableModel DTM = new DefaultTableModel();

    public Listar_Alumnos() {
        initComponents();
        vaciar();
        llenar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTABLE = new javax.swing.JTable();
        jCheckBox1 = new javax.swing.JCheckBox();
        JComboMaterias = new javax.swing.JComboBox<>();
        jCheckBox2 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();

        JTABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTABLE.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(JTABLE);
        if (JTABLE.getColumnModel().getColumnCount() > 0) {
            JTABLE.getColumnModel().getColumn(0).setResizable(false);
            JTABLE.getColumnModel().getColumn(1).setResizable(false);
            JTABLE.getColumnModel().getColumn(2).setResizable(false);
            JTABLE.getColumnModel().getColumn(3).setResizable(false);
        }

        jCheckBox1.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jCheckBox1.setText("Selecciona una Materia");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        JComboMaterias.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JComboMaterias.setEnabled(false);
        JComboMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboMateriasActionPerformed(evt);
            }
        });

        jCheckBox2.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jCheckBox2.setText("Buscar por DNI");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setEnabled(false);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JComboMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(JComboMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            jCheckBox2.setSelected(false);
            JComboMaterias.removeAllItems();
            MateriaData MD = new MateriaData();
            for (int i = 0; i <= MD.listarMaterias().size() - 1; i++) {
                JComboMaterias.addItem("" + MD.listarMaterias().get(i).getIdMateria() + "  " + MD.listarMaterias().get(i).getNombre());
            }
            JComboMaterias.setEnabled(true);
        } else {
            vaciar();
            AlumnoData AD = new AlumnoData();
            String estado;
            DTM.setColumnIdentifiers(new Object[]{"ID Alumno", "DNI", "Apellido", "Nombre", "Fecha de Nacimiento", "Estado"});
            JTABLE.setModel(DTM);
            for (Alumno alumno : AD.listarAlumnos()) {
                if (alumno.isEstado()) {
                    estado = "Activo";
                } else {
                    estado = "Inactivo";
                }
                DTM.addRow(new Object[]{alumno.getIdAlumno(), alumno.getDni(), alumno.getApellido(), alumno.getNombre(), alumno.getFechaNac(), estado});
            }
            JComboMaterias.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void JComboMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboMateriasActionPerformed
        if (jCheckBox1.isSelected() && JComboMaterias.getSelectedItem() != null) {
            vaciar();
            InscripcionData ID = new InscripcionData();
            ArrayList<Alumno> alumno = new ArrayList();
            if (ID.obtenerAlumnosXMateria(Integer.parseInt(((String) JComboMaterias.getSelectedItem()).substring(0, 1))) != null) {
                alumno = new ArrayList(ID.obtenerAlumnosXMateria(Integer.parseInt(((String) JComboMaterias.getSelectedItem()).substring(0, 1))));
            }
            String estado;
            for (Alumno backslide : alumno) {
                if(backslide.isEstado()){estado = "Activo";}else{estado = "Inactivo";}
                DTM.addRow(new Object[]{backslide.getIdAlumno(), backslide.getDni(), backslide.getApellido(), backslide.getNombre(), backslide.getFechaNac(), estado});
            }
        }
    }//GEN-LAST:event_JComboMateriasActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if (jCheckBox2.isSelected()) {
            jCheckBox1.setSelected(false);
            jTextField1.setEnabled(true);
        } else {
            vaciar();
            AlumnoData AD = new AlumnoData();
            DTM.setColumnIdentifiers(new Object[]{"ID Alumno", "DNI", "Apellido", "Nombre", "Fecha de Nacimiento", "Estado"});
            JTABLE.setModel(DTM);
            String estado;
            for (Alumno alumno : AD.listarAlumnos()) {
                if(alumno.isEstado()){estado = "Activo";}else{estado = "Inactivo";}
                DTM.addRow(new Object[]{alumno.getIdAlumno(), alumno.getDni(), alumno.getApellido(), alumno.getNombre(), alumno.getFechaNac(), estado});
            }
            JComboMaterias.setEnabled(false);
            jTextField1.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if (jTextField1.isEnabled()) {
            try {
                AlumnoData AD = new AlumnoData();
                if (evt.getKeyCode() == 10) {
                    vaciar();
                    Alumno alumno = AD.buscarDni(Integer.parseInt(jTextField1.getText()));
                    String estado;
                    if(alumno.isEstado()){estado = "Activo";}else{estado = "Inactivo";}
                    DTM.addRow(new Object[]{alumno.getIdAlumno(), alumno.getDni(), alumno.getApellido(), alumno.getNombre(), alumno.getFechaNac(), estado});
                }
            } catch (NumberFormatException NFE) {
                System.err.println(NFE);
            }
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    public void llenar(){
        vaciar();
        JComboMaterias.removeAllItems();
        MateriaData MD = new MateriaData();
        for (int i = 0; i <= MD.listarMaterias().size() - 1; i++) {
            JComboMaterias.addItem("" + MD.listarMaterias().get(i).getIdMateria() + "  " + MD.listarMaterias().get(i).getNombre());
        }
        AlumnoData AD = new AlumnoData();
        DTM.setColumnIdentifiers(new Object[]{"ID Alumno", "DNI", "Apellido", "Nombre", "Fecha de Nacimiento", "Estado"});
        JTABLE.setModel(DTM);
        String estado;
        for (Alumno alumno : AD.listarAlumnos()) {
            if(alumno.isEstado()){estado = "Activo";}else{estado = "Inactivo";}
            DTM.addRow(new Object[]{alumno.getIdAlumno(), alumno.getDni(), alumno.getApellido(), alumno.getNombre(), alumno.getFechaNac(), estado});
        }
    }
    public void vaciar(){
        for (int i = DTM.getRowCount() - 1; i >= 0; i--) {
            DTM.removeRow(i);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JComboMaterias;
    private javax.swing.JTable JTABLE;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
