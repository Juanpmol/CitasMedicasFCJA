/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;


/**
 *
 * @author Andres Vallejo
 */
public class RegPacienteFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form RegPacienteFrame
     */
    
    private Controlador.PacienteController pacienteController;
    
    public RegPacienteFrame() {
        initComponents();
        pacienteController = new Controlador.PacienteController(this);
        botonRegistrar.addActionListener(pacienteController);
        botonNuevo.addActionListener(pacienteController);
        botonCerrar.addActionListener(pacienteController);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txt_identificacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_nombre1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_nombre2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_apellido1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_apellido2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fechaNacimientoBox = new com.toedter.calendar.JDateChooser();
        sexoBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        botonRegistrar = new javax.swing.JButton();
        botonNuevo = new javax.swing.JButton();
        botonCerrar = new javax.swing.JButton();

        setResizable(true);
        setTitle("Registrar paciente");
        setToolTipText("");
        setName(""); // NOI18N

        jLabel2.setText("Identificación:");

        txt_identificacion.setName("txt_identificacion"); // NOI18N
        txt_identificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_identificacionActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre 1:");

        txt_nombre1.setText("nombre");
        txt_nombre1.setName("txt_nombre1"); // NOI18N
        txt_nombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombre1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre 2:");

        txt_nombre2.setText("nombre");
        txt_nombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombre2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Apellido 1:");

        txt_apellido1.setText("apellido");

        jLabel6.setText("Apellido 2");

        txt_apellido2.setText("apellido");
        txt_apellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellido2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Fecha de Nacimiento:");

        sexoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        sexoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoBoxActionPerformed(evt);
            }
        });

        jLabel8.setText("Sexo:");

        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });

        botonNuevo.setText("Limpiar");
        botonNuevo.setToolTipText("");

        botonCerrar.setText("Cerrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_nombre1, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                    .addComponent(txt_apellido1))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_nombre2, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                    .addComponent(txt_apellido2)))
                            .addComponent(txt_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fechaNacimientoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonRegistrar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(39, 39, 39)
                                .addComponent(sexoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(botonNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(botonCerrar)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txt_nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(fechaNacimientoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sexoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonRegistrar)
                    .addComponent(botonNuevo)
                    .addComponent(botonCerrar))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_identificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_identificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_identificacionActionPerformed

    private void txt_nombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombre1ActionPerformed

    private void txt_nombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombre2ActionPerformed

    private void txt_apellido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellido2ActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void sexoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonCerrar;
    public javax.swing.JButton botonNuevo;
    public javax.swing.JButton botonRegistrar;
    public com.toedter.calendar.JDateChooser fechaNacimientoBox;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JComboBox<String> sexoBox;
    public javax.swing.JTextField txt_apellido1;
    public javax.swing.JTextField txt_apellido2;
    public javax.swing.JTextField txt_identificacion;
    public javax.swing.JTextField txt_nombre1;
    public javax.swing.JTextField txt_nombre2;
    // End of variables declaration//GEN-END:variables
}
