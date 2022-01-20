/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.Adm;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Pessoa;


/**
 *
 * @author laisp
 */
public class TelaTabPessoa extends javax.swing.JFrame {
    
     DefaultTableModel dtm = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"Idpessoa", "nome", "estado_civil", "endereco", "numero",  "cep",  "cidade",
            "estado"," telefone"});
    /**
     * Creates new form GUICadTabPasciente
     */
    public TelaTabPessoa() {
        initComponents();
        preencherTabela();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfRua = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfNum = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfTelefone = new javax.swing.JTextField();
        jbAlterar = new javax.swing.JButton();
        jbConfirmar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDados = new javax.swing.JTable();
        jbAtualizar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jtfCep = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtfCidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtfEstado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtfEstadoCivil = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();

        jLabel2.setText("Código:");

        jtfCodigo.setEditable(false);
        jtfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCodigoActionPerformed(evt);
            }
        });

        jLabel4.setText("Endereco:");

        jtfRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfRuaActionPerformed(evt);
            }
        });

        jLabel5.setText("Número:");

        jtfNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNumActionPerformed(evt);
            }
        });

        jLabel6.setText("Telefone:");

        jtfTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTelefoneActionPerformed(evt);
            }
        });

        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbConfirmar.setText("Confirmar");
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarActionPerformed(evt);
            }
        });

        jtDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "nome", "Estado Civil", "Endereço", "Número", "CEP", "Cidade", "Estado", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(jtDados);

        jbAtualizar.setText("Atualizar");
        jbAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarActionPerformed(evt);
            }
        });

        jLabel9.setText("CEP:");

        jtfCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCepActionPerformed(evt);
            }
        });

        jLabel10.setText("Cidade:");

        jtfCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCidadeActionPerformed(evt);
            }
        });

        jLabel11.setText("Estado:");

        jtfEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEstadoActionPerformed(evt);
            }
        });

        jLabel12.setText("Estado Civil:");

        jtfEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEstadoCivilActionPerformed(evt);
            }
        });

        jLabel1.setText("Paciente:");

        jtfNome.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(jtfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jtfCep, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addGap(22, 22, 22)
                                .addComponent(jtfRua, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jtfNum, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(136, 136, 136)
                            .addComponent(jLabel12)
                            .addGap(18, 18, 18)
                            .addComponent(jtfEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jbAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jtfEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jtfNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtfCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfRuaActionPerformed
        if(jtfRua.getText().isEmpty()){
            jtfRua.setBackground(Color.red);

        }else{
            jtfRua.setBackground(Color.white);

        }//fecha else
    }//GEN-LAST:event_jtfRuaActionPerformed

    private void jbAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarActionPerformed
        limparTabela();
        preencherTabela();
    }//GEN-LAST:event_jbAtualizarActionPerformed

    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed
        confirmarAlteracao();
        limparTabela();
        limparCampos();
        preencherTabela();
        
        
        
    }//GEN-LAST:event_jbConfirmarActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        alterar();
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jtfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCodigoActionPerformed
        if(jtfCodigo.getText().isEmpty()){
            jtfCodigo.setBackground(Color.red);

        }else{
            jtfCodigo.setBackground(Color.white);

        }//fecha else
    }//GEN-LAST:event_jtfCodigoActionPerformed

    private void jtfNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNumActionPerformed
        if(jtfNum.getText().isEmpty()){
            jtfNum.setBackground(Color.red);

        }else{
            jtfNum.setBackground(Color.white);

        }//fecha else
    }//GEN-LAST:event_jtfNumActionPerformed

    private void jtfTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTelefoneActionPerformed
         if(jtfTelefone.getText().isEmpty()){
            jtfTelefone.setBackground(Color.red);

        }else{
            jtfTelefone.setBackground(Color.white);

        }//fecha else
    }//GEN-LAST:event_jtfTelefoneActionPerformed

    private void jtfCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCidadeActionPerformed
        if(jtfCidade.getText().isEmpty()){
            jtfCidade.setBackground(Color.red);

        }else{
            jtfCidade.setBackground(Color.white);

        }//fecha else
    }//GEN-LAST:event_jtfCidadeActionPerformed

    private void jtfEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEstadoCivilActionPerformed
        if(jtfEstadoCivil.getText().isEmpty()){
            jtfEstadoCivil.setBackground(Color.red);

        }else{
            jtfEstadoCivil.setBackground(Color.white);

        }//fecha else
    }//GEN-LAST:event_jtfEstadoCivilActionPerformed

    private void jtfCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCepActionPerformed
        if(jtfCep.getText().isEmpty()){
            jtfCep.setBackground(Color.red);

        }else{
            jtfCep.setBackground(Color.white);

        }//fecha else
    }//GEN-LAST:event_jtfCepActionPerformed

    private void jtfEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEstadoActionPerformed
        if(jtfEstado.getText().isEmpty()){
            jtfEstado.setBackground(Color.red);

        }else{
            jtfEstado.setBackground(Color.white);

        }//fecha else:
    }//GEN-LAST:event_jtfEstadoActionPerformed

   private void preencherTabela() {
        try {

            Adm a = new Adm();

            ArrayList<Pessoa> pe = new ArrayList<>();

            pe = a.preencherTabela();
            dtm.setNumRows(0);
            for (int i = 0; i <pe.size(); i++) {
                dtm.addRow(new Object[]{
                    String.valueOf(pe.get(i).getIdPessoa()),
                    String.valueOf(pe.get(i).getNome()),
                    String.valueOf(pe.get(i).getEstCivil()),
                    String.valueOf(pe.get(i).getendereco()),
                    String.valueOf(pe.get(i).getNum()),
                    String.valueOf(pe.get(i).getCep()),
                    String.valueOf(pe.get(i).getCidade()),
                    String.valueOf(pe.get(i).getEstado()),
                    String.valueOf(pe.get(i).getTel())
            });
            }//fecha for

            /* Adicionando o modelo de tabela 
             com os dados na tabela */
            jtDados.setModel(dtm);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Erro! " + e.getMessage());
        }//fecha catch
    }//fecha preencherTabela
    
    private void confirmarAlteracao(){
        try {
             
            Pessoa p = new Pessoa();
            p.setIdPessoa(Integer.parseInt( jtfCodigo.getText()));
            p.setNome(jtfNome.getText());
            p.setEstCivil(jtfEstadoCivil.getText());
            p.setendereco(jtfRua.getText());
            p.setNum(jtfNum.getText());
            p.setCep(jtfCep.getText());
            p.setCidade(jtfCidade.getText());
            p.setEstado(jtfEstado.getText());
            p.setTel(jtfTelefone.getText());
            
            Adm a = new Adm();
            a.alterarPessoa(p.getIdPessoa(), p.getNome(), p.getEstCivil(), p.getendereco(), p.getNum(), p.getCep(), p.getCidade(), p.getEstado(), p.getTel());
            
            JOptionPane.showMessageDialog(
                    rootPane,
                    "Confirmação da alteração com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, 
                    "erro! " + e.getMessage());
        }
    }
    
    private void limparTabela() {
      /* Para limpar a tabela temos que setar o número de
           linhas para zero no default table model */        
        dtm.setNumRows(0);
    }//fecha limparTabela
    
    private void alterar() {
        int linha = jtDados.getSelectedRow();
            if(linha != -1) {
            jtfCodigo.setText((String)jtDados.getValueAt(linha, 0));
            jtfNome.setText((String)jtDados.getValueAt(linha, 1));
            jtfEstadoCivil.setText((String)jtDados.getValueAt(linha, 2));
            jtfRua.setText((String)jtDados.getValueAt(linha, 3));
            jtfNum.setText((String)jtDados.getValueAt(linha, 4));
            jtfCep.setText((String)jtDados.getValueAt(linha, 5));
            jtfCidade.setText((String)jtDados.getValueAt(linha, 6));
            jtfEstado.setText((String)jtDados.getValueAt(linha, 7));
            jtfTelefone.setText((String)jtDados.getValueAt(linha, 8));
            
            
            }else{
                JOptionPane.showMessageDialog(this, 
                        "Você não selecionou nenhuma linha!");
         }//fecha else
    }//fecha método
    
    private void limparCampos(){
        jtfCodigo.setText("");
        jtfNome.setText("");
        jtfEstadoCivil.setText("");
        jtfRua.setText("");
        jtfNum.setText("");
        jtfCep.setText("");
        jtfCidade.setText("");
        jtfEstado.setText("");
        jtfTelefone.setText("");
         
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
            java.util.logging.Logger.getLogger(TelaTabPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTabPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTabPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTabPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTabPessoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbAtualizar;
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JTable jtDados;
    private javax.swing.JTextField jtfCep;
    private javax.swing.JTextField jtfCidade;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfEstado;
    private javax.swing.JTextField jtfEstadoCivil;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfNum;
    private javax.swing.JTextField jtfRua;
    private javax.swing.JTextField jtfTelefone;
    // End of variables declaration//GEN-END:variables
}
