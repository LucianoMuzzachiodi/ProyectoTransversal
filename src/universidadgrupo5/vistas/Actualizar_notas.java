package universidadgrupo5.vistas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadgrupo5.accesoADatos.*;
import universidadgrupo5.entidades.*;

public class Actualizar_notas extends javax.swing.JInternalFrame {
    AlumnoData AD = new AlumnoData();
    InscripcionData ID = new InscripcionData();
    DefaultTableModel DTM = new DefaultTableModel();
    
    public Actualizar_notas() {
        initComponents();
        JComboAlumno.removeAllItems();
        for (Alumno alumno : AD.listarAlumnos()) {
            JComboAlumno.addItem(alumno);
        }
        DTM.setColumnIdentifiers(new Object[]{"ID", "Nombre", "Nota"});
        vaciarTabla();
        Alumno alumno = (Alumno) JComboAlumno.getSelectedItem();
        for (Inscripcion inscripcion : ID.obtenerInscripcionesPorAlumno(alumno.getIdAlumno())) {
            DTM.addRow(new Object[]{inscripcion.getMateria().getIdMateria(), inscripcion.getMateria().getNombre(), inscripcion.getNota()});
        }
        JTable.setModel(DTM);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JComboAlumno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSalir = new javax.swing.JButton();

        setTitle("Administración de notas");

        jLabel1.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jLabel1.setText("Seleccionar alumno");
        jPanel1.add(jLabel1);

        JComboAlumno.setFont(new java.awt.Font("DialogInput", 0, 10)); // NOI18N
        JComboAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboAlumnoActionPerformed(evt);
            }
        });
        jPanel1.add(JComboAlumno);

        JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Materia", "Nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(JTable);
        if (JTable.getColumnModel().getColumnCount() > 0) {
            JTable.getColumnModel().getColumn(0).setResizable(false);
            JTable.getColumnModel().getColumn(1).setResizable(false);
            JTable.getColumnModel().getColumn(2).setResizable(false);
        }

        jGuardar.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jGuardar.setText("Guardar");
        jGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(jGuardar);

        jLabel2.setText("                                                                                                         ");
        jPanel2.add(jLabel2);

        jSalir.setFont(new java.awt.Font("DialogInput", 0, 15)); // NOI18N
        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });
        jPanel2.add(jSalir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JComboAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboAlumnoActionPerformed
        if (JComboAlumno.getSelectedIndex() != -1) {
            vaciarTabla();
            Alumno alumno = (Alumno) JComboAlumno.getSelectedItem();
            for (Inscripcion inscripcion : ID.obtenerInscripcionesPorAlumno(alumno.getIdAlumno())) {
                DTM.addRow(new Object[]{inscripcion.getMateria().getIdMateria(), inscripcion.getMateria().getNombre(), inscripcion.getNota()});
            }
        }
    }//GEN-LAST:event_JComboAlumnoActionPerformed

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed
        if (JTable.getSelectedRow() != -1 && JComboAlumno.getSelectedIndex() != -1) {
            try {
                Inscripcion inscripcion = ID.obtenerInscripcionesPorAlumno(((Alumno) JComboAlumno.getSelectedItem()).getIdAlumno()).get(JTable.getSelectedRow());
                ID.actualizarNota(inscripcion.getAlumno().getIdAlumno(), inscripcion.getMateria().getIdMateria(), (double) DTM.getValueAt(JTable.getSelectedRow(), 2));
                vaciarTabla();
                for (Inscripcion materia : ID.obtenerInscripcionesPorAlumno(((Alumno) JComboAlumno.getItemAt(JComboAlumno.getSelectedIndex())).getIdAlumno())) {
                    DTM.addRow(new Object[]{materia.getMateria().getIdMateria(), materia.getMateria().getNombre(), materia.getNota()});
                }
            } catch (NumberFormatException cs) {
                JOptionPane.showMessageDialog(this, "Debe ser un número.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Elegir materia a guardar.");
        }
    }//GEN-LAST:event_jGuardarActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jSalirActionPerformed

    public void llenar(){
        vaciarTabla();
        DTM.addColumn("ID");
        DTM.addColumn("Nombre");
        DTM.addColumn("Nota");
        for (Inscripcion materia : ID.obtenerInscripcionesPorAlumno(((Alumno) JComboAlumno.getItemAt(JComboAlumno.getSelectedIndex())).getIdAlumno())) {
            DTM.addRow(new Object[]{materia.getMateria().getIdMateria(), materia.getMateria().getNombre(), materia.getNota()});
        }
        JTable.setModel(DTM);
    }
    public void vaciarTabla(){
        for (int i = DTM.getRowCount() - 1; i >= 0; i--) {
            DTM.removeRow(i);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Alumno> JComboAlumno;
    private javax.swing.JTable JTable;
    private javax.swing.JButton jGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jSalir;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
