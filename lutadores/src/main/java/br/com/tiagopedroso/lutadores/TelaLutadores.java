package br.com.tiagopedroso.lutadores;

// <editor-fold defaultstate="collapsed" desc="imports...">
import static javax.swing.JOptionPane.*;
// </editor-fold>

/**
 *
 * @author Tiago Penha Pedroso, 2019-05-15
 */
public class TelaLutadores extends javax.swing.JFrame {

    // <editor-fold defaultstate="collapsed" desc="Atributos Principais">
    private Lutador lutador1 = new Lutador("Soldado");
    private LutadorAlien lutador2 = new LutadorAlien("Alien");
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Construtores">
    public TelaLutadores() {
        initComponents();

        txtNomeLutador1.setText(lutador1.getNome());
        imagemLutador1.setText("");

        txtNomeLutador2.setText(lutador2.getNome());
        imagemLutador2.setText("");

        atualizarStatusLutadores();
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Métodos Auxiliares">
    private void atualizarStatusLutadores() {
        txtVidaLutador1.setText(String.valueOf(lutador1.getVida()));
        txtStatusLutador1.setText(lutador1.getStatusString());
        imagemLutador1.setIcon(lutador1.getImagemStatusAtual());

        txtVidaLutador2.setText(String.valueOf(lutador2.getVida()));
        txtStatusLutador2.setText(lutador2.getStatusString());
        imagemLutador2.setIcon(lutador2.getImagemStatusAtual());

        if (lutador1.getVida() == 0 && lutador2.getVida() == 0) {
            showMessageDialog(this, "Infelizmente Empatou :(\nTente novamente!");
            regenerarLutador1.setEnabled(false);
            regenerarLutador2.setEnabled(false);
            baterLutador1.setEnabled(false);
            baterLutador2.setEnabled(false);
            System.exit(0);
        } else if (lutador1.getVida() == 0) {
            showMessageDialog(this, "LUTADOR 02\n\nVenceu!!!! :)");
            regenerarLutador1.setEnabled(false);
            regenerarLutador2.setEnabled(false);
            baterLutador1.setEnabled(false);
            baterLutador2.setEnabled(false);
            System.exit(0);
        } else if (lutador2.getVida() == 0) {
            showMessageDialog(this, "LUTADOR 01\n\nVenceu!!!! :)");
            regenerarLutador1.setEnabled(false);
            regenerarLutador2.setEnabled(false);
            baterLutador1.setEnabled(false);
            baterLutador2.setEnabled(false);
            System.exit(0);
        }
        
        if (lutador1.acabouRegeneracoes()) {
            regenerarLutador1.setEnabled(false);
        }
        
        if (lutador2.acabouRegeneracoes()) {
            regenerarLutador2.setEnabled(false);
        }
    }
    // </editor-fold>

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JPanel();
        labelVidaLutador1 = new javax.swing.JLabel();
        txtNomeLutador1 = new javax.swing.JLabel();
        txtVidaLutador1 = new javax.swing.JLabel();
        txtStatusLutador1 = new javax.swing.JLabel();
        imagemLutador1 = new javax.swing.JLabel();
        regenerarLutador1 = new javax.swing.JButton();
        baterLutador1 = new javax.swing.JButton();
        labelVidaLutador2 = new javax.swing.JLabel();
        txtNomeLutador2 = new javax.swing.JLabel();
        txtVidaLutador2 = new javax.swing.JLabel();
        txtStatusLutador2 = new javax.swing.JLabel();
        imagemLutador2 = new javax.swing.JLabel();
        regenerarLutador2 = new javax.swing.JButton();
        baterLutador2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.SystemColor.windowBorder);

        painel.setBackground(java.awt.SystemColor.windowBorder);
        painel.setForeground(null);

        labelVidaLutador1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelVidaLutador1.setForeground(new java.awt.Color(204, 204, 204));
        labelVidaLutador1.setText("Vida:");

        txtNomeLutador1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtNomeLutador1.setForeground(new java.awt.Color(153, 153, 255));
        txtNomeLutador1.setText("nome");

        txtVidaLutador1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtVidaLutador1.setForeground(new java.awt.Color(204, 204, 204));
        txtVidaLutador1.setText("...");

        txtStatusLutador1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        txtStatusLutador1.setForeground(new java.awt.Color(204, 204, 255));
        txtStatusLutador1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtStatusLutador1.setText("status");

        imagemLutador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagemLutador1.setText("<imagem>");

        regenerarLutador1.setBackground(new java.awt.Color(51, 51, 51));
        regenerarLutador1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        regenerarLutador1.setForeground(new java.awt.Color(255, 255, 255));
        regenerarLutador1.setText("Regenerar");
        regenerarLutador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnClick_RegenerarLutador1(evt);
            }
        });

        baterLutador1.setBackground(new java.awt.Color(102, 0, 0));
        baterLutador1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        baterLutador1.setForeground(new java.awt.Color(255, 153, 153));
        baterLutador1.setText("Bater!");
        baterLutador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnClick_BaterLutador1(evt);
            }
        });

        labelVidaLutador2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelVidaLutador2.setForeground(new java.awt.Color(204, 204, 204));
        labelVidaLutador2.setText("Vida:");

        txtNomeLutador2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtNomeLutador2.setForeground(new java.awt.Color(51, 255, 51));
        txtNomeLutador2.setText("nome");

        txtVidaLutador2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtVidaLutador2.setForeground(new java.awt.Color(204, 204, 204));
        txtVidaLutador2.setText("...");

        txtStatusLutador2.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        txtStatusLutador2.setForeground(new java.awt.Color(153, 255, 153));
        txtStatusLutador2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtStatusLutador2.setText("status");

        imagemLutador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagemLutador2.setText("<imagem>");

        regenerarLutador2.setBackground(new java.awt.Color(51, 51, 51));
        regenerarLutador2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        regenerarLutador2.setForeground(new java.awt.Color(255, 255, 255));
        regenerarLutador2.setText("Regenerar");
        regenerarLutador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnClick_RegenerarLutador2(evt);
            }
        });

        baterLutador2.setBackground(new java.awt.Color(102, 0, 0));
        baterLutador2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        baterLutador2.setForeground(new java.awt.Color(255, 153, 153));
        baterLutador2.setText("Bater!");
        baterLutador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnClick_BaterbaterLutador2(evt);
            }
        });

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addComponent(imagemLutador1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelLayout.createSequentialGroup()
                                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomeLutador1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(painelLayout.createSequentialGroup()
                                        .addComponent(labelVidaLutador1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtVidaLutador1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE))
                            .addComponent(txtStatusLutador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                                .addComponent(imagemLutador2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelLayout.createSequentialGroup()
                                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(painelLayout.createSequentialGroup()
                                                .addComponent(labelVidaLutador2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtVidaLutador2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtNomeLutador2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtStatusLutador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(painelLayout.createSequentialGroup()
                                .addComponent(regenerarLutador2)
                                .addGap(61, 61, 61)
                                .addComponent(baterLutador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(painelLayout.createSequentialGroup()
                        .addComponent(regenerarLutador1)
                        .addGap(61, 61, 61)
                        .addComponent(baterLutador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addComponent(txtNomeLutador1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelVidaLutador1)
                            .addComponent(txtVidaLutador1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStatusLutador1))
                    .addComponent(imagemLutador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(baterLutador1)
                    .addComponent(regenerarLutador1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addComponent(txtNomeLutador2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelVidaLutador2)
                            .addComponent(txtVidaLutador2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStatusLutador2))
                    .addComponent(imagemLutador2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regenerarLutador2)
                    .addComponent(baterLutador2))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Métodos dos Eventos">
    private void OnClick_BaterLutador1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnClick_BaterLutador1
        int valor = (int) (Math.random() * 20) + 1;
        lutador2.apanhar(valor);
        atualizarStatusLutadores();
    }//GEN-LAST:event_OnClick_BaterLutador1

    private void OnClick_RegenerarLutador1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnClick_RegenerarLutador1
        lutador1.regenerar();
        atualizarStatusLutadores();
    }//GEN-LAST:event_OnClick_RegenerarLutador1

    private void OnClick_BaterbaterLutador2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnClick_BaterbaterLutador2
        int valor = (int) (Math.random() * 20) + 1;
        lutador1.apanhar(valor);
        atualizarStatusLutadores();
    }//GEN-LAST:event_OnClick_BaterbaterLutador2

    private void OnClick_RegenerarLutador2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnClick_RegenerarLutador2
        lutador2.regenerar();
        atualizarStatusLutadores();
    }//GEN-LAST:event_OnClick_RegenerarLutador2
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Códigos Gerados pelo Netbeans...">                          
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
            java.util.logging.Logger.getLogger(TelaLutadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLutadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLutadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLutadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLutadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton baterLutador1;
    private javax.swing.JButton baterLutador2;
    private javax.swing.JLabel imagemLutador1;
    private javax.swing.JLabel imagemLutador2;
    private javax.swing.JLabel labelVidaLutador1;
    private javax.swing.JLabel labelVidaLutador2;
    private javax.swing.JPanel painel;
    private javax.swing.JButton regenerarLutador1;
    private javax.swing.JButton regenerarLutador2;
    private javax.swing.JLabel txtNomeLutador1;
    private javax.swing.JLabel txtNomeLutador2;
    private javax.swing.JLabel txtStatusLutador1;
    private javax.swing.JLabel txtStatusLutador2;
    private javax.swing.JLabel txtVidaLutador1;
    private javax.swing.JLabel txtVidaLutador2;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>    
}
