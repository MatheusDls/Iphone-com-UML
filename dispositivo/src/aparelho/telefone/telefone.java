package aparelho.telefone;

import aparelho.AparelhoTelefonico;

public class telefone implements AparelhoTelefonico{
    @Override
    public void ligar() {
        System.out.println("Iphone: ligando");
    }

    @Override
    public void atender() {
        System.out.println("Iphone: atendendo chamada");

    }

    @Override
    public void correioVoz() {
        System.out.println("Iphone: iniciando correio");

    }
}
