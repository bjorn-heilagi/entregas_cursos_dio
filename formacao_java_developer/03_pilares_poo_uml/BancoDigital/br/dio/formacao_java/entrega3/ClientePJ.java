package br.dio.formacao_java.entrega3;

public class ClientePJ extends Cliente
{
    private String cnpj;

    public ClientePJ(String razaoSocial, String cnpj){
        super(razaoSocial);
        setCNPJ(cnpj);
    }

    public String getCNPJ(){
        return this.cnpj;
    }

    public void setCNPJ(String cnpj){
        this.cnpj = cnpj;
    }
}