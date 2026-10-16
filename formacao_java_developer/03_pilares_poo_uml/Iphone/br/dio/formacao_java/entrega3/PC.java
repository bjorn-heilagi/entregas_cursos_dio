package br.dio.formacao_java.entrega3;

public class PC implements NavegadorInternet
{
    @Override
    public void exibirPagina(String url){
        System.out.println("Exibindo a página indicada pelo endereço '" +
            url + "' no navegador padrão do PC");
    }

    @Override
    public void adicionarNovaAba(){
        System.out.println("Abrindo uma nova aba no navegador padrão do PC");
    }

    @Override
    public void atualizarPagina(){
        System.out.println("Atualizando a página corrente no navegador padrão do PC");
    }
}