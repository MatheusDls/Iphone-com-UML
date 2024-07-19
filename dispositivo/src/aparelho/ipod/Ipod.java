package aparelho.ipod;

import aparelho.ReprodutorMusical;


public class Ipod implements ReprodutorMusical {

    @Override
    public void tocarMusica() {

        System.out.println();
    }

    @Override
    public void pausar(){
        System.out.println("Musica Pausada.");
    }

    @Override
    public void selecionarMusica(){
        System.out.println();
    }
}
