package br.dio.formacao_java.entrega3;

public class Principal
{
    public static void main(String args[]){
        ReprodutorMusical reprod = new iPod();
        reprod.selecionarMusica("November Rain");
        reprod.tocar();
        reprod.pausar();

        AparelhoTelefonico telefone = new Nokia2280();
        telefone.ligar("123456");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        NavegadorInternet browser = new PC();
        browser.exibirPagina("http://www.google.com");
        browser.atualizarPagina();
        browser.adicionarNovaAba();

        reprod = new iPhone();
        reprod.selecionarMusica("Sultans of Swing");
        reprod.tocar();
        reprod.pausar();

        telefone = new iPhone();
        telefone.ligar("567890");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        browser = new iPhone();
        browser.exibirPagina("http://www.msn.com");
        browser.atualizarPagina();
        browser.adicionarNovaAba();
    }
}