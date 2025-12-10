/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package uiux.empleado;

import bakend.daos.DaoEmpleado;
import bakend.objetos.Empleado;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author Emmanuel
 */
public class agregarVisitas extends javax.swing.JPanel {

    private boolean esEdicion = false;
    private Empleado empleadoOriginal;

    /**
     * Creates new form agregarEmpleado
     */
    public agregarVisitas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtNombre5 = new javax.swing.JLabel();
        txtNombre6 = new javax.swing.JLabel();
        txtNombre7 = new javax.swing.JLabel();
        txtNombre8 = new javax.swing.JLabel();
        caja_fecha = new javax.swing.JTextField();
        txtNombre9 = new javax.swing.JLabel();
        caja_usuario1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btn_agregar_visita = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btn_eliminar = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtNombre5.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        txtNombre5.setText("Propiedad");

        txtNombre6.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        txtNombre6.setText("Cliente");

        txtNombre7.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        txtNombre7.setText("Empleado");

        txtNombre8.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        txtNombre8.setText("Fecha");

        caja_fecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtNombre9.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        txtNombre9.setText("Comentario");

        caja_usuario1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(caja_usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombre7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombre8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(caja_fecha, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNombre5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(txtNombre6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(59, 59, 59))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre5)
                    .addComponent(txtNombre6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtNombre7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtNombre8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caja_fecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombre9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caja_usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btn_agregar_visita.setBackground(new java.awt.Color(242, 242, 242));
        btn_agregar_visita.setText("AGREGAR");
        btn_agregar_visita.setBorder(null);
        btn_agregar_visita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar_visitaActionPerformed(evt);
            }
        });

        btn_cancelar.setBackground(new java.awt.Color(242, 242, 242));
        btn_cancelar.setText("CANCELAR");
        btn_cancelar.setBorder(null);
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_agregar_visita, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_agregar_visita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        btn_eliminar.setBackground(new java.awt.Color(255, 153, 153));
        btn_eliminar.setText("del");
        btn_eliminar.setBorder(null);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Sitka Text", 0, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("AGREGAR VISITA");
        titulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        titulo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        titulo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        java.awt.Window ventana = javax.swing.SwingUtilities.getWindowAncestor(this);
        ventana.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_agregar_visitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_visitaActionPerformed
        java.awt.Window ventana = javax.swing.SwingUtilities.getWindowAncestor(this);
        titulo.setText("AGREGAR EMPLEADO");
        // Después: solo mostrar si es edición
        btn_eliminar.setVisible(esEdicion);

        String segAp = caja_fecha.getText().trim();
        String sexo = tipo_sexo.getSelectedItem().toString();

        if ("Mujer".equals(sexo)) {
            sexo = "F";
        } else {
            sexo = "M";
        }
        // Revisar que no haya campos vacíos
        if (usuario.isEmpty() || nombre.isEmpty() || prAp.isEmpty() || segAp.isEmpty()
                || fecha.isEmpty() || telefono.isEmpty() || correo.isEmpty() || contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios");
            return;
        }

        if (usuario.length() > 6) {
            JOptionPane.showMessageDialog(this, "Usuario: Maximo 6 caracteres");
        }

        // Validar que solo contengan letras
        if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
            JOptionPane.showMessageDialog(this, "El nombre solo puede contener letras");
            return;
        }

        if (!prAp.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
            JOptionPane.showMessageDialog(this, "El primer apellido solo puede contener letras");
            return;
        }

        if (!segAp.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
            JOptionPane.showMessageDialog(this, "El segundo apellido solo puede contener letras");
            return;
        }

        // Validar fecha
        LocalDate fechaNac;
        try {
            fechaNac = LocalDate.parse(fecha); // formato YYYY-MM-DD
        } catch (DateTimeParseException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese una fecha válida (AAAA-MM-DD)");
            return;
        }

        // Verificar que no sea superior a hoy
        if (fechaNac.isAfter(LocalDate.now())) {
            JOptionPane.showMessageDialog(this, "La fecha de nacimiento no puede ser superior a la fecha actual");
            return;
        }

        // Validar teléfono (solo números y longitud 10)
        if (!telefono.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Ingrese un número de teléfono válido (solo dígitos)");
            return;
        }

        if (telefono.length() != 10) {
            JOptionPane.showMessageDialog(this, "El número de teléfono debe tener 10 dígitos");
            return;
        }

        // Validar correo
        if (!correo.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$")) {
            JOptionPane.showMessageDialog(this, "Ingrese un correo válido");
            return;
        }

        String regexContrasena = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[!@#$%^&*()\\-+=]).{8,}$";

        if (!contrasena.matches(regexContrasena)) {
            JOptionPane.showMessageDialog(this,
                    "La contraseña debe tener al menos:\n"
                    + "- 1 letra\n"
                    + "- 1 número\n"
                    + "- 1 carácter especial (!@#$%^&*()-+=)\n"
                    + "- Mínimo 8 caracteres");
            return;
        }

        // Si todo está bien, crear el objeto Empleado
        Empleado emp = new Empleado();
        emp.setIdEmpleado(usuario);
        emp.setSuperEmpleado("EMP001");
        emp.setNombre(nombre);
        emp.setPrimerAp(prAp);
        emp.setSegundoAp(segAp);
        emp.setSexo(sexo);
        java.sql.Date sqlDate = java.sql.Date.valueOf(fecha); // convierte a java.sql.Date
        emp.setFechaNac(sqlDate); // cambia el tipo de la propiedad fechaNac a java.sql.Date
        emp.setPuesto(puesto);
        emp.setNumTel(telefono);
        emp.setCorreo(correo);
        emp.setContrasena(contrasena);

        // Llamar al DAO para guardar en BD
        DaoEmpleado dao = new DaoEmpleado();
        try {
            if (esEdicion) {
                // Mantener el mismo ID
                emp.setIdEmpleado(empleadoOriginal.getIdEmpleado());
                dao.actualizarEmpleado(emp);
                JOptionPane.showMessageDialog(this, "Empleado actualizado correctamente");
            } else {
                dao.insertarEmpleado(emp);  // <-- Aquí se corrige
                JOptionPane.showMessageDialog(this, "Empleado agregado correctamente");
            }
            ventana.dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }


    }//GEN-LAST:event_btn_agregar_visitaActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(
                this,
                "¿Está seguro que desea eliminar este empleado?",
                "Confirmar eliminación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
        );

        // Si el usuario elige "Sí"
        if (respuesta == JOptionPane.YES_OPTION) {
            try {
                DaoEmpleado dao = new DaoEmpleado();
                String idEmpleado = caja_propiedad.getText().trim(); // o el ID que tengas seleccionado
                dao.eliminarEmpleado(idEmpleado); // método que borre de la BD
                JOptionPane.showMessageDialog(this, "Empleado eliminado correctamente");

                // Opcional: cerrar ventana o limpiar campos
                java.awt.Window ventana = javax.swing.SwingUtilities.getWindowAncestor(this);
                ventana.dispose();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al eliminar: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    public agregarVisitas(Empleado emp) {
        initComponents();
        esEdicion = true;
        empleadoOriginal = emp;
        btn_eliminar.setVisible(true);

        titulo.setText("MODIFICAR");
        // Llenar los campos como ya lo tienes
        caja_propiedad.setText(emp.getIdEmpleado());
        caja_cliente.setText(emp.getNombre());
        caja_empleado.setText(emp.getPrimerAp());
        caja_fecha.setText(emp.getSegundoAp());
        tipo_sexo.setSelectedItem(emp.getSexo().equalsIgnoreCase("F") ? "Mujer" : "Hombre");
        caja_fecha_nac.setText(emp.getFechaNac().toString());
        tipo_puesto.setSelectedItem(emp.getPuesto());
        caja_num_tel.setText(emp.getNumTel());
        caja_usuario11.setText(emp.getCorreo());
        caja_usuario7.setText(emp.getContrasena());

        caja_propiedad.setEditable(false);
        // Si es edición, cambiar texto del botón
        btn_agregar_visita.setText("GUARDAR CAMBIOS");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar_visita;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JTextField caja_fecha;
    private javax.swing.JTextField caja_usuario1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel txtNombre5;
    private javax.swing.JLabel txtNombre6;
    private javax.swing.JLabel txtNombre7;
    private javax.swing.JLabel txtNombre8;
    private javax.swing.JLabel txtNombre9;
    // End of variables declaration//GEN-END:variables
}
