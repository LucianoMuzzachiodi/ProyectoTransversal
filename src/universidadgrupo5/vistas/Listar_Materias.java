package universidadgrupo5.vistas;

import javax.swing.table.DefaultTableModel;
import universidadgrupo5.entidades.*;
import universidadgrupo5.accesoADatos.*;

public class Listar_Materias extends javax.swing.JInternalFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    MateriaData materiaData = new MateriaData();
    
    
    public Listar_Materias() {
        initComponents();
        jRadio1.setSelected(true);
        llenar();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jRadio1 = new javax.swing.JRadioButton();
        jRadio2 = new javax.swing.JRadioButton();

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTabla);

        jRadio1.setText("Materias activas");
        jRadio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadio1ActionPerformed(evt);
            }
        });

        jRadio2.setText("Materias inactivas");
        jRadio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadio2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadio1)
                .addGap(27, 27, 27)
                .addComponent(jRadio2)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadio1)
                    .addComponent(jRadio2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadio2ActionPerformed
        if(jRadio2.isSelected()){
            vaciar();
            jRadio2.setSelected(true);
            jRadio1.setSelected(false);
            
            for (Materia materias : materiaData.listarMaterias()) {
                if(!materias.isActivo()){
                    modelo.addRow(new Object[]{materias.getIdMateria(),materias.getNombre(),materias.getAnio()});
                }
            }
        }
    }//GEN-LAST:event_jRadio2ActionPerformed

    private void jRadio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadio1ActionPerformed
        if(jRadio1.isSelected()){
            vaciar();
            jRadio1.setSelected(true);
            jRadio2.setSelected(false);
            
            for (Materia materias : materiaData.listarMaterias()) {
                if(materias.isActivo()){
                    modelo.addRow(new Object[]{materias.getIdMateria(),materias.getNombre(),materias.getAnio()});
                }
            }
        }
    }//GEN-LAST:event_jRadio1ActionPerformed

    public void llenar(){
        jTabla.removeAll();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        for (Materia materias : materiaData.listarMaterias()) {
            if(materias.isActivo()){
            modelo.addRow(new Object[]{materias.getIdMateria(),materias.getNombre(),materias.getAnio()});
            }
        }
        jTabla.setModel(modelo);
    }
    public void vaciar(){
        for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton jRadio1;
    private javax.swing.JRadioButton jRadio2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    // End of variables declaration//GEN-END:variables
}
