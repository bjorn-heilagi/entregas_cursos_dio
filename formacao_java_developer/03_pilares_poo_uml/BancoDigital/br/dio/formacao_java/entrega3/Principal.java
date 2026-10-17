package br.dio.formacao_java.entrega3;

import java.util.List;
import java.util.ArrayList;

public class Principal
{
    public static void main(String args[]){
        Banco banco = new Banco();
        banco.setNome("BB");

        Cliente cliente1 = new ClientePF("Breno Santos", "12345");
        Cliente cliente2 = new ClientePJ("Macrofertil", "0920897293");

        Conta poupanca = new ContaPoupanca(cliente1);
        Conta cc = new ContaCorrente(cliente2);

        cc.depositar(100);
        cc.transferir(50, poupanca);

        List<Conta> contas = new ArrayList<Conta>(
            List.of(cc, poupanca));
        banco.setContas(contas);
        banco.imprimirContasPF();
    }
}