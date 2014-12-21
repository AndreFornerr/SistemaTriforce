/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Triforce.intrefaces;

import br.com.Triforce.model.CodigoExcluidoRegistro;
import java.awt.Color;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import br.com.Triforce.model.ProdutoEstoque;

/**
 *
 * @author a145292
 */
public class CadastrarProduto extends Geral {

    /**
     * Creates new form CadastroProduto
     */
    private ProdutoEstoque prod;
    private CodigoExcluidoRegistro ex;

    public CadastrarProduto(ProdutoEstoque prod, CodigoExcluidoRegistro ex) {
        initComponents();
        this.prod = prod;
        this.ex = ex;

        txt_codigo.setText(Integer.toString(prod.retornoMap() + 1 + ex.getProd(0)));
        txt_codigo.setEditable(false);
        this.setLocationRelativeTo(null);

        lbl_confirmarTitulo.setVisible(false);
        lbl_confirmarTitulo.setForeground(Color.red);
        lbl_confirmarVolume.setVisible(false);
        lbl_confirmarVolume.setForeground(Color.red);
        lbl_confirmarAutor.setVisible(false);
        lbl_confirmarAutor.setForeground(Color.red);
        lbl_confirmarDatalcto.setVisible(false);
        lbl_confirmarDatalcto.setForeground(Color.red);
        lbl_confirmarCategoria.setVisible(false);
        lbl_confirmarCategoria.setForeground(Color.red);
        lbl_confirmarPreco.setVisible(false);
        lbl_confirmarPreco.setForeground(Color.red);
        lbl_confirmarSaldo.setVisible(false);
        lbl_confirmarSaldo.setForeground(Color.red);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_titulo = new javax.swing.JLabel();
        lbl_cadastroproduto = new javax.swing.JLabel();
        lbl_volume = new javax.swing.JLabel();
        lbl_autor = new javax.swing.JLabel();
        lbl_datalcto = new javax.swing.JLabel();
        lbl_categoria = new javax.swing.JLabel();
        lbl_preco = new javax.swing.JLabel();
        lbl_valor = new javax.swing.JLabel();
        txt_titulo = new javax.swing.JTextField();
        txt_volume = new javax.swing.JTextField();
        txt_autor = new javax.swing.JTextField();
        txt_categoria = new javax.swing.JTextField();
        txt_preco = new javax.swing.JTextField();
        txt_saldo = new javax.swing.JTextField();
        btn_gravar = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();
        lbl_confirmarTitulo = new javax.swing.JLabel();
        lbl_confirmarVolume = new javax.swing.JLabel();
        lbl_confirmarDatalcto = new javax.swing.JLabel();
        lbl_confirmarAutor = new javax.swing.JLabel();
        lbl_confirmarCategoria = new javax.swing.JLabel();
        lbl_confirmarSaldo = new javax.swing.JLabel();
        lbl_confirmarPreco = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        data_choose = new com.toedter.calendar.JDateChooser();
        txt_codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setTitle("Cadastrar Produto");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(400, 410));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_titulo.setText("Título*");
        getContentPane().add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 49, 25));

        lbl_cadastroproduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_cadastroproduto.setText("Cadastro Produto");
        getContentPane().add(lbl_cadastroproduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lbl_volume.setText("Volume*");
        getContentPane().add(lbl_volume, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, 20));

        lbl_autor.setText("Autor*");
        getContentPane().add(lbl_autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        lbl_datalcto.setText("DataLcto*");
        getContentPane().add(lbl_datalcto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        lbl_categoria.setText("Categoria*");
        getContentPane().add(lbl_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        lbl_preco.setText("Preço*");
        getContentPane().add(lbl_preco, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        lbl_valor.setText("Saldo*");
        getContentPane().add(lbl_valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));
        getContentPane().add(txt_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 340, -1));
        getContentPane().add(txt_volume, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 70, -1));
        getContentPane().add(txt_autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 340, -1));
        getContentPane().add(txt_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 240, -1));
        getContentPane().add(txt_preco, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 70, -1));
        getContentPane().add(txt_saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 90, -1));

        btn_gravar.setText("Gravar");
        btn_gravar.setMaximumSize(new java.awt.Dimension(80, 30));
        btn_gravar.setMinimumSize(new java.awt.Dimension(80, 30));
        btn_gravar.setPreferredSize(new java.awt.Dimension(80, 30));
        btn_gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gravarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_gravar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        btn_voltar.setText("Voltar");
        btn_voltar.setToolTipText("");
        btn_voltar.setMaximumSize(new java.awt.Dimension(80, 30));
        btn_voltar.setMinimumSize(new java.awt.Dimension(80, 30));
        btn_voltar.setPreferredSize(new java.awt.Dimension(80, 30));
        btn_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_voltarMouseClicked(evt);
            }
        });
        getContentPane().add(btn_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, -1, -1));

        lbl_confirmarTitulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_confirmarTitulo.setText(" *");
        getContentPane().add(lbl_confirmarTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 20, -1));

        lbl_confirmarVolume.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_confirmarVolume.setText(" *");
        getContentPane().add(lbl_confirmarVolume, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));

        lbl_confirmarDatalcto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_confirmarDatalcto.setText(" *");
        getContentPane().add(lbl_confirmarDatalcto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        lbl_confirmarAutor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_confirmarAutor.setText(" *");
        getContentPane().add(lbl_confirmarAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 20, -1));

        lbl_confirmarCategoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_confirmarCategoria.setText(" *");
        getContentPane().add(lbl_confirmarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 21, -1));

        lbl_confirmarSaldo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_confirmarSaldo.setText(" *");
        getContentPane().add(lbl_confirmarSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 21, -1));

        lbl_confirmarPreco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_confirmarPreco.setText(" *");
        getContentPane().add(lbl_confirmarPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 21, -1));

        jLabel1.setText("* campos obrigátorios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 150, -1));
        getContentPane().add(data_choose, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 130, -1));
        getContentPane().add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 30, -1));

        jLabel2.setText("Codigo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gravarActionPerformed
        // TODO add your handling code here:

        if (txt_titulo.getText().length() > 0) {
            lbl_confirmarTitulo.setVisible(false);

        } else {
            lbl_confirmarTitulo.setVisible(true);

        }
        ///////visibilidade volume
        if (txt_volume.getText().length() > 0) {
            lbl_confirmarVolume.setVisible(false);
        } else {
            lbl_confirmarVolume.setVisible(true);
        }
        ///////visibilidade auto
        if (txt_autor.getText().length() > 0) {
            lbl_confirmarAutor.setVisible(false);
        } else {
            lbl_confirmarAutor.setVisible(true);
        }
        /// visibilidade de data  de lançamento
        if (data_choose.getDateFormatString().length() > 0) {
            lbl_confirmarDatalcto.setVisible(false);
        } else {
            lbl_confirmarDatalcto.setVisible(true);
        }
        //visibilidade categoria
        if (txt_categoria.getText().length() > 0) {
            lbl_confirmarCategoria.setVisible(false);
        } else {
            lbl_confirmarCategoria.setVisible(true);
        }
        //visibilidade preco
        if (txt_preco.getText().length() > 0) {
            lbl_confirmarPreco.setVisible(false);
        } else {
            lbl_confirmarPreco.setVisible(true);
        }
        //visibilidae do preco 
        if (txt_saldo.getText().length() > 0) {
            lbl_confirmarSaldo.setVisible(false);
        } else {
            lbl_confirmarSaldo.setVisible(true);
        }
        //// fim dos if encadeados 

        if (txt_titulo.getText().length() > 0
                && txt_volume.getText().length() > 0
                && txt_autor.getText().length() > 0
                && data_choose.getDateFormatString().length() > 0
                && txt_categoria.getText().length() > 0
                && txt_preco.getText().length() > 0
                && txt_saldo.getText().length() > 0) {

            String data = new SimpleDateFormat("dd/MM/yyyy").format(data_choose.getDate());
            prod.adicionaProduto(prod.retornoMap() + 1 + ex.getProd(0),
                    txt_titulo.getText(),
                    Integer.parseInt(txt_volume.getText()),
                    txt_autor.getText(),
                    data,
                    txt_categoria.getText(),
                    Double.parseDouble(txt_preco.getText()),
                    Integer.parseInt(txt_saldo.getText()));

            JOptionPane.showMessageDialog(null, "Dados Cadastrados com sucesso");
            limpaTuto();
        } else {
            JOptionPane.showMessageDialog(null, "Favor inserir dados nos campos obrigatórios");
        }
    }//GEN-LAST:event_btn_gravarActionPerformed

    private void btn_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_voltarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btn_voltarMouseClicked

    public void limpaTuto() {
        txt_titulo.setText("");
        txt_volume.setText("");
        txt_autor.setText("");
        data_choose.setDate(null);
        txt_codigo.setText(Integer.toString(prod.retornoMap() + 1));
        txt_categoria.setText("");
        txt_preco.setText("");
        txt_saldo.setText("");

    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_gravar;
    private javax.swing.JButton btn_voltar;
    private com.toedter.calendar.JDateChooser data_choose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_autor;
    private javax.swing.JLabel lbl_cadastroproduto;
    private javax.swing.JLabel lbl_categoria;
    private javax.swing.JLabel lbl_confirmarAutor;
    private javax.swing.JLabel lbl_confirmarCategoria;
    private javax.swing.JLabel lbl_confirmarDatalcto;
    private javax.swing.JLabel lbl_confirmarPreco;
    private javax.swing.JLabel lbl_confirmarSaldo;
    private javax.swing.JLabel lbl_confirmarTitulo;
    private javax.swing.JLabel lbl_confirmarVolume;
    private javax.swing.JLabel lbl_datalcto;
    private javax.swing.JLabel lbl_preco;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_valor;
    private javax.swing.JLabel lbl_volume;
    private javax.swing.JTextField txt_autor;
    private javax.swing.JTextField txt_categoria;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_preco;
    private javax.swing.JTextField txt_saldo;
    private javax.swing.JTextField txt_titulo;
    private javax.swing.JTextField txt_volume;
    // End of variables declaration//GEN-END:variables
}
