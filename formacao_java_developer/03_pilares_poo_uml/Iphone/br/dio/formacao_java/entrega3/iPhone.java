package br.dio.formacao_java.entrega3;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet
{
    @Override
    public void tocar(){
        System.out.println("Tocando música no iPhone");
    }

    @Override
    public void pausar(){
        System.out.println("Pausando música no iPhone");
    }

    @Override
    public void selecionarMusica(String musica){
        System.out.println("A música '" + musica +
            "' foi selecionada para ser reproduzida no iPhone");
    }

    @Override
    public void ligar(String numero){
        System.out.println("Ligando para o número " +
            numero + " pelo iPhone");
    }

    @Override
    public void atender(){
        System.out.println("Atendendo chamada pelo iPhone");
    }

    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando o Correio de Voz no iPhone");
    }

    @Override
    public void exibirPagina(String url){
        System.out.println("Exibindo a página indicada pelo endereço '" +
            url + "' no Safari do iPhone");
    }

    @Override
    public void adicionarNovaAba(){
        System.out.println("Abrindo uma nova aba no Safari do iPhone");
    }

    @Override
    public void atualizarPagina(){
        System.out.println("Atualizando a página corrente no Safari do iPhone");
    }
}
