/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProjetoFinal_1000;

import javax.swing.JOptionPane;

/**
 *
 * @author DHEIVERODRIGUESFUCK
 */
public class TelaCriarPersonagem extends javax.swing.JFrame {

    /**
     * Creates new form TelaCriarPersonagem
     */
    public TelaCriarPersonagem() {
        initComponents();
    }

    String classeSelecionada = "";
    String nome;

    int vida, forca, velocidade, mana;

    int etapa = 0;
    int etapa2 = 1;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        butaoArqueiro = new javax.swing.JButton();
        butaoLadino = new javax.swing.JButton();
        butaoBarbaro = new javax.swing.JButton();
        butaoMago = new javax.swing.JButton();
        textName = new javax.swing.JTextField();
        girarDado = new javax.swing.JButton();
        resultdado = new javax.swing.JLabel();
        criarPersonagem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 0, 255));

        butaoArqueiro.setText("Arqueiro");
        butaoArqueiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaoArqueiroActionPerformed(evt);
            }
        });

        butaoLadino.setText("Ladino");
        butaoLadino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaoLadinoActionPerformed(evt);
            }
        });

        butaoBarbaro.setText("Barbaro");
        butaoBarbaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaoBarbaroActionPerformed(evt);
            }
        });

        butaoMago.setText("Mago");
        butaoMago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaoMagoActionPerformed(evt);
            }
        });

        textName.setText("Qual seu nome?");
        textName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNameActionPerformed(evt);
            }
        });

        girarDado.setText("Gire o dado");
        girarDado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girarDadoActionPerformed(evt);
            }
        });

        resultdado.setBackground(new java.awt.Color(255, 255, 255));
        resultdado.setForeground(new java.awt.Color(255, 255, 255));
        resultdado.setText("Resultado: ");

        criarPersonagem.setText("criar");
        criarPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarPersonagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(criarPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(butaoLadino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(butaoBarbaro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(butaoMago)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(butaoArqueiro)))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resultdado)
                            .addComponent(girarDado))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butaoLadino)
                    .addComponent(butaoBarbaro)
                    .addComponent(butaoMago)
                    .addComponent(butaoArqueiro)
                    .addComponent(girarDado))
                .addGap(6, 6, 6)
                .addComponent(resultdado)
                .addGap(65, 65, 65)
                .addComponent(criarPersonagem)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void criarPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarPersonagemActionPerformed
        nome = textName.getText();

        if (classeSelecionada.equals("")) {
            JOptionPane.showMessageDialog(this, "Escolha uma classe primeiro!");
            return;
        }

        if (etapa < 5) {
            JOptionPane.showMessageDialog(this, "Você ainda não definiu todos os atributos!");
            return;
        }

        Personagem personagem = null;

        switch (classeSelecionada) {
            case "Mago":

                personagem = new Mago(nome, vida, mana, forca, velocidade);
                break;
            case "Barbaro":
                personagem = new Barbaro(nome, vida, mana, forca, velocidade);

                break;
            case "Arqueiro":
                personagem = new Arqueiro(nome, vida, mana, forca, velocidade);
                break;
            case "Ladino":
                personagem = new Ladino(nome, vida, mana, forca, velocidade);
        }

        JOptionPane.showMessageDialog(this,
                classeSelecionada + " criado com sucesso!\n\n"
                + "Nome: " + nome
                + "\nVida: " + vida
                + "\nForça: " + forca
                + "\nVelocidade: " + velocidade
                + "\nMana: " + mana);

        // Reseta pra criar outro
        etapa = 0;
        classeSelecionada = "";

    }//GEN-LAST:event_criarPersonagemActionPerformed

    private void girarDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girarDadoActionPerformed
        if (classeSelecionada.equals("")) {
            JOptionPane.showMessageDialog(this, "Escolha uma classe primeiro!");
            return;
        }

        int resultado = dados();
        int resultado2 = dados();
        int resultado3 = dados();
        switch (etapa) {
            case 1:

                int vida1 = resultado;
                JOptionPane.showMessageDialog(this, "Giro de dado: " + vida1);
                int vida2 = resultado2;
                JOptionPane.showMessageDialog(this, "segundo giro de dado: " + vida2);
                int vida3 = resultado3;
                JOptionPane.showMessageDialog(this, "tereiro giro de dado: " + vida3);
                vida = vida1 + vida2 + vida3;
                JOptionPane.showMessageDialog(this, "Vida foi definida como: " + vida + "HP");
                etapa++;
                break;
            case 2:
                forca = resultado;
                JOptionPane.showMessageDialog(this, "Força definida: " + forca);
                if (classeSelecionada.equals("Barbaro")) {
                    forca = resultado + 2;
                    JOptionPane.showMessageDialog(this, "porem voce e um Barbaro entao \n Forca: " + forca);
                } else if (classeSelecionada.equals("Arqueiro")) {
                    forca = resultado + 1;
                    JOptionPane.showMessageDialog(this, "porem voce e um Arqueiro entao \n Forca: " + forca);
                }

                etapa++;
                break;
            case 3:
                velocidade = resultado;
                JOptionPane.showMessageDialog(this, "Velocidade definida \n Velocidade: " + velocidade);
                if (classeSelecionada.equals("Arqueiro")) {
                    velocidade = resultado + 1;
                    JOptionPane.showMessageDialog(this, "Porem voce e Arqueiro entao \n Velocidade: " + velocidade);
                } else if (classeSelecionada.equals("Ladino")) {
                    velocidade = resultado + 2;
                    JOptionPane.showMessageDialog(this, "Porem voce e Ladino entao \n Mana: " + velocidade);
                }
                etapa++;
                break;
            case 4:
                mana = resultado;
                JOptionPane.showMessageDialog(this, "Mana definida: " + mana);
                if (classeSelecionada.equals("Mago")) {
                    mana = resultado + 2;
                    JOptionPane.showMessageDialog(this, "Porem voce e mago entao: " + mana);
                }
                etapa++;
                break;
            default:
                JOptionPane.showMessageDialog(this, "Todos os atributos já foram definidos! Clique em 'Criar Personagem'.");
        }
    }//GEN-LAST:event_girarDadoActionPerformed

    private void textNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNameActionPerformed

    }//GEN-LAST:event_textNameActionPerformed

    private void butaoMagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaoMagoActionPerformed
        classeSelecionada = "Mago";
        etapa = 1;
        JOptionPane.showMessageDialog(this, "Você escolheu MAGO!\nGire o dado para definir a VIDA.");
    }//GEN-LAST:event_butaoMagoActionPerformed

    private void butaoBarbaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaoBarbaroActionPerformed
        classeSelecionada = "Barbaro";
        etapa = 1;
        JOptionPane.showMessageDialog(this, "Você escolheu GUERREIRO!\nGire o dado para definir a VIDA.");
    }//GEN-LAST:event_butaoBarbaroActionPerformed

    private void butaoLadinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaoLadinoActionPerformed
        classeSelecionada = "Ladino";
        etapa = 1;
        JOptionPane.showMessageDialog(this, "Você escolheu Ladino!\nGire o dado para definir a VIDA.");
    }//GEN-LAST:event_butaoLadinoActionPerformed

    private void butaoArqueiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaoArqueiroActionPerformed
        classeSelecionada = "Arqueiro";
        etapa = 1;
        JOptionPane.showMessageDialog(this, "Você escolheu Arqueiro!\nGire o dado para definir a VIDA.");
    }//GEN-LAST:event_butaoArqueiroActionPerformed

    public int dados() {
        int resultadoDado = Dados.useDice();
        resultdado.setText("Resultado: " + resultadoDado);
        return resultadoDado;
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
            java.util.logging.Logger.getLogger(TelaCriarPersonagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCriarPersonagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCriarPersonagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCriarPersonagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCriarPersonagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butaoArqueiro;
    private javax.swing.JButton butaoBarbaro;
    private javax.swing.JButton butaoLadino;
    private javax.swing.JButton butaoMago;
    private javax.swing.JButton criarPersonagem;
    private javax.swing.JButton girarDado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel resultdado;
    private javax.swing.JTextField textName;
    // End of variables declaration//GEN-END:variables
}
