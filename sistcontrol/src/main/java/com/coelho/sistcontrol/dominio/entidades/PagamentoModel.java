package com.coelho.sistcontrol.dominio.entidades;

import java.time.LocalDate;

public class PagamentoModel {
    private long codigo;
    private double valorPago;
    private LocalDate dataPagamento;
    private String promocao;

    public PagamentoModel(long codigo, double valorPago, LocalDate dataPagamento, String promocao) {
        this.codigo = codigo;
        this.valorPago = valorPago;
        this.dataPagamento = dataPagamento;
        this.promocao = promocao;
    }

    public long getCodigo() {
        return this.codigo;
    }

    public double valorPago() {
        return this.valorPago;
    }

    public LocalDate getDataPagamento() {
        return this.dataPagamento;
    }

    public String getPromocao() {
        return this.promocao;
    }

    @Override
    public String toString() {
        return "PagamentoModel [codigo=" + codigo + ", valorPago=" + valorPago + ", dataPagamento=" + dataPagamento
                + ", promocao=" + promocao + "]";
    }

}
