package br.dio.formacao_java.entrega3;

public class ContaCorrente extends Conta
{
    public ContaCorrente(Cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirExtrato(Boolean cabecalho){
        if(cabecalho == null || cabecalho)
            System.out.println("=== Extrato da Conta Corrente ===");
        super.imprimirInfoExtrato();
    }
}