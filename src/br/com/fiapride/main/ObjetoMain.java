package br.com.fiapride.main;

// Você PRECISA deste import para acessar a classe que está em outro pacote
import br.com.fiapride.model.Geladeira;


public class ObjetoMain {
    public static void main(String[] args) {
        // Instância 1
        Geladeira minhaGeladeira = new Geladeira();
        minhaGeladeira.cor = "Prata";
        minhaGeladeira.potencia = 300;
        minhaGeladeira.capacidadeEmL = 400;

        // Instância 2
        Geladeira geladeiraDoProfessor = new Geladeira();
        geladeiraDoProfessor.cor = "Branca";
        geladeiraDoProfessor.potencia = 500;
        geladeiraDoProfessor.capacidadeEmL = 600;

        // Impressão dos resultados
        System.out.println("Minha geladeira é: " + minhaGeladeira.cor);
        System.out.println("A do professor é: " + geladeiraDoProfessor.cor);
    }
}