/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Triforce.intrefaces;

import br.com.Triforce.model.CodigoExcluidoRegistro;
import java.awt.Color;
import javax.swing.JOptionPane;
import br.com.Triforce.model.FornecedorRegistro;
import br.com.Triforce.model.PedidoRegistro;
import br.com.Triforce.model.ProdutoEstoque;
import java.text.SimpleDateFormat;

/**
 *
 * @author angelo
 */
public class CadastrarPedido extends Geral {

    /**
     * Creates new form CadastrarPedido
     */
    private ProdutoEstoque prod;
    private FornecedorRegistro forn;
    private PedidoRegistro reg;
    private CodigoExcluidoRegistro ex;

    public CadastrarPedido(ProdutoEstoque prod, FornecedorRegistro forn, PedidoRegistro reg, CodigoExcluidoRegistro ex) {

        initComponents();

        this.prod = prod;
        this.forn = forn;
        this.reg = reg;
        this.ex = ex;
        this.setLocationRelativeTo(null);
        lbl_confirmar_dlcto.setVisible(false);
        lbl_confirmar_dlcto.setForeground(Color.red);
        lbl_confirmar_dreserva.setVisible(false);
        lbl_confirmar_dreserva.setForeground(Color.red);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Pedido = new javax.swing.JLabel();
        lbl_Produto = new javax.swing.JLabel();
        txt_Produto = new javax.swing.JTextField();
        btn_Produto = new javax.swing.JButton();
        lbl_Lcto = new javax.swing.JLabel();
        lbl_Previsao = new javax.swing.JLabel();
        Fornecedor = new javax.swing.JLabel();
        txt_Fornecedor = new javax.swing.JTextField();
        btn_Fornecedor = new javax.swing.JButton();
        btn_Voltar = new javax.swing.JButton();
        btn_Confirmar = new javax.swing.JButton();
        lbl_confirmar_dlcto = new javax.swing.JLabel();
        lbl_confirmar_dreserva = new javax.swing.JLabel();
        txt_Lcto = new com.toedter.calendar.JDateChooser();
        txt_Previsao = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        txt_quantidade = new javax.swing.JTextField();

        setTitle("Cadastrar Pedido");
        setMinimumSize(new java.awt.Dimension(500, 350));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Pedido.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_Pedido.setText("Cadastrar Pedido");
        getContentPane().add(lbl_Pedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        lbl_Produto.setText("Produto:");
        getContentPane().add(lbl_Produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));
        getContentPane().add(txt_Produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 180, -1));

        btn_Produto.setText("Consultar Produto");
        btn_Produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ProdutoMouseClicked(evt);
            }
        });
        getContentPane().add(btn_Produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 140, -1));

        lbl_Lcto.setText("Data Lcto:");
        getContentPane().add(lbl_Lcto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        lbl_Previsao.setText("Data Reserva:");
        getContentPane().add(lbl_Previsao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        Fornecedor.setText("Fornecedor:");
        getContentPane().add(Fornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));
        getContentPane().add(txt_Fornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 180, -1));

        btn_Fornecedor.setText("Consultar Fornecedor");
        btn_Fornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_FornecedorMouseClicked(evt);
            }
        });
        getContentPane().add(btn_Fornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        btn_Voltar.setText("Voltar");
        btn_Voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_VoltarMouseClicked(evt);
            }
        });
        getContentPane().add(btn_Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        btn_Confirmar.setText("Confirmar");
        btn_Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        lbl_confirmar_dlcto.setText("*");
        getContentPane().add(lbl_confirmar_dlcto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 23, -1));

        lbl_confirmar_dreserva.setText("*");
        getContentPane().add(lbl_confirmar_dreserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 16, -1));
        getContentPane().add(txt_Lcto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 205, -1));
        getContentPane().add(txt_Previsao, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 205, -1));

        jLabel1.setText("Quantidade:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));
        getContentPane().add(txt_quantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 180, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_FornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_FornecedorMouseClicked
        abreJanela(new ConsultarFornecedor(forn, ex), 0);
    }//GEN-LAST:event_btn_FornecedorMouseClicked

    private void btn_VoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VoltarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btn_VoltarMouseClicked

    private void btn_ProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ProdutoMouseClicked
        abreJanela(new ConsultarProduto(prod, ex), 0);
    }//GEN-LAST:event_btn_ProdutoMouseClicked

    private void btn_ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConfirmarActionPerformed
        // TODO add your handling code here:
        if (txt_Lcto.getDate().toString().length() > 0) {
            lbl_confirmar_dlcto.setVisible(false);
        } else {
            lbl_confirmar_dlcto.setVisible(true);
        }

        if (txt_Previsao.getDate().toString().length() > 0) {
            lbl_confirmar_dreserva.setVisible(false);
        } else {
            lbl_confirmar_dreserva.setVisible(true);
        }

        if (txt_Lcto.getDate().toString().length() > 0
                && txt_Previsao.getDate().toString().length() > 0
                && prod.verificaKey(Integer.parseInt(txt_Produto.getText())) == 1
                && forn.verificaKey(Integer.parseInt(txt_Fornecedor.getText())) == 1) {
            String data1 = new SimpleDateFormat("dd/MM/yyyy").format(txt_Lcto.getDate());
            String data2 = new SimpleDateFormat("dd/MM/yyyy").format(txt_Previsao.getDate());

            reg.adicionarPedido(reg.retornMap() + 1 + ex.getPed(0),
                    Integer.parseInt(txt_Produto.getText()),
                    Integer.parseInt(txt_Fornecedor.getText()),
                    data1,
                    data2,
                    Integer.parseInt(txt_quantidade.getText()),
                    'N');

            JOptionPane.showMessageDialog(null, "Cadastro Feito com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Favor inserir Dados nos campos Obrigatórios ou um Codigo Existente");
        }

    }//GEN-LAST:event_btn_ConfirmarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fornecedor;
    private javax.swing.JButton btn_Confirmar;
    private javax.swing.JButton btn_Fornecedor;
    private javax.swing.JButton btn_Produto;
    private javax.swing.JButton btn_Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_Lcto;
    private javax.swing.JLabel lbl_Pedido;
    private javax.swing.JLabel lbl_Previsao;
    private javax.swing.JLabel lbl_Produto;
    private javax.swing.JLabel lbl_confirmar_dlcto;
    private javax.swing.JLabel lbl_confirmar_dreserva;
    private javax.swing.JTextField txt_Fornecedor;
    private com.toedter.calendar.JDateChooser txt_Lcto;
    private com.toedter.calendar.JDateChooser txt_Previsao;
    private javax.swing.JTextField txt_Produto;
    private javax.swing.JTextField txt_quantidade;
    // End of variables declaration//GEN-END:variables
}
