# Diagrama de classes
Representação das funcionalidades iPhone


```mermaid
classDiagram
    class AparelhoTelefonico {
        +void ligar(String numero)
        +void atender()
        +void iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +void exibirPagina(String url)
        +void adicionarNovaAba()
        +void atualizarPagina()
    }

    class ReprodutorMusical {
        +void tocar()
        +void pausar()
        +void selecionarMusica(String musica)
    }

    class iPhone {
        +void ligar(String numero)
        +void atender()
        +void iniciarCorreioVoz()
        +void exibirPagina(String url)
        +void adicionarNovaAba()
        +void atualizarPagina()
        +void tocar()
        +void pausar()
        +void selecionarMusica(String musica)
    }

    AparelhoTelefonico <|-- iPhone
    NavegadorInternet <|-- iPhone
    ReprodutorMusical <|-- iPhone

```
