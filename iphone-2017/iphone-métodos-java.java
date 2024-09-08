// Classe principal que implementa todas as funcionalidades
public class DispositivoMultifuncional {

    // Funcionalidades do Reprodutor Musical
    public void tocar() {
        System.out.println("A música está tocando.");
    }

    public void pausar() {
        System.out.println("A música foi pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("A música '" + musica + "' foi selecionada.");
    }

    // Funcionalidades do Aparelho Telefônico
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    public void atender() {
        System.out.println("Atendendo a chamada...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz...");
    }

    // Funcionalidades do Navegador na Internet
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    // Método principal para testar
    public static void main(String[] args) {
        DispositivoMultifuncional dispositivo = new DispositivoMultifuncional();

        // Testando funcionalidades do Reprodutor Musical
        dispositivo.selecionarMusica("Imagine - John Lennon");
        dispositivo.tocar();
        dispositivo.pausar();

        // Testando funcionalidades do Aparelho Telefônico
        dispositivo.ligar("123-456-789");
        dispositivo.atender();
        dispositivo.iniciarCorreioVoz();

        // Testando funcionalidades do Navegador na Internet
        dispositivo.exibirPagina("www.exemplo.com");
        dispositivo.adicionarNovaAba();
        dispositivo.atualizarPagina();
    }
}
