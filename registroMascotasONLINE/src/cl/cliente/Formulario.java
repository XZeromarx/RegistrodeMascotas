package cl.cliente;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author XZeroMarx
 */
public class Formulario extends javax.swing.JFrame {

    public Formulario() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Registro de Mascotas");
    }

    private Socket cliente;

    private ObjectOutputStream outObj;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdgroupSexo = new javax.swing.ButtonGroup();
        rdgroupTamanio = new javax.swing.ButtonGroup();
        pnlPrinc = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreMascota = new javax.swing.JTextField();
        spEdad = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        txtIdMascota = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        rdMacho = new javax.swing.JRadioButton();
        rdHembra = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombreDuenio = new javax.swing.JTextField();
        txtRutDuenio = new javax.swing.JTextField();
        txtDireccionDuenio = new javax.swing.JTextField();
        btnRegistrarMascota = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        rdPequenio = new javax.swing.JRadioButton();
        rdMediano = new javax.swing.JRadioButton();
        rdGrande = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPrinc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formulario de registro de mascotas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Console", 1, 12))); // NOI18N
        pnlPrinc.setForeground(new java.awt.Color(0, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Nombre Mascota: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Edad: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("ID/RUT: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Raza: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Sexo:");

        rdgroupSexo.add(rdMacho);
        rdMacho.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdMacho.setSelected(true);
        rdMacho.setText("Macho");

        rdgroupSexo.add(rdHembra);
        rdHembra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdHembra.setText("Hembra");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Datos de dueño");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Nombre:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("RUT: ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Direccion: ");

        btnRegistrarMascota.setText("Registrar Mascota");
        btnRegistrarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarMascotaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Tamaño:");

        rdgroupTamanio.add(rdPequenio);
        rdPequenio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rdPequenio.setSelected(true);
        rdPequenio.setText("Pequeño");

        rdgroupTamanio.add(rdMediano);
        rdMediano.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rdMediano.setText("Mediano");

        rdgroupTamanio.add(rdGrande);
        rdGrande.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rdGrande.setText("Grande");

        javax.swing.GroupLayout pnlPrincLayout = new javax.swing.GroupLayout(pnlPrinc);
        pnlPrinc.setLayout(pnlPrincLayout);
        pnlPrincLayout.setHorizontalGroup(
            pnlPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincLayout.createSequentialGroup()
                        .addGroup(pnlPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPrincLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlPrincLayout.createSequentialGroup()
                                        .addComponent(rdPequenio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rdMediano)
                                        .addGap(7, 7, 7)
                                        .addComponent(rdGrande))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincLayout.createSequentialGroup()
                                        .addComponent(rdMacho)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdHembra)
                                        .addGap(43, 43, 43))))
                            .addGroup(pnlPrincLayout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(pnlPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(pnlPrincLayout.createSequentialGroup()
                        .addGroup(pnlPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreMascota)
                            .addComponent(spEdad)
                            .addComponent(txtIdMascota))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(pnlPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreDuenio)
                            .addComponent(txtRutDuenio)
                            .addComponent(txtDireccionDuenio)))
                    .addGroup(pnlPrincLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlPrincLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnRegistrarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlPrincLayout.setVerticalGroup(
            pnlPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlPrincLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel8)
                        .addGap(46, 46, 46)
                        .addGroup(pnlPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtRutDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtDireccionDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))))
            .addGroup(pnlPrincLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(pnlPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIdMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdMacho)
                    .addComponent(rdHembra)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27)
                .addGroup(pnlPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdPequenio)
                    .addComponent(rdMediano)
                    .addComponent(rdGrande)
                    .addComponent(jLabel11))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPrinc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPrinc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarMascotaActionPerformed
        Mascota m = new Mascota();

        m.setNombre(txtNombreMascota.getText());
        if (txtNombreMascota.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "nombre de mascota esta vacío");
        }

        m.setRun(txtIdMascota.getText());

        if (txtIdMascota.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "ID/Rut de mascota esta vacío");
        }

        m.setEdad(Integer.parseInt(spEdad.getValue().toString()));
        m.setRaza(txtRaza.getText());

        if (txtRaza.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "raza de mascota esta vacía");
        }

        if (rdMacho.isSelected()) {
            m.setSexo("Macho");
        } else {
            m.setSexo("Hembra");
        }

        if (rdPequenio.isSelected()) {
            m.setTamanio("Pequeño");
        } else if (rdMediano.isSelected()) {
            m.setTamanio("Mediano");
        } else {
            m.setTamanio("Grande");
        }

        Duenio duenio = new Duenio();

        duenio.setNombre(txtNombreDuenio.getText());
        if (txtNombreDuenio.getText().equalsIgnoreCase("")) {

            JOptionPane.showMessageDialog(null, "nombre dueño de mascota esta vacío");
        }
        duenio.setRut(txtRutDuenio.getText());
        if (txtRutDuenio.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "rut de dueño de mascota esta vacío");

        }
        duenio.setDireccion(txtDireccionDuenio.getText());
        if (txtDireccionDuenio.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "direccion de dueño de mascota esta vacía");

        }

        if (confirmarEnvio()) {
            if (txtNombreDuenio.getText().trim().equals("") || txtRutDuenio.getText().trim().equals("") || txtIdMascota.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Tiene que haber aunque sea un nombre de dueño y su rut");
            } else {
                try {

                    enviarObjetos(m,duenio);
                    

                    txtNombreMascota.setText("");
                    spEdad.setValue(0);
                    txtIdMascota.setText("");
                    txtRaza.setText("");
                    rdMacho.isSelected();
                    rdPequenio.isSelected();
                    txtNombreDuenio.setText("");
                    txtRutDuenio.setText("");
                    txtDireccionDuenio.setText("");
                    txtNombreMascota.setFocusable(true);

                } catch (IOException | ClassNotFoundException ex) {
                    Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }


    }//GEN-LAST:event_btnRegistrarMascotaActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarMascota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel pnlPrinc;
    private javax.swing.JRadioButton rdGrande;
    private javax.swing.JRadioButton rdHembra;
    private javax.swing.JRadioButton rdMacho;
    private javax.swing.JRadioButton rdMediano;
    private javax.swing.JRadioButton rdPequenio;
    private javax.swing.ButtonGroup rdgroupSexo;
    private javax.swing.ButtonGroup rdgroupTamanio;
    private javax.swing.JSpinner spEdad;
    private javax.swing.JTextField txtDireccionDuenio;
    private javax.swing.JTextField txtIdMascota;
    private javax.swing.JTextField txtNombreDuenio;
    private javax.swing.JTextField txtNombreMascota;
    private javax.swing.JTextField txtRaza;
    private javax.swing.JTextField txtRutDuenio;
    // End of variables declaration//GEN-END:variables

    private void enviarObjetos(Object m, Object d) throws IOException, ClassNotFoundException {

        try {
            cliente = new Socket("localhost", 5000);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No se ha encontrado servidor");
        }
        
        List<Object> objetos = new ArrayList<>();
        objetos.add(m);
        objetos.add(d);
        
        outObj = new ObjectOutputStream(cliente.getOutputStream());

        outObj.writeObject(objetos);//envía la clase 

        cliente.close();//se "cierra" la conexión del cliente

    }

    private boolean confirmarEnvio() {
        boolean confirmacion = false;
        if (JOptionPane.showConfirmDialog(this, "Confirmar envio de formulario?") == JOptionPane.YES_OPTION) {
            confirmacion = true;
        }

        return confirmacion;
    }
}
