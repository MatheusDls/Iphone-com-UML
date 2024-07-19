package aparelho.safari;

import aparelho.NavegadorInternet;

public class Safari implements NavegadorInternet {
    @Override
    public void exibirPagina() {
        System.out.println("Iphone: Exibindo pagina");
    }

    @Override
    public void novaAba() {
        System.out.println("Iphone: Abrindo nova aba");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Iphone: Pagina atualizada");

    }
}
