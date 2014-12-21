/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Triforce.model;

import br.com.Triforce.dados.Arquivo;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Forner
 */
public class VendaRegistro implements Serializable {

    private Map<Integer, Venda> vendas;
    private Arquivo arqVendaPer;

    public VendaRegistro() {
        arqVendaPer = new Arquivo();
        vendas = arqVendaPer.getVenda();
    }

    public void adicionaVenda(int cod, int codCli, int codProd, int qtd, double valor, String dta) {

        Venda dados = new Venda();
        dados.setCodCli(codCli);
        dados.setCodProd(codProd);
        dados.setQtd(qtd);
        dados.setValorTotal(valor);
        dados.setDta(dta);

        Venda put = vendas.put(cod, dados);

        this.salvar();
    }

    public Set<Integer> mostraTodos() {
        return vendas.keySet();
    }

    public int getCodCli(int cod) {

        return vendas.get(cod).getCodCli();
    }

    public void setCodCli(int cod, int cli) {
        vendas.get(cod).setCodCli(cli);
    }

    public int getCodProd(int cod) {

        return vendas.get(cod).getCodProd();
    }

    public void setCodProd(int cod, int prod) {
        vendas.get(cod).setCodProd(prod);
    }

    public int getQtd(int cod) {

        return vendas.get(cod).getQtd();
    }

    public void setQts(int cod, int qtd) {
        vendas.get(cod).setQtd(qtd);
    }

    public double getValorTotal(int cod) {

        return vendas.get(cod).getValor();
    }

    public void setValorTotal(int cod, double valor) {
        vendas.get(cod).setValorTotal(valor);
    }

    public String getData(int cod) {

        return vendas.get(cod).getDta();
    }

    public void setCalorTotal(int cod, String data) {
        vendas.get(cod).setDta(data);
    }

    public void salvar() {
        arqVendaPer.salvarVenda(vendas);
    }

    public int retornoMap() {
        return vendas.size();
    }

}
