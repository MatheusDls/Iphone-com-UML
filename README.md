# Exemplo de Diagrama UML (Mermaid) by: Matheus Lima

```mermaid
classDiagram
    class ReprodutorMusical {
        +tocarMusica()
        +pausar()
        selecionarMusica()
    }

    class AparelhoTelefonico {
        +ligar()
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina()
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
