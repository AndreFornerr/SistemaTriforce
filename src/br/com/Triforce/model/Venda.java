/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Triforce.model;

import java.io.Serializable;

/**
 *
 * @author Forner
 */
public class Venda implements Serializable {

    private int codCliente;
    private int codProd;
    private int quantidade;
    private double valorTotal;
    private String data;

    public int getCodCli() {
        return codCliente;
    }

    public void setCodCli(int cli) {
        this.codCliente = cli;

    }

    public int getCodProd() {
        return codProd;
    }

    public void setCodProd(int prod) {
        this.codProd = prod;
    }

    public int getQtd() {
        return quantidade;
    }

    public void setQtd(int q) {
        this.quantidade = q;
    }

    public double getValor() {
        return valorTotal;
    }

    public void setValorTotal(double valor) {
        this.valorTotal = valor;
    }

    public void setDta(String dta) {
        this.data = dta;
    }

    public String getDta() {
        return data;
    }
}
