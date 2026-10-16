package br.dio.formacao_java.entrega3;

public class Nokia2280 implements AparelhoTelefonico
{
    @Override
    public void ligar(String numero){
        System.out.println("Ligando para o número " +
            numero + " pelo Nokia2280");
    }

    @Override
    public void atender(){
        System.out.println("Atendendo chamada pelo Nokia2280");
    }

    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando o Correio de Voz no Nokia2280");
    }
}