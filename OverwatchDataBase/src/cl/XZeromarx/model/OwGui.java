/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.XZeromarx.model;

import cl.XZeromarx.log.Herramienta;

/**
 *
 * @author XZeroMarx
 */
public class OwGui extends javax.swing.JFrame {

    /**
     * Creates new form OwGui
     */
    Herramienta dimension = new Herramienta();

    public OwGui() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Overwatch DataBase");
        vtnInfo.setTitle("Información");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vtnInfo = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        lblHeroe = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblClase = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        vtnPrincipal = new javax.swing.JPanel();
        cmbHeroes = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cbClase = new javax.swing.JCheckBox();
        cbHabilidades = new javax.swing.JCheckBox();
        chDificultad = new javax.swing.JCheckBox();
        cbDaño = new javax.swing.JCheckBox();
        cbHistoria = new javax.swing.JCheckBox();

        jLabel3.setText("Heroe:");

        lblHeroe.setText("---------");

        jLabel4.setText("Clase:");

        lblClase.setText("---------");

        jLabel5.setText("Datos");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel6.setText("Historia");

        javax.swing.GroupLayout vtnInfoLayout = new javax.swing.GroupLayout(vtnInfo.getContentPane());
        vtnInfo.getContentPane().setLayout(vtnInfoLayout);
        vtnInfoLayout.setHorizontalGroup(
            vtnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vtnInfoLayout.createSequentialGroup()
                .addGroup(vtnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vtnInfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(vtnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(40, 40, 40)
                        .addGroup(vtnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblClase)
                            .addComponent(lblHeroe)))
                    .addGroup(vtnInfoLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel5)))
                .addGap(133, 133, 133)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(654, Short.MAX_VALUE))
        );
        vtnInfoLayout.setVerticalGroup(
            vtnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(vtnInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(vtnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vtnInfoLayout.createSequentialGroup()
                        .addGroup(vtnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblHeroe))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(vtnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblClase))
                        .addGap(43, 43, 43)
                        .addComponent(jLabel5))
                    .addComponent(jLabel6))
                .addContainerGap(530, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbHeroes.setBackground(new java.awt.Color(255, 255, 153));
        cmbHeroes.setFont(new java.awt.Font("Dotum", 0, 12)); // NOI18N
        cmbHeroes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Heroe", "Doomfist", "Genji", "Mccre", "Pharah", "Reaper", "Soldado: 76", "Sombra", "Tracer", "Bastion", "Hanzo", "Junkrat", "Mei", "Torbjörn", "Widowmaker", "D.Va", "Orisa", "Reinhardt", "Roadhog", "Winston", "Zarya", "Ana", "Brigitte", "Lúcio", "Mercy", "Moira", "Symmetra", "Zenyatta" }));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Que heroe desea examinar");

        jLabel2.setText("Que datos del heroe desea mostrar");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        cbClase.setText("Clase");

        cbHabilidades.setText("Habilidades");

        chDificultad.setText("Dificultad");

        cbDaño.setText("Daño");

        cbHistoria.setText("Historia");

        javax.swing.GroupLayout vtnPrincipalLayout = new javax.swing.GroupLayout(vtnPrincipal);
        vtnPrincipal.setLayout(vtnPrincipalLayout);
        vtnPrincipalLayout.setHorizontalGroup(
            vtnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vtnPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(vtnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbHeroes, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(vtnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(btnBuscar)
                    .addComponent(cbClase)
                    .addComponent(cbHabilidades)
                    .addComponent(chDificultad)
                    .addComponent(cbDaño)
                    .addComponent(cbHistoria))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        vtnPrincipalLayout.setVerticalGroup(
            vtnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vtnPrincipalLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbHeroes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(vtnPrincipalLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(vtnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(vtnPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cbClase)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbHabilidades)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chDificultad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbDaño)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbHistoria)
                        .addGap(29, 29, 29)
                        .addComponent(btnBuscar)
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vtnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vtnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        vtnInfo.setSize(dimension.getAnchoPantalla() / 2, dimension.getAltoPantalla() / 2);
        vtnInfo.setLocationRelativeTo(null);
        vtnInfo.setResizable(false);
        vtnInfo.setVisible(true);
        vtnInfo.setFocusable(true);


    }//GEN-LAST:event_btnBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(OwGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OwGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OwGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OwGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OwGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JCheckBox cbClase;
    private javax.swing.JCheckBox cbDaño;
    private javax.swing.JCheckBox cbHabilidades;
    private javax.swing.JCheckBox cbHistoria;
    private javax.swing.JCheckBox chDificultad;
    private javax.swing.JComboBox<String> cmbHeroes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblClase;
    private javax.swing.JLabel lblHeroe;
    private javax.swing.JFrame vtnInfo;
    private javax.swing.JPanel vtnPrincipal;
    // End of variables declaration//GEN-END:variables
}