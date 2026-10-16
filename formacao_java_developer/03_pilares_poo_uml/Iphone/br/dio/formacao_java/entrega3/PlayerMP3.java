package br.dio.formacao_java.entrega3;

public class PlayerMP3 implements ReprodutorMusical
{
    @Override
    public void tocar(){
        System.out.println("Tocando música no PlayerMP3");
    }

    @Override
    public void pausar(){
        System.out.println("Pausando música no PlayerMP3");
    }

    @Override
    public void selecionarMusica(String musica){
        System.out.println("A música '" + musica +
            "' foi selecionada para ser reproduzida no PlayerMP3");
    }
}
