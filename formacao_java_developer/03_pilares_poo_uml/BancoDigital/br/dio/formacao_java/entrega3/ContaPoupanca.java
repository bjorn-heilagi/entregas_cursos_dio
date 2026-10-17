package br.dio.formacao_java.entrega3;

public class ContaPoupanca extends Conta
{
    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirExtrato(Boolean cabecalho){
        if(cabecalho == null || cabecalho)
            System.out.println("=== Extrato da Conta Poupança ===");
        super.imprimirInfoExtrato();
    }
}