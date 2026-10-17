package br.dio.formacao_java.entrega3;

import java.util.List;

public class Banco
{
    private String nome;
    private List<Conta> contas;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public List<Conta> getContas(){
        return this.contas;
    }

    public void setContas(List<Conta> contas){
        this.contas = contas;
    }

    public void imprimirContasPF(){
        if(contas.size() > 0){
            boolean flag = false;
            System.out.println("=== Contas de Pessoas Física ===");
            for(Conta conta : contas){
                if(conta.getCliente() instanceof ClientePF){
                    flag = true;
                    conta.imprimirExtrato(false);
                }
            }
            if(!flag)
                System.out.println("Não existe contas de pessoas física cadastradas no banco!");
        } else
            System.out.println("Não existe contas de pessoas físicas cadastradas no banco!");
    }

    public void imprimirContasPJ(){
        if(contas.size() > 0){
            boolean flag = false;
            System.out.println("=== Contas de Pessoas Jurídicas ===");
            for(Conta conta : contas){
                if(conta.getCliente() instanceof ClientePJ){
                    flag = true;
                    conta.imprimirExtrato(false);
                }
            }
            if(!flag)
                System.out.println("Não existe contas de pessoas jurídicas cadastradas no banco!");
        } else
            System.out.println("Não existe contas de pessoas jurídicas cadastradas no banco!");
    }
}