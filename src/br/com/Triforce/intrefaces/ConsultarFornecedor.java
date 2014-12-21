/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Triforce.intrefaces;

import br.com.Triforce.model.CodigoExcluidoRegistro;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import br.com.Triforce.model.FornecedorRegistro;

/**
 *
 * @author angelo
 */
public class ConsultarFornecedor extends Geral {

    /**
     * Creates new form Consultar_Produto
     */
    private FornecedorRegistro forReg;
    private FornecedorTableModel model;
    private FornecedorTableBusca mod;
    private CodigoExcluidoRegistro ex;
    private int codigo;
    private int decis;

    public int getCod() {
        return codigo;
    }

    public void setCod(int cod) {
        this.codigo = cod;
    }

    public int getDes() {
        return decis;
    }

    public void setDes(int des) {
        this.decis = des;
    }

    public ConsultarFornecedor(FornecedorRegistro forReg, CodigoExcluidoRegistro ex) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.forReg = forReg;
        model = new FornecedorTableModel(forReg);
        tab_Fornecedor.setModel(model);
        this.ex = ex;
        setDes(0);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                forReg.salvar();// serve para quando fechar a janela, salvar meu arquivo
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tab_Fornecedor = new javax.swing.JTable();
        btn_Novo = new javax.swing.JButton();
        btn_Consultar = new javax.swing.JButton();
        btn_Alterar = new javax.swing.JButton();
        btn_Excluir = new javax.swing.JButton();
        lbl_Fornecedor = new javax.swing.JLabel();
        btn_Voltar = new javax.swing.JButton();

        setTitle("Fornecedores");

        tab_Fornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Razão Social", "Nome Fantasia", "CNPJ", "Telefone", "Email"
            }
        ));
        jScrollPane1.setViewportView(tab_Fornecedor);

        btn_Novo.setText("Novo");
        btn_Novo.setToolTipText("");
        btn_Novo.setMaximumSize(new java.awt.Dimension(80, 25));
        btn_Novo.setMinimumSize(new java.awt.Dimension(80, 25));
        btn_Novo.setPreferredSize(new java.awt.Dimension(80, 25));
        btn_Novo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_NovoMouseClicked(evt);
            }
        });

        btn_Consultar.setText("Atualizar");
        btn_Consultar.setMaximumSize(new java.awt.Dimension(80, 25));
        btn_Consultar.setMinimumSize(new java.awt.Dimension(80, 25));
        btn_Consultar.setPreferredSize(new java.awt.Dimension(80, 25));
        btn_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultarActionPerformed(evt);
            }
        });

        btn_Alterar.setText("Consultar");
        btn_Alterar.setMaximumSize(new java.awt.Dimension(80, 25));
        btn_Alterar.setMinimumSize(new java.awt.Dimension(80, 25));
        btn_Alterar.setPreferredSize(new java.awt.Dimension(80, 25));
        btn_Alterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AlterarMouseClicked(evt);
            }
        });
        btn_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AlterarActionPerformed(evt);
            }
        });

        btn_Excluir.setText("Excluir");
        btn_Excluir.setMaximumSize(new java.awt.Dimension(80, 25));
        btn_Excluir.setMinimumSize(new java.awt.Dimension(80, 25));
        btn_Excluir.setPreferredSize(new java.awt.Dimension(80, 25));
        btn_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExcluirActionPerformed(evt);
            }
        });

        lbl_Fornecedor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_Fornecedor.setText("Fornecedor");

        btn_Voltar.setText("Voltar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Fornecedor)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Novo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Voltar)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_Excluir, btn_Novo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Fornecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Novo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Voltar)
                        .addComponent(btn_Consultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_NovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NovoMouseClicked
        abreJanela(new CadastrarFornecedor(forReg, ex), 0);
    }//GEN-LAST:event_btn_NovoMouseClicked

    private void btn_AlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AlterarMouseClicked
        String consultarCodigo = JOptionPane.showInputDialog("Insira um codigo");
        if (consultarCodigo.length() > 0) {
            mod = new FornecedorTableBusca(forReg, Integer.parseInt(consultarCodigo));//traz o codigo pra Modificar apenas um 
            setDes(1);
            setCod(mod.getCodigo());
            if (forReg.verificaKey(Integer.parseInt(consultarCodigo)) == 1) {
                tab_Fornecedor.setModel(mod);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Erro Codigo Inexistente");
            }

        }
    }//GEN-LAST:event_btn_AlterarMouseClicked

    private void btn_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AlterarActionPerformed

    private void btn_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultarActionPerformed
        // TODO add your handling code here:
        setDes(0);
        model = new FornecedorTableModel(forReg);
        tab_Fornecedor.setModel(model);
    }//GEN-LAST:event_btn_ConsultarActionPerformed

    private void btn_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExcluirActionPerformed
        // TODO add your handling code here:
        if (getDes() == 0) {
            int linha = tab_Fornecedor.getSelectedRow();
            int codigo = model.getCodigo(linha);
        }
        Object[] options = {"Sim", "Não"};
        int i = JOptionPane.showOptionDialog(null,
                "Tem certeza que deseja Excluir o Fornecedor  " + codigo + "? ", "Excluir Fornecedor",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                options, options[0]);
        if (i == JOptionPane.YES_OPTION) {
            forReg.removeMap(getCod());
            ex.setForn(0, ex.getForn(0) + 1);
            ex.salvar();
            model = new FornecedorTableModel(forReg);
            tab_Fornecedor.setModel(model);
            JOptionPane.showMessageDialog(rootPane, " Fornecedor removido com sucesso!");
            model = new FornecedorTableModel(forReg);
            tab_Fornecedor.setModel(model);
            setDes(0);
    }//GEN-LAST:event_btn_ExcluirActionPerformed
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Alterar;
    private javax.swing.JButton btn_Consultar;
    private javax.swing.JButton btn_Excluir;
    private javax.swing.JButton btn_Novo;
    private javax.swing.JButton btn_Voltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Fornecedor;
    private javax.swing.JTable tab_Fornecedor;
    // End of variables declaration//GEN-END:variables
}
