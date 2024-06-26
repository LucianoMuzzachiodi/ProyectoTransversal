package universidadgrupo5.vistas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadgrupo5.accesoADatos.*;
import universidadgrupo5.entidades.*;

public class Listado_Inscripcion extends javax.swing.JInternalFrame {
    DefaultTableModel DTM = new DefaultTableModel();
    AlumnoData AD = new AlumnoData();
    
    public Listado_Inscripcion() {
        initComponents();
        Llenar();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JComboAlumnos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();

        setTitle("Gestión de inscripciones");

        jLabel1.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Selecciona un Alumno");

        JComboAlumnos.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        JComboAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboAlumnosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Listado de Materias");

        jRadioButton1.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Materias Inscriptas");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);

        jPanel2.setPreferredSize(new java.awt.Dimension(100, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);

        jRadioButton2.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jRadioButton2.setText("Materias no Inscriptas");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);

        jTable1.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Año", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton1.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jButton1.setText("Inscribir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);

        jPanel4.setPreferredSize(new java.awt.Dimension(100, 30));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4);

        jButton2.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jButton2.setText("Anular Inscripcion");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);

        jPanel5.setPreferredSize(new java.awt.Dimension(100, 30));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5);

        jButton3.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JComboAlumnos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JComboAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jButton1.setEnabled(false);
        jButton2.setEnabled(true);
        jRadioButton1.setSelected(true);
        jRadioButton2.setSelected(false);
        if (jRadioButton1.isSelected()) {
            InscripcionData ID = new InscripcionData();
            vaciarTabla();
            Alumno alumno = (Alumno) JComboAlumnos.getSelectedItem();
            for (Materia materia : ID.obtenerMateriasCursadas(alumno.getIdAlumno())) {
                DTM.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), materia.getAnio()});
            }
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jButton1.setEnabled(true);
        jButton2.setEnabled(false);
        jRadioButton2.setSelected(true);
        jRadioButton1.setSelected(false);
        if (jRadioButton2.isSelected()) {
            InscripcionData ID = new InscripcionData();
            vaciarTabla();
            Alumno alumno = (Alumno) JComboAlumnos.getSelectedItem();
            for (Materia materia : ID.obtenerMateriasNOCursadas(alumno.getIdAlumno())) {
                DTM.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), materia.getAnio()});
            }
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jButton1.isEnabled()) {
            if (jTable1.getSelectedRow() != -1) {
                Alumno alumno = (Alumno) JComboAlumnos.getSelectedItem();
                InscripcionData ID = new InscripcionData();
                Materia materia = ID.obtenerMateriasNOCursadas(alumno.getIdAlumno()).get(jTable1.getSelectedRow());
                Inscripcion inscripcion = new Inscripcion(alumno, materia, 0);
                System.out.println();
                ID.guardar(inscripcion);
                vaciarTabla();
                for (Materia materia2 : ID.obtenerMateriasNOCursadas(alumno.getIdAlumno())) {
                    DTM.addRow(new Object[]{materia2.getIdMateria(), materia2.getNombre(), materia2.getAnio()});
                }
            } else {
                JOptionPane.showMessageDialog(this, "selecciona una materia.");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JComboAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboAlumnosActionPerformed
        if (jRadioButton1.isSelected()) {
            InscripcionData ID = new InscripcionData();
            vaciarTabla();
            if (jRadioButton1.isSelected()) {
                vaciarTabla();
                Alumno alumno = (Alumno) JComboAlumnos.getSelectedItem();
                for (Materia materia : ID.obtenerMateriasCursadas(alumno.getIdAlumno())) {
                    DTM.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), materia.getAnio()});
                }
            }
        } else if (jRadioButton2.isSelected()) {
            InscripcionData ID = new InscripcionData();
            vaciarTabla();
            Alumno alumno = (Alumno) JComboAlumnos.getSelectedItem();
            for (Materia materia : ID.obtenerMateriasNOCursadas(alumno.getIdAlumno())) {
                DTM.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), materia.getAnio()});
            }
        }
    }//GEN-LAST:event_JComboAlumnosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jButton2.isEnabled()) {
            if (jTable1.getSelectedRow() != -1) {
                InscripcionData ID = new InscripcionData();
                Alumno alumno = (Alumno) JComboAlumnos.getSelectedItem();
                ID.borrarInscripcionMateria_Alumno(alumno.getIdAlumno(), ID.obtenerMateriasCursadas(alumno.getIdAlumno()).get(jTable1.getSelectedRow()).getIdMateria());
                vaciarTabla();
                for (Materia materia : ID.obtenerMateriasCursadas(alumno.getIdAlumno())) {
                    DTM.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), materia.getAnio()});
                }
            } else {
                JOptionPane.showMessageDialog(this, "selecciona una materia.");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    public void Llenar() {
        JComboAlumnos.removeAllItems();
        for (Alumno alumno : AD.listarAlumnos()) {
            JComboAlumnos.addItem(alumno);
        }
        DTM.setColumnIdentifiers(new Object[]{"ID", "Nombre", "Año"});
        jTable1.setModel(DTM);
        if (jRadioButton1.isSelected()) {
            InscripcionData ID = new InscripcionData();
            vaciarTabla();
            if (jRadioButton1.isSelected()) {
                Alumno alumno = (Alumno) JComboAlumnos.getSelectedItem();
                for (Materia materia : ID.obtenerMateriasCursadas(alumno.getIdAlumno())) {
                    DTM.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), materia.getAnio()});
                }
            }
        }
    }
    public void vaciarTabla(){
        for (int i = DTM.getRowCount() - 1; i >= 0; i--) {
            DTM.removeRow(i);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Alumno> JComboAlumnos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
