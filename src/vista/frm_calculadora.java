/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;
import modelo.operacion;
import java.awt.Toolkit;
/**
 *
 * @author robin
 */
public class frm_calculadora extends javax.swing.JFrame {

    /**
     * Creates new form frm_calculadora
     */
    
    private float num1;
    private float num2;
    private String operador;
    
    
    public frm_calculadora() {
        super("CALCULADORA");
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        panel_escritorio = new javax.swing.JDesktopPane();
        btn_4 = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_divi = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_suma = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        lbl_datos = new javax.swing.JLabel();
        btn_multi = new javax.swing.JButton();
        btn_resta = new javax.swing.JButton();
        btn_cero = new javax.swing.JButton();
        Menu = new javax.swing.JMenuBar();
        menu_opc = new javax.swing.JMenu();
        menu_nuevo = new javax.swing.JMenuItem();
        menu_historial = new javax.swing.JMenuItem();
        menu_ayuda = new javax.swing.JMenu();
        manual_user = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(204, 204, 204));

        panel_escritorio.setBackground(new java.awt.Color(204, 204, 204));
        panel_escritorio.setForeground(new java.awt.Color(102, 255, 102));

        btn_4.setBackground(new java.awt.Color(153, 204, 255));
        btn_4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btn_4.setText("4");
        btn_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        btn_punto.setBackground(new java.awt.Color(153, 204, 255));
        btn_punto.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btn_punto.setText(".");
        btn_punto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puntoActionPerformed(evt);
            }
        });

        btn_igual.setBackground(new java.awt.Color(153, 204, 255));
        btn_igual.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btn_igual.setText("=");
        btn_igual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });

        btn_1.setBackground(new java.awt.Color(153, 204, 255));
        btn_1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btn_1.setText("1");
        btn_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        btn_divi.setBackground(new java.awt.Color(153, 204, 255));
        btn_divi.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btn_divi.setText("/");
        btn_divi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_divi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_diviActionPerformed(evt);
            }
        });

        btn_2.setBackground(new java.awt.Color(153, 204, 255));
        btn_2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btn_2.setText("2");
        btn_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        btn_5.setBackground(new java.awt.Color(153, 204, 255));
        btn_5.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btn_5.setText("5");
        btn_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });

        btn_3.setBackground(new java.awt.Color(153, 204, 255));
        btn_3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btn_3.setText("3");
        btn_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        btn_suma.setBackground(new java.awt.Color(153, 204, 255));
        btn_suma.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btn_suma.setText("+");
        btn_suma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumaActionPerformed(evt);
            }
        });

        btn_7.setBackground(new java.awt.Color(153, 204, 255));
        btn_7.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btn_7.setText("7");
        btn_7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });

        btn_6.setBackground(new java.awt.Color(153, 204, 255));
        btn_6.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btn_6.setText("6");
        btn_6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });

        btn_8.setBackground(new java.awt.Color(153, 204, 255));
        btn_8.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btn_8.setText("8");
        btn_8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });

        btn_9.setBackground(new java.awt.Color(153, 204, 255));
        btn_9.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btn_9.setText("9");
        btn_9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });

        lbl_datos.setBackground(new java.awt.Color(51, 255, 51));
        lbl_datos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_datos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_datos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_multi.setBackground(new java.awt.Color(153, 204, 255));
        btn_multi.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btn_multi.setText("*");
        btn_multi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiActionPerformed(evt);
            }
        });

        btn_resta.setBackground(new java.awt.Color(153, 204, 255));
        btn_resta.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btn_resta.setText("-");
        btn_resta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaActionPerformed(evt);
            }
        });

        btn_cero.setBackground(new java.awt.Color(153, 204, 255));
        btn_cero.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btn_cero.setText("0");
        btn_cero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ceroActionPerformed(evt);
            }
        });

        panel_escritorio.setLayer(btn_4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_escritorio.setLayer(btn_punto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_escritorio.setLayer(btn_igual, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_escritorio.setLayer(btn_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_escritorio.setLayer(btn_divi, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_escritorio.setLayer(btn_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_escritorio.setLayer(btn_5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_escritorio.setLayer(btn_3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_escritorio.setLayer(btn_suma, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_escritorio.setLayer(btn_7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_escritorio.setLayer(btn_6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_escritorio.setLayer(btn_8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_escritorio.setLayer(btn_9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_escritorio.setLayer(lbl_datos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_escritorio.setLayer(btn_multi, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_escritorio.setLayer(btn_resta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_escritorio.setLayer(btn_cero, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panel_escritorioLayout = new javax.swing.GroupLayout(panel_escritorio);
        panel_escritorio.setLayout(panel_escritorioLayout);
        panel_escritorioLayout.setHorizontalGroup(
            panel_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_escritorioLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(panel_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_escritorioLayout.createSequentialGroup()
                        .addComponent(btn_cero, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_punto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_divi, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_escritorioLayout.createSequentialGroup()
                        .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_multi, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_escritorioLayout.createSequentialGroup()
                        .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_suma, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_escritorioLayout.createSequentialGroup()
                        .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_resta, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
        );
        panel_escritorioLayout.setVerticalGroup(
            panel_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_escritorioLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lbl_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(panel_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_suma, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_resta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_multi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_punto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_divi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        menu_opc.setText("Opciones");
        menu_opc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_opcActionPerformed(evt);
            }
        });

        menu_nuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menu_nuevo.setText("Nuevo");
        menu_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_nuevoActionPerformed(evt);
            }
        });
        menu_opc.add(menu_nuevo);

        menu_historial.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menu_historial.setText("Historial");
        menu_historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_historialActionPerformed(evt);
            }
        });
        menu_opc.add(menu_historial);

        Menu.add(menu_opc);

        menu_ayuda.setText("Ayuda");
        menu_ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ayudaActionPerformed(evt);
            }
        });

        manual_user.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        manual_user.setText("Manual de Usuario");
        manual_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manual_userActionPerformed(evt);
            }
        });
        menu_ayuda.add(manual_user);

        Menu.add(menu_ayuda);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void menu_ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ayudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_ayudaActionPerformed

    private void manual_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manual_userActionPerformed
        // TODO add your handling code here:
        Manual verventana = new Manual();
        panel_escritorio.add(verventana);
        verventana.show();
    }//GEN-LAST:event_manual_userActionPerformed

    private void btn_ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ceroActionPerformed
        // TODO add your handling code here:
        Toolkit.getDefaultToolkit().beep();
        this.lbl_datos.setText(this.lbl_datos.getText()+"0");
    }//GEN-LAST:event_btn_ceroActionPerformed

    private void btn_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restaActionPerformed
        // TODO add your handling code here:
        this.num1=Float.parseFloat(this.lbl_datos.getText());
        this.operador="-";
        this.lbl_datos.setText("");
    }//GEN-LAST:event_btn_restaActionPerformed

    private void btn_multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiActionPerformed
        // TODO add your handling code here:
        this.num1=Float.parseFloat(this.lbl_datos.getText());
        this.operador="*";
        this.lbl_datos.setText("");
    }//GEN-LAST:event_btn_multiActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        // TODO add your handling code here:
        Toolkit.getDefaultToolkit().beep();
        this.lbl_datos.setText(this.lbl_datos.getText()+"9");
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        // TODO add your handling code here:
        Toolkit.getDefaultToolkit().beep();
        this.lbl_datos.setText(this.lbl_datos.getText()+"8");
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        // TODO add your handling code here:
        Toolkit.getDefaultToolkit().beep();
        this.lbl_datos.setText(this.lbl_datos.getText()+"6");
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        // TODO add your handling code here:
        Toolkit.getDefaultToolkit().beep();
        this.lbl_datos.setText(this.lbl_datos.getText()+"7");
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumaActionPerformed
        // TODO add your handling code here:
        this.num1=Float.parseFloat(this.lbl_datos.getText());
        this.operador="+";
        this.lbl_datos.setText("");
    }//GEN-LAST:event_btn_sumaActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        // TODO add your handling code here:
        Toolkit.getDefaultToolkit().beep();
        this.lbl_datos.setText(this.lbl_datos.getText()+"3");
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        // TODO add your handling code here:
        Toolkit.getDefaultToolkit().beep();
        this.lbl_datos.setText(this.lbl_datos.getText()+"5");
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        // TODO add your handling code here:
        Toolkit.getDefaultToolkit().beep();
        this.lbl_datos.setText(this.lbl_datos.getText()+"2");
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_diviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_diviActionPerformed
        // TODO add your handling code here:
        this.num1=Float.parseFloat(this.lbl_datos.getText());
        this.operador="/";
        this.lbl_datos.setText("");
    }//GEN-LAST:event_btn_diviActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        // TODO add your handling code here:
        Toolkit.getDefaultToolkit().beep();
        this.lbl_datos.setText(this.lbl_datos.getText()+"1");
        
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed

        this.num2 = Float.parseFloat(this.lbl_datos.getText());

    // Declarar la variable resultado
    float resultado = 0;

    // Realizar la operación según el operador
    switch (this.operador) {
        case "+":
            resultado = this.num1 + this.num2;
            
            break;
        case "-":
            resultado = this.num1 - this.num2;
            break;
        case "*":
            resultado = this.num1 * this.num2;
            break;
        case "/":
            resultado = this.num1 / this.num2;
            break;
    }
    // Actualizar el texto del lbl_datos con el resultado
    this.lbl_datos.setText(String.valueOf(resultado));

    // Convertir num1, num2 y el resultado a String
    String strNum1 = String.valueOf(this.num1);
    String strNum2 = String.valueOf(this.num2);
    String strResultado = String.valueOf(resultado);

    // Crear una nueva instancia de la clase operacion con los argumentos necesarios
    operacion obj_op = new operacion(strNum1, strNum2, this.operador, strResultado);

    // Llamar al método agregar para imprimir el resultado
    obj_op.agregar();
    }//GEN-LAST:event_btn_igualActionPerformed

    private void btn_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_puntoActionPerformed
        // TODO add your handling code here:
        if(!(this.lbl_datos.getText().contains("."))){
            this.lbl_datos.setText(this.lbl_datos.getText()+".");
        }
    }//GEN-LAST:event_btn_puntoActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        // TODO add your handling code here:
        Toolkit.getDefaultToolkit().beep();
        this.lbl_datos.setText(this.lbl_datos.getText()+"4");
    }//GEN-LAST:event_btn_4ActionPerformed

    private void menu_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_nuevoActionPerformed
        // TODO add your handling code here:
        this.lbl_datos.setText("");
        System.out.println("nuevo");
    }//GEN-LAST:event_menu_nuevoActionPerformed

    private void menu_historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_historialActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        historial_operaciones ventana = new historial_operaciones();
        panel_escritorio.add(ventana);
        ventana.show();
    }//GEN-LAST:event_menu_historialActionPerformed

    private void menu_opcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_opcActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menu_opcActionPerformed


    public String sincero(float resultad){
        
        String retorno="";
        
        retorno=Float.toString(resultad);
        
        if(resultad%1==0){
            retorno=retorno.substring(0, retorno.length()-2);
        }
        return retorno;
    }
    
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
            java.util.logging.Logger.getLogger(frm_calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_cero;
    private javax.swing.JButton btn_divi;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_multi;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_resta;
    private javax.swing.JButton btn_suma;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel lbl_datos;
    private javax.swing.JMenuItem manual_user;
    private javax.swing.JMenu menu_ayuda;
    private javax.swing.JMenuItem menu_historial;
    private javax.swing.JMenuItem menu_nuevo;
    private javax.swing.JMenu menu_opc;
    private javax.swing.JDesktopPane panel_escritorio;
    // End of variables declaration//GEN-END:variables
}
