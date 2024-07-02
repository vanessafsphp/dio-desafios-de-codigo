import interfaces.browser.NavegadorInternet;
import interfaces.music.ReprodutorMusical;
import interfaces.phone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // métodos referentes a interface ReprodutorMusical
    public void tocar() {
        System.out.println("TOCANDO MÚSICA");
    }
    public void pausar() {
        System.out.println("MÚSICA PAUSADA");
    }
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO MÚSICA");
    }

    // métodos referentes a interface AparelhoTelefonico
    public void ligar(String numero) {
        System.out.println("LIGANDO PARA O NÚMERO: " + numero);
    }
    public void atender() {
        System.out.println("ATENDENDO UMA LIGAÇÃO");
    }    
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    // métodos referentes a interface NavegadorInternet
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PÁGINA WEB: " + url);
    }
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA AO NAVEGADOR");
    }    
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO A PÁGINA WEB");
    }
}
