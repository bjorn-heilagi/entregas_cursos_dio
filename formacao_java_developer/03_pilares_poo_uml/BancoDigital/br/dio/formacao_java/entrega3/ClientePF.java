package br.dio.formacao_java.entrega3;

public class ClientePF extends Cliente
{
    private String cpf;

    public ClientePF(String nome, String cpf){
        super(nome);
        setCPF(cpf);
    }

    public String getCPF(){
        return this.cpf;
    }

    public void setCPF(String cpf){
        this.cpf = cpf;
    }
}