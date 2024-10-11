public class Smartphone {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        iphone.ligar("(11) 99999-9999");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Rock");
    }
}