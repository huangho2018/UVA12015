
package es.huangho.tarea07;

/**
 *
 * @author Juan Jose Gómez Vázquez <DAW 2015/2016. MP0485. Programación>
 */
public class Formulario extends javax.swing.JFrame {

    /**
     * Creates new form Formulario
     */
    public Formulario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbArea = new javax.swing.JLabel();
        txtVocalA = new javax.swing.JTextField();
        lbVocalA = new javax.swing.JLabel();
        txtVocalE = new javax.swing.JTextField();
        lbVocalE = new javax.swing.JLabel();
        txtVocalI = new javax.swing.JTextField();
        lbVocalI = new javax.swing.JLabel();
        txtVocalO = new javax.swing.JTextField();
        lbVocalO = new javax.swing.JLabel();
        txtVocalU = new javax.swing.JTextField();
        lbVocalU = new javax.swing.JLabel();
        btnContar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lbTitle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contar Vocales (versión 1.0)");
        setResizable(false);

        lbArea.setText("Introduce el texto");
        lbArea.setToolTipText("");

        txtVocalA.setEditable(false);
        txtVocalA.setBackground(new java.awt.Color(255, 255, 255));
        txtVocalA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtVocalA.setToolTipText("");

        lbVocalA.setText("Vocales A/a:");
        lbVocalA.setToolTipText("");

        txtVocalE.setEditable(false);
        txtVocalE.setBackground(new java.awt.Color(255, 255, 255));
        txtVocalE.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbVocalE.setText("Vocales E/e:");
        lbVocalE.setToolTipText("");

        txtVocalI.setEditable(false);
        txtVocalI.setBackground(new java.awt.Color(255, 255, 255));
        txtVocalI.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbVocalI.setText("Vocales I/i:");
        lbVocalI.setToolTipText("");

        txtVocalO.setEditable(false);
        txtVocalO.setBackground(new java.awt.Color(255, 255, 255));
        txtVocalO.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbVocalO.setText("Vocales O/o:");
        lbVocalO.setToolTipText("");

        txtVocalU.setEditable(false);
        txtVocalU.setBackground(new java.awt.Color(255, 255, 255));
        txtVocalU.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbVocalU.setText("Vocales U/u:");
        lbVocalU.setToolTipText("");

        btnContar.setText("Contar");
        btnContar.setToolTipText("Contar vocales");
        btnContar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnContarMouseClicked(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.setToolTipText("Borrar texto");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });

        lbTitle.setFont(new java.awt.Font("Old English Text MT", 0, 36)); // NOI18N
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("aàáâåãäAÀÁÂÅÃÄ");
        lbTitle.setToolTipText("");

        txtArea.setColumns(20);
        txtArea.setRows(5);
        txtArea.setToolTipText("Introduce el texto aquí");
        jScrollPane2.setViewportView(txtArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtVocalA, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                            .addComponent(lbVocalA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtVocalE, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(lbVocalE)
                            .addComponent(btnContar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtVocalI, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(lbVocalI))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtVocalO, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(lbVocalO)
                            .addComponent(btnLimpiar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtVocalU, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                            .addComponent(lbVocalU)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lbArea)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(11, 11, 11))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbArea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbVocalE)
                                .addGap(78, 78, 78))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbVocalO)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtVocalO))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbVocalU)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtVocalU))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbVocalI)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtVocalI, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(36, 36, 36)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnContar)
                            .addComponent(btnLimpiar))
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtVocalE, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbVocalA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVocalA, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(102, 102, 102))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        txtArea.setText("");
        txtVocalA.setText("");
        txtVocalE.setText("");
        txtVocalI.setText("");
        txtVocalO.setText("");
        txtVocalU.setText("");
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnContarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContarMouseClicked
        String sTexto = txtArea.getText();

        if (sTexto != null && sTexto.trim().length() > 0) {
            contarVocales(sTexto);
        }
    }//GEN-LAST:event_btnContarMouseClicked

    // Esta función cuenta las repeticiones de cada vocal para mayúsculas, minúsculas, con tilde, diéresis, circunflejo...
    public void contarVocales(String sTexto) {
        int a, e, i, o, u;
        a = e = i = o = u = 0;

        for (int k = 0; k < sTexto.length(); k++) {
            // Obtenemos el valor ANSI del caracter
            int codeA = (int) sTexto.charAt(k);

            // Analizamos si es una vocal simple (sin tilde, diacrítico, circunflejo, diéresis...)
            // ...en mayúsculas y minúsculas...
            // ...o si se trata de una vocal con algún tipo de signo ortogáfico
            // Utilizamos la tabla ANSI
            // (ejemplo con la a) a, A, á, Á, ä, Ä, â, Â, à, À

            if ((codeA > 192 && codeA < 197) || (codeA > 224 && codeA < 229) || codeA==65 || codeA==97) {
                a += 1;
            }
            if ((codeA > 200 && codeA < 203) || (codeA > 232 && codeA < 235) || codeA==69 || codeA==101) {
                e += 1;
            }
            if ((codeA > 204 && codeA < 207) || (codeA > 234 && codeA < 239) || codeA==73 || codeA==105) {
                i += 1;
            }
            if ((codeA > 210 && codeA < 214) || (codeA > 242 && codeA < 246) || codeA==79 || codeA==111) {
                o += 1;
            }
            if ((codeA > 217 && codeA < 220) || (codeA > 249 && codeA < 252) || codeA==85 || codeA==117) {
                u += 1;
            }
        }

        //Parseamos a String el integer
        txtVocalA.setText(String.valueOf(a));
        txtVocalE.setText(String.valueOf(e));
        txtVocalI.setText(String.valueOf(i));
        txtVocalO.setText(String.valueOf(o));
        txtVocalU.setText(String.valueOf(u));
    }

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
    private javax.swing.JButton btnContar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbArea;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbVocalA;
    private javax.swing.JLabel lbVocalE;
    private javax.swing.JLabel lbVocalI;
    private javax.swing.JLabel lbVocalO;
    private javax.swing.JLabel lbVocalU;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtVocalA;
    private javax.swing.JTextField txtVocalE;
    private javax.swing.JTextField txtVocalI;
    private javax.swing.JTextField txtVocalO;
    private javax.swing.JTextField txtVocalU;
    // End of variables declaration//GEN-END:variables
}
