package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {

    public static void main(String[] args) {
        // 1. Criando o passageiro
        Passageiro p1 = new Passageiro("Ana Silva", "123.456.789-00");

        System.out.println("--- Bem-vindo ao FiapRide ---");
        System.out.println("Passageiro: " + p1.getNome());
        System.out.println("Saldo Inicial: R$ " + p1.getSaldo());

        System.out.println("\n--- Testando Recarga ---");
        // Teste Válido
        p1.adicionarSaldo(50.0);
        // Teste Inválido (Regra de Negócio: não deve aceitar negativo)
        p1.adicionarSaldo(-10.0); 

        System.out.println("\n--- Testando Viagens ---");
        // Primeira viagem (Deve funcionar)
        System.out.println("Tentando pagar viagem de R$ 5.00...");
        p1.pagarViagem(5.00);

        // Segunda viagem (Custo alto, deve cair no 'if' de saldo insuficiente)
        System.out.println("Tentando pagar viagem de R$ 100.00...");
        p1.pagarViagem(100.00);

        // Terceira viagem (Custo inválido)
        System.out.println("Tentando pagar viagem de R$ -2.00...");
        p1.pagarViagem(-2.00);

        System.out.println("\n--- Estado Final ---");
        System.out.println("Saldo final de " + p1.getNome() + ": R$ " + p1.getSaldo());
    }
}