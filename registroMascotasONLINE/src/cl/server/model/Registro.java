
package cl.server.model;

import javax.swing.JTable;

public class Registro extends javax.swing.JFrame {

    public Registro() {
        initComponents();
    }
    
    public JTable getTablaRegistros(){
        return tblRegistroMascota;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblRegistroMascota = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblRegistroMascota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Mascota", "Edad", "ID/RUT", "Raza", "Tamaño", "Sexo", "Nombre de Dueño", "RUT Dueño"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRegistroMascota.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblRegistroMascota);
        if (tblRegistroMascota.getColumnModel().getColumnCount() > 0) {
            tblRegistroMascota.getColumnModel().getColumn(0).setResizable(false);
            tblRegistroMascota.getColumnModel().getColumn(0).setPreferredWidth(20);
            tblRegistroMascota.getColumnModel().getColumn(1).setResizable(false);
            tblRegistroMascota.getColumnModel().getColumn(1).setPreferredWidth(5);
            tblRegistroMascota.getColumnModel().getColumn(2).setResizable(false);
            tblRegistroMascota.getColumnModel().getColumn(2).setPreferredWidth(10);
            tblRegistroMascota.getColumnModel().getColumn(3).setResizable(false);
            tblRegistroMascota.getColumnModel().getColumn(3).setPreferredWidth(10);
            tblRegistroMascota.getColumnModel().getColumn(4).setResizable(false);
            tblRegistroMascota.getColumnModel().getColumn(4).setPreferredWidth(10);
            tblRegistroMascota.getColumnModel().getColumn(5).setResizable(false);
            tblRegistroMascota.getColumnModel().getColumn(5).setPreferredWidth(10);
            tblRegistroMascota.getColumnModel().getColumn(6).setResizable(false);
            tblRegistroMascota.getColumnModel().getColumn(6).setPreferredWidth(20);
            tblRegistroMascota.getColumnModel().getColumn(7).setResizable(false);
            tblRegistroMascota.getColumnModel().getColumn(7).setPreferredWidth(10);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
        
        
        
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblRegistroMascota;
    // End of variables declaration//GEN-END:variables
}
