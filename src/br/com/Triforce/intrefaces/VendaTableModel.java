/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Triforce.intrefaces;

import br.com.Triforce.model.VendaRegistro;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Forner
 */
public class VendaTableModel extends AbstractTableModel {

    private final VendaRegistro tabelaVenda;
    private final List<Integer> codigo;
    private String[] colunas = {"Codigo Venda", "Codigo Cliente", "Codigo Produto", "Quantidade", "Valor Total", "Data Venda"};

    private final int CODIGO = 0;
    private final int CODIGOCLI = 1;
    private final int CODIGOPROD = 2;
    private final int QTD = 3;
    private final int VALOR = 4;
    private final int DTA = 5;

    public VendaTableModel(VendaRegistro vend) {
        this.tabelaVenda = vend;
        codigo = new ArrayList(vend.mostraTodos());

    }

    @Override
    public int getRowCount() {

        return codigo.size();
    }

    @Override
    public int getColumnCount() {

        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Integer codigo = this.codigo.get(rowIndex);
        switch (columnIndex) {

            case CODIGOCLI:
                return tabelaVenda.getCodCli(codigo);
            case CODIGOPROD:
                return tabelaVenda.getCodProd(codigo);
            case QTD:
                return tabelaVenda.getQtd(codigo);
            case VALOR:
                return tabelaVenda.getValorTotal(codigo);
            case DTA:
                return tabelaVenda.getData(codigo);

        }
        return codigo;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }

}
