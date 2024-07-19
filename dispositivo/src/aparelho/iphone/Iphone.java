package aparelho.iphone;

import aparelho.AparelhoTelefonico;
import aparelho.NavegadorInternet;
import aparelho.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void exibirPagina() {
        System.out.println("Iphone: exibindo pagina");
    }

    @Override
    public void novaAba() {
        System.out.println("Iphone: adicionando aba");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Iphone: atualizando pagina");

    }

    @Override
    public void ligar() {
        System.out.print("Iphone: ligando");

    }

    @Override
    public void atender() {
        System.out.println("Iphone: atendendo chamada");

    }

    @Override
    public void correioVoz() {
        System.out.println("Iphone: iniciando correio");

    }

    @Override
    public void tocarMusica() {
        System.out.println("Iphone: tocando Linkin Park");

    }

    @Override
    public void pausar() {
        System.out.println("Iphone: pausando Linkin Park ");

    }

    @Override
    public void selecionarMusica() {
        System.out.println("iphone: mudar música para Metallica");

    }
}
