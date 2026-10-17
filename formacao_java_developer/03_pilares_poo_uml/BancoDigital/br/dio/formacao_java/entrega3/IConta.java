package br.dio.formacao_java.entrega3;

public interface IConta
{
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, IConta contaDestino);
    void imprimirExtrato(Boolean cabecalho);
}