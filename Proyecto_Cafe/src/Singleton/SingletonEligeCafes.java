/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import Decorador.Cafe_Solo;
import Estrategia.Efectivo;
import Estrategia.Tarjetas;
import Iterador.IteraLista;
import Iterador.IteraPrecio;
import Iterador.IteraTipo;
import Iterador.Lista_Cafes;
import Observador.GranHermano;
import Observador.Observador;
import Observador.Sujeto;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto_cafe.Main;
import proyecto_cafe.Main;

/**
 *
 * @author Eli
 */
public class SingletonEligeCafes extends javax.swing.JInternalFrame implements Sujeto {

    boolean todos;
    Lista_Cafes ls;
    IteraLista it;
    IteraPrecio itp;
    IteraTipo itt;
    Cafe_Solo capuccino;
    Cafe_Solo americano;
    Cafe_Solo express;
    Cafe_Solo moka;
    Cafe_Solo capuccino_frio;
    Cafe_Solo moka_frio;
    private float total_pagar;
    private float costo_unidad;
    private static int numIns = 0;
    private static SingletonEligeCafes instancia;
    // Observador
    private ArrayList observadores;

    protected SingletonEligeCafes() {
        numIns++;
        todos = true;
        total_pagar = 0;
        observadores = new ArrayList();

        initComponents();
        iniciar();
    }

    public void iniciar() {

        ls = new Lista_Cafes();
        it = new IteraLista(ls);

        capuccino = new Cafe_Solo('C', "Capuccino", 25);
        americano = new Cafe_Solo('C', "Americano", 23);
        express = new Cafe_Solo('C', "Express", 20);
        moka = new Cafe_Solo('C', "Moka", 21);
        capuccino_frio = new Cafe_Solo('F', "Capuccino Frio", 30);
        moka_frio = new Cafe_Solo('F', "Moka Frio", 35);

        ls.add(capuccino);
        ls.add(americano);
        ls.add(express);
        ls.add(moka);
        ls.add(capuccino_frio);
        ls.add(moka_frio);

        System.out.println(ls.size());
        //ls.mostrar(it);
        tabla(ls.modelo_tabla(it));
    }

    public void tabla(DefaultTableModel modelo) {
        tablaResultado.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filtros = new javax.swing.ButtonGroup();
        pago = new javax.swing.ButtonGroup();
        panelMuestraCafes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaResultado = new javax.swing.JTable();
        btnAcepta = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        radSinFiltro = new javax.swing.JRadioButton();
        radFiltros = new javax.swing.JRadioButton();
        panelFiltros = new javax.swing.JPanel();
        cbxEligeTipo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMayor = new javax.swing.JTextField();
        txtMenor = new javax.swing.JTextField();
        etiNumIns = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JTextField();
        radEfectivo = new javax.swing.JRadioButton();
        radTarjeta = new javax.swing.JRadioButton();
        etiEleccion = new javax.swing.JLabel();
        etiElegido = new javax.swing.JLabel();

        setTitle("Cafes Predefinidos");
        setToolTipText("");

        panelMuestraCafes.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados Busqueda"));

        tablaResultado.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaResultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaResultadoMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaResultado);

        javax.swing.GroupLayout panelMuestraCafesLayout = new javax.swing.GroupLayout(panelMuestraCafes);
        panelMuestraCafes.setLayout(panelMuestraCafesLayout);
        panelMuestraCafesLayout.setHorizontalGroup(
            panelMuestraCafesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );
        panelMuestraCafesLayout.setVerticalGroup(
            panelMuestraCafesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMuestraCafesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        btnAcepta.setText("Aceptar");
        btnAcepta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptaActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        filtros.add(radSinFiltro);
        radSinFiltro.setSelected(true);
        radSinFiltro.setText("Todos");
        radSinFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radSinFiltroActionPerformed(evt);
            }
        });

        filtros.add(radFiltros);
        radFiltros.setText("Filtros");
        radFiltros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radFiltrosActionPerformed(evt);
            }
        });

        panelFiltros.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtros"));

        cbxEligeTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Calientes", "Frios" }));
        cbxEligeTipo.setEnabled(false);
        cbxEligeTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEligeTipoActionPerformed(evt);
            }
        });

        jLabel1.setText("Precio Mayor a:");

        jLabel2.setText("Precio Menor a:");

        txtMayor.setEnabled(false);
        txtMayor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMayorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMayorKeyTyped(evt);
            }
        });

        txtMenor.setEnabled(false);
        txtMenor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMenorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMenorKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelFiltrosLayout = new javax.swing.GroupLayout(panelFiltros);
        panelFiltros.setLayout(panelFiltrosLayout);
        panelFiltrosLayout.setHorizontalGroup(
            panelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFiltrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxEligeTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelFiltrosLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtMenor, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                    .addGroup(panelFiltrosLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtMayor)))
                .addContainerGap())
        );
        panelFiltrosLayout.setVerticalGroup(
            panelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFiltrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxEligeTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMayor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMenor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        etiNumIns.setText("jLabel3");

        jLabel3.setText("Cantidad: ");

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantidadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        jLabel4.setText("Total a Pagar: ");

        txtTotalPagar.setEnabled(false);

        pago.add(radEfectivo);
        radEfectivo.setSelected(true);
        radEfectivo.setText("Efectivo");

        pago.add(radTarjeta);
        radTarjeta.setText("Tarjeta");

        etiEleccion.setText("Cafe Elegido :");

        etiElegido.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        etiElegido.setText("   ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiNumIns)
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAcepta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radSinFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radFiltros))
                            .addComponent(panelFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radEfectivo)
                                .addGap(33, 33, 33)
                                .addComponent(radTarjeta)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(etiEleccion)
                        .addGap(61, 61, 61)
                        .addComponent(etiElegido, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelMuestraCafes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelMuestraCafes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radSinFiltro)
                            .addComponent(radFiltros))
                        .addGap(18, 18, 18)
                        .addComponent(panelFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radEfectivo)
                            .addComponent(radTarjeta))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar)
                            .addComponent(btnAcepta))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiEleccion)
                    .addComponent(etiElegido))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiNumIns)
                    .addComponent(jLabel4)
                    .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptaActionPerformed

        if (radEfectivo.isSelected()) {
            Efectivo ce = new Efectivo(total_pagar);
            ce.mostrar_pago();
            
        } else {
            Tarjetas ct = new Tarjetas(total_pagar);
            ct.mostrar_pago();
        }
        // DESTRUYE SINGLETON
        Main.areaInforme.setText(null);
        Main.abierta_ec = false;
        this.instancia.dispose();
        this.instancia = null;
    }//GEN-LAST:event_btnAceptaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // DESTRUYE SINGLETON
        Main.areaInforme.setText(null);
        Main.abierta_ec = false;
        this.instancia.dispose();
        this.instancia = null;

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void radFiltrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radFiltrosActionPerformed
        cbxEligeTipo.setEnabled(true);
        txtMayor.setEnabled(true);
        txtMenor.setEnabled(true);
        todos = false;
    }//GEN-LAST:event_radFiltrosActionPerformed

    private void radSinFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radSinFiltroActionPerformed
        cbxEligeTipo.setEnabled(false);
        txtMayor.setEnabled(false);
        txtMenor.setEnabled(false);
        iniciar();
    }//GEN-LAST:event_radSinFiltroActionPerformed

    private void tablaResultadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaResultadoMousePressed
        if (evt.getClickCount() == 2) {
            int fila = tablaResultado.getSelectedRow();
            costo_unidad = Float.parseFloat(tablaResultado.getValueAt(fila, 2).toString());
            etiElegido.setText(tablaResultado.getValueAt(fila, 1).toString());
            cambiosMedicion();
        }
    }//GEN-LAST:event_tablaResultadoMousePressed

    private void txtCantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyReleased
        total_pagar = costo_unidad * Integer.parseInt(txtCantidad.getText());
        txtTotalPagar.setText("$ " + total_pagar);

    }//GEN-LAST:event_txtCantidadKeyReleased

    private void cbxEligeTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEligeTipoActionPerformed
        if (cbxEligeTipo.getSelectedIndex() == 0) {
            // Calientes
            itt = new IteraTipo(ls, 'C');
            tabla(ls.modelo_tabla(itt));

        } else {
            // Frios
            itt = new IteraTipo(ls, 'F');
            tabla(ls.modelo_tabla(itt));
        }
    }//GEN-LAST:event_cbxEligeTipoActionPerformed

    private void txtMayorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMayorKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresa numeros", "Tipo de dato erroneo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtMayorKeyTyped

    private void txtMenorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMenorKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresa numeros", "Tipo de dato erroneo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtMenorKeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresa numeros", "Tipo de dato erroneo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtMayorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMayorKeyReleased
        if (!txtMayor.getText().isEmpty()) {
            float precio = Float.parseFloat(txtMayor.getText());
            itp = new IteraPrecio(ls, precio, 'M');
            tabla(ls.modelo_tabla(itp));
        }
    }//GEN-LAST:event_txtMayorKeyReleased

    private void txtMenorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMenorKeyReleased
        if (!txtMenor.getText().isEmpty()) {
            float precio = Float.parseFloat(txtMenor.getText());
            itp = new IteraPrecio(ls, precio, 'm');
            tabla(ls.modelo_tabla(itp));
        }
    }//GEN-LAST:event_txtMenorKeyReleased

    public static SingletonEligeCafes getInstancia() {
        if (instancia == null) {
            instancia = new SingletonEligeCafes();
            instancia.setVisible(true);
            etiNumIns.setText(instancia.getNumIns() + "  " + System.currentTimeMillis());
            GranHermano gran_her = new GranHermano(SingletonEligeCafes.instancia);
        }
        numIns = 0;
        return instancia;

    }

    public int getNumIns() {
        return numIns;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcepta;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox cbxEligeTipo;
    private javax.swing.JLabel etiEleccion;
    private javax.swing.JLabel etiElegido;
    public static javax.swing.JLabel etiNumIns;
    private javax.swing.ButtonGroup filtros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup pago;
    private javax.swing.JPanel panelFiltros;
    private javax.swing.JPanel panelMuestraCafes;
    private javax.swing.JRadioButton radEfectivo;
    private javax.swing.JRadioButton radFiltros;
    private javax.swing.JRadioButton radSinFiltro;
    private javax.swing.JRadioButton radTarjeta;
    private javax.swing.JTable tablaResultado;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtMayor;
    private javax.swing.JTextField txtMenor;
    private javax.swing.JTextField txtTotalPagar;
    // End of variables declaration//GEN-END:variables

    @Override
    public void registraObservador(Observador o) {
        observadores.add(o);
    }

    @Override
    public void remueveObservador(Observador o) {
        int i = observadores.indexOf(o);
        if (i >= 0) {
            observadores.remove(o);
        }
    }

    @Override
    public void notificaObservadores() {
        for (int i = 0; i < observadores.size(); i++) {
            Observador observador = (Observador) observadores.get(i);
            //(float costo_total,float costo_unitario,int cantidad, String nombre);
            observador.actualiza(total_pagar, costo_unidad, obtenCantidad(), etiElegido.getText());
        }
    }

    public void cambiosMedicion() {
        notificaObservadores(); /// cambio de estado modificacion en el estado
    }

    public int obtenCantidad() {
        int cantidad = 0;
        if (!txtCantidad.getText().isEmpty()) {
            cantidad = Integer.parseInt(txtCantidad.getText());
        }
        return cantidad;
    }

}
