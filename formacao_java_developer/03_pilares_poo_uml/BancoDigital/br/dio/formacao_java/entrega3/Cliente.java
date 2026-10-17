package br.dio.formacao_java.entrega3;

public class Cliente
{
    private String nome;

    public Cliente(String nome){
        setNome(nome);
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}